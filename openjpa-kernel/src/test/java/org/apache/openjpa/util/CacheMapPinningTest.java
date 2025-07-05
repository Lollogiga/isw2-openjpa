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
public class CacheMapPinningTest {

    // Parametri del test
    private final String description;
    private final Object keyToTest;
    private final Action actionToPerform;
    private final InitialState initialState;
    private final boolean expectedReturnValue;

    private CacheMap cacheMap;

    // Costanti
    private static final String KEY_1 = "K1";
    private static final String VALUE_1 = "V1";
    private static final String KEY_2 = "K2";
    private static final String VALUE_2 = "V2";
    private static final String OVERFLOW_KEY = "OVK";
    private static final String OVERFLOW_VALUE = "OVV";
    // Enum per definire lo stato iniziale della mappa
    private enum InitialState {
        EMPTY,
        KEY_IN_CACHE,
        KEY_IN_SOFT_CACHE,
        KEY_PINNED,
        CACHE_FULL_WITH_ANOTHER_KEY,
        KEY_PINNED_WITH_NULL_VALUE

    }

    // Enum per definire l'azione da testare
    private enum Action {
        PIN,
        UNPIN
    }

    // Costruttore del test
    public CacheMapPinningTest(String description, Object keyToTest, Action action,
                               InitialState initialState, boolean expectedReturnValue) {
        this.description = description;
        this.keyToTest = keyToTest;
        this.actionToPerform = action;
        this.initialState = initialState;
        this.expectedReturnValue = expectedReturnValue;
    }

    // Definizione dei casi di test
    @Parameterized.Parameters(name = "{index}: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                // Description, KeyToTest, Action, InitialState, ExpectedReturnValue

                // --- Test per PIN ---
                {"Pin Test: Key not in cache", KEY_1, Action.PIN, InitialState.EMPTY, false},
                {"Pin Test: Key in main cache", KEY_1, Action.PIN, InitialState.KEY_IN_CACHE, true},
                {"Pin Test: Key in soft cache", KEY_1, Action.PIN, InitialState.KEY_IN_SOFT_CACHE, true},
                {"Pin Test: Key already pinned", KEY_1, Action.PIN, InitialState.KEY_PINNED, true},

                // --- Test per UNPIN ---
                {"Unpin Test: Key is pinned", KEY_1, Action.UNPIN, InitialState.KEY_PINNED, true},
                {"Unpin Test: Key not in cache", KEY_2, Action.UNPIN, InitialState.KEY_IN_CACHE, false},
                {"Unpin Test: Key into full cache (causes overflow)", OVERFLOW_KEY, Action.UNPIN, InitialState.CACHE_FULL_WITH_ANOTHER_KEY, true},

                //Add after jacoco:
                {"Pin test: key already pinned return false", KEY_1, Action.PIN, InitialState.KEY_PINNED_WITH_NULL_VALUE, false},
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
                cacheMap.put(KEY_1, VALUE_1);
                break;
            case KEY_IN_SOFT_CACHE:
                cacheMap.put(KEY_1, VALUE_1);
                cacheMap.put(KEY_2, VALUE_2); // Fa uscire K1 e lo sposta in softMap
                break;
            case KEY_PINNED:
                cacheMap.put(KEY_1, VALUE_1);
                cacheMap.pin(KEY_1);
                break;
            case CACHE_FULL_WITH_ANOTHER_KEY:
                cacheMap.put(OVERFLOW_KEY, OVERFLOW_VALUE);
                cacheMap.pin(OVERFLOW_KEY);        // Pinna K1, svuotando la cache principale
                cacheMap.put(KEY_2, VALUE_2); // Riempie la cache principale con K2
                break;
            case KEY_PINNED_WITH_NULL_VALUE:
                cacheMap.put(KEY_1, VALUE_1);
                cacheMap.pin(KEY_1);
                cacheMap.remove(KEY_1); //Value is null
                break;
        }
    }

    @Test
    public void testPinningActions() {
        if (actionToPerform == Action.PIN) {
            boolean pinResult = cacheMap.pin(keyToTest);
            Assert.assertEquals(expectedReturnValue, pinResult);
            if (pinResult) {
                Assert.assertTrue("La chiave non risulta pinnata", cacheMap.getPinnedKeys().contains(keyToTest));
            }

        }else if (actionToPerform == Action.UNPIN) {
            boolean unpinResult = cacheMap.unpin(keyToTest);
            Assert.assertEquals(expectedReturnValue, unpinResult);
            Assert.assertFalse("La chiave non deve più essere pinnata", cacheMap.getPinnedKeys().contains(keyToTest));

            if (unpinResult) {
                Assert.assertTrue("La chiave 'unpinnata' doveva essere nella cache", cacheMap.containsKey(keyToTest));
            }

            // Verifica specifica per il caso critico di overflow
            if (initialState == InitialState.CACHE_FULL_WITH_ANOTHER_KEY) {
                cacheMap.put(KEY_1, VALUE_1);
                Assert.assertFalse(cacheMap.containsKey(keyToTest));
            }
        }
    }

    @After
    public void tearDown() {
        if (cacheMap != null) {
            cacheMap.clear();
        }
    }
}