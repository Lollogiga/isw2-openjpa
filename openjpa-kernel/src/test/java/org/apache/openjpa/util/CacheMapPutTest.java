/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
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
    private final Object expectedReturnValue; // Valore che put() dovrebbe ritornare (il vecchio valore)
    private final Class<? extends Exception> expectedException;

    private CacheMap cacheMap;

    // Costanti per i test
    private static final String KEY_1 = "K1";
    private static final String VALUE_1 = "V1";
    private static final String KEY_2 = "K2";
    private static final String VALUE_2 = "V2";
    private static final String NEW_VALUE_2 = "NV2";
    private static final String OVERFLOW_KEY = "OVK";
    private static final String OVERFLOW_VALUE = "OVV";

    private enum TestState {
        EMPTY,
        KEY_IN_CACHE,
        KEY_PINNED,
        OVERFLOW,
        MAX_SIZE_ZERO,
        KEY_PINNED_NULL
    }

    // Costruttore per iniettare i parametri
    public CacheMapPutTest(String description, Object keyToPut, Object valueToPut, TestState initialState,
                           Object expectedReturnValue, Class<? extends Exception> expectedException) {
        this.description = description;
        this.keyToPut = keyToPut;
        this.valueToPut = valueToPut;
        this.initialState = initialState;
        this.expectedReturnValue = expectedReturnValue;
        this.expectedException = expectedException;
    }

    // Definizione dei casi di test
    @Parameterized.Parameters(name = "{index}: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                // Description, KeyToPut, ValueToPut, initialState, expectedReturnValue, expectedException

                /** Dall'analisi delle funzionalità mi aspettavo un NullPointerExceptionThrows:
                //Dalle specifiche di Put--> Throws:
                //UnsupportedOperationException – if the remove operation is not supported by this map
                //ClassCastException – if the key is of an inappropriate type for this map (optional)
                //NullPointerException – if the specified key is null and this map does not permit null keys (optional)*/
                //{"Put test: null key", null, VALUE_1, TestState.EMPTY, null, NullPointerException.class },

                {"Put test: null key", null, VALUE_1, TestState.EMPTY, null, null},
                {"Pu test: null value", KEY_1, null, TestState.EMPTY, null, null},

                {"Put test: put value in empty map", KEY_1, VALUE_1, TestState.EMPTY, null, null},
                {"Put test: update existing key", KEY_1, VALUE_2, TestState.KEY_IN_CACHE, VALUE_1, null},

                {"Put test: overflow", KEY_2, VALUE_2, TestState.OVERFLOW, null, null},
                {"Put test: update pinned key",KEY_2, NEW_VALUE_2, TestState.KEY_PINNED, VALUE_2, null},

                //Added after jacoco:
                {"Put test: maxSize = 0", KEY_1, VALUE_1, TestState.MAX_SIZE_ZERO, null, null},
                {"Put test: add value to key pinned with null", KEY_1, VALUE_1, TestState.KEY_PINNED_NULL, null, null},
        });
    }

    @Before
    public void setUp() {
        cacheMap = new CacheMap(true, 1, 1, 0.75f);
        cacheMap.setSoftReferenceSize(1);

        switch (initialState) {
            case EMPTY:
                break;
            case KEY_IN_CACHE:
                // Inseriamo un elemento per i test di aggiornamento e overflow
                cacheMap.put(KEY_1, VALUE_1);
                break;

            case KEY_PINNED:
                cacheMap.setSoftReferenceSize(1);
                cacheMap.put(KEY_2, VALUE_2);
                cacheMap.pin(KEY_2);
                cacheMap.put(KEY_1, VALUE_1);
                cacheMap.put("K3", "V3");
                break;
            case OVERFLOW:
                cacheMap.setSoftReferenceSize(1);
                cacheMap.put(KEY_1, VALUE_1);
                cacheMap.put(OVERFLOW_KEY, OVERFLOW_VALUE);
                break;
            case MAX_SIZE_ZERO:
                cacheMap.setCacheSize(0);
                break;
            case KEY_PINNED_NULL:
                cacheMap.pin(KEY_1);
                break;
        }
    }

    @Test
    public void testPut() {
        try {
            // Eseguiamo l'operazione di put
            Object returnValue = cacheMap.put(keyToPut, valueToPut);

            // 1. Verifichiamo che l'eccezione (se attesa) sia stata lanciata
            if (expectedException != null) {
                Assert.fail("Attesa eccezione " + expectedException.getSimpleName() + " ma non è stata lanciata.");
            }

            if(initialState == TestState.MAX_SIZE_ZERO) {
                Assert.assertNull(returnValue);
                Assert.assertNull(cacheMap.get(keyToPut));
            }
            else{
                Assert.assertEquals(expectedReturnValue, returnValue);
                Assert.assertEquals("Il valore nella mappa dopo put() non è corretto", valueToPut, cacheMap.get(keyToPut));

                if(initialState == TestState.OVERFLOW) {
                    Assert.assertFalse(cacheMap.containsKey(OVERFLOW_KEY));
                } else if (initialState == TestState.KEY_PINNED) {
                    Assert.assertTrue(cacheMap.containsKey(keyToPut));
                    Assert.assertTrue(cacheMap.getPinnedKeys().contains(keyToPut));
                    Assert.assertEquals(NEW_VALUE_2, cacheMap.get(keyToPut));

                }
            }

        } catch (Exception e) {
            if (expectedException == null) {
                Assert.fail("Lanciata eccezione inattesa: " + e.getClass().getSimpleName());
            }
            Assert.assertTrue("L'eccezione lanciata non è del tipo atteso",
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