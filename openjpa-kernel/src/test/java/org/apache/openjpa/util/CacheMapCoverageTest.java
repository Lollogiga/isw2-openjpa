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

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.junit.*;
import org.junit.Test;

/**
 * Test class for CacheMap to improve code coverage.
 * This class specifically targets methods with low or zero coverage
 * as indicated by the JaCoCo report.
 */
public class CacheMapCoverageTest {

    private CacheMap cacheMap;
    private static final String KEY_1 = "K1";
    private static final String VALUE_1 = "V1";
    private static final String KEY_2 = "K2";
    private static final String VALUE_2 = "V2";

    @Before
    public void setUp() {
        cacheMap = new CacheMap(true, 1, 1, 0.75f, 1);
        cacheMap.setSoftReferenceSize(1);
    }

    @Test
    public void testConstructors() {
        // Test default constructor
        CacheMap defaultCache = new CacheMap();
        Assert.assertEquals(1000, defaultCache.getCacheSize());
        Assert.assertFalse(defaultCache.isLRU());

        // Test constructor with LRU flag
        CacheMap lruCache = new CacheMap(true);
        Assert.assertEquals(1000, lruCache.getCacheSize());
        Assert.assertTrue(lruCache.isLRU());

        // Test constructor with LRU and max size
        CacheMap sizedCache = new CacheMap(false, 500);
        Assert.assertEquals(500, sizedCache.getCacheSize());
        Assert.assertFalse(sizedCache.isLRU());

        CacheMap deprecatedCache = new CacheMap(true, -1, -1, 0.75f);
        Assert.assertEquals(-1, deprecatedCache.getCacheSize());
        deprecatedCache.put(KEY_1, VALUE_1);
        Assert.assertEquals(1, deprecatedCache.size());
        Assert.assertEquals(VALUE_1, deprecatedCache.get(KEY_1));

    }

    @Test
    public void testRemove() {
        cacheMap.put(KEY_1, VALUE_1);
        Assert.assertTrue(cacheMap.containsKey(KEY_1));

        Object removedValue = cacheMap.remove(KEY_1);
        Assert.assertEquals(VALUE_1, removedValue);
        Assert.assertFalse(cacheMap.containsKey(KEY_1));
        Assert.assertEquals(0, cacheMap.size());
    }

    //* Line 442:
    //     * If <code>key</code> is pinned into the cache, the pin is
    //     * cleared and the object is removed.
    //     */
    @Test
    public void testRemovePinnedKey() {
        cacheMap.put(KEY_1, VALUE_1);
        cacheMap.pin(KEY_1);

        // Removing a pinned key should set its value to null but keep it pinned
        Object removedValue = cacheMap.remove(KEY_1);
        Assert.assertEquals(VALUE_1, removedValue);
        Assert.assertTrue(cacheMap.getPinnedKeys().contains(KEY_1));
        Assert.assertNull(cacheMap.get(KEY_1)); // The value is now null
        Assert.assertEquals(0, cacheMap.size()); // _pinnedSize is decremented

        cacheMap.unpin(KEY_1);
        Assert.assertFalse(cacheMap.getPinnedKeys().contains(KEY_1));
    }


    @Test
    public void testPutAll() {
        Map<String, String> newEntries = new HashMap<>();
        newEntries.put(KEY_1, VALUE_1);
        newEntries.put(KEY_2, VALUE_2);

        cacheMap.putAll(newEntries);
        Assert.assertEquals(2, cacheMap.size());
        Assert.assertEquals(VALUE_2, cacheMap.get(KEY_2)); // è necessario avere prima get(KEY_2)!
        Assert.assertEquals(VALUE_1, cacheMap.get(KEY_1));

        // Test putAll with replaceExisting = false
        Map<String, String> moreEntries = new HashMap<>();
        moreEntries.put(KEY_1, "NV1"); // This should not replace
        moreEntries.put("K3", "V3");    // This should be added

        cacheMap.putAll(moreEntries, false);

        Assert.assertEquals(2, cacheMap.size());

        Assert.assertEquals("V3", cacheMap.get("K3"));
        Assert.assertEquals(VALUE_1, cacheMap.get(KEY_1)); // Unchanged

    }

    @Test
    public void testContainsValue() {
        cacheMap.put(KEY_1, VALUE_1);
        Assert.assertTrue(cacheMap.containsValue(VALUE_1));
        Assert.assertFalse(cacheMap.containsValue(VALUE_2));
    }

    @Test
    public void testSizeAndIsEmpty() {
        Assert.assertTrue(cacheMap.isEmpty());
        Assert.assertEquals(0, cacheMap.size());

        cacheMap.put(KEY_1, VALUE_1);
        Assert.assertFalse(cacheMap.isEmpty());
        Assert.assertEquals(1, cacheMap.size());
    }

    // Test for set/get CacheSize and SoftReferenceSize
    @Test
    public void testGetAndSetSizesCache() {

        cacheMap.setCacheSize(10);
        Assert.assertEquals(10, cacheMap.getCacheSize());

        cacheMap.setCacheSize(-1); //Set to MAX_value
        Assert.assertEquals(-1, cacheMap.getCacheSize());

        cacheMap.setCacheSize(Integer.MAX_VALUE);
        Assert.assertEquals(-1, cacheMap.getCacheSize());

    }

    @Test
    public void testGetAndSetSizesSoftCache() {

        cacheMap.setSoftReferenceSize(10);
        Assert.assertEquals(10, cacheMap.getSoftReferenceSize());

        cacheMap.setSoftReferenceSize(-1); //Set to MAX_value
        Assert.assertEquals(-1, cacheMap.getSoftReferenceSize());

        cacheMap.setSoftReferenceSize(Integer.MAX_VALUE);
        Assert.assertEquals(-1, cacheMap.getSoftReferenceSize());

    }

    @Test
    public void testIsLRU() {
        CacheMap lruCache = new CacheMap(true);
        Assert.assertTrue(lruCache.isLRU());

        CacheMap nonLruCache = new CacheMap(false);
        Assert.assertFalse(nonLruCache.isLRU());
    }

    @Test
    public void testClear() {
        cacheMap.put(KEY_1, VALUE_1);
        cacheMap.put(KEY_2, VALUE_2);
        cacheMap.pin(KEY_1);

        Assert.assertFalse(cacheMap.isEmpty());

        cacheMap.clear();

        Assert.assertTrue(cacheMap.isEmpty());
        Assert.assertTrue(cacheMap.getPinnedKeys().isEmpty());
        Assert.assertEquals(0, cacheMap.size());
    }

    //Added for mutation 311 e 330
    @Test
    public void testWriteUnlockCalledOnException() throws Exception {
        // GIVEN
        CacheMap cacheMap = new CacheMap(true, 1, 1, 0.75f) {
            @Override
            protected Object remove(Map map, Object key) {
                throw new RuntimeException("Simulated failure");
            }
        };

        Field lockField = CacheMap.class.getDeclaredField("rwl");
        lockField.setAccessible(true);
        ReentrantReadWriteLock lock = (ReentrantReadWriteLock) lockField.get(cacheMap);

        //Test su pin:
        try {
            cacheMap.pin(KEY_1);
        } catch (RuntimeException ignored) {
        }

        Assert.assertEquals("Il write lock dovrebbe essere stato rilasciato", 0, lock.getWriteHoldCount());

        //Test su unpin:
        try {
            cacheMap.unpin(KEY_1);
        } catch (RuntimeException ignored) {
        }

        Assert.assertEquals("Il write lock dovrebbe essere stato rilasciato", 0, lock.getWriteHoldCount());

    }

}
