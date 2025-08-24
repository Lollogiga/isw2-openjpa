#!/usr/bin/env bash
set -euo pipefail

# Genero test Randoop per due classi (CacheMap + ProxyManagerImpl),

TIME_LIMIT=300
HEAP="4g"

# Jar Randoop nella cartella tools/ del modulo
RANDOOP_JAR="$(pwd)/tools/randoop-all-4.3.4.jar"
if [[ ! -f "$RANDOOP_JAR" ]]; then
  echo "Errore: non trovo $RANDOOP_JAR (atteso: openjpa-kernel/tools/randoop-all-4.3.4.jar)"
  exit 1
fi

# 1) Build modulo + test-compile (mi serve il CP di test completo)
mvn -q -DskipTests package
mvn -q -DskipTests test-compile

# 2) Classpath (runtime + test)
mvn -q dependency:build-classpath -DincludeScope=test -Dmdep.outputFile=cp.txt
CP="target/classes:target/test-classes:$(cat cp.txt)"

# 3) Output/Package separati per i due target
OUTDIR_CM="target/randoop-tests-cm"
OUTDIR_PM="target/randoop-tests-pm"
PKG_CM="org.apache.openjpa.generated.cm"   # per CacheMap
PKG_PM="org.apache.openjpa.generated.pm"   # per ProxyManagerImpl

rm -rf "$OUTDIR_CM" "$OUTDIR_PM"
mkdir -p "$OUTDIR_CM" "$OUTDIR_PM"

# --- Flag chiave:
# --time-limit         = tempo massimo (s) per la generazione
# --usethreads=true    = thread multipli
# --flaky-test-behavior= scarto i test non deterministici
# --junit-output-dir   = dove salvo i .java generati
# --junit-package-name = package dei test generati
# --forbid-null        = evito null casuali
# --null-ratio         = probabilità di usare null (bassa)

# 4) Genero test per CacheMap
java -Xmx"$HEAP" -cp "$CP:$RANDOOP_JAR" randoop.main.Main gentests \
  --time-limit="$TIME_LIMIT" \
  --usethreads=true \
  --flaky-test-behavior=DISCARD \
  --junit-output-dir="$OUTDIR_CM" \
  --junit-package-name="$PKG_CM" \
  --testclass=org.apache.openjpa.util.CacheMap \
  --forbid-null=true \
  --null-ratio=0.05

# 5) Genero test per ProxyManagerImpl
java -Xmx"$HEAP" -cp "$CP:$RANDOOP_JAR" randoop.main.Main gentests \
  --time-limit="$TIME_LIMIT" \
  --usethreads=true \
  --flaky-test-behavior=DISCARD \
  --junit-output-dir="$OUTDIR_PM" \
  --junit-package-name="$PKG_PM" \
  --testclass=org.apache.openjpa.util.ProxyManagerImpl \
  --forbid-null=true \
  --null-ratio=0.05

# 6) Compilo i test generati (ricorsivo, mantenendo i package)
if find "$OUTDIR_CM" -name '*.java' -print -quit | grep -q . ; then
  find "$OUTDIR_CM" -name '*.java' -print0 | xargs -0 javac -cp "$OUTDIR_CM:$CP" -d "$OUTDIR_CM"
fi
if find "$OUTDIR_PM" -name '*.java' -print -quit | grep -q . ; then
  find "$OUTDIR_PM" -name '*.java' -print0 | xargs -0 javac -cp "$OUTDIR_PM:$CP" -d "$OUTDIR_PM"
fi

# 7) Copio SOLO i RegressionTest*.java in src/test/java (escludo gli ErrorTest*.java)
DEST="src/test/java"; mkdir -p "$DEST"
PKGDIR_CM="${PKG_CM//.//}"  # org/apache/openjpa/generated/cm
PKGDIR_PM="${PKG_PM//.//}"  # org/apache/openjpa/generated/pm

copy_regression_only () {
  local OUTDIR="$1"
  local PKGDIR="$2"
  local SRCDIR="$OUTDIR/$PKGDIR"
  local DSTDIRECTORY="$DEST/$PKGDIR"
  [[ -d "$SRCDIR" ]] || return 0
  mkdir -p "$DSTDIRECTORY"

  if command -v rsync >/dev/null 2>&1; then
    # includo solo directory e RegressionTest*.java; tutto il resto escluso
    rsync -a \
      --include='*/' \
      --include='RegressionTest*.java' \
      --exclude='*' \
      "$SRCDIR/" "$DSTDIRECTORY/"
  else
    # fallback: copia con find solo i RegressionTest*.java
    find "$SRCDIR" -maxdepth 1 -name 'RegressionTest*.java' -print0 \
      | xargs -0 -I{} cp "{}" "$DSTDIRECTORY/"
  fi
}

copy_regression_only "$OUTDIR_CM" "$PKGDIR_CM"
copy_regression_only "$OUTDIR_PM" "$PKGDIR_PM"

echo "Copiati SOLO i RegressionTest in:"
echo "  - $DEST/$PKGDIR_CM"
echo "  - $DEST/$PKGDIR_PM"


# 8) Coverage con profilo dedicato
mvn -q -Prandoop-coverage test verify
open "target/site/jacoco-randoop/index.html" || true

echo "Done."
