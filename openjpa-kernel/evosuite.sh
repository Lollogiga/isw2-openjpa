#!/usr/bin/env bash
set -e

# Classe target
CLASS="${1:-org.apache.openjpa.util.CacheMap}"

# Jar di EvoSuite: per default ./tools/evosuite-1.2.0.jar
EVOSUITE_JAR="${EVOSUITE_JAR:-$(pwd)/tools/evosuite-1.2.0.jar}"

mvn -q -DskipTests package

# Classpath (scope test)
mvn -q dependency:build-classpath -DincludeScope=test -Dmdep.outputFile=evosuite.classpath
echo "$(pwd)/target/test-classes:$(pwd)/target/classes:$(cat evosuite.classpath)" > full.classpath

# Lancio EvoSuite
"$JAVA_HOME/bin/java" -Xmx4g -jar "$EVOSUITE_JAR" \
  -class "$CLASS" \
  -projectCP "$(cat full.classpath)" \
  -Djunit=4 \
  -Dsandbox=false \
  -Dcriterion=BRANCH \
  -Dtest_dir=evosuite-tests \
  -Dreport_dir=evosuite-report \
  -Dsearch_budget="${SEARCH_BUDGET:-180}"

echo "OK: test generati in evosuite-tests/."
