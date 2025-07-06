/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.openjpa.util;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CacheMapPutTest {

    // Parametri del test
    private final String description;
    private final Object keyToPut;
    private final Object valueToPut;
    private final TestState initialState;
    private final Object expectedReturnValue;

    // Sostituito con la nostra sottoclasse per i test
    private CacheMapWithListener cacheMap;

    // Costanti per i test
    private static final String KEY_1 = "K1";
    private static final String VALUE_1 = "V1";
    private static final String KEY_2 = "K2";
    private static final String VALUE_2 = "V2";
    private static final String OVERFLOW_KEY = "OVK";
    private static final String OVERFLOW_VALUE = "OVV";

    private enum TestState {
        EMPTY,
        KEY_IN_CACHE,
        KEY_PINNED,
        OVERFLOW_EVICTION,
        MAX_SIZE_ZERO,
        KEY_PINNED_WITH_NULL
    }

    /**
     * Sottoclasse di CacheMap per tracciare le chiamate ai metodi listener,
     * rendendo testabili gli effetti collaterali di put().
     */
    private static class CacheMapWithListener extends CacheMap {
        int addedCount = 0;
        int removedCount = 0;
        boolean wasEvicted = false; //Evicted = true se la cache diviene piena

        // Costruttori necessari
        public CacheMapWithListener(boolean lru, int initialCapacity, int maxSize, float loadFactor) {
            super(lru, initialCapacity, maxSize, loadFactor);
        }

        @Override
        protected void entryAdded(Object key, Object value) {
            this.addedCount++;
            super.entryAdded(key, value);
        }

        @Override
        protected void entryRemoved(Object key, Object value, boolean evicted) {
            this.removedCount++;
            this.wasEvicted = evicted;
            super.entryRemoved(key, value, evicted);
        }
    }

    // Costruttore per iniettare i parametri
    public CacheMapPutTest(String description, Object keyToPut, Object valueToPut, TestState initialState,
                           Object expectedReturnValue) {
        this.description = description;
        this.keyToPut = keyToPut;
        this.valueToPut = valueToPut;
        this.initialState = initialState;
        this.expectedReturnValue = expectedReturnValue;
    }


    @Parameterized.Parameters(name = "{index}: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Put test: null key", null, VALUE_1, TestState.EMPTY, null},
                {"Put test: null value", KEY_1, null, TestState.EMPTY, null},

                {"Put test: put key in empty map", KEY_1, VALUE_1, TestState.EMPTY, null},
                {"Put test: update existing key", KEY_1, VALUE_2, TestState.KEY_IN_CACHE, VALUE_1},
                {"Put test: overflow causing eviction", KEY_2, VALUE_2, TestState.OVERFLOW_EVICTION, null},
                {"Put test: update pinned key", KEY_1, VALUE_2, TestState.KEY_PINNED, VALUE_1},
                //Added after jacoco
                {"Put test: maxSize = 0", KEY_1, VALUE_1, TestState.MAX_SIZE_ZERO, null},
                {"Put test: set value for a key pinned with null", KEY_1, VALUE_1, TestState.KEY_PINNED_WITH_NULL, null},
        });
    }

    @Before
    public void setUp() {
        // Usiamo la nostra sottoclasse per poter tracciare le chiamate
        cacheMap = new CacheMapWithListener(true, 1, 1, 0.75f);
        cacheMap.setSoftReferenceSize(1);

        switch (initialState) {
            case EMPTY:
                break;
            case KEY_IN_CACHE:
                cacheMap.put(KEY_1, VALUE_1);
                break;
            case KEY_PINNED:
                cacheMap.put(KEY_1, VALUE_1);
                cacheMap.pin(KEY_1);
                break;
            case OVERFLOW_EVICTION:
                cacheMap.put(KEY_1, VALUE_1);
                cacheMap.put(OVERFLOW_KEY, OVERFLOW_VALUE);
                break;
            case MAX_SIZE_ZERO:
                cacheMap.setCacheSize(0);
                break;
            case KEY_PINNED_WITH_NULL:
                cacheMap.pin(KEY_1);
                break;
        }
        // Resettiamo i contatori dopo ogni setup
        cacheMap.addedCount = 0;
        cacheMap.removedCount = 0;
        cacheMap.wasEvicted = false;
    }

    @Test
    public void testPut() {
        Object returnValue = cacheMap.put(keyToPut, valueToPut);
        Assert.assertEquals("Il valore di ritorno di put() non è corretto", expectedReturnValue, returnValue);

        //Refactoring for mutation 391 to 397
        switch (initialState) {
            case EMPTY:
                Assert.assertEquals( 1, cacheMap.addedCount);
                Assert.assertEquals(0, cacheMap.removedCount);
                break;

            case KEY_IN_CACHE:
                // Un valore viene rimosso, uno viene aggiunto
                Assert.assertEquals(1, cacheMap.removedCount);
                Assert.assertEquals( 1, cacheMap.addedCount);
                Assert.assertFalse(cacheMap.wasEvicted);
                break;

            case OVERFLOW_EVICTION:
                // Un valore viene espulso (evicted), uno viene aggiunto
                Assert.assertEquals(1, cacheMap.removedCount);
                Assert.assertTrue(cacheMap.wasEvicted);
                Assert.assertEquals(1, cacheMap.addedCount);
                break;

            case KEY_PINNED:
                // Simile a KEY_IN_CACHE, ma su una chiave pinnata
                Assert.assertEquals(1, cacheMap.removedCount);
                Assert.assertEquals(1, cacheMap.addedCount);
                break;

            case KEY_PINNED_WITH_NULL:
                // Viene solo aggiunto un valore, nulla viene rimosso
                Assert.assertEquals(0, cacheMap.removedCount);
                Assert.assertEquals(1, cacheMap.addedCount);
                // Questa asserzione uccide la mutazione su _pinnedSize++
                Assert.assertEquals(1, cacheMap.size());
                break;

            case MAX_SIZE_ZERO:
                Assert.assertEquals(0, cacheMap.addedCount);
                Assert.assertEquals(0, cacheMap.removedCount);
                Assert.assertNull( cacheMap.get(keyToPut));
                break;
        }
    }

    @After
    public void tearDown() {
        if (cacheMap != null) {
            cacheMap.clear();
        }
    }
}