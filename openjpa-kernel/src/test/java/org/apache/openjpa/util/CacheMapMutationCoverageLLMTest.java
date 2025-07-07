/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.openjpa.util;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Suite di test JUnit 4 completa per {@link org.apache.openjpa.util.CacheMap}.
 * L'obiettivo primario è ottenere la massima copertura di mutazione possibile creando test mirati
 * per ogni metodo pubblico. I test sono progettati per rilevare bug sottili introdotti da mutazioni comuni.
 */
public class CacheMapMutationCoverageLLMTest {

    private org.apache.openjpa.util.CacheMap cacheMap;
    private org.apache.openjpa.util.CacheMap lruCacheMap;
    private TrackingCacheMap trackingCacheMap;

    // Una classe di supporto per tracciare le invocazioni dei metodi di callback protetti.
    // Questo è cruciale per "uccidere" i mutanti che potrebbero eliminare le chiamate ai metodi.
    private static class TrackingCacheMap extends org.apache.openjpa.util.CacheMap {
        public final List<Object> removedKeys = new ArrayList<>();
        public final List<Object> addedKeys = new ArrayList<>();
        public final List<Boolean> expiredFlags = new ArrayList<>();
        public final AtomicInteger cacheOverflowCount = new AtomicInteger(0);
        public final AtomicInteger softOverflowCount = new AtomicInteger(0);
        public final AtomicInteger softExpiredCount = new AtomicInteger(0);


        public TrackingCacheMap(boolean lru, int max) {
            super(lru, max);
        }

        @Override
        protected void entryRemoved(Object key, Object value, boolean expired) {
            super.entryRemoved(key, value, expired);
            removedKeys.add(key);
            expiredFlags.add(expired);
        }

        @Override
        protected void entryAdded(Object key, Object value) {
            super.entryAdded(key, value);
            addedKeys.add(key);
        }

        @Override
        protected void cacheMapOverflowRemoved(Object key, Object value) {
            cacheOverflowCount.incrementAndGet();
            super.cacheMapOverflowRemoved(key, value);
        }

        @Override
        protected void softMapOverflowRemoved(Object key, Object value) {
            softOverflowCount.incrementAndGet();
            super.softMapOverflowRemoved(key, value);
        }

        @Override
        protected void softMapValueExpired(Object key) {
            softExpiredCount.incrementAndGet();
            super.softMapValueExpired(key);
        }

        public void clearTrackers() {
            removedKeys.clear();
            addedKeys.clear();
            expiredFlags.clear();
            cacheOverflowCount.set(0);
            softOverflowCount.set(0);
            softExpiredCount.set(0);
        }
    }

    @Before
    public void setUp() {
        // Cache map standard non-LRU
        cacheMap = new org.apache.openjpa.util.CacheMap(false, 10);
        // Cache map LRU
        lruCacheMap = new org.apache.openjpa.util.CacheMap(true, 10);
        // Cache map di tracciamento per la verifica degli effetti collaterali
        trackingCacheMap = new TrackingCacheMap(false, 2);
        trackingCacheMap.setSoftReferenceSize(1);
    }

    //
    // Test dei Costruttori
    //

    @Test
    public void testDefaultConstructor() {
        org.apache.openjpa.util.CacheMap map = new org.apache.openjpa.util.CacheMap();
        assertFalse("Il costruttore predefinito dovrebbe creare una mappa non-LRU", map.isLRU());
        assertEquals("La dimensione predefinita della cache dovrebbe essere 1000", 1000, map.getCacheSize());
    }

    @Test
    public void testLruConstructor() {
        org.apache.openjpa.util.CacheMap map = new org.apache.openjpa.util.CacheMap(true);
        assertTrue("Il costruttore con true dovrebbe creare una mappa LRU", map.isLRU());
        assertEquals("La dimensione predefinita della cache dovrebbe essere 1000", 1000, map.getCacheSize());
    }

