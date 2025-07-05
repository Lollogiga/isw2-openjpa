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
public class CacheMapGetTest {

    private final String description;
    private final Object keyToGet;
    private final TestState initialState;
    private final Object expectedValue;
    private final Class<? extends Exception> expectedException;

    private CacheMap cacheMap;

    private static final String KEY_1 = "K1";
    private static final String VALUE_1 = "V1";
    private static final String KEY_2 = "K2";
    private static final String VALUE_2 = "V2";

    private enum TestState {
        EMPTY,
        KEY_IN_CACHE,
        KEY_EVICTED_TO_SOFT,
        KEY_PINNED,
    }

    public CacheMapGetTest(String description, Object keyToGet, TestState initialState,
                           Object expectedValue, Class<? extends Exception> expectedException) {
        this.description = description;
        this.keyToGet = keyToGet;
        this.initialState = initialState;
        this.expectedValue = expectedValue;
        this.expectedException = expectedException;
    }

    @Parameterized.Parameters(name = "{index}: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                // --- Description, KeyToGet, initialState, expectedValue, expectedException ---

                // Black-box: mi aspettavo NullPointerException;
                // White-box: il metodo ritorna null senza eccezioni se la mappa è vuota
                {"Get: Key null", null, TestState.EMPTY, null, null},

                {"Get: invalid key", 1, TestState.KEY_IN_CACHE, null, null},
                {"Get: valid key not in cacheMap", KEY_2, TestState.KEY_IN_CACHE, null, null},
                {"Get: valid key in cacheMap", KEY_1, TestState.KEY_IN_CACHE, VALUE_1, null},
                {"Get: Key in soft cache", KEY_1, TestState.KEY_EVICTED_TO_SOFT, VALUE_1, null},
                {"Get: Key pinned", KEY_1, TestState.KEY_PINNED, VALUE_1, null},
        });
    }

    @Before
    public void setUp() {
        cacheMap = new CacheMap(true, 1, 1, 0.75f);

        switch (initialState) {
            case EMPTY:
                break;

            case KEY_IN_CACHE:
                cacheMap.put(KEY_1, VALUE_1);
                break;

            case KEY_EVICTED_TO_SOFT:
                //Vogliamo testare l'uscita di un elemento
                cacheMap.setSoftReferenceSize(1);
                cacheMap.put(KEY_1, VALUE_1);
                cacheMap.put(KEY_2, VALUE_2); // K1 viene sposta in softMAP
                Assert.assertEquals(VALUE_2, cacheMap.get(KEY_2));
                break;

            case KEY_PINNED:
                //Vogliamo testare che un elemento pinnato non esce dalla struttura
                cacheMap.setSoftReferenceSize(1);
                cacheMap.put(KEY_1, VALUE_1);
                cacheMap.put(KEY_2, VALUE_2);
                cacheMap.pin(KEY_2);
                break;
        }
    }

    @Test
    public void testGet() {
        try {
            Object result = cacheMap.get(keyToGet);

            if (expectedException != null) {
                Assert.fail("Attesa eccezione " + expectedException.getSimpleName() + " ma non è stata lanciata.");
            }

            Assert.assertEquals("Valore restituito non corretto", expectedValue, result);

            if (initialState == TestState.KEY_EVICTED_TO_SOFT) {
                // Dopo la get, la chiave K1 è tornata "attiva", quindi mettendo un nuovo elemento dovrebbe uscire K2
                cacheMap.put("K3", "V3");
                Object val = cacheMap.get(KEY_1);
                Assert.assertEquals(VALUE_1, val);
                val = cacheMap.get(KEY_2);
                Assert.assertNull(val);

            }else if (initialState == TestState.KEY_PINNED) {
                cacheMap.put("K3", "V3");
                Object val = cacheMap.get(KEY_1);
                Assert.assertEquals(VALUE_1, val);
                //Ora ci aspettiamo che la key, essendo pinnata, sia ancora presente
                val = cacheMap.get(KEY_2);
                Assert.assertEquals(VALUE_2, val);
            }


        } catch (Exception e) {
            if (expectedException == null) {
                Assert.fail("Eccezione inattesa: " + e.getClass().getSimpleName());
            }
            Assert.assertTrue("Eccezione attesa di tipo diverso",
                    expectedException.isAssignableFrom(e.getClass()));
        }
    }

    @After
    public void tearDown() {
        if (cacheMap != null) {
            cacheMap.clear();
        }
    }
}