    @Test
    public void testFullConstructor() {
        // NOTA: il parametro 'size' (25) imposta la capacità iniziale, non la dimensione massima della soft map.
        // La dimensione massima della soft map non è impostata da questo costruttore.
        org.apache.openjpa.util.CacheMap map = new org.apache.openjpa.util.CacheMap(true, 50, 25, 0.75f, 8);
        assertTrue("La mappa dovrebbe essere LRU", map.isLRU());
        assertEquals("La dimensione della cache dovrebbe essere 50", 50, map.getCacheSize());
    }

    @Test
    public void testConstructorWithNegativeSize() {
        // Una dimensione negativa dovrebbe usare il valore predefinito di 500
        org.apache.openjpa.util.CacheMap map = new org.apache.openjpa.util.CacheMap(false, 1000, -1, 0.75f);
        assertNotNull(map.softMap); // softMap viene inizializzata con una dimensione predefinita
    }

    @Test
    public void testConstructorWithNegativeMaxSize() {
        // Una dimensione massima negativa dovrebbe usare Integer.MAX_VALUE
        org.apache.openjpa.util.CacheMap map = new org.apache.openjpa.util.CacheMap(false, -1);
        assertEquals(-1, map.getCacheSize()); // getCacheSize converte MAX_VALUE in -1
        assertEquals(Integer.MAX_VALUE, map.cacheMap.getMaxSize());
    }

    //
    // Operazioni di Base: put, get, remove
    //

    @Test
    public void testPutAndGet() {
        assertNull("L'inserimento di una nuova chiave dovrebbe restituire null", cacheMap.put("key1", "value1"));
        assertEquals("Il recupero di una chiave esistente dovrebbe restituire il suo valore", "value1", cacheMap.get("key1"));
        assertEquals(1, cacheMap.size());
    }

    @Test
    public void testPutExistingKey() {
        cacheMap.put("key1", "value1");
        assertEquals("L'inserimento di una chiave esistente dovrebbe restituire il vecchio valore", "value1", cacheMap.put("key1", "value2"));
        assertEquals("Il valore dovrebbe essere aggiornato", "value2", cacheMap.get("key1"));
        assertEquals(1, cacheMap.size());
    }

    @Test
    public void testGetNonExistentKey() {
        assertNull("Il recupero di una chiave non esistente dovrebbe restituire null", cacheMap.get("nonexistent"));
    }

    @Test
    public void testRemove() {
        cacheMap.put("key1", "value1");
        assertEquals("La rimozione di una chiave esistente dovrebbe restituire il suo valore", "value1", cacheMap.remove("key1"));
        assertNull("La chiave non dovrebbe più esistere", cacheMap.get("key1"));
        assertEquals(0, cacheMap.size());
    }

    @Test
    public void testRemoveNonExistentKey() {
        assertNull("La rimozione di una chiave non esistente dovrebbe restituire null", cacheMap.remove("nonexistent"));
    }

    //
    // Logica di Pinning e Unpinning
    //

    @Test
    public void testPinExistingKeyInCacheMap() {
        cacheMap.put("key1", "value1");
        assertTrue("pin dovrebbe restituire true per una chiave esistente", cacheMap.pin("key1"));
        assertTrue("Le chiavi pinnate dovrebbero essere in getPinnedKeys", cacheMap.getPinnedKeys().contains("key1"));
        assertEquals("Il valore pinnato dovrebbe essere recuperabile", "value1", cacheMap.get("key1"));
        assertFalse("La chiave dovrebbe essere rimossa dalla mappa cache principale", cacheMap.cacheMap.containsKey("key1"));
    }

    @Test
    public void testPinNonExistentKey() {
        assertFalse("pin dovrebbe restituire false per una chiave non esistente", cacheMap.pin("key1"));
        assertTrue("Le chiavi pinnate dovrebbero includere la nuova chiave", cacheMap.getPinnedKeys().contains("key1"));
        assertNull("Il valore per una chiave appena pinnata dovrebbe essere null", cacheMap.get("key1"));
    }

    @Test
    public void testPinAlreadyPinnedKey() {
        cacheMap.pin("key1");
        assertFalse("Il pinning di una chiave già pinnata (con valore nullo) dovrebbe restituire false", cacheMap.pin("key1"));
        cacheMap.put("key1", "value1"); // Ora ha un valore
        assertTrue("Il pinning di una chiave già pinnata (con valore) dovrebbe restituire true", cacheMap.pin("key1"));
        assertEquals(1, cacheMap.getPinnedKeys().size());
    }

    @Test
    public void testUnpin() {
        cacheMap.put("key1", "value1");
        cacheMap.pin("key1");

        assertTrue("unpin dovrebbe restituire true per una chiave pinnata", cacheMap.unpin("key1"));
        assertFalse("La chiave dovrebbe essere rimossa dalle chiavi pinnate", cacheMap.getPinnedKeys().contains("key1"));
        assertEquals("Il valore non pinnato dovrebbe essere nella cache", "value1", cacheMap.get("key1"));
        assertTrue("La chiave non pinnata dovrebbe essere nella mappa cache principale", cacheMap.cacheMap.containsKey("key1"));
    }

    @Test
    public void testUnpinNonPinnedKey() {
        assertFalse("unpin dovrebbe restituire false per una chiave non pinnata", cacheMap.unpin("key1"));
    }

    @Test
    public void testRemovePinnedKey() {
        trackingCacheMap.put("key1", "value1");
        trackingCacheMap.pin("key1");
        trackingCacheMap.clearTrackers();

        assertEquals("La rimozione di una chiave pinnata dovrebbe restituire il suo valore", "value1", trackingCacheMap.remove("key1"));
        assertTrue("La chiave dovrebbe rimanere pinnata", trackingCacheMap.getPinnedKeys().contains("key1"));
        assertNull("Il valore dovrebbe essere nullo dopo la rimozione", trackingCacheMap.get("key1"));

        assertEquals("entryRemoved dovrebbe essere chiamato una volta", 1, trackingCacheMap.removedKeys.size());
        assertEquals("key1", trackingCacheMap.removedKeys.get(0));
        assertFalse("Il flag expired dovrebbe essere false per una rimozione esplicita", trackingCacheMap.expiredFlags.get(0));
    }

    //
    // Logica di Overflow e Verifica degli Effetti Collaterali
    //

    @Test
    public void testCacheMapOverflowToSoftMap() {
        trackingCacheMap.put("key1", "value1");
        trackingCacheMap.put("key2", "value2");
        trackingCacheMap.clearTrackers();

        trackingCacheMap.put("key3", "value3");

        assertEquals("L'overflow della cache dovrebbe essere avvenuto una volta", 1, trackingCacheMap.cacheOverflowCount.get());
        assertEquals("La dimensione dovrebbe essere 3", 3, trackingCacheMap.size());
        assertEquals("la dimensione di cacheMap dovrebbe essere al suo massimo", 2, trackingCacheMap.cacheMap.size());
        assertEquals("la dimensione di softMap dovrebbe essere 1", 1, trackingCacheMap.softMap.size());
    }

    @Test
    public void testSoftMapOverflow() {
        // Impostazione: cacheMap max 2, softMap max 1.
        trackingCacheMap.clear();
        trackingCacheMap.clearTrackers();

        // 1. Riempi la cacheMap
        trackingCacheMap.put("key1", "value1");
        trackingCacheMap.put("key2", "value2");
        assertEquals(2, trackingCacheMap.cacheMap.size());

        // 2. Causa un overflow dalla cache alla soft map.
        trackingCacheMap.put("key3", "value3");
        assertEquals("Primo overflow della cache", 1, trackingCacheMap.cacheOverflowCount.get());
        assertEquals("La soft map dovrebbe contenere 1 elemento", 1, trackingCacheMap.softMap.size());
        assertEquals("La dimensione totale dovrebbe essere 3", 3, trackingCacheMap.size());

        // 3. Causa un altro overflow. L'elemento espulso dalla cache non troverà spazio
        // nella soft map (che è piena) e verrà rimosso in modo "expired".
        trackingCacheMap.put("key4", "value4");

        assertEquals("L'overflow della cache dovrebbe avvenire di nuovo", 2, trackingCacheMap.cacheOverflowCount.get());
        // In questo scenario, softMapOverflowRemoved non viene chiamato. Invece, cacheMapOverflowRemoved
        // vede che la soft map è piena e chiama direttamente entryRemoved.
        assertEquals("L'overflow della soft map non dovrebbe essere contato qui", 0, trackingCacheMap.softOverflowCount.get());

        // Verifichiamo che entryRemoved sia stato chiamato per l'elemento che non ha trovato spazio.
        assertEquals("entryRemoved dovrebbe essere chiamato per l'elemento espulso", 1, trackingCacheMap.removedKeys.size());
        assertTrue("L'espulsione dovrebbe essere contrassegnata come expired", trackingCacheMap.expiredFlags.get(0));

        // Controlliamo lo stato finale.
        assertEquals("La dimensione totale dovrebbe rimanere 3", 3, trackingCacheMap.size());
    }

    @Test
    public void testGetFromSoftMapMovesToCacheMap() {
        lruCacheMap.put("key1", "value1");
        for (int i = 2; i <= 11; i++) {
            lruCacheMap.put("key" + i, "value" + i);
        }

        assertTrue("key1 dovrebbe essere ora nella softMap", lruCacheMap.softMap.containsKey("key1"));
        assertFalse("key1 non dovrebbe essere nella cacheMap", lruCacheMap.cacheMap.containsKey("key1"));

        assertEquals("value1", lruCacheMap.get("key1"));

        assertTrue("La chiave dovrebbe tornare nella cacheMap dopo get", lruCacheMap.cacheMap.containsKey("key1"));
        assertFalse("La chiave dovrebbe essere rimossa dalla softMap", lruCacheMap.softMap.containsKey("key1"));
    }

    //
    // Metodi di Vista: keySet, values, entrySet e i loro Iteratori
    //

    @Test
    public void testKeySet() {
        cacheMap.put("key1", "value1");
        cacheMap.put("key2", "value2");
        cacheMap.pin("key3"); // Pinnato con un valore nullo

        Set<String> keySet = cacheMap.keySet();

        // Dimostrazione dell'incoerenza in CacheMap:
        // Il metodo size() conta solo gli elementi pinnati con valori non nulli.
        // _pinnedSize non viene incrementato per pin("key3"), quindi CacheMap.size() restituisce 2.
        assertEquals("keySet.size() è incoerente e restituisce 2", 2, keySet.size());

        // Tuttavia, l'iteratore trova correttamente tutte e 3 le chiavi.
        // Lo verifichiamo contando gli elementi dall'iteratore.
        int count = 0;
        for (String key : keySet) {
            count++;
        }
        assertEquals("L'iteratore del keySet dovrebbe trovare 3 elementi", 3, count);

        // E verifichiamo che tutte le chiavi siano presenti usando contains().
        assertTrue("Il keySet dovrebbe contenere 'key1'", keySet.contains("key1"));
        assertTrue("Il keySet dovrebbe contenere 'key2'", keySet.contains("key2"));
        assertTrue("Il keySet dovrebbe contenere 'key3'", keySet.contains("key3"));
    }

    @Test
    public void testValues() {
        cacheMap.put("key1", "value1");
        cacheMap.put("key2", "value2");
        cacheMap.pin("key3");
        cacheMap.put("key3", "value3");

        Collection<String> values = cacheMap.values();
        assertEquals(3, values.size());
        assertTrue(values.containsAll(Arrays.asList("value1", "value2", "value3")));
    }

    @Test
    public void testEntrySet() {
        cacheMap.put("key1", "value1");
        cacheMap.pin("key2"); // Pinnato con valore nullo

        Set<Map.Entry> entrySet = cacheMap.entrySet();
        // L'iteratore di entrySet filtra le voci con valore nullo, quindi la dimensione è 1.
        assertEquals("L'entrySet dovrebbe contenere solo 1 elemento", 1, entrySet.size());

        Map.Entry entry = entrySet.iterator().next();
        assertEquals("La chiave dovrebbe essere key1", "key1", entry.getKey());
        assertEquals("Il valore dovrebbe essere value1", "value1", entry.getValue());
    }

    @Test
    public void testEntrySetAdd() {
        Set<Map.Entry> entrySet = cacheMap.entrySet();
        Map.Entry<String, String> newEntry = new HashMap.SimpleEntry<>("newKey", "newValue");

        assertTrue(entrySet.add(newEntry));
        assertEquals(1, cacheMap.size());
        assertEquals("newValue", cacheMap.get("newKey"));
    }

    @Test
    public void testIteratorRemove() {
        cacheMap.put("key1", "value1");
        cacheMap.put("key2", "value2");

        Iterator<String> keyIterator = cacheMap.keySet().iterator();
        assertTrue("L'iteratore dovrebbe avere elementi", keyIterator.hasNext());

        // Rimuovi il primo elemento restituito, qualunque esso sia.
        String keyToRemove = keyIterator.next();
        keyIterator.remove();

        assertFalse(keyToRemove + " dovrebbe essere stato rimosso dalla mappa", cacheMap.containsKey(keyToRemove));
        assertEquals("La dimensione della mappa dovrebbe essere 1", 1, cacheMap.size());
        assertTrue("L'iteratore dovrebbe avere ancora un elemento", keyIterator.hasNext());
    }

    @Test
    public void testIteratorFiltersNullPinnedValues() {
        cacheMap.pin("key1"); // Pinnato con valore nullo
        cacheMap.put("key2", "value2");

        Iterator<String> valIter = cacheMap.values().iterator();
        assertTrue(valIter.hasNext());
        assertEquals("value2", valIter.next());
        assertFalse(valIter.hasNext());

        Iterator<Map.Entry> entryIter = cacheMap.entrySet().iterator();
        assertTrue(entryIter.hasNext());
        Map.Entry entry = entryIter.next();
        assertEquals("key2", entry.getKey());
        assertEquals("value2", entry.getValue());
        assertFalse(entryIter.hasNext());
    }

    //
    // Operazioni Massive e Controlli di Stato
    //

    @Test
    public void testClear() {
        trackingCacheMap.put("key1", "value1");
        trackingCacheMap.pin("key2");
        trackingCacheMap.put("key2", "value2");
        trackingCacheMap.clearTrackers();

        trackingCacheMap.clear();

        assertEquals(0, trackingCacheMap.size());
        assertTrue(trackingCacheMap.isEmpty());
        assertTrue(trackingCacheMap.getPinnedKeys().isEmpty());

        assertEquals("entryRemoved dovrebbe essere chiamato per tutti gli elementi cancellati", 2, trackingCacheMap.removedKeys.size());
        assertFalse("Il flag expired dovrebbe essere false per clear()", trackingCacheMap.expiredFlags.get(0));
        assertFalse("Il flag expired dovrebbe essere false per clear()", trackingCacheMap.expiredFlags.get(1));
    }

    @Test
    public void testPutAll() {
        Map<String, String> toAdd = new HashMap<>();
        toAdd.put("key1", "value1");
        toAdd.put("key2", "value2");

        cacheMap.putAll(toAdd);

        assertEquals(2, cacheMap.size());
        assertEquals("value1", cacheMap.get("key1"));
        assertEquals("value2", cacheMap.get("key2"));
    }

    @Test
    public void testPutAllNoReplace() {
        cacheMap.put("key1", "original_value");
        Map<String, String> toAdd = new HashMap<>();
        toAdd.put("key1", "new_value");
        toAdd.put("key2", "value2");

        cacheMap.putAll(toAdd, false);

        assertEquals(2, cacheMap.size());
        assertEquals("il valore non dovrebbe essere sostituito", "original_value", cacheMap.get("key1"));
        assertEquals("la nuova chiave dovrebbe essere aggiunta", "value2", cacheMap.get("key2"));
    }

    @Test
    public void testSizeAndIsEmpty() {
        assertTrue(cacheMap.isEmpty());
        assertEquals(0, cacheMap.size());

        cacheMap.put("key1", "value1");
        assertFalse(cacheMap.isEmpty());
        assertEquals(1, cacheMap.size());

        cacheMap.clear();
        assertTrue(cacheMap.isEmpty());
        assertEquals(0, cacheMap.size());
    }

    @Test
    public void testContainsKey() {
        cacheMap.put("cacheKey", "v1");
        cacheMap.pin("pinnedKey"); // Pinnato con valore nullo

        assertTrue("Dovrebbe contenere una chiave nella cache", cacheMap.containsKey("cacheKey"));
        // `containsKey` controlla `pinnedMap.get(key) != null`, quindi questo deve essere falso.
        assertFalse("Non dovrebbe contenere una chiave pinnata con valore nullo", cacheMap.containsKey("pinnedKey"));

        cacheMap.put("pinnedKey", "v2"); // Ora ha un valore
        assertTrue("Dovrebbe contenere una chiave pinnata con un valore", cacheMap.containsKey("pinnedKey"));
        assertFalse("Non dovrebbe contenere una chiave inesistente", cacheMap.containsKey("nonexistent"));
    }

    @Test
    public void testContainsValue() {
        cacheMap.put("key1", "value1");
        cacheMap.pin("key2");
        cacheMap.put("key2", "pinnedValue");

        assertTrue(cacheMap.containsValue("value1"));
        assertTrue(cacheMap.containsValue("pinnedValue"));
        assertFalse(cacheMap.containsValue("nonexistentValue"));
    }

    //
    // Setter/Getter di Configurazione
    //

    @Test
    public void testSetAndGetCacheSize() {
        cacheMap.setCacheSize(100);
        assertEquals(100, cacheMap.getCacheSize());

        cacheMap.setCacheSize(-1);
        assertEquals(-1, cacheMap.getCacheSize());
        assertEquals(Integer.MAX_VALUE, cacheMap.cacheMap.getMaxSize());
    }

    @Test
    public void testSetAndGetSoftReferenceSize() {
        cacheMap.setSoftReferenceSize(200);
        assertEquals(200, cacheMap.getSoftReferenceSize());

        cacheMap.setSoftReferenceSize(-1);
        assertEquals(-1, cacheMap.getSoftReferenceSize());
        assertEquals(Integer.MAX_VALUE, cacheMap.softMap.getMaxSize());
    }

    @Test
    public void testIsLRU() {
        assertFalse("La mappa standard non dovrebbe essere LRU", cacheMap.isLRU());
        assertTrue("La mappa LRU dovrebbe essere LRU", lruCacheMap.isLRU());
    }

    //
    // Concorrenza e Varie
    //

    @Test
    public void testLockingMethods() {
        // Test che i metodi di lock non lancino eccezioni e non causino deadlock.
        // Acquisire e rilasciare i lock in sequenza per evitare deadlock.
        try {
            cacheMap.writeLock();
            // Eseguire un'operazione
            cacheMap.put("test", "lock");
            cacheMap.writeUnlock();

            cacheMap.readLock();
            // Eseguire un'operazione
            cacheMap.get("test");
            cacheMap.readUnlock();
        } catch (Exception e) {
            fail("I metodi di locking non dovrebbero lanciare eccezioni: " + e.getMessage());
        }
    }

    @Test
    public void testToString() {
        cacheMap.put("key", "val");
        String s = cacheMap.toString();
        assertNotNull(s);
        assertTrue(s.startsWith("CacheMap:"));
    }

    @Test
    public void testGetPinnedKeysIsUnmodifiable() {
        cacheMap.pin("key1");
        Set pinnedKeys = cacheMap.getPinnedKeys();
        try {
            pinnedKeys.add("anotherKey");
            fail("getPinnedKeys dovrebbe restituire un set non modificabile");
        } catch (UnsupportedOperationException e) {
            // previsto
        }
    }
}
