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
package org.apache.openjpa.generated.cm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: LRUMap max size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true, (int) 'a', (int) 'a', (float) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, (int) (short) 1, 1, (float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap0.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap0.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: LRUMap max size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, 1000, (int) (short) -1, (float) 1L);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap0.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean4 = cacheMap2.containsValue((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass5 = cacheMap2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, 1, (int) (short) -1, (float) 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 1000.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection6 = cacheMap5.values();
        cacheMap5.readLock();
        java.lang.Object obj8 = cacheMap0.remove((java.lang.Object) cacheMap5);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap0.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        boolean boolean4 = cacheMap0.pin((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap0.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.util.Set set2 = cacheMap0.entrySet();
        java.util.Set set3 = cacheMap0.getPinnedKeys();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) '#', (int) (byte) 10, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        cacheMap0.putAll((java.util.Map) cacheMap4, true);
        java.util.Collection collection8 = cacheMap0.values();
        boolean boolean9 = cacheMap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        boolean boolean3 = cacheMap0.isEmpty();
        cacheMap0.writeLock();
        java.lang.Class<?> wildcardClass5 = cacheMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.writeLock();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap0.writeUnlock();
// flaky "1) test017(org.apache.openjpa.generated.cm.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        cacheMap8.setCacheSize((int) (byte) 10);
        boolean boolean12 = cacheMap8.pin((java.lang.Object) 1);
        cacheMap3.putAll((java.util.Map) cacheMap8, true);
        int int15 = cacheMap3.getSoftReferenceSize();
        java.lang.Object obj17 = cacheMap3.remove((java.lang.Object) (-1.0d));
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap();
        cacheMap18.setCacheSize((int) (byte) 10);
        boolean boolean22 = cacheMap18.pin((java.lang.Object) 1);
        java.util.Collection collection23 = cacheMap18.values();
        boolean boolean24 = cacheMap18.isLRU();
        java.util.Set set25 = cacheMap18.getPinnedKeys();
        boolean boolean27 = cacheMap18.unpin((java.lang.Object) 0L);
        boolean boolean28 = cacheMap3.pin((java.lang.Object) 0L);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, (int) (short) 100, (int) '4', (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 35.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap0.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.util.Set set2 = cacheMap0.entrySet();
        cacheMap0.setCacheSize((int) (short) 0);
        java.util.Set set5 = cacheMap0.getPinnedKeys();
        cacheMap0.readLock();
        boolean boolean7 = cacheMap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) 100, (int) ' ', (float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 32.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, (int) (short) 1, (int) (byte) 0, (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) (short) 1, (int) (short) 0, (float) 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 1000.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true, (-1), 1000, (float) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: LRUMap max size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection6 = cacheMap5.values();
        cacheMap5.readLock();
        java.lang.Object obj8 = cacheMap0.remove((java.lang.Object) cacheMap5);
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap();
        cacheMap9.setCacheSize(10);
        boolean boolean12 = cacheMap9.isEmpty();
        cacheMap9.writeLock();
        cacheMap5.putAll((java.util.Map) cacheMap9);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean19 = cacheMap17.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection22 = cacheMap21.values();
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap();
        cacheMap23.setCacheSize((int) (byte) 10);
        java.lang.String str26 = cacheMap23.toString();
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap();
        boolean boolean28 = cacheMap27.isEmpty();
        cacheMap23.putAll((java.util.Map) cacheMap27, true);
        boolean boolean31 = cacheMap21.containsKey((java.lang.Object) true);
        java.util.Collection collection32 = cacheMap21.values();
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean37 = cacheMap35.containsValue((java.lang.Object) '4');
        boolean boolean38 = cacheMap21.containsKey((java.lang.Object) boolean37);
        boolean boolean39 = cacheMap17.pin((java.lang.Object) boolean38);
        cacheMap9.putAll((java.util.Map) cacheMap17, false);
        cacheMap17.setSoftReferenceSize((int) (short) 100);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "CacheMap:{}::{}" + "'", str26, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        cacheMap0.putAll((java.util.Map) cacheMap4, true);
        boolean boolean8 = cacheMap0.isLRU();
        cacheMap0.setSoftReferenceSize(10);
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj13 = cacheMap11.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj16 = cacheMap14.remove((java.lang.Object) (short) 1);
        cacheMap11.putAll((java.util.Map) cacheMap14, false);
        cacheMap0.putAll((java.util.Map) cacheMap14);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap14.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, 100);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        cacheMap3.setCacheSize((int) (byte) 10);
        java.lang.String str6 = cacheMap3.toString();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        boolean boolean8 = cacheMap7.isEmpty();
        cacheMap3.putAll((java.util.Map) cacheMap7, true);
        boolean boolean11 = cacheMap2.pin((java.lang.Object) true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection6 = cacheMap5.values();
        cacheMap5.readLock();
        java.lang.Object obj8 = cacheMap0.remove((java.lang.Object) cacheMap5);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.Object obj11 = cacheMap0.get(obj9);
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set13 = cacheMap12.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection16 = cacheMap15.values();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        cacheMap17.setCacheSize((int) (byte) 10);
        java.lang.String str20 = cacheMap17.toString();
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap();
        boolean boolean22 = cacheMap21.isEmpty();
        cacheMap17.putAll((java.util.Map) cacheMap21, true);
        boolean boolean25 = cacheMap15.containsKey((java.lang.Object) true);
        java.lang.Object obj26 = cacheMap0.put((java.lang.Object) set13, (java.lang.Object) boolean25);
        int int27 = cacheMap0.getCacheSize();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CacheMap:{}::{}" + "'", str20, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        cacheMap8.setCacheSize((int) (byte) 10);
        boolean boolean12 = cacheMap8.pin((java.lang.Object) 1);
        cacheMap3.putAll((java.util.Map) cacheMap8, true);
        int int15 = cacheMap3.getSoftReferenceSize();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap3.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = cacheMap10.pin(obj11);
        boolean boolean13 = cacheMap10.isLRU();
        cacheMap10.setCacheSize((int) (byte) -1);
        boolean boolean16 = cacheMap3.containsValue((java.lang.Object) cacheMap10);
        int int17 = cacheMap10.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) 1, (int) (byte) 0, (float) 1L, (int) '4');
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = cacheMap2.pin(obj3);
        java.util.Set set5 = cacheMap2.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        java.lang.String str9 = cacheMap6.toString();
        boolean boolean10 = cacheMap6.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection14 = cacheMap13.values();
        java.lang.Object obj15 = cacheMap6.put((java.lang.Object) 100L, (java.lang.Object) collection14);
        java.lang.Object obj16 = cacheMap2.remove((java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.lang.Object obj4 = cacheMap0.get((java.lang.Object) 100L);
        cacheMap0.clear();
        java.lang.Class<?> wildcardClass6 = cacheMap0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection2 = cacheMap1.values();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        cacheMap3.setCacheSize((int) (byte) 10);
        java.lang.String str6 = cacheMap3.toString();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        boolean boolean8 = cacheMap7.isEmpty();
        cacheMap3.putAll((java.util.Map) cacheMap7, true);
        boolean boolean11 = cacheMap1.containsKey((java.lang.Object) true);
        java.util.Collection collection12 = cacheMap1.values();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean17 = cacheMap15.containsValue((java.lang.Object) '4');
        boolean boolean18 = cacheMap1.containsKey((java.lang.Object) boolean17);
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap(false);
        cacheMap1.putAll((java.util.Map) cacheMap20, true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection2 = cacheMap1.values();
        cacheMap1.readLock();
        java.util.Set set4 = cacheMap1.getPinnedKeys();
        int int5 = cacheMap1.getCacheSize();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        boolean boolean4 = cacheMap0.containsValue((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        boolean boolean5 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        cacheMap0.putAll((java.util.Map) cacheMap6, false);
        boolean boolean12 = cacheMap0.unpin((java.lang.Object) (short) 10);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap();
        cacheMap13.setCacheSize((int) (byte) 10);
        java.lang.String str16 = cacheMap13.toString();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        boolean boolean18 = cacheMap17.isEmpty();
        java.lang.Object obj19 = cacheMap13.remove((java.lang.Object) cacheMap17);
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap();
        boolean boolean22 = cacheMap21.isEmpty();
        java.util.Set set23 = cacheMap21.entrySet();
        int int24 = cacheMap21.getCacheSize();
        java.lang.Object obj25 = cacheMap17.put((java.lang.Object) false, (java.lang.Object) int24);
        cacheMap17.setSoftReferenceSize((int) (short) 10);
        org.apache.openjpa.util.CacheMap cacheMap28 = new org.apache.openjpa.util.CacheMap();
        cacheMap28.setCacheSize(10);
        java.util.Set set31 = cacheMap28.entrySet();
        boolean boolean32 = cacheMap28.isLRU();
        boolean boolean33 = cacheMap17.containsValue((java.lang.Object) cacheMap28);
        boolean boolean34 = cacheMap0.containsKey((java.lang.Object) cacheMap17);
        int int35 = cacheMap17.getCacheSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CacheMap:{}::{}" + "'", str16, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1000 + "'", int24 == 1000);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1000 + "'", int35 == 1000);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        java.util.Set set10 = cacheMap0.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection13 = cacheMap12.values();
        cacheMap12.readLock();
        boolean boolean15 = cacheMap0.pin((java.lang.Object) cacheMap12);
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap();
        cacheMap16.setCacheSize(10);
        java.util.Set set19 = cacheMap16.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection22 = cacheMap21.values();
        cacheMap21.readLock();
        java.lang.Object obj24 = cacheMap16.remove((java.lang.Object) cacheMap21);
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = cacheMap16.get(obj25);
        boolean boolean28 = cacheMap0.containsValue(obj25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        boolean boolean3 = cacheMap0.isEmpty();
        java.lang.String str4 = cacheMap0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CacheMap:{}::{}" + "'", str4, "CacheMap:{}::{}");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap2.writeLock();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        boolean boolean4 = cacheMap0.pin((java.lang.Object) 1);
        java.util.Collection collection5 = cacheMap0.values();
        boolean boolean6 = cacheMap0.isLRU();
        java.util.Set set7 = cacheMap0.getPinnedKeys();
        boolean boolean9 = cacheMap0.unpin((java.lang.Object) 0L);
        int int10 = cacheMap0.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, 0, (int) ' ', (float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 32.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        cacheMap3.setCacheSize((int) (byte) 10);
        java.lang.String str6 = cacheMap3.toString();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        boolean boolean8 = cacheMap7.isEmpty();
        cacheMap3.putAll((java.util.Map) cacheMap7, true);
        boolean boolean11 = cacheMap3.isLRU();
        cacheMap3.setSoftReferenceSize(10);
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj16 = cacheMap14.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj19 = cacheMap17.remove((java.lang.Object) (short) 1);
        cacheMap14.putAll((java.util.Map) cacheMap17, false);
        cacheMap3.putAll((java.util.Map) cacheMap17);
        boolean boolean23 = cacheMap0.containsValue((java.lang.Object) cacheMap17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.writeLock();
        boolean boolean2 = cacheMap0.isLRU();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true, (int) (short) 10, 1000, (float) (short) 1, (int) 'a');
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = obj2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.lang.Object obj4 = cacheMap0.get((java.lang.Object) 100L);
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        cacheMap5.setCacheSize((int) (byte) 10);
        java.lang.String str8 = cacheMap5.toString();
        cacheMap0.putAll((java.util.Map) cacheMap5, false);
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap();
        cacheMap11.setCacheSize(10);
        java.util.Set set14 = cacheMap11.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection17 = cacheMap16.values();
        cacheMap16.readLock();
        java.lang.Object obj19 = cacheMap11.remove((java.lang.Object) cacheMap16);
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap();
        cacheMap20.setCacheSize(10);
        boolean boolean23 = cacheMap20.isEmpty();
        cacheMap20.writeLock();
        cacheMap16.putAll((java.util.Map) cacheMap20);
        org.apache.openjpa.util.CacheMap cacheMap28 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean30 = cacheMap28.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap32 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection33 = cacheMap32.values();
        org.apache.openjpa.util.CacheMap cacheMap34 = new org.apache.openjpa.util.CacheMap();
        cacheMap34.setCacheSize((int) (byte) 10);
        java.lang.String str37 = cacheMap34.toString();
        org.apache.openjpa.util.CacheMap cacheMap38 = new org.apache.openjpa.util.CacheMap();
        boolean boolean39 = cacheMap38.isEmpty();
        cacheMap34.putAll((java.util.Map) cacheMap38, true);
        boolean boolean42 = cacheMap32.containsKey((java.lang.Object) true);
        java.util.Collection collection43 = cacheMap32.values();
        org.apache.openjpa.util.CacheMap cacheMap46 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean48 = cacheMap46.containsValue((java.lang.Object) '4');
        boolean boolean49 = cacheMap32.containsKey((java.lang.Object) boolean48);
        boolean boolean50 = cacheMap28.pin((java.lang.Object) boolean49);
        cacheMap20.putAll((java.util.Map) cacheMap28, false);
        boolean boolean53 = cacheMap5.pin((java.lang.Object) cacheMap20);
        int int54 = cacheMap5.getCacheSize();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "CacheMap:{}::{}" + "'", str37, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true, (int) (short) 1, (int) (short) -1, (float) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        boolean boolean3 = cacheMap0.isEmpty();
        cacheMap0.setCacheSize((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap0.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        boolean boolean5 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        cacheMap0.putAll((java.util.Map) cacheMap6, false);
        boolean boolean12 = cacheMap0.unpin((java.lang.Object) (short) 10);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap();
        cacheMap13.setCacheSize((int) (byte) 10);
        java.lang.String str16 = cacheMap13.toString();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        boolean boolean18 = cacheMap17.isEmpty();
        java.lang.Object obj19 = cacheMap13.remove((java.lang.Object) cacheMap17);
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap();
        boolean boolean22 = cacheMap21.isEmpty();
        java.util.Set set23 = cacheMap21.entrySet();
        int int24 = cacheMap21.getCacheSize();
        java.lang.Object obj25 = cacheMap17.put((java.lang.Object) false, (java.lang.Object) int24);
        cacheMap17.setSoftReferenceSize((int) (short) 10);
        org.apache.openjpa.util.CacheMap cacheMap28 = new org.apache.openjpa.util.CacheMap();
        cacheMap28.setCacheSize(10);
        java.util.Set set31 = cacheMap28.entrySet();
        boolean boolean32 = cacheMap28.isLRU();
        boolean boolean33 = cacheMap17.containsValue((java.lang.Object) cacheMap28);
        boolean boolean34 = cacheMap0.containsKey((java.lang.Object) cacheMap17);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap0.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CacheMap:{}::{}" + "'", str16, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1000 + "'", int24 == 1000);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        cacheMap8.setCacheSize((int) (byte) 10);
        boolean boolean12 = cacheMap8.pin((java.lang.Object) 1);
        cacheMap3.putAll((java.util.Map) cacheMap8, true);
        int int15 = cacheMap3.getSoftReferenceSize();
        java.lang.Object obj17 = cacheMap3.remove((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            cacheMap3.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        cacheMap0.writeLock();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection10 = cacheMap9.values();
        cacheMap9.readLock();
        boolean boolean12 = cacheMap0.containsValue((java.lang.Object) cacheMap9);
        boolean boolean13 = cacheMap0.isEmpty();
        java.lang.Class<?> wildcardClass14 = cacheMap0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        java.lang.Object obj6 = cacheMap0.remove((java.lang.Object) cacheMap4);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        boolean boolean9 = cacheMap8.isEmpty();
        java.util.Set set10 = cacheMap8.entrySet();
        int int11 = cacheMap8.getCacheSize();
        java.lang.Object obj12 = cacheMap4.put((java.lang.Object) false, (java.lang.Object) int11);
        cacheMap4.setSoftReferenceSize((int) (short) 10);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        cacheMap15.setCacheSize(10);
        java.util.Set set18 = cacheMap15.entrySet();
        boolean boolean19 = cacheMap15.isLRU();
        boolean boolean20 = cacheMap4.containsValue((java.lang.Object) cacheMap15);
        java.util.Collection collection21 = cacheMap4.values();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, 32, 0, (float) 1000, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 1000.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean4 = cacheMap2.containsValue((java.lang.Object) '4');
        java.util.Set set5 = cacheMap2.keySet();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        boolean boolean7 = cacheMap6.isEmpty();
        java.lang.Object obj9 = cacheMap6.remove((java.lang.Object) 1);
        java.lang.Object obj10 = cacheMap2.remove((java.lang.Object) 1);
        java.util.Collection collection11 = cacheMap2.values();
        boolean boolean13 = cacheMap2.pin((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap2.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        int int3 = cacheMap0.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        boolean boolean6 = cacheMap4.isEmpty();
        java.lang.Object obj7 = cacheMap0.remove((java.lang.Object) cacheMap4);
        java.lang.Class<?> wildcardClass8 = cacheMap0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = cacheMap2.pin(obj3);
        boolean boolean5 = cacheMap2.isLRU();
        java.lang.Class<?> wildcardClass6 = cacheMap2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        cacheMap0.readLock();
        java.lang.Object obj12 = cacheMap0.get((java.lang.Object) 10L);
        java.lang.String str13 = cacheMap0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CacheMap:{100=[]}::{}" + "'", str13, "CacheMap:{100=[]}::{}");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (short) -1, (int) (byte) 10, (float) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        cacheMap0.putAll((java.util.Map) cacheMap4, true);
        boolean boolean8 = cacheMap0.isLRU();
        cacheMap0.setSoftReferenceSize(10);
        cacheMap0.writeLock();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean6 = cacheMap4.pin(obj5);
        boolean boolean7 = cacheMap4.isLRU();
        cacheMap1.putAll((java.util.Map) cacheMap4, false);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        cacheMap10.setCacheSize((int) (byte) 10);
        java.lang.String str13 = cacheMap10.toString();
        boolean boolean14 = cacheMap10.isEmpty();
        java.util.Set set15 = cacheMap10.keySet();
        boolean boolean16 = cacheMap1.containsValue((java.lang.Object) set15);
        boolean boolean18 = cacheMap1.pin((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CacheMap:{}::{}" + "'", str13, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        java.lang.Object obj6 = cacheMap0.remove((java.lang.Object) cacheMap4);
        int int7 = cacheMap4.getCacheSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1000 + "'", int7 == 1000);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        java.lang.Object obj6 = cacheMap0.remove((java.lang.Object) cacheMap4);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        boolean boolean9 = cacheMap8.isEmpty();
        java.util.Set set10 = cacheMap8.entrySet();
        int int11 = cacheMap8.getCacheSize();
        java.lang.Object obj12 = cacheMap4.put((java.lang.Object) false, (java.lang.Object) int11);
        boolean boolean13 = cacheMap4.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj16 = cacheMap14.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj19 = cacheMap17.remove((java.lang.Object) (short) 1);
        cacheMap14.putAll((java.util.Map) cacheMap17, false);
        java.util.Set set22 = cacheMap17.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap();
        int int24 = cacheMap23.getSoftReferenceSize();
        java.lang.Object obj25 = cacheMap4.put((java.lang.Object) set22, (java.lang.Object) cacheMap23);
        boolean boolean26 = cacheMap23.isEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection6 = cacheMap5.values();
        cacheMap5.readLock();
        java.lang.Object obj8 = cacheMap0.remove((java.lang.Object) cacheMap5);
        cacheMap0.readLock();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        java.util.Set set10 = cacheMap0.getPinnedKeys();
        cacheMap0.setSoftReferenceSize((int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        boolean boolean5 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        java.lang.String str9 = cacheMap6.toString();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        boolean boolean11 = cacheMap10.isEmpty();
        cacheMap6.putAll((java.util.Map) cacheMap10, true);
        java.util.Collection collection14 = cacheMap6.values();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        boolean boolean16 = cacheMap15.isEmpty();
        java.util.Set set17 = cacheMap15.entrySet();
        cacheMap15.setCacheSize((int) (short) 0);
        java.util.Set set20 = cacheMap15.getPinnedKeys();
        java.lang.Object obj21 = cacheMap0.put((java.lang.Object) collection14, (java.lang.Object) cacheMap15);
        cacheMap0.setSoftReferenceSize((int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.util.Set set2 = cacheMap0.entrySet();
        cacheMap0.setCacheSize((int) (short) 0);
        java.util.Set set5 = cacheMap0.getPinnedKeys();
        java.lang.String str6 = cacheMap0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        int int5 = cacheMap0.getCacheSize();
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = cacheMap8.pin(obj9);
        java.lang.Class<?> wildcardClass11 = cacheMap8.getClass();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj15 = new java.lang.Object();
        boolean boolean16 = cacheMap14.pin(obj15);
        java.lang.Object obj17 = cacheMap0.put((java.lang.Object) cacheMap8, (java.lang.Object) boolean16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.util.Set set2 = cacheMap0.entrySet();
        boolean boolean3 = cacheMap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        boolean boolean4 = cacheMap0.pin((java.lang.Object) 1);
        java.util.Collection collection5 = cacheMap0.values();
        boolean boolean6 = cacheMap0.isLRU();
        java.util.Set set7 = cacheMap0.getPinnedKeys();
        boolean boolean9 = cacheMap0.unpin((java.lang.Object) 0L);
        cacheMap0.setCacheSize((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.lang.Object obj4 = cacheMap0.get((java.lang.Object) 100L);
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        cacheMap5.setCacheSize((int) (byte) 10);
        java.lang.String str8 = cacheMap5.toString();
        cacheMap0.putAll((java.util.Map) cacheMap5, false);
        cacheMap5.writeLock();
        int int12 = cacheMap5.getCacheSize();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        java.lang.Object obj6 = cacheMap0.remove((java.lang.Object) cacheMap4);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        boolean boolean9 = cacheMap8.isEmpty();
        java.util.Set set10 = cacheMap8.entrySet();
        int int11 = cacheMap8.getCacheSize();
        java.lang.Object obj12 = cacheMap4.put((java.lang.Object) false, (java.lang.Object) int11);
        boolean boolean13 = cacheMap4.isEmpty();
        java.util.Set set14 = cacheMap4.getPinnedKeys();
        int int15 = cacheMap4.size();
        java.util.Set set16 = cacheMap4.keySet();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection2 = cacheMap1.values();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        cacheMap3.setCacheSize((int) (byte) 10);
        java.lang.String str6 = cacheMap3.toString();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        boolean boolean8 = cacheMap7.isEmpty();
        cacheMap3.putAll((java.util.Map) cacheMap7, true);
        boolean boolean11 = cacheMap1.containsKey((java.lang.Object) true);
        java.lang.String str12 = cacheMap1.toString();
        java.lang.Class<?> wildcardClass13 = cacheMap1.getClass();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CacheMap:{}::{}" + "'", str12, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) '4');
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        int int2 = cacheMap1.getCacheSize();
        java.lang.Class<?> wildcardClass3 = cacheMap1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1000 + "'", int2 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        boolean boolean4 = cacheMap0.pin((java.lang.Object) 1);
        java.util.Collection collection5 = cacheMap0.values();
        java.lang.String str6 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        cacheMap7.setCacheSize((int) (byte) 10);
        boolean boolean11 = cacheMap7.pin((java.lang.Object) 1);
        java.util.Collection collection12 = cacheMap7.values();
        boolean boolean13 = cacheMap7.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        cacheMap14.setCacheSize((int) (byte) 10);
        java.lang.String str17 = cacheMap14.toString();
        boolean boolean18 = cacheMap14.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection22 = cacheMap21.values();
        java.lang.Object obj23 = cacheMap14.put((java.lang.Object) 100L, (java.lang.Object) collection22);
        java.util.Set set24 = cacheMap14.getPinnedKeys();
        java.lang.Object obj26 = cacheMap14.remove((java.lang.Object) true);
        cacheMap7.putAll((java.util.Map) cacheMap14);
        java.lang.Object obj28 = cacheMap0.remove((java.lang.Object) cacheMap7);
        java.lang.Class<?> wildcardClass29 = cacheMap7.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CacheMap:{}::{}" + "'", str17, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.util.Set set2 = cacheMap0.entrySet();
        cacheMap0.setCacheSize((int) (short) 0);
        java.util.Set set5 = cacheMap0.getPinnedKeys();
        cacheMap0.readLock();
        java.util.Set set7 = cacheMap0.entrySet();
        cacheMap0.readLock();
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap();
        cacheMap9.setCacheSize((int) (byte) 10);
        java.lang.String str12 = cacheMap9.toString();
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap();
        boolean boolean14 = cacheMap13.isEmpty();
        cacheMap9.putAll((java.util.Map) cacheMap13, true);
        boolean boolean17 = cacheMap9.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap();
        cacheMap18.setCacheSize((int) (byte) 10);
        java.lang.String str21 = cacheMap18.toString();
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        boolean boolean23 = cacheMap22.isEmpty();
        cacheMap18.putAll((java.util.Map) cacheMap22, true);
        java.util.Collection collection26 = cacheMap22.values();
        org.apache.openjpa.util.CacheMap cacheMap28 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection29 = cacheMap28.values();
        cacheMap28.readLock();
        java.util.Set set31 = cacheMap28.getPinnedKeys();
        cacheMap22.putAll((java.util.Map) cacheMap28, true);
        boolean boolean34 = cacheMap9.unpin((java.lang.Object) cacheMap28);
        cacheMap0.putAll((java.util.Map) cacheMap28);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CacheMap:{}::{}" + "'", str12, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CacheMap:{}::{}" + "'", str21, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        boolean boolean8 = cacheMap0.isLRU();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap0.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = cacheMap2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap2.setCacheSize((int) '4');
        boolean boolean6 = cacheMap2.containsValue((java.lang.Object) 100);
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        cacheMap7.setCacheSize(10);
        java.lang.Object obj11 = cacheMap7.get((java.lang.Object) 100L);
        java.lang.Object obj12 = cacheMap2.remove((java.lang.Object) cacheMap7);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap();
        cacheMap13.setCacheSize(10);
        java.util.Set set16 = cacheMap13.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection19 = cacheMap18.values();
        cacheMap18.readLock();
        java.lang.Object obj21 = cacheMap13.remove((java.lang.Object) cacheMap18);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        cacheMap22.setCacheSize(10);
        boolean boolean25 = cacheMap22.isEmpty();
        cacheMap22.writeLock();
        cacheMap18.putAll((java.util.Map) cacheMap22);
        cacheMap7.putAll((java.util.Map) cacheMap18);
        java.lang.String str29 = cacheMap7.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "CacheMap:{}::{}" + "'", str29, "CacheMap:{}::{}");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        cacheMap0.putAll((java.util.Map) cacheMap4, true);
        boolean boolean8 = cacheMap0.isLRU();
        int int9 = cacheMap0.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        cacheMap10.setCacheSize(10);
        boolean boolean13 = cacheMap10.isEmpty();
        cacheMap10.setCacheSize((int) (byte) 10);
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap();
        cacheMap16.setCacheSize(10);
        java.lang.Object obj20 = cacheMap16.get((java.lang.Object) 100L);
        java.lang.Object obj21 = cacheMap0.put((java.lang.Object) (byte) 10, obj20);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.util.Set set2 = cacheMap0.entrySet();
        java.lang.String str3 = cacheMap0.toString();
        cacheMap0.writeLock();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        cacheMap0.readLock();
        java.lang.Object obj12 = cacheMap0.get((java.lang.Object) 10L);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap();
        cacheMap13.setCacheSize((int) (byte) 10);
        java.lang.String str16 = cacheMap13.toString();
        java.lang.Object obj17 = cacheMap0.get((java.lang.Object) cacheMap13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CacheMap:{}::{}" + "'", str16, "CacheMap:{}::{}");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.lang.Object obj4 = cacheMap0.get((java.lang.Object) 100L);
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        cacheMap5.setCacheSize((int) (byte) 10);
        java.lang.String str8 = cacheMap5.toString();
        cacheMap0.putAll((java.util.Map) cacheMap5, false);
        java.lang.String str11 = cacheMap5.toString();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CacheMap:{}::{}" + "'", str11, "CacheMap:{}::{}");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) ' ', (int) (byte) 0, (float) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 35.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, 0, 10, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, (int) (byte) 100, 10, 1.0f);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection2 = cacheMap1.values();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        cacheMap3.setCacheSize((int) (byte) 10);
        java.lang.String str6 = cacheMap3.toString();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        boolean boolean8 = cacheMap7.isEmpty();
        cacheMap3.putAll((java.util.Map) cacheMap7, true);
        boolean boolean11 = cacheMap1.containsKey((java.lang.Object) true);
        java.lang.String str12 = cacheMap1.toString();
        java.lang.String str13 = cacheMap1.toString();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CacheMap:{}::{}" + "'", str12, "CacheMap:{}::{}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CacheMap:{}::{}" + "'", str13, "CacheMap:{}::{}");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        java.util.Set set5 = cacheMap0.getPinnedKeys();
        cacheMap0.setCacheSize((int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) (byte) 100);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection2 = cacheMap1.values();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        cacheMap3.setCacheSize((int) (byte) 10);
        java.lang.String str6 = cacheMap3.toString();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        boolean boolean8 = cacheMap7.isEmpty();
        cacheMap3.putAll((java.util.Map) cacheMap7, true);
        boolean boolean11 = cacheMap1.containsKey((java.lang.Object) true);
        java.util.Collection collection12 = cacheMap1.values();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean17 = cacheMap15.containsValue((java.lang.Object) '4');
        boolean boolean18 = cacheMap1.containsKey((java.lang.Object) boolean17);
        java.lang.String str19 = cacheMap1.toString();
        int int20 = cacheMap1.getCacheSize();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CacheMap:{}::{}" + "'", str19, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1000 + "'", int20 == 1000);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        int int4 = cacheMap0.size();
        cacheMap0.setCacheSize((int) '4');
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean11 = cacheMap9.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection14 = cacheMap13.values();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        cacheMap15.setCacheSize((int) (byte) 10);
        java.lang.String str18 = cacheMap15.toString();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap();
        boolean boolean20 = cacheMap19.isEmpty();
        cacheMap15.putAll((java.util.Map) cacheMap19, true);
        boolean boolean23 = cacheMap13.containsKey((java.lang.Object) true);
        java.util.Collection collection24 = cacheMap13.values();
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean29 = cacheMap27.containsValue((java.lang.Object) '4');
        boolean boolean30 = cacheMap13.containsKey((java.lang.Object) boolean29);
        boolean boolean31 = cacheMap9.pin((java.lang.Object) boolean30);
        java.lang.Object obj32 = cacheMap0.remove((java.lang.Object) cacheMap9);
        boolean boolean33 = cacheMap9.isEmpty();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CacheMap:{}::{}" + "'", str18, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap2.setCacheSize((int) '4');
        boolean boolean6 = cacheMap2.containsValue((java.lang.Object) 100);
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        cacheMap7.setCacheSize(10);
        java.lang.Object obj11 = cacheMap7.get((java.lang.Object) 100L);
        java.lang.Object obj12 = cacheMap2.remove((java.lang.Object) cacheMap7);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap();
        cacheMap13.setCacheSize((int) (byte) 10);
        java.lang.String str16 = cacheMap13.toString();
        boolean boolean17 = cacheMap13.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection21 = cacheMap20.values();
        java.lang.Object obj22 = cacheMap13.put((java.lang.Object) 100L, (java.lang.Object) collection21);
        java.util.Set set23 = cacheMap13.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap25 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection26 = cacheMap25.values();
        cacheMap25.readLock();
        boolean boolean28 = cacheMap13.pin((java.lang.Object) cacheMap25);
        java.lang.Object obj29 = cacheMap7.get((java.lang.Object) cacheMap13);
        int int30 = cacheMap7.getSoftReferenceSize();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CacheMap:{}::{}" + "'", str16, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.lang.Object obj3 = cacheMap0.remove((java.lang.Object) 1);
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        java.lang.String str9 = cacheMap6.toString();
        boolean boolean10 = cacheMap6.isEmpty();
        cacheMap4.putAll((java.util.Map) cacheMap6, true);
        cacheMap0.putAll((java.util.Map) cacheMap4, true);
        java.util.Set set15 = cacheMap4.entrySet();
        java.util.Set set16 = cacheMap4.keySet();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        cacheMap0.readLock();
        java.util.Collection collection11 = cacheMap0.values();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        cacheMap12.setCacheSize((int) (byte) 10);
        boolean boolean16 = cacheMap12.pin((java.lang.Object) 1);
        java.util.Collection collection17 = cacheMap12.values();
        boolean boolean18 = cacheMap12.isLRU();
        java.util.Set set19 = cacheMap12.getPinnedKeys();
        boolean boolean21 = cacheMap12.unpin((java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        cacheMap22.setCacheSize((int) (byte) 10);
        java.lang.String str25 = cacheMap22.toString();
        boolean boolean26 = cacheMap22.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection30 = cacheMap29.values();
        java.lang.Object obj31 = cacheMap22.put((java.lang.Object) 100L, (java.lang.Object) collection30);
        java.util.Set set32 = cacheMap22.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap34 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection35 = cacheMap34.values();
        cacheMap34.readLock();
        boolean boolean37 = cacheMap22.pin((java.lang.Object) cacheMap34);
        cacheMap12.putAll((java.util.Map) cacheMap22);
        boolean boolean39 = cacheMap0.containsKey((java.lang.Object) cacheMap22);
        int int40 = cacheMap0.size();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "CacheMap:{}::{}" + "'", str25, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        boolean boolean4 = cacheMap0.pin((java.lang.Object) 1);
        java.util.Collection collection5 = cacheMap0.values();
        boolean boolean6 = cacheMap0.isLRU();
        java.util.Set set7 = cacheMap0.getPinnedKeys();
        boolean boolean9 = cacheMap0.unpin((java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        cacheMap10.setCacheSize((int) (byte) 10);
        java.lang.String str13 = cacheMap10.toString();
        boolean boolean14 = cacheMap10.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection18 = cacheMap17.values();
        java.lang.Object obj19 = cacheMap10.put((java.lang.Object) 100L, (java.lang.Object) collection18);
        java.util.Set set20 = cacheMap10.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection23 = cacheMap22.values();
        cacheMap22.readLock();
        boolean boolean25 = cacheMap10.pin((java.lang.Object) cacheMap22);
        cacheMap0.putAll((java.util.Map) cacheMap10);
        java.lang.String str27 = cacheMap0.toString();
        cacheMap0.setSoftReferenceSize((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CacheMap:{}::{}" + "'", str13, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "CacheMap:{100=[]}::{}" + "'", str27, "CacheMap:{100=[]}::{}");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection6 = cacheMap5.values();
        cacheMap5.readLock();
        java.lang.Object obj8 = cacheMap0.remove((java.lang.Object) cacheMap5);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.Object obj11 = cacheMap0.get(obj9);
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set13 = cacheMap12.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection16 = cacheMap15.values();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        cacheMap17.setCacheSize((int) (byte) 10);
        java.lang.String str20 = cacheMap17.toString();
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap();
        boolean boolean22 = cacheMap21.isEmpty();
        cacheMap17.putAll((java.util.Map) cacheMap21, true);
        boolean boolean25 = cacheMap15.containsKey((java.lang.Object) true);
        java.lang.Object obj26 = cacheMap0.put((java.lang.Object) set13, (java.lang.Object) boolean25);
        org.apache.openjpa.util.CacheMap cacheMap28 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection29 = cacheMap28.values();
        org.apache.openjpa.util.CacheMap cacheMap30 = new org.apache.openjpa.util.CacheMap();
        cacheMap30.setCacheSize((int) (byte) 10);
        java.lang.String str33 = cacheMap30.toString();
        org.apache.openjpa.util.CacheMap cacheMap34 = new org.apache.openjpa.util.CacheMap();
        boolean boolean35 = cacheMap34.isEmpty();
        cacheMap30.putAll((java.util.Map) cacheMap34, true);
        boolean boolean38 = cacheMap28.containsKey((java.lang.Object) true);
        java.util.Collection collection39 = cacheMap28.values();
        org.apache.openjpa.util.CacheMap cacheMap42 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean44 = cacheMap42.containsValue((java.lang.Object) '4');
        boolean boolean45 = cacheMap28.containsKey((java.lang.Object) boolean44);
        org.apache.openjpa.util.CacheMap cacheMap46 = new org.apache.openjpa.util.CacheMap();
        cacheMap46.setCacheSize((int) (byte) 10);
        java.lang.String str49 = cacheMap46.toString();
        boolean boolean50 = cacheMap46.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap53 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection54 = cacheMap53.values();
        java.lang.Object obj55 = cacheMap46.put((java.lang.Object) 100L, (java.lang.Object) collection54);
        cacheMap46.readLock();
        java.util.Collection collection57 = cacheMap46.values();
        cacheMap46.readLock();
        org.apache.openjpa.util.CacheMap cacheMap59 = new org.apache.openjpa.util.CacheMap();
        boolean boolean60 = cacheMap59.isEmpty();
        java.lang.Object obj62 = cacheMap59.remove((java.lang.Object) 1);
        java.util.Set set63 = cacheMap59.keySet();
        java.lang.Object obj64 = cacheMap28.put((java.lang.Object) cacheMap46, (java.lang.Object) set63);
        boolean boolean65 = cacheMap0.containsValue((java.lang.Object) set63);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CacheMap:{}::{}" + "'", str20, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "CacheMap:{}::{}" + "'", str33, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "CacheMap:{}::{}" + "'", str49, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        cacheMap0.readLock();
        java.util.Collection collection11 = cacheMap0.values();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        cacheMap12.setCacheSize((int) (byte) 10);
        boolean boolean16 = cacheMap12.pin((java.lang.Object) 1);
        java.util.Collection collection17 = cacheMap12.values();
        boolean boolean18 = cacheMap12.isLRU();
        java.util.Set set19 = cacheMap12.getPinnedKeys();
        boolean boolean21 = cacheMap12.unpin((java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        cacheMap22.setCacheSize((int) (byte) 10);
        java.lang.String str25 = cacheMap22.toString();
        boolean boolean26 = cacheMap22.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection30 = cacheMap29.values();
        java.lang.Object obj31 = cacheMap22.put((java.lang.Object) 100L, (java.lang.Object) collection30);
        java.util.Set set32 = cacheMap22.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap34 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection35 = cacheMap34.values();
        cacheMap34.readLock();
        boolean boolean37 = cacheMap22.pin((java.lang.Object) cacheMap34);
        cacheMap12.putAll((java.util.Map) cacheMap22);
        boolean boolean39 = cacheMap0.containsKey((java.lang.Object) cacheMap22);
        org.apache.openjpa.util.CacheMap cacheMap40 = new org.apache.openjpa.util.CacheMap();
        cacheMap40.setCacheSize(10);
        boolean boolean43 = cacheMap40.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap44 = new org.apache.openjpa.util.CacheMap();
        cacheMap44.setCacheSize((int) (byte) 10);
        java.lang.String str47 = cacheMap44.toString();
        boolean boolean48 = cacheMap44.isEmpty();
        boolean boolean49 = cacheMap44.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap50 = new org.apache.openjpa.util.CacheMap();
        cacheMap50.setCacheSize((int) (byte) 10);
        cacheMap44.putAll((java.util.Map) cacheMap50, false);
        boolean boolean56 = cacheMap44.unpin((java.lang.Object) (short) 10);
        boolean boolean57 = cacheMap40.unpin((java.lang.Object) (short) 10);
        cacheMap22.putAll((java.util.Map) cacheMap40, true);
        java.util.Collection collection60 = cacheMap40.values();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "CacheMap:{}::{}" + "'", str25, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "CacheMap:{}::{}" + "'", str47, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(collection60);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.util.Set set2 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection5 = cacheMap4.values();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        java.lang.String str9 = cacheMap6.toString();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        boolean boolean11 = cacheMap10.isEmpty();
        java.lang.Object obj12 = cacheMap6.remove((java.lang.Object) cacheMap10);
        java.lang.Object obj13 = cacheMap0.put((java.lang.Object) cacheMap4, obj12);
        cacheMap0.setCacheSize((int) (byte) 1);
        java.util.Collection collection16 = cacheMap0.values();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean4 = cacheMap2.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection7 = cacheMap6.values();
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        cacheMap8.setCacheSize((int) (byte) 10);
        java.lang.String str11 = cacheMap8.toString();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        boolean boolean13 = cacheMap12.isEmpty();
        cacheMap8.putAll((java.util.Map) cacheMap12, true);
        boolean boolean16 = cacheMap6.containsKey((java.lang.Object) true);
        java.util.Collection collection17 = cacheMap6.values();
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean22 = cacheMap20.containsValue((java.lang.Object) '4');
        boolean boolean23 = cacheMap6.containsKey((java.lang.Object) boolean22);
        boolean boolean24 = cacheMap2.pin((java.lang.Object) boolean23);
        java.util.Set set25 = cacheMap2.entrySet();
        cacheMap2.clear();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap2.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CacheMap:{}::{}" + "'", str11, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        boolean boolean4 = cacheMap0.pin((java.lang.Object) 1);
        java.util.Collection collection5 = cacheMap0.values();
        java.lang.String str6 = cacheMap0.toString();
        java.lang.String str7 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(true, 100);
        cacheMap0.putAll((java.util.Map) cacheMap10);
        java.util.Set set12 = cacheMap10.keySet();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CacheMap:{}::{}" + "'", str7, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        boolean boolean5 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        cacheMap0.putAll((java.util.Map) cacheMap6, false);
        cacheMap0.writeLock();
        boolean boolean12 = cacheMap0.isLRU();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        cacheMap8.setCacheSize((int) (byte) 10);
        boolean boolean12 = cacheMap8.pin((java.lang.Object) 1);
        cacheMap3.putAll((java.util.Map) cacheMap8, true);
        cacheMap3.setSoftReferenceSize((int) 'a');
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, 1000, 0, (float) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection2 = cacheMap1.values();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        cacheMap3.setCacheSize((int) (byte) 10);
        java.lang.String str6 = cacheMap3.toString();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        boolean boolean8 = cacheMap7.isEmpty();
        cacheMap3.putAll((java.util.Map) cacheMap7, true);
        boolean boolean11 = cacheMap1.containsKey((java.lang.Object) true);
        cacheMap1.clear();
        cacheMap1.writeLock();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        java.lang.Object obj6 = cacheMap0.remove((java.lang.Object) cacheMap4);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        boolean boolean9 = cacheMap8.isEmpty();
        java.util.Set set10 = cacheMap8.entrySet();
        int int11 = cacheMap8.getCacheSize();
        java.lang.Object obj12 = cacheMap4.put((java.lang.Object) false, (java.lang.Object) int11);
        boolean boolean13 = cacheMap4.isEmpty();
        java.util.Set set14 = cacheMap4.getPinnedKeys();
        int int15 = cacheMap4.size();
        java.util.Set set16 = cacheMap4.getPinnedKeys();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        boolean boolean4 = cacheMap0.pin((java.lang.Object) 1);
        java.util.Collection collection5 = cacheMap0.values();
        java.util.Collection collection6 = cacheMap0.values();
        int int7 = cacheMap0.getCacheSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) '#', (int) (byte) 10, (float) 1, 1000);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.lang.Object obj4 = cacheMap0.get((java.lang.Object) 100L);
        int int5 = cacheMap0.getSoftReferenceSize();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        int int4 = cacheMap0.size();
        cacheMap0.setCacheSize((int) (short) 100);
        java.util.Collection collection7 = cacheMap0.values();
        java.util.Collection collection8 = cacheMap0.values();
        cacheMap0.clear();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        int int3 = cacheMap0.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        cacheMap4.setCacheSize((int) (byte) 10);
        java.lang.String str7 = cacheMap4.toString();
        boolean boolean8 = cacheMap4.isEmpty();
        boolean boolean9 = cacheMap4.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        cacheMap10.setCacheSize((int) (byte) 10);
        cacheMap4.putAll((java.util.Map) cacheMap10, false);
        boolean boolean15 = cacheMap0.containsKey((java.lang.Object) cacheMap10);
        cacheMap0.setSoftReferenceSize((int) ' ');
        java.lang.Class<?> wildcardClass18 = cacheMap0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CacheMap:{}::{}" + "'", str7, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection2 = cacheMap1.values();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        cacheMap3.setCacheSize((int) (byte) 10);
        java.lang.String str6 = cacheMap3.toString();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        boolean boolean8 = cacheMap7.isEmpty();
        cacheMap3.putAll((java.util.Map) cacheMap7, true);
        boolean boolean11 = cacheMap1.containsKey((java.lang.Object) true);
        java.util.Collection collection12 = cacheMap1.values();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean17 = cacheMap15.containsValue((java.lang.Object) '4');
        boolean boolean18 = cacheMap1.containsKey((java.lang.Object) boolean17);
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap();
        cacheMap19.setCacheSize((int) (byte) 10);
        java.lang.String str22 = cacheMap19.toString();
        boolean boolean23 = cacheMap19.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection27 = cacheMap26.values();
        java.lang.Object obj28 = cacheMap19.put((java.lang.Object) 100L, (java.lang.Object) collection27);
        cacheMap19.readLock();
        java.util.Collection collection30 = cacheMap19.values();
        cacheMap19.readLock();
        org.apache.openjpa.util.CacheMap cacheMap32 = new org.apache.openjpa.util.CacheMap();
        boolean boolean33 = cacheMap32.isEmpty();
        java.lang.Object obj35 = cacheMap32.remove((java.lang.Object) 1);
        java.util.Set set36 = cacheMap32.keySet();
        java.lang.Object obj37 = cacheMap1.put((java.lang.Object) cacheMap19, (java.lang.Object) set36);
        java.lang.String str38 = cacheMap19.toString();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap19.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CacheMap:{}::{}" + "'", str22, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "CacheMap:{100=[]}::{}" + "'", str38, "CacheMap:{100=[]}::{}");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, 1, (int) (short) 10, (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true, 1000, (int) '4', 100.0f, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, 1);
        java.lang.Class<?> wildcardClass3 = cacheMap2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        java.lang.Object obj6 = cacheMap0.remove((java.lang.Object) cacheMap4);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        boolean boolean9 = cacheMap8.isEmpty();
        java.util.Set set10 = cacheMap8.entrySet();
        int int11 = cacheMap8.getCacheSize();
        java.lang.Object obj12 = cacheMap4.put((java.lang.Object) false, (java.lang.Object) int11);
        boolean boolean13 = cacheMap4.isEmpty();
        java.util.Set set14 = cacheMap4.getPinnedKeys();
        cacheMap4.clear();
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj19 = new java.lang.Object();
        boolean boolean20 = cacheMap18.pin(obj19);
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap();
        cacheMap21.setCacheSize((int) (byte) 10);
        java.lang.String str24 = cacheMap21.toString();
        org.apache.openjpa.util.CacheMap cacheMap25 = new org.apache.openjpa.util.CacheMap();
        boolean boolean26 = cacheMap25.isEmpty();
        cacheMap21.putAll((java.util.Map) cacheMap25, true);
        java.util.Collection collection29 = cacheMap21.values();
        java.lang.Object obj31 = cacheMap18.put((java.lang.Object) collection29, (java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection34 = cacheMap33.values();
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap();
        cacheMap35.setCacheSize((int) (byte) 10);
        java.lang.String str38 = cacheMap35.toString();
        org.apache.openjpa.util.CacheMap cacheMap39 = new org.apache.openjpa.util.CacheMap();
        boolean boolean40 = cacheMap39.isEmpty();
        cacheMap35.putAll((java.util.Map) cacheMap39, true);
        boolean boolean43 = cacheMap33.containsKey((java.lang.Object) true);
        java.util.Collection collection44 = cacheMap33.values();
        org.apache.openjpa.util.CacheMap cacheMap47 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean49 = cacheMap47.containsValue((java.lang.Object) '4');
        boolean boolean50 = cacheMap33.containsKey((java.lang.Object) boolean49);
        org.apache.openjpa.util.CacheMap cacheMap51 = new org.apache.openjpa.util.CacheMap();
        cacheMap51.setCacheSize((int) (byte) 10);
        java.lang.String str54 = cacheMap51.toString();
        boolean boolean55 = cacheMap51.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap58 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection59 = cacheMap58.values();
        java.lang.Object obj60 = cacheMap51.put((java.lang.Object) 100L, (java.lang.Object) collection59);
        cacheMap51.readLock();
        java.util.Collection collection62 = cacheMap51.values();
        cacheMap51.readLock();
        org.apache.openjpa.util.CacheMap cacheMap64 = new org.apache.openjpa.util.CacheMap();
        boolean boolean65 = cacheMap64.isEmpty();
        java.lang.Object obj67 = cacheMap64.remove((java.lang.Object) 1);
        java.util.Set set68 = cacheMap64.keySet();
        java.lang.Object obj69 = cacheMap33.put((java.lang.Object) cacheMap51, (java.lang.Object) set68);
        cacheMap33.clear();
        cacheMap18.putAll((java.util.Map) cacheMap33, true);
        java.lang.Object obj73 = cacheMap4.remove((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap4.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "CacheMap:{}::{}" + "'", str24, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "CacheMap:{}::{}" + "'", str38, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "CacheMap:{}::{}" + "'", str54, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj73);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        boolean boolean4 = cacheMap0.pin((java.lang.Object) 1);
        int int5 = cacheMap0.getSoftReferenceSize();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap0.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        cacheMap0.putAll((java.util.Map) cacheMap4, true);
        java.util.Collection collection8 = cacheMap4.values();
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj12 = new java.lang.Object();
        boolean boolean13 = cacheMap11.pin(obj12);
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        cacheMap14.setCacheSize(10);
        java.util.Set set17 = cacheMap14.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection20 = cacheMap19.values();
        cacheMap19.readLock();
        java.lang.Object obj22 = cacheMap14.remove((java.lang.Object) cacheMap19);
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj28 = new java.lang.Object();
        boolean boolean29 = cacheMap27.pin(obj28);
        boolean boolean30 = cacheMap27.isLRU();
        cacheMap24.putAll((java.util.Map) cacheMap27, false);
        cacheMap19.putAll((java.util.Map) cacheMap24);
        int int34 = cacheMap24.getCacheSize();
        java.util.Set set35 = cacheMap24.keySet();
        org.apache.openjpa.util.CacheMap cacheMap36 = new org.apache.openjpa.util.CacheMap();
        boolean boolean37 = cacheMap36.isEmpty();
        java.util.Set set38 = cacheMap36.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap40 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection41 = cacheMap40.values();
        org.apache.openjpa.util.CacheMap cacheMap42 = new org.apache.openjpa.util.CacheMap();
        cacheMap42.setCacheSize((int) (byte) 10);
        java.lang.String str45 = cacheMap42.toString();
        org.apache.openjpa.util.CacheMap cacheMap46 = new org.apache.openjpa.util.CacheMap();
        boolean boolean47 = cacheMap46.isEmpty();
        java.lang.Object obj48 = cacheMap42.remove((java.lang.Object) cacheMap46);
        java.lang.Object obj49 = cacheMap36.put((java.lang.Object) cacheMap40, obj48);
        java.lang.Object obj50 = cacheMap11.put((java.lang.Object) set35, (java.lang.Object) cacheMap40);
        int int51 = cacheMap11.getSoftReferenceSize();
        cacheMap11.writeLock();
        org.apache.openjpa.util.CacheMap cacheMap55 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj56 = new java.lang.Object();
        boolean boolean57 = cacheMap55.pin(obj56);
        cacheMap55.setCacheSize(0);
        cacheMap11.putAll((java.util.Map) cacheMap55, false);
        cacheMap4.putAll((java.util.Map) cacheMap11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1000 + "'", int34 == 1000);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "CacheMap:{}::{}" + "'", str45, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        java.lang.String str10 = cacheMap0.toString();
        java.lang.Class<?> wildcardClass11 = cacheMap0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CacheMap:{100=[]}::{}" + "'", str10, "CacheMap:{100=[]}::{}");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        boolean boolean4 = cacheMap0.isLRU();
        int int5 = cacheMap0.getCacheSize();
        int int6 = cacheMap0.getCacheSize();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap0.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = cacheMap2.pin(obj3);
        cacheMap2.setCacheSize(0);
        cacheMap2.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, (int) (short) 10, (int) (short) -1, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        boolean boolean4 = cacheMap0.pin((java.lang.Object) 1);
        java.util.Set set5 = cacheMap0.entrySet();
        int int6 = cacheMap0.getSoftReferenceSize();
        cacheMap0.writeLock();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap();
        cacheMap2.setCacheSize((int) (byte) 10);
        java.lang.String str5 = cacheMap2.toString();
        boolean boolean6 = cacheMap2.isEmpty();
        cacheMap0.putAll((java.util.Map) cacheMap2, true);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection11 = cacheMap10.values();
        cacheMap10.readLock();
        java.util.Collection collection13 = cacheMap10.values();
        java.lang.Object obj14 = cacheMap2.remove((java.lang.Object) collection13);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        cacheMap15.setCacheSize(10);
        java.util.Set set18 = cacheMap15.entrySet();
        boolean boolean19 = cacheMap15.isLRU();
        int int20 = cacheMap15.getCacheSize();
        int int21 = cacheMap15.getCacheSize();
        boolean boolean22 = cacheMap2.unpin((java.lang.Object) int21);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CacheMap:{}::{}" + "'", str5, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        cacheMap3.setCacheSize((int) (byte) 10);
        boolean boolean7 = cacheMap3.pin((java.lang.Object) 1);
        java.util.Collection collection8 = cacheMap3.values();
        boolean boolean9 = cacheMap3.isLRU();
        java.util.Set set10 = cacheMap3.getPinnedKeys();
        cacheMap3.setCacheSize(32);
        java.lang.Object obj13 = cacheMap0.get((java.lang.Object) cacheMap3);
        java.util.Set set14 = cacheMap0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true, (int) ' ', (int) (byte) 10, (float) (short) 1, (int) ' ');
        int int6 = cacheMap5.getSoftReferenceSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, (int) '#', 1000, (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection2 = cacheMap1.values();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        cacheMap3.setCacheSize((int) (byte) 10);
        java.lang.String str6 = cacheMap3.toString();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        boolean boolean8 = cacheMap7.isEmpty();
        cacheMap3.putAll((java.util.Map) cacheMap7, true);
        boolean boolean11 = cacheMap1.containsKey((java.lang.Object) true);
        java.util.Collection collection12 = cacheMap1.values();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean17 = cacheMap15.containsValue((java.lang.Object) '4');
        boolean boolean18 = cacheMap1.containsKey((java.lang.Object) boolean17);
        java.lang.String str19 = cacheMap1.toString();
        cacheMap1.writeLock();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CacheMap:{}::{}" + "'", str19, "CacheMap:{}::{}");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, (int) (short) 100, (int) (short) 1, (float) 1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap2.setCacheSize((int) '4');
        boolean boolean6 = cacheMap2.containsValue((java.lang.Object) 100);
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        cacheMap7.setCacheSize(10);
        java.lang.Object obj11 = cacheMap7.get((java.lang.Object) 100L);
        java.lang.Object obj12 = cacheMap2.remove((java.lang.Object) cacheMap7);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap();
        cacheMap13.setCacheSize(10);
        java.util.Set set16 = cacheMap13.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection19 = cacheMap18.values();
        cacheMap18.readLock();
        java.lang.Object obj21 = cacheMap13.remove((java.lang.Object) cacheMap18);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        cacheMap22.setCacheSize(10);
        boolean boolean25 = cacheMap22.isEmpty();
        cacheMap22.writeLock();
        cacheMap18.putAll((java.util.Map) cacheMap22);
        cacheMap7.putAll((java.util.Map) cacheMap18);
        int int29 = cacheMap18.size();
        org.apache.openjpa.util.CacheMap cacheMap30 = new org.apache.openjpa.util.CacheMap();
        cacheMap30.setCacheSize(10);
        java.lang.Object obj34 = cacheMap30.get((java.lang.Object) 100L);
        int int35 = cacheMap30.getCacheSize();
        org.apache.openjpa.util.CacheMap cacheMap37 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection38 = cacheMap37.values();
        org.apache.openjpa.util.CacheMap cacheMap39 = new org.apache.openjpa.util.CacheMap();
        cacheMap39.setCacheSize((int) (byte) 10);
        java.lang.String str42 = cacheMap39.toString();
        org.apache.openjpa.util.CacheMap cacheMap43 = new org.apache.openjpa.util.CacheMap();
        boolean boolean44 = cacheMap43.isEmpty();
        cacheMap39.putAll((java.util.Map) cacheMap43, true);
        boolean boolean47 = cacheMap37.containsKey((java.lang.Object) true);
        java.util.Collection collection48 = cacheMap37.values();
        int int49 = cacheMap37.size();
        org.apache.openjpa.util.CacheMap cacheMap50 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj52 = cacheMap50.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap53 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj55 = cacheMap53.remove((java.lang.Object) (short) 1);
        cacheMap50.putAll((java.util.Map) cacheMap53, false);
        org.apache.openjpa.util.CacheMap cacheMap58 = new org.apache.openjpa.util.CacheMap();
        cacheMap58.setCacheSize((int) (byte) 10);
        boolean boolean62 = cacheMap58.pin((java.lang.Object) 1);
        cacheMap53.putAll((java.util.Map) cacheMap58, true);
        int int65 = cacheMap53.getSoftReferenceSize();
        boolean boolean66 = cacheMap37.unpin((java.lang.Object) cacheMap53);
        cacheMap30.putAll((java.util.Map) cacheMap53);
        boolean boolean68 = cacheMap18.containsKey((java.lang.Object) cacheMap53);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "CacheMap:{}::{}" + "'", str42, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        boolean boolean5 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        cacheMap0.putAll((java.util.Map) cacheMap6, false);
        boolean boolean12 = cacheMap0.unpin((java.lang.Object) 1);
        java.lang.String str13 = cacheMap0.toString();
        java.lang.Class<?> wildcardClass14 = cacheMap0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CacheMap:{}::{}" + "'", str13, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, (int) ' ', (int) (byte) 100, (float) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        cacheMap5.setCacheSize((int) (byte) 10);
        boolean boolean9 = cacheMap5.pin((java.lang.Object) 1);
        java.util.Collection collection10 = cacheMap5.values();
        boolean boolean11 = cacheMap5.isLRU();
        java.util.Set set12 = cacheMap5.getPinnedKeys();
        cacheMap5.setCacheSize(32);
        boolean boolean15 = cacheMap4.pin((java.lang.Object) 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (short) 10);
        boolean boolean4 = cacheMap2.containsKey((java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection10 = cacheMap9.values();
        cacheMap9.readLock();
        boolean boolean12 = cacheMap0.containsValue((java.lang.Object) cacheMap9);
        cacheMap0.readLock();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj19 = new java.lang.Object();
        boolean boolean20 = cacheMap18.pin(obj19);
        boolean boolean21 = cacheMap18.isLRU();
        cacheMap15.putAll((java.util.Map) cacheMap18, false);
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap();
        cacheMap24.setCacheSize((int) (byte) 10);
        java.lang.String str27 = cacheMap24.toString();
        boolean boolean28 = cacheMap24.isEmpty();
        java.util.Set set29 = cacheMap24.keySet();
        boolean boolean30 = cacheMap15.containsValue((java.lang.Object) set29);
        cacheMap0.putAll((java.util.Map) cacheMap15);
        int int32 = cacheMap15.getSoftReferenceSize();
        java.lang.Object obj34 = cacheMap15.get((java.lang.Object) 10.0d);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "CacheMap:{}::{}" + "'", str27, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        java.util.Set set10 = cacheMap0.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection13 = cacheMap12.values();
        cacheMap12.readLock();
        boolean boolean15 = cacheMap0.pin((java.lang.Object) cacheMap12);
        cacheMap0.setCacheSize(1);
        boolean boolean18 = cacheMap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) 0, (int) (short) 100, (float) 1, (int) (short) -1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        boolean boolean5 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        cacheMap0.putAll((java.util.Map) cacheMap6, false);
        cacheMap6.writeLock();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        boolean boolean4 = cacheMap0.isLRU();
        cacheMap0.readLock();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) ' ', (int) (short) 10, (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (short) 10);
        cacheMap2.setSoftReferenceSize((int) (byte) -1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        boolean boolean4 = cacheMap0.pin((java.lang.Object) 1);
        java.util.Collection collection5 = cacheMap0.values();
        boolean boolean6 = cacheMap0.isLRU();
        java.util.Set set7 = cacheMap0.getPinnedKeys();
        boolean boolean9 = cacheMap0.unpin((java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        cacheMap10.setCacheSize((int) (byte) 10);
        java.lang.String str13 = cacheMap10.toString();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        boolean boolean15 = cacheMap14.isEmpty();
        cacheMap10.putAll((java.util.Map) cacheMap14, true);
        boolean boolean18 = cacheMap10.isLRU();
        java.lang.Object obj19 = cacheMap0.get((java.lang.Object) cacheMap10);
        java.util.Set set20 = cacheMap10.entrySet();
        java.util.Set set21 = cacheMap10.entrySet();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CacheMap:{}::{}" + "'", str13, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = cacheMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.lang.Object obj3 = cacheMap0.remove((java.lang.Object) 1);
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        java.lang.String str9 = cacheMap6.toString();
        boolean boolean10 = cacheMap6.isEmpty();
        cacheMap4.putAll((java.util.Map) cacheMap6, true);
        cacheMap0.putAll((java.util.Map) cacheMap4, true);
        java.util.Collection collection15 = cacheMap0.values();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection18 = cacheMap17.values();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap();
        cacheMap19.setCacheSize((int) (byte) 10);
        java.lang.String str22 = cacheMap19.toString();
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap();
        boolean boolean24 = cacheMap23.isEmpty();
        cacheMap19.putAll((java.util.Map) cacheMap23, true);
        boolean boolean27 = cacheMap17.containsKey((java.lang.Object) true);
        java.util.Collection collection28 = cacheMap17.values();
        int int29 = cacheMap17.size();
        org.apache.openjpa.util.CacheMap cacheMap30 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj32 = cacheMap30.remove((java.lang.Object) (short) 1);
        int int33 = cacheMap30.getSoftReferenceSize();
        cacheMap30.clear();
        boolean boolean35 = cacheMap17.containsKey((java.lang.Object) cacheMap30);
        org.apache.openjpa.util.CacheMap cacheMap37 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection38 = cacheMap37.values();
        org.apache.openjpa.util.CacheMap cacheMap39 = new org.apache.openjpa.util.CacheMap();
        cacheMap39.setCacheSize((int) (byte) 10);
        java.lang.String str42 = cacheMap39.toString();
        org.apache.openjpa.util.CacheMap cacheMap43 = new org.apache.openjpa.util.CacheMap();
        boolean boolean44 = cacheMap43.isEmpty();
        cacheMap39.putAll((java.util.Map) cacheMap43, true);
        boolean boolean47 = cacheMap37.containsKey((java.lang.Object) true);
        java.util.Collection collection48 = cacheMap37.values();
        org.apache.openjpa.util.CacheMap cacheMap51 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean53 = cacheMap51.containsValue((java.lang.Object) '4');
        boolean boolean54 = cacheMap37.containsKey((java.lang.Object) boolean53);
        org.apache.openjpa.util.CacheMap cacheMap55 = new org.apache.openjpa.util.CacheMap();
        cacheMap55.setCacheSize((int) (byte) 10);
        java.lang.String str58 = cacheMap55.toString();
        boolean boolean59 = cacheMap55.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap62 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection63 = cacheMap62.values();
        java.lang.Object obj64 = cacheMap55.put((java.lang.Object) 100L, (java.lang.Object) collection63);
        cacheMap55.readLock();
        java.util.Collection collection66 = cacheMap55.values();
        cacheMap55.readLock();
        org.apache.openjpa.util.CacheMap cacheMap68 = new org.apache.openjpa.util.CacheMap();
        boolean boolean69 = cacheMap68.isEmpty();
        java.lang.Object obj71 = cacheMap68.remove((java.lang.Object) 1);
        java.util.Set set72 = cacheMap68.keySet();
        java.lang.Object obj73 = cacheMap37.put((java.lang.Object) cacheMap55, (java.lang.Object) set72);
        java.lang.Object obj74 = cacheMap17.remove((java.lang.Object) cacheMap55);
        boolean boolean75 = cacheMap0.unpin(obj74);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CacheMap:{}::{}" + "'", str22, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "CacheMap:{}::{}" + "'", str42, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "CacheMap:{}::{}" + "'", str58, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, (int) (short) 0, (int) (byte) 1, (float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.util.Set set2 = cacheMap0.entrySet();
        int int3 = cacheMap0.getCacheSize();
        java.util.Set set4 = cacheMap0.getPinnedKeys();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (short) 0, (int) (byte) 100, (float) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        boolean boolean4 = cacheMap0.pin((java.lang.Object) 1);
        java.util.Collection collection5 = cacheMap0.values();
        boolean boolean6 = cacheMap0.isLRU();
        java.util.Set set7 = cacheMap0.getPinnedKeys();
        cacheMap0.writeLock();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.util.Set set2 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        cacheMap3.setCacheSize(10);
        java.lang.Object obj7 = cacheMap3.get((java.lang.Object) 100L);
        cacheMap3.clear();
        java.util.Set set9 = cacheMap3.getPinnedKeys();
        boolean boolean10 = cacheMap0.containsValue((java.lang.Object) set9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        cacheMap0.setSoftReferenceSize(1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, 32, (int) ' ', (float) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = cacheMap2.pin(obj3);
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        cacheMap5.setCacheSize((int) (byte) 10);
        java.lang.String str8 = cacheMap5.toString();
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap();
        boolean boolean10 = cacheMap9.isEmpty();
        cacheMap5.putAll((java.util.Map) cacheMap9, true);
        java.util.Collection collection13 = cacheMap5.values();
        java.lang.Object obj15 = cacheMap2.put((java.lang.Object) collection13, (java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection18 = cacheMap17.values();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap();
        cacheMap19.setCacheSize((int) (byte) 10);
        java.lang.String str22 = cacheMap19.toString();
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap();
        boolean boolean24 = cacheMap23.isEmpty();
        cacheMap19.putAll((java.util.Map) cacheMap23, true);
        boolean boolean27 = cacheMap17.containsKey((java.lang.Object) true);
        java.util.Collection collection28 = cacheMap17.values();
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean33 = cacheMap31.containsValue((java.lang.Object) '4');
        boolean boolean34 = cacheMap17.containsKey((java.lang.Object) boolean33);
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap();
        cacheMap35.setCacheSize((int) (byte) 10);
        java.lang.String str38 = cacheMap35.toString();
        boolean boolean39 = cacheMap35.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap42 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection43 = cacheMap42.values();
        java.lang.Object obj44 = cacheMap35.put((java.lang.Object) 100L, (java.lang.Object) collection43);
        cacheMap35.readLock();
        java.util.Collection collection46 = cacheMap35.values();
        cacheMap35.readLock();
        org.apache.openjpa.util.CacheMap cacheMap48 = new org.apache.openjpa.util.CacheMap();
        boolean boolean49 = cacheMap48.isEmpty();
        java.lang.Object obj51 = cacheMap48.remove((java.lang.Object) 1);
        java.util.Set set52 = cacheMap48.keySet();
        java.lang.Object obj53 = cacheMap17.put((java.lang.Object) cacheMap35, (java.lang.Object) set52);
        cacheMap17.clear();
        cacheMap2.putAll((java.util.Map) cacheMap17, true);
        cacheMap2.readLock();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CacheMap:{}::{}" + "'", str22, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "CacheMap:{}::{}" + "'", str38, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        int int4 = cacheMap0.size();
        cacheMap0.setCacheSize((int) '4');
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap(true);
        int int9 = cacheMap8.getCacheSize();
        java.lang.Object obj10 = cacheMap0.remove((java.lang.Object) cacheMap8);
        boolean boolean12 = cacheMap8.unpin((java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection6 = cacheMap5.values();
        cacheMap5.readLock();
        java.lang.Object obj8 = cacheMap0.remove((java.lang.Object) cacheMap5);
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap();
        cacheMap9.setCacheSize(10);
        boolean boolean12 = cacheMap9.isEmpty();
        cacheMap9.writeLock();
        cacheMap5.putAll((java.util.Map) cacheMap9);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean19 = cacheMap17.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection22 = cacheMap21.values();
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap();
        cacheMap23.setCacheSize((int) (byte) 10);
        java.lang.String str26 = cacheMap23.toString();
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap();
        boolean boolean28 = cacheMap27.isEmpty();
        cacheMap23.putAll((java.util.Map) cacheMap27, true);
        boolean boolean31 = cacheMap21.containsKey((java.lang.Object) true);
        java.util.Collection collection32 = cacheMap21.values();
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean37 = cacheMap35.containsValue((java.lang.Object) '4');
        boolean boolean38 = cacheMap21.containsKey((java.lang.Object) boolean37);
        boolean boolean39 = cacheMap17.pin((java.lang.Object) boolean38);
        cacheMap9.putAll((java.util.Map) cacheMap17, false);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap9.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "CacheMap:{}::{}" + "'", str26, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        java.lang.String str10 = cacheMap0.toString();
        int int11 = cacheMap0.getSoftReferenceSize();
        cacheMap0.setCacheSize((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CacheMap:{100=[]}::{}" + "'", str10, "CacheMap:{100=[]}::{}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true, 0, 1000, (float) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, (int) (byte) 1, (int) (short) 1, (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true, (int) ' ', (int) (byte) 10, (float) (short) 1, (int) ' ');
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        boolean boolean7 = cacheMap5.unpin((java.lang.Object) cacheMap6);
        int int8 = cacheMap6.getSoftReferenceSize();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, 100);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.lang.Object obj3 = cacheMap0.remove((java.lang.Object) 1);
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        java.lang.String str9 = cacheMap6.toString();
        boolean boolean10 = cacheMap6.isEmpty();
        cacheMap4.putAll((java.util.Map) cacheMap6, true);
        cacheMap0.putAll((java.util.Map) cacheMap4, true);
        java.util.Collection collection15 = cacheMap0.values();
        java.util.Collection collection16 = cacheMap0.values();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        int int4 = cacheMap0.size();
        cacheMap0.setCacheSize((int) '4');
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean11 = cacheMap9.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection14 = cacheMap13.values();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        cacheMap15.setCacheSize((int) (byte) 10);
        java.lang.String str18 = cacheMap15.toString();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap();
        boolean boolean20 = cacheMap19.isEmpty();
        cacheMap15.putAll((java.util.Map) cacheMap19, true);
        boolean boolean23 = cacheMap13.containsKey((java.lang.Object) true);
        java.util.Collection collection24 = cacheMap13.values();
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean29 = cacheMap27.containsValue((java.lang.Object) '4');
        boolean boolean30 = cacheMap13.containsKey((java.lang.Object) boolean29);
        boolean boolean31 = cacheMap9.pin((java.lang.Object) boolean30);
        java.lang.Object obj32 = cacheMap0.remove((java.lang.Object) cacheMap9);
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap();
        cacheMap33.setCacheSize((int) (byte) 10);
        java.lang.String str36 = cacheMap33.toString();
        boolean boolean37 = cacheMap33.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap40 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection41 = cacheMap40.values();
        java.lang.Object obj42 = cacheMap33.put((java.lang.Object) 100L, (java.lang.Object) collection41);
        java.util.Set set43 = cacheMap33.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap45 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection46 = cacheMap45.values();
        cacheMap45.readLock();
        boolean boolean48 = cacheMap33.pin((java.lang.Object) cacheMap45);
        java.lang.Object obj49 = cacheMap9.get((java.lang.Object) boolean48);
        cacheMap9.writeLock();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CacheMap:{}::{}" + "'", str18, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "CacheMap:{}::{}" + "'", str36, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.lang.Object obj3 = cacheMap0.remove((java.lang.Object) 1);
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        java.lang.String str9 = cacheMap6.toString();
        boolean boolean10 = cacheMap6.isEmpty();
        cacheMap4.putAll((java.util.Map) cacheMap6, true);
        cacheMap0.putAll((java.util.Map) cacheMap4, true);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        cacheMap15.setCacheSize((int) (byte) 10);
        java.lang.String str18 = cacheMap15.toString();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap();
        boolean boolean20 = cacheMap19.isEmpty();
        cacheMap15.putAll((java.util.Map) cacheMap19, true);
        java.lang.Object obj23 = cacheMap0.remove((java.lang.Object) true);
        cacheMap0.writeLock();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CacheMap:{}::{}" + "'", str18, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        cacheMap0.putAll((java.util.Map) cacheMap4, true);
        boolean boolean8 = cacheMap0.isLRU();
        cacheMap0.setSoftReferenceSize(10);
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj13 = cacheMap11.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj16 = cacheMap14.remove((java.lang.Object) (short) 1);
        cacheMap11.putAll((java.util.Map) cacheMap14, false);
        cacheMap0.putAll((java.util.Map) cacheMap14);
        java.util.Collection collection20 = cacheMap14.values();
        java.util.Collection collection21 = cacheMap14.values();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        int int4 = cacheMap0.size();
        boolean boolean5 = cacheMap0.isEmpty();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap2.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.lang.Object obj4 = cacheMap0.get((java.lang.Object) 100L);
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        cacheMap5.setCacheSize((int) (byte) 10);
        java.lang.String str8 = cacheMap5.toString();
        cacheMap0.putAll((java.util.Map) cacheMap5, false);
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj13 = cacheMap11.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj16 = cacheMap14.remove((java.lang.Object) (short) 1);
        cacheMap11.putAll((java.util.Map) cacheMap14, false);
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj22 = new java.lang.Object();
        boolean boolean23 = cacheMap21.pin(obj22);
        boolean boolean24 = cacheMap21.isLRU();
        cacheMap21.setCacheSize((int) (byte) -1);
        boolean boolean27 = cacheMap14.containsValue((java.lang.Object) cacheMap21);
        java.lang.String str28 = cacheMap14.toString();
        cacheMap5.putAll((java.util.Map) cacheMap14, true);
        int int31 = cacheMap14.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "CacheMap:{}::{}" + "'", str28, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        java.lang.String str10 = cacheMap0.toString();
        cacheMap0.readLock();
        java.util.Set set12 = cacheMap0.getPinnedKeys();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CacheMap:{100=[]}::{}" + "'", str10, "CacheMap:{100=[]}::{}");
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.lang.Object obj4 = cacheMap0.get((java.lang.Object) 100L);
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        cacheMap5.setCacheSize((int) (byte) 10);
        java.lang.String str8 = cacheMap5.toString();
        cacheMap0.putAll((java.util.Map) cacheMap5, false);
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap();
        cacheMap11.setCacheSize(10);
        java.lang.Object obj15 = cacheMap11.get((java.lang.Object) 100L);
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap();
        cacheMap16.setCacheSize((int) (byte) 10);
        java.lang.String str19 = cacheMap16.toString();
        cacheMap11.putAll((java.util.Map) cacheMap16, false);
        boolean boolean22 = cacheMap5.pin((java.lang.Object) false);
        int int23 = cacheMap5.getCacheSize();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CacheMap:{}::{}" + "'", str19, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean4 = cacheMap2.containsValue((java.lang.Object) '4');
        java.util.Set set5 = cacheMap2.keySet();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        boolean boolean7 = cacheMap6.isEmpty();
        java.lang.Object obj9 = cacheMap6.remove((java.lang.Object) 1);
        java.lang.Object obj10 = cacheMap2.remove((java.lang.Object) 1);
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap();
        cacheMap11.setCacheSize(10);
        java.util.Set set14 = cacheMap11.entrySet();
        int int15 = cacheMap11.size();
        cacheMap11.setCacheSize((int) '4');
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean22 = cacheMap20.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection25 = cacheMap24.values();
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap();
        cacheMap26.setCacheSize((int) (byte) 10);
        java.lang.String str29 = cacheMap26.toString();
        org.apache.openjpa.util.CacheMap cacheMap30 = new org.apache.openjpa.util.CacheMap();
        boolean boolean31 = cacheMap30.isEmpty();
        cacheMap26.putAll((java.util.Map) cacheMap30, true);
        boolean boolean34 = cacheMap24.containsKey((java.lang.Object) true);
        java.util.Collection collection35 = cacheMap24.values();
        org.apache.openjpa.util.CacheMap cacheMap38 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean40 = cacheMap38.containsValue((java.lang.Object) '4');
        boolean boolean41 = cacheMap24.containsKey((java.lang.Object) boolean40);
        boolean boolean42 = cacheMap20.pin((java.lang.Object) boolean41);
        java.lang.Object obj43 = cacheMap11.remove((java.lang.Object) cacheMap20);
        org.apache.openjpa.util.CacheMap cacheMap44 = new org.apache.openjpa.util.CacheMap();
        cacheMap44.setCacheSize((int) (byte) 10);
        boolean boolean48 = cacheMap44.pin((java.lang.Object) 1);
        java.util.Collection collection49 = cacheMap44.values();
        boolean boolean50 = cacheMap44.isLRU();
        java.util.Set set51 = cacheMap44.getPinnedKeys();
        boolean boolean53 = cacheMap44.unpin((java.lang.Object) 0L);
        boolean boolean54 = cacheMap11.pin((java.lang.Object) cacheMap44);
        java.lang.Object obj55 = cacheMap2.get((java.lang.Object) cacheMap44);
        org.apache.openjpa.util.CacheMap cacheMap57 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection58 = cacheMap57.values();
        org.apache.openjpa.util.CacheMap cacheMap61 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean63 = cacheMap61.containsValue((java.lang.Object) '4');
        java.util.Set set64 = cacheMap61.keySet();
        java.util.Set set65 = cacheMap61.getPinnedKeys();
        cacheMap61.clear();
        java.lang.Object obj67 = cacheMap2.put((java.lang.Object) collection58, (java.lang.Object) cacheMap61);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "CacheMap:{}::{}" + "'", str29, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNull(obj67);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        boolean boolean4 = cacheMap0.pin((java.lang.Object) 1);
        java.util.Collection collection5 = cacheMap0.values();
        boolean boolean6 = cacheMap0.isLRU();
        java.util.Set set7 = cacheMap0.getPinnedKeys();
        boolean boolean9 = cacheMap0.unpin((java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        cacheMap10.setCacheSize((int) (byte) 10);
        java.lang.String str13 = cacheMap10.toString();
        boolean boolean14 = cacheMap10.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection18 = cacheMap17.values();
        java.lang.Object obj19 = cacheMap10.put((java.lang.Object) 100L, (java.lang.Object) collection18);
        java.util.Set set20 = cacheMap10.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection23 = cacheMap22.values();
        cacheMap22.readLock();
        boolean boolean25 = cacheMap10.pin((java.lang.Object) cacheMap22);
        cacheMap0.putAll((java.util.Map) cacheMap10);
        java.lang.String str27 = cacheMap0.toString();
        java.lang.String str28 = cacheMap0.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CacheMap:{}::{}" + "'", str13, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "CacheMap:{100=[]}::{}" + "'", str27, "CacheMap:{100=[]}::{}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "CacheMap:{100=[]}::{}" + "'", str28, "CacheMap:{100=[]}::{}");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection10 = cacheMap9.values();
        cacheMap9.readLock();
        boolean boolean12 = cacheMap0.containsValue((java.lang.Object) cacheMap9);
        java.util.Set set13 = cacheMap0.keySet();
        java.util.Collection collection14 = cacheMap0.values();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        cacheMap15.setCacheSize((int) (byte) 10);
        boolean boolean19 = cacheMap15.pin((java.lang.Object) 1);
        java.util.Collection collection20 = cacheMap15.values();
        boolean boolean21 = cacheMap15.isLRU();
        java.util.Set set22 = cacheMap15.getPinnedKeys();
        boolean boolean24 = cacheMap15.unpin((java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap25 = new org.apache.openjpa.util.CacheMap();
        cacheMap25.setCacheSize((int) (byte) 10);
        java.lang.String str28 = cacheMap25.toString();
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap();
        boolean boolean30 = cacheMap29.isEmpty();
        cacheMap25.putAll((java.util.Map) cacheMap29, true);
        boolean boolean33 = cacheMap25.isLRU();
        java.lang.Object obj34 = cacheMap15.get((java.lang.Object) cacheMap25);
        cacheMap15.writeLock();
        boolean boolean36 = cacheMap15.isLRU();
        cacheMap0.putAll((java.util.Map) cacheMap15, false);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "CacheMap:{}::{}" + "'", str28, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        int int4 = cacheMap0.size();
        int int5 = cacheMap0.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        boolean boolean10 = cacheMap6.pin((java.lang.Object) 1);
        java.util.Set set11 = cacheMap6.entrySet();
        java.lang.Object obj12 = cacheMap0.remove((java.lang.Object) set11);
        java.lang.Class<?> wildcardClass13 = cacheMap0.getClass();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        cacheMap0.readLock();
        java.util.Collection collection11 = cacheMap0.values();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap(false, (int) (short) 10);
        cacheMap0.putAll((java.util.Map) cacheMap14, false);
        int int17 = cacheMap14.getCacheSize();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap14.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean6 = cacheMap4.pin(obj5);
        boolean boolean7 = cacheMap4.isLRU();
        cacheMap1.putAll((java.util.Map) cacheMap4, false);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        cacheMap10.setCacheSize((int) (byte) 10);
        java.lang.String str13 = cacheMap10.toString();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        boolean boolean15 = cacheMap14.isEmpty();
        java.lang.Object obj16 = cacheMap10.remove((java.lang.Object) cacheMap14);
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap();
        boolean boolean19 = cacheMap18.isEmpty();
        java.util.Set set20 = cacheMap18.entrySet();
        int int21 = cacheMap18.getCacheSize();
        java.lang.Object obj22 = cacheMap14.put((java.lang.Object) false, (java.lang.Object) int21);
        boolean boolean23 = cacheMap14.isEmpty();
        java.util.Set set24 = cacheMap14.getPinnedKeys();
        cacheMap14.clear();
        org.apache.openjpa.util.CacheMap cacheMap28 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj29 = new java.lang.Object();
        boolean boolean30 = cacheMap28.pin(obj29);
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap();
        cacheMap31.setCacheSize((int) (byte) 10);
        java.lang.String str34 = cacheMap31.toString();
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap();
        boolean boolean36 = cacheMap35.isEmpty();
        cacheMap31.putAll((java.util.Map) cacheMap35, true);
        java.util.Collection collection39 = cacheMap31.values();
        java.lang.Object obj41 = cacheMap28.put((java.lang.Object) collection39, (java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap43 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection44 = cacheMap43.values();
        org.apache.openjpa.util.CacheMap cacheMap45 = new org.apache.openjpa.util.CacheMap();
        cacheMap45.setCacheSize((int) (byte) 10);
        java.lang.String str48 = cacheMap45.toString();
        org.apache.openjpa.util.CacheMap cacheMap49 = new org.apache.openjpa.util.CacheMap();
        boolean boolean50 = cacheMap49.isEmpty();
        cacheMap45.putAll((java.util.Map) cacheMap49, true);
        boolean boolean53 = cacheMap43.containsKey((java.lang.Object) true);
        java.util.Collection collection54 = cacheMap43.values();
        org.apache.openjpa.util.CacheMap cacheMap57 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean59 = cacheMap57.containsValue((java.lang.Object) '4');
        boolean boolean60 = cacheMap43.containsKey((java.lang.Object) boolean59);
        org.apache.openjpa.util.CacheMap cacheMap61 = new org.apache.openjpa.util.CacheMap();
        cacheMap61.setCacheSize((int) (byte) 10);
        java.lang.String str64 = cacheMap61.toString();
        boolean boolean65 = cacheMap61.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap68 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection69 = cacheMap68.values();
        java.lang.Object obj70 = cacheMap61.put((java.lang.Object) 100L, (java.lang.Object) collection69);
        cacheMap61.readLock();
        java.util.Collection collection72 = cacheMap61.values();
        cacheMap61.readLock();
        org.apache.openjpa.util.CacheMap cacheMap74 = new org.apache.openjpa.util.CacheMap();
        boolean boolean75 = cacheMap74.isEmpty();
        java.lang.Object obj77 = cacheMap74.remove((java.lang.Object) 1);
        java.util.Set set78 = cacheMap74.keySet();
        java.lang.Object obj79 = cacheMap43.put((java.lang.Object) cacheMap61, (java.lang.Object) set78);
        cacheMap43.clear();
        cacheMap28.putAll((java.util.Map) cacheMap43, true);
        java.lang.Object obj83 = cacheMap14.remove((java.lang.Object) true);
        java.util.Collection collection84 = cacheMap14.values();
        cacheMap14.setSoftReferenceSize(10);
        boolean boolean87 = cacheMap4.containsValue((java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CacheMap:{}::{}" + "'", str13, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1000 + "'", int21 == 1000);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "CacheMap:{}::{}" + "'", str34, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "CacheMap:{}::{}" + "'", str48, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "CacheMap:{}::{}" + "'", str64, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection2 = cacheMap1.values();
        cacheMap1.readLock();
        java.util.Collection collection4 = cacheMap1.values();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        cacheMap5.setCacheSize(10);
        java.util.Set set8 = cacheMap5.entrySet();
        int int9 = cacheMap5.size();
        cacheMap5.setCacheSize((int) '4');
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(true);
        int int14 = cacheMap13.getCacheSize();
        java.lang.Object obj15 = cacheMap5.remove((java.lang.Object) cacheMap13);
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap18.setCacheSize((int) '4');
        boolean boolean22 = cacheMap18.containsValue((java.lang.Object) 100);
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap();
        cacheMap23.setCacheSize(10);
        java.lang.Object obj27 = cacheMap23.get((java.lang.Object) 100L);
        java.lang.Object obj28 = cacheMap18.remove((java.lang.Object) cacheMap23);
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap();
        cacheMap29.setCacheSize(10);
        java.util.Set set32 = cacheMap29.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap34 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection35 = cacheMap34.values();
        cacheMap34.readLock();
        java.lang.Object obj37 = cacheMap29.remove((java.lang.Object) cacheMap34);
        org.apache.openjpa.util.CacheMap cacheMap38 = new org.apache.openjpa.util.CacheMap();
        cacheMap38.setCacheSize(10);
        boolean boolean41 = cacheMap38.isEmpty();
        cacheMap38.writeLock();
        cacheMap34.putAll((java.util.Map) cacheMap38);
        cacheMap23.putAll((java.util.Map) cacheMap34);
        int int45 = cacheMap34.size();
        java.lang.Object obj46 = cacheMap5.remove((java.lang.Object) cacheMap34);
        cacheMap1.putAll((java.util.Map) cacheMap34, false);
        java.util.Collection collection49 = cacheMap34.values();
        java.lang.Class<?> wildcardClass50 = cacheMap34.getClass();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1000 + "'", int14 == 1000);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        java.util.Set set5 = cacheMap0.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap(false, 1);
        boolean boolean9 = cacheMap0.containsKey((java.lang.Object) false);
        java.util.Collection collection10 = cacheMap0.values();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        boolean boolean4 = cacheMap0.pin((java.lang.Object) 1);
        java.util.Collection collection5 = cacheMap0.values();
        boolean boolean6 = cacheMap0.isLRU();
        java.util.Set set7 = cacheMap0.getPinnedKeys();
        boolean boolean9 = cacheMap0.unpin((java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        cacheMap10.setCacheSize((int) (byte) 10);
        java.lang.String str13 = cacheMap10.toString();
        boolean boolean14 = cacheMap10.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection18 = cacheMap17.values();
        java.lang.Object obj19 = cacheMap10.put((java.lang.Object) 100L, (java.lang.Object) collection18);
        cacheMap10.readLock();
        java.util.Collection collection21 = cacheMap10.values();
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        cacheMap22.setCacheSize((int) (byte) 10);
        boolean boolean26 = cacheMap22.pin((java.lang.Object) 1);
        java.util.Collection collection27 = cacheMap22.values();
        boolean boolean28 = cacheMap22.isLRU();
        java.util.Set set29 = cacheMap22.getPinnedKeys();
        boolean boolean31 = cacheMap22.unpin((java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap32 = new org.apache.openjpa.util.CacheMap();
        cacheMap32.setCacheSize((int) (byte) 10);
        java.lang.String str35 = cacheMap32.toString();
        boolean boolean36 = cacheMap32.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap39 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection40 = cacheMap39.values();
        java.lang.Object obj41 = cacheMap32.put((java.lang.Object) 100L, (java.lang.Object) collection40);
        java.util.Set set42 = cacheMap32.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap44 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection45 = cacheMap44.values();
        cacheMap44.readLock();
        boolean boolean47 = cacheMap32.pin((java.lang.Object) cacheMap44);
        cacheMap22.putAll((java.util.Map) cacheMap32);
        boolean boolean49 = cacheMap10.containsKey((java.lang.Object) cacheMap32);
        boolean boolean50 = cacheMap0.unpin((java.lang.Object) cacheMap10);
        int int51 = cacheMap0.getSoftReferenceSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CacheMap:{}::{}" + "'", str13, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "CacheMap:{}::{}" + "'", str35, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        cacheMap3.setCacheSize(10);
        java.util.Set set6 = cacheMap3.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection9 = cacheMap8.values();
        cacheMap8.readLock();
        java.lang.Object obj11 = cacheMap3.remove((java.lang.Object) cacheMap8);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = cacheMap16.pin(obj17);
        boolean boolean19 = cacheMap16.isLRU();
        cacheMap13.putAll((java.util.Map) cacheMap16, false);
        cacheMap8.putAll((java.util.Map) cacheMap13);
        int int23 = cacheMap13.getCacheSize();
        java.util.Set set24 = cacheMap13.keySet();
        boolean boolean25 = cacheMap0.pin((java.lang.Object) cacheMap13);
        cacheMap0.readLock();
        java.util.Set set27 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap30 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap30.setCacheSize((int) '4');
        boolean boolean34 = cacheMap30.containsValue((java.lang.Object) 100);
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap();
        cacheMap35.setCacheSize(10);
        java.lang.Object obj39 = cacheMap35.get((java.lang.Object) 100L);
        java.lang.Object obj40 = cacheMap30.remove((java.lang.Object) cacheMap35);
        org.apache.openjpa.util.CacheMap cacheMap41 = new org.apache.openjpa.util.CacheMap();
        cacheMap41.setCacheSize(10);
        java.util.Set set44 = cacheMap41.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap46 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection47 = cacheMap46.values();
        cacheMap46.readLock();
        java.lang.Object obj49 = cacheMap41.remove((java.lang.Object) cacheMap46);
        org.apache.openjpa.util.CacheMap cacheMap50 = new org.apache.openjpa.util.CacheMap();
        cacheMap50.setCacheSize(10);
        boolean boolean53 = cacheMap50.isEmpty();
        cacheMap50.writeLock();
        cacheMap46.putAll((java.util.Map) cacheMap50);
        cacheMap35.putAll((java.util.Map) cacheMap46);
        int int57 = cacheMap46.getSoftReferenceSize();
        java.lang.Object obj58 = cacheMap0.get((java.lang.Object) cacheMap46);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1000 + "'", int23 == 1000);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        boolean boolean5 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        cacheMap0.putAll((java.util.Map) cacheMap6, false);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean15 = cacheMap13.containsValue((java.lang.Object) '4');
        java.util.Set set16 = cacheMap13.keySet();
        java.lang.String str17 = cacheMap13.toString();
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap();
        cacheMap18.setCacheSize(10);
        java.util.Set set21 = cacheMap18.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection24 = cacheMap23.values();
        cacheMap23.readLock();
        java.lang.Object obj26 = cacheMap18.remove((java.lang.Object) cacheMap23);
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj29 = cacheMap18.get(obj27);
        java.util.Collection collection30 = cacheMap18.values();
        java.lang.Object obj31 = cacheMap6.put((java.lang.Object) str17, (java.lang.Object) collection30);
        java.lang.Class<?> wildcardClass32 = cacheMap6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CacheMap:{}::{}" + "'", str17, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: LRUMap max size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        int int3 = cacheMap0.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = cacheMap6.pin(obj7);
        boolean boolean9 = cacheMap0.containsValue((java.lang.Object) boolean8);
        java.lang.Class<?> wildcardClass10 = cacheMap0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = cacheMap2.pin(obj3);
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        cacheMap5.setCacheSize((int) (byte) 10);
        java.lang.String str8 = cacheMap5.toString();
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap();
        boolean boolean10 = cacheMap9.isEmpty();
        cacheMap5.putAll((java.util.Map) cacheMap9, true);
        java.util.Collection collection13 = cacheMap5.values();
        java.lang.Object obj15 = cacheMap2.put((java.lang.Object) collection13, (java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection18 = cacheMap17.values();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap();
        cacheMap19.setCacheSize((int) (byte) 10);
        java.lang.String str22 = cacheMap19.toString();
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap();
        boolean boolean24 = cacheMap23.isEmpty();
        cacheMap19.putAll((java.util.Map) cacheMap23, true);
        boolean boolean27 = cacheMap17.containsKey((java.lang.Object) true);
        java.util.Collection collection28 = cacheMap17.values();
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean33 = cacheMap31.containsValue((java.lang.Object) '4');
        boolean boolean34 = cacheMap17.containsKey((java.lang.Object) boolean33);
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap();
        cacheMap35.setCacheSize((int) (byte) 10);
        java.lang.String str38 = cacheMap35.toString();
        boolean boolean39 = cacheMap35.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap42 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection43 = cacheMap42.values();
        java.lang.Object obj44 = cacheMap35.put((java.lang.Object) 100L, (java.lang.Object) collection43);
        cacheMap35.readLock();
        java.util.Collection collection46 = cacheMap35.values();
        cacheMap35.readLock();
        org.apache.openjpa.util.CacheMap cacheMap48 = new org.apache.openjpa.util.CacheMap();
        boolean boolean49 = cacheMap48.isEmpty();
        java.lang.Object obj51 = cacheMap48.remove((java.lang.Object) 1);
        java.util.Set set52 = cacheMap48.keySet();
        java.lang.Object obj53 = cacheMap17.put((java.lang.Object) cacheMap35, (java.lang.Object) set52);
        cacheMap17.clear();
        cacheMap2.putAll((java.util.Map) cacheMap17, true);
        boolean boolean57 = cacheMap2.isLRU();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CacheMap:{}::{}" + "'", str22, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "CacheMap:{}::{}" + "'", str38, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.lang.Object obj4 = cacheMap0.get((java.lang.Object) 100L);
        cacheMap0.clear();
        int int6 = cacheMap0.getSoftReferenceSize();
        cacheMap0.readLock();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        java.lang.String str10 = cacheMap0.toString();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap0.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CacheMap:{100=[]}::{}" + "'", str10, "CacheMap:{100=[]}::{}");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.lang.Object obj3 = cacheMap0.remove((java.lang.Object) 1);
        java.util.Set set4 = cacheMap0.keySet();
        java.lang.String str5 = cacheMap0.toString();
        java.lang.String str6 = cacheMap0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CacheMap:{}::{}" + "'", str5, "CacheMap:{}::{}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        java.lang.Object obj6 = cacheMap0.remove((java.lang.Object) cacheMap4);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        boolean boolean9 = cacheMap8.isEmpty();
        java.util.Set set10 = cacheMap8.entrySet();
        int int11 = cacheMap8.getCacheSize();
        java.lang.Object obj12 = cacheMap4.put((java.lang.Object) false, (java.lang.Object) int11);
        boolean boolean13 = cacheMap4.isEmpty();
        java.util.Set set14 = cacheMap4.getPinnedKeys();
        int int15 = cacheMap4.size();
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap();
        cacheMap16.setCacheSize((int) (byte) 10);
        java.lang.String str19 = cacheMap16.toString();
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap();
        boolean boolean21 = cacheMap20.isEmpty();
        cacheMap16.putAll((java.util.Map) cacheMap20, true);
        java.util.Collection collection24 = cacheMap20.values();
        java.lang.Object obj25 = cacheMap4.get((java.lang.Object) collection24);
        org.apache.openjpa.util.CacheMap cacheMap28 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean29 = cacheMap4.containsKey((java.lang.Object) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CacheMap:{}::{}" + "'", str19, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) 'a');
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.util.Set set2 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection5 = cacheMap4.values();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        java.lang.String str9 = cacheMap6.toString();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        boolean boolean11 = cacheMap10.isEmpty();
        java.lang.Object obj12 = cacheMap6.remove((java.lang.Object) cacheMap10);
        java.lang.Object obj13 = cacheMap0.put((java.lang.Object) cacheMap4, obj12);
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = cacheMap16.pin(obj17);
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap();
        cacheMap19.setCacheSize(10);
        java.util.Set set22 = cacheMap19.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection25 = cacheMap24.values();
        cacheMap24.readLock();
        java.lang.Object obj27 = cacheMap19.remove((java.lang.Object) cacheMap24);
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap32 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj33 = new java.lang.Object();
        boolean boolean34 = cacheMap32.pin(obj33);
        boolean boolean35 = cacheMap32.isLRU();
        cacheMap29.putAll((java.util.Map) cacheMap32, false);
        cacheMap24.putAll((java.util.Map) cacheMap29);
        int int39 = cacheMap29.getCacheSize();
        java.util.Set set40 = cacheMap29.keySet();
        org.apache.openjpa.util.CacheMap cacheMap41 = new org.apache.openjpa.util.CacheMap();
        boolean boolean42 = cacheMap41.isEmpty();
        java.util.Set set43 = cacheMap41.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap45 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection46 = cacheMap45.values();
        org.apache.openjpa.util.CacheMap cacheMap47 = new org.apache.openjpa.util.CacheMap();
        cacheMap47.setCacheSize((int) (byte) 10);
        java.lang.String str50 = cacheMap47.toString();
        org.apache.openjpa.util.CacheMap cacheMap51 = new org.apache.openjpa.util.CacheMap();
        boolean boolean52 = cacheMap51.isEmpty();
        java.lang.Object obj53 = cacheMap47.remove((java.lang.Object) cacheMap51);
        java.lang.Object obj54 = cacheMap41.put((java.lang.Object) cacheMap45, obj53);
        java.lang.Object obj55 = cacheMap16.put((java.lang.Object) set40, (java.lang.Object) cacheMap45);
        int int56 = cacheMap16.getSoftReferenceSize();
        boolean boolean57 = cacheMap4.pin((java.lang.Object) cacheMap16);
        org.apache.openjpa.util.CacheMap cacheMap58 = new org.apache.openjpa.util.CacheMap();
        boolean boolean59 = cacheMap58.isEmpty();
        java.lang.Object obj61 = cacheMap58.remove((java.lang.Object) 1);
        org.apache.openjpa.util.CacheMap cacheMap62 = new org.apache.openjpa.util.CacheMap();
        cacheMap62.setCacheSize((int) (byte) 10);
        boolean boolean66 = cacheMap62.pin((java.lang.Object) 1);
        java.util.Set set67 = cacheMap62.entrySet();
        java.lang.Object obj68 = cacheMap58.remove((java.lang.Object) cacheMap62);
        org.apache.openjpa.util.CacheMap cacheMap69 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj71 = cacheMap69.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap72 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj74 = cacheMap72.remove((java.lang.Object) (short) 1);
        cacheMap69.putAll((java.util.Map) cacheMap72, false);
        org.apache.openjpa.util.CacheMap cacheMap77 = new org.apache.openjpa.util.CacheMap();
        cacheMap77.setCacheSize((int) (byte) 10);
        boolean boolean81 = cacheMap77.pin((java.lang.Object) 1);
        cacheMap72.putAll((java.util.Map) cacheMap77, true);
        java.lang.Object obj84 = cacheMap62.remove((java.lang.Object) cacheMap77);
        boolean boolean85 = cacheMap16.pin((java.lang.Object) cacheMap77);
        cacheMap77.readLock();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1000 + "'", int39 == 1000);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "CacheMap:{}::{}" + "'", str50, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.lang.Object obj4 = cacheMap0.get((java.lang.Object) 100L);
        java.lang.Object obj6 = cacheMap0.remove((java.lang.Object) (-1.0d));
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        cacheMap7.setCacheSize((int) (byte) 10);
        java.lang.String str10 = cacheMap7.toString();
        boolean boolean11 = cacheMap7.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection15 = cacheMap14.values();
        java.lang.Object obj16 = cacheMap7.put((java.lang.Object) 100L, (java.lang.Object) collection15);
        cacheMap7.readLock();
        java.util.Collection collection18 = cacheMap7.values();
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap(false, (int) (short) 10);
        cacheMap7.putAll((java.util.Map) cacheMap21, false);
        java.lang.Object obj24 = cacheMap0.get((java.lang.Object) false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CacheMap:{}::{}" + "'", str10, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection2 = cacheMap1.values();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        cacheMap3.setCacheSize((int) (byte) 10);
        java.lang.String str6 = cacheMap3.toString();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        boolean boolean8 = cacheMap7.isEmpty();
        cacheMap3.putAll((java.util.Map) cacheMap7, true);
        boolean boolean11 = cacheMap1.containsKey((java.lang.Object) true);
        java.util.Collection collection12 = cacheMap1.values();
        int int13 = cacheMap1.size();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj16 = cacheMap14.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj19 = cacheMap17.remove((java.lang.Object) (short) 1);
        cacheMap14.putAll((java.util.Map) cacheMap17, false);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        cacheMap22.setCacheSize((int) (byte) 10);
        boolean boolean26 = cacheMap22.pin((java.lang.Object) 1);
        cacheMap17.putAll((java.util.Map) cacheMap22, true);
        int int29 = cacheMap17.getSoftReferenceSize();
        boolean boolean30 = cacheMap1.unpin((java.lang.Object) cacheMap17);
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap();
        cacheMap31.setCacheSize(10);
        java.util.Set set34 = cacheMap31.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap36 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection37 = cacheMap36.values();
        cacheMap36.readLock();
        java.lang.Object obj39 = cacheMap31.remove((java.lang.Object) cacheMap36);
        org.apache.openjpa.util.CacheMap cacheMap41 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap44 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj45 = new java.lang.Object();
        boolean boolean46 = cacheMap44.pin(obj45);
        boolean boolean47 = cacheMap44.isLRU();
        cacheMap41.putAll((java.util.Map) cacheMap44, false);
        cacheMap36.putAll((java.util.Map) cacheMap41);
        boolean boolean51 = cacheMap1.containsValue((java.lang.Object) cacheMap36);
        org.apache.openjpa.util.CacheMap cacheMap52 = new org.apache.openjpa.util.CacheMap();
        cacheMap52.setCacheSize((int) (byte) 10);
        java.lang.String str55 = cacheMap52.toString();
        boolean boolean56 = cacheMap52.isEmpty();
        boolean boolean57 = cacheMap52.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap58 = new org.apache.openjpa.util.CacheMap();
        cacheMap58.setCacheSize((int) (byte) 10);
        cacheMap52.putAll((java.util.Map) cacheMap58, false);
        boolean boolean64 = cacheMap52.unpin((java.lang.Object) (short) 10);
        org.apache.openjpa.util.CacheMap cacheMap65 = new org.apache.openjpa.util.CacheMap();
        cacheMap65.setCacheSize((int) (byte) 10);
        java.lang.String str68 = cacheMap65.toString();
        org.apache.openjpa.util.CacheMap cacheMap69 = new org.apache.openjpa.util.CacheMap();
        boolean boolean70 = cacheMap69.isEmpty();
        java.lang.Object obj71 = cacheMap65.remove((java.lang.Object) cacheMap69);
        org.apache.openjpa.util.CacheMap cacheMap73 = new org.apache.openjpa.util.CacheMap();
        boolean boolean74 = cacheMap73.isEmpty();
        java.util.Set set75 = cacheMap73.entrySet();
        int int76 = cacheMap73.getCacheSize();
        java.lang.Object obj77 = cacheMap69.put((java.lang.Object) false, (java.lang.Object) int76);
        cacheMap69.setSoftReferenceSize((int) (short) 10);
        org.apache.openjpa.util.CacheMap cacheMap80 = new org.apache.openjpa.util.CacheMap();
        cacheMap80.setCacheSize(10);
        java.util.Set set83 = cacheMap80.entrySet();
        boolean boolean84 = cacheMap80.isLRU();
        boolean boolean85 = cacheMap69.containsValue((java.lang.Object) cacheMap80);
        boolean boolean86 = cacheMap52.containsKey((java.lang.Object) cacheMap69);
        cacheMap69.setSoftReferenceSize((int) (short) 10);
        java.util.Set set89 = cacheMap69.entrySet();
        boolean boolean90 = cacheMap1.containsKey((java.lang.Object) set89);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "CacheMap:{}::{}" + "'", str55, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "CacheMap:{}::{}" + "'", str68, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1000 + "'", int76 == 1000);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        boolean boolean2 = cacheMap0.isEmpty();
        cacheMap0.setSoftReferenceSize((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean4 = cacheMap2.containsValue((java.lang.Object) '4');
        java.util.Set set5 = cacheMap2.keySet();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        boolean boolean7 = cacheMap6.isEmpty();
        java.lang.Object obj9 = cacheMap6.remove((java.lang.Object) 1);
        java.lang.Object obj10 = cacheMap2.remove((java.lang.Object) 1);
        java.util.Collection collection11 = cacheMap2.values();
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection14 = cacheMap13.values();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        cacheMap15.setCacheSize((int) (byte) 10);
        java.lang.String str18 = cacheMap15.toString();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap();
        boolean boolean20 = cacheMap19.isEmpty();
        cacheMap15.putAll((java.util.Map) cacheMap19, true);
        boolean boolean23 = cacheMap13.containsKey((java.lang.Object) true);
        java.util.Collection collection24 = cacheMap13.values();
        int int25 = cacheMap13.size();
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj28 = cacheMap26.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj31 = cacheMap29.remove((java.lang.Object) (short) 1);
        cacheMap26.putAll((java.util.Map) cacheMap29, false);
        org.apache.openjpa.util.CacheMap cacheMap34 = new org.apache.openjpa.util.CacheMap();
        cacheMap34.setCacheSize((int) (byte) 10);
        boolean boolean38 = cacheMap34.pin((java.lang.Object) 1);
        cacheMap29.putAll((java.util.Map) cacheMap34, true);
        int int41 = cacheMap29.getSoftReferenceSize();
        boolean boolean42 = cacheMap13.unpin((java.lang.Object) cacheMap29);
        org.apache.openjpa.util.CacheMap cacheMap43 = new org.apache.openjpa.util.CacheMap();
        boolean boolean44 = cacheMap43.isEmpty();
        boolean boolean45 = cacheMap29.containsValue((java.lang.Object) cacheMap43);
        boolean boolean46 = cacheMap2.unpin((java.lang.Object) cacheMap29);
        int int47 = cacheMap29.getSoftReferenceSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CacheMap:{}::{}" + "'", str18, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean4 = cacheMap2.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection7 = cacheMap6.values();
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        cacheMap8.setCacheSize((int) (byte) 10);
        java.lang.String str11 = cacheMap8.toString();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        boolean boolean13 = cacheMap12.isEmpty();
        cacheMap8.putAll((java.util.Map) cacheMap12, true);
        boolean boolean16 = cacheMap6.containsKey((java.lang.Object) true);
        java.util.Collection collection17 = cacheMap6.values();
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean22 = cacheMap20.containsValue((java.lang.Object) '4');
        boolean boolean23 = cacheMap6.containsKey((java.lang.Object) boolean22);
        boolean boolean24 = cacheMap2.pin((java.lang.Object) boolean23);
        java.util.Set set25 = cacheMap2.entrySet();
        cacheMap2.clear();
        java.util.Set set27 = cacheMap2.entrySet();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CacheMap:{}::{}" + "'", str11, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.lang.Object obj4 = cacheMap0.get((java.lang.Object) 100L);
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        cacheMap5.setCacheSize((int) (byte) 10);
        java.lang.String str8 = cacheMap5.toString();
        cacheMap0.putAll((java.util.Map) cacheMap5, false);
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap();
        cacheMap11.setCacheSize(10);
        java.util.Set set14 = cacheMap11.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection17 = cacheMap16.values();
        cacheMap16.readLock();
        java.lang.Object obj19 = cacheMap11.remove((java.lang.Object) cacheMap16);
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap();
        cacheMap20.setCacheSize(10);
        boolean boolean23 = cacheMap20.isEmpty();
        cacheMap20.writeLock();
        cacheMap16.putAll((java.util.Map) cacheMap20);
        org.apache.openjpa.util.CacheMap cacheMap28 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean30 = cacheMap28.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap32 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection33 = cacheMap32.values();
        org.apache.openjpa.util.CacheMap cacheMap34 = new org.apache.openjpa.util.CacheMap();
        cacheMap34.setCacheSize((int) (byte) 10);
        java.lang.String str37 = cacheMap34.toString();
        org.apache.openjpa.util.CacheMap cacheMap38 = new org.apache.openjpa.util.CacheMap();
        boolean boolean39 = cacheMap38.isEmpty();
        cacheMap34.putAll((java.util.Map) cacheMap38, true);
        boolean boolean42 = cacheMap32.containsKey((java.lang.Object) true);
        java.util.Collection collection43 = cacheMap32.values();
        org.apache.openjpa.util.CacheMap cacheMap46 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean48 = cacheMap46.containsValue((java.lang.Object) '4');
        boolean boolean49 = cacheMap32.containsKey((java.lang.Object) boolean48);
        boolean boolean50 = cacheMap28.pin((java.lang.Object) boolean49);
        cacheMap20.putAll((java.util.Map) cacheMap28, false);
        boolean boolean53 = cacheMap5.pin((java.lang.Object) cacheMap20);
        java.util.Set set54 = cacheMap5.getPinnedKeys();
        cacheMap5.setCacheSize((int) '4');
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "CacheMap:{}::{}" + "'", str37, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(set54);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true, (int) (short) 100, (int) (byte) 1, (float) (short) 1, (int) (short) 10);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        boolean boolean4 = cacheMap0.pin((java.lang.Object) 1);
        java.util.Collection collection5 = cacheMap0.values();
        boolean boolean6 = cacheMap0.isLRU();
        java.util.Set set7 = cacheMap0.getPinnedKeys();
        boolean boolean9 = cacheMap0.unpin((java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        cacheMap10.setCacheSize((int) (byte) 10);
        java.lang.String str13 = cacheMap10.toString();
        boolean boolean14 = cacheMap10.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection18 = cacheMap17.values();
        java.lang.Object obj19 = cacheMap10.put((java.lang.Object) 100L, (java.lang.Object) collection18);
        java.util.Set set20 = cacheMap10.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection23 = cacheMap22.values();
        cacheMap22.readLock();
        boolean boolean25 = cacheMap10.pin((java.lang.Object) cacheMap22);
        cacheMap0.putAll((java.util.Map) cacheMap10);
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap();
        cacheMap27.setCacheSize((int) (byte) 10);
        java.lang.String str30 = cacheMap27.toString();
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap();
        boolean boolean32 = cacheMap31.isEmpty();
        java.lang.Object obj33 = cacheMap27.remove((java.lang.Object) cacheMap31);
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap();
        boolean boolean36 = cacheMap35.isEmpty();
        java.util.Set set37 = cacheMap35.entrySet();
        int int38 = cacheMap35.getCacheSize();
        java.lang.Object obj39 = cacheMap31.put((java.lang.Object) false, (java.lang.Object) int38);
        cacheMap31.setSoftReferenceSize((int) (short) 10);
        org.apache.openjpa.util.CacheMap cacheMap42 = new org.apache.openjpa.util.CacheMap();
        cacheMap42.setCacheSize(10);
        java.util.Set set45 = cacheMap42.entrySet();
        boolean boolean46 = cacheMap42.isLRU();
        boolean boolean47 = cacheMap31.containsValue((java.lang.Object) cacheMap42);
        cacheMap10.putAll((java.util.Map) cacheMap31, true);
        cacheMap10.setSoftReferenceSize((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CacheMap:{}::{}" + "'", str13, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "CacheMap:{}::{}" + "'", str30, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1000 + "'", int38 == 1000);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.util.Set set2 = cacheMap0.entrySet();
        cacheMap0.setCacheSize((int) (short) 0);
        java.util.Set set5 = cacheMap0.getPinnedKeys();
        cacheMap0.readLock();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        cacheMap7.setCacheSize(10);
        java.util.Set set10 = cacheMap7.entrySet();
        int int11 = cacheMap7.size();
        int int12 = cacheMap7.getSoftReferenceSize();
        cacheMap0.putAll((java.util.Map) cacheMap7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        cacheMap8.setCacheSize((int) (byte) 10);
        boolean boolean12 = cacheMap8.pin((java.lang.Object) 1);
        cacheMap3.putAll((java.util.Map) cacheMap8, true);
        int int15 = cacheMap3.getSoftReferenceSize();
        java.util.Set set16 = cacheMap3.getPinnedKeys();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        java.lang.Object obj6 = cacheMap0.remove((java.lang.Object) cacheMap4);
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        cacheMap7.setCacheSize((int) (byte) 10);
        java.lang.String str10 = cacheMap7.toString();
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap();
        boolean boolean12 = cacheMap11.isEmpty();
        java.lang.Object obj13 = cacheMap7.remove((java.lang.Object) cacheMap11);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        boolean boolean16 = cacheMap15.isEmpty();
        java.util.Set set17 = cacheMap15.entrySet();
        int int18 = cacheMap15.getCacheSize();
        java.lang.Object obj19 = cacheMap11.put((java.lang.Object) false, (java.lang.Object) int18);
        boolean boolean20 = cacheMap11.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj23 = cacheMap21.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj26 = cacheMap24.remove((java.lang.Object) (short) 1);
        cacheMap21.putAll((java.util.Map) cacheMap24, false);
        java.util.Set set29 = cacheMap24.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap30 = new org.apache.openjpa.util.CacheMap();
        int int31 = cacheMap30.getSoftReferenceSize();
        java.lang.Object obj32 = cacheMap11.put((java.lang.Object) set29, (java.lang.Object) cacheMap30);
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap();
        cacheMap33.setCacheSize((int) (byte) 10);
        boolean boolean37 = cacheMap33.pin((java.lang.Object) 1);
        java.util.Collection collection38 = cacheMap33.values();
        java.lang.String str39 = cacheMap33.toString();
        java.lang.String str40 = cacheMap33.toString();
        org.apache.openjpa.util.CacheMap cacheMap43 = new org.apache.openjpa.util.CacheMap(true, 100);
        cacheMap33.putAll((java.util.Map) cacheMap43);
        java.lang.Object obj45 = cacheMap11.remove((java.lang.Object) cacheMap33);
        org.apache.openjpa.util.CacheMap cacheMap46 = new org.apache.openjpa.util.CacheMap();
        cacheMap46.setCacheSize((int) (byte) 10);
        java.lang.String str49 = cacheMap46.toString();
        boolean boolean50 = cacheMap46.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap53 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection54 = cacheMap53.values();
        java.lang.Object obj55 = cacheMap46.put((java.lang.Object) 100L, (java.lang.Object) collection54);
        java.util.Set set56 = cacheMap46.getPinnedKeys();
        cacheMap46.clear();
        boolean boolean58 = cacheMap11.pin((java.lang.Object) cacheMap46);
        boolean boolean59 = cacheMap4.containsKey((java.lang.Object) cacheMap46);
        int int60 = cacheMap46.getCacheSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CacheMap:{}::{}" + "'", str10, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1000 + "'", int18 == 1000);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "CacheMap:{}::{}" + "'", str39, "CacheMap:{}::{}");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "CacheMap:{}::{}" + "'", str40, "CacheMap:{}::{}");
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "CacheMap:{}::{}" + "'", str49, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.lang.Object obj4 = cacheMap0.get((java.lang.Object) 100L);
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        cacheMap5.setCacheSize((int) (byte) 10);
        java.lang.String str8 = cacheMap5.toString();
        cacheMap0.putAll((java.util.Map) cacheMap5, false);
        cacheMap0.setCacheSize(0);
        java.util.Collection collection13 = cacheMap0.values();
        java.lang.Class<?> wildcardClass14 = cacheMap0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setSoftReferenceSize((int) '4');
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection5 = cacheMap4.values();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        java.lang.String str9 = cacheMap6.toString();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        boolean boolean11 = cacheMap10.isEmpty();
        cacheMap6.putAll((java.util.Map) cacheMap10, true);
        boolean boolean14 = cacheMap4.containsKey((java.lang.Object) true);
        boolean boolean15 = cacheMap0.containsValue((java.lang.Object) true);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean4 = cacheMap2.containsValue((java.lang.Object) '4');
        java.util.Set set5 = cacheMap2.keySet();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        boolean boolean7 = cacheMap6.isEmpty();
        java.lang.Object obj9 = cacheMap6.remove((java.lang.Object) 1);
        java.lang.Object obj10 = cacheMap2.remove((java.lang.Object) 1);
        java.util.Collection collection11 = cacheMap2.values();
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection14 = cacheMap13.values();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        cacheMap15.setCacheSize((int) (byte) 10);
        java.lang.String str18 = cacheMap15.toString();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap();
        boolean boolean20 = cacheMap19.isEmpty();
        cacheMap15.putAll((java.util.Map) cacheMap19, true);
        boolean boolean23 = cacheMap13.containsKey((java.lang.Object) true);
        java.util.Collection collection24 = cacheMap13.values();
        int int25 = cacheMap13.size();
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj28 = cacheMap26.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj31 = cacheMap29.remove((java.lang.Object) (short) 1);
        cacheMap26.putAll((java.util.Map) cacheMap29, false);
        org.apache.openjpa.util.CacheMap cacheMap34 = new org.apache.openjpa.util.CacheMap();
        cacheMap34.setCacheSize((int) (byte) 10);
        boolean boolean38 = cacheMap34.pin((java.lang.Object) 1);
        cacheMap29.putAll((java.util.Map) cacheMap34, true);
        int int41 = cacheMap29.getSoftReferenceSize();
        boolean boolean42 = cacheMap13.unpin((java.lang.Object) cacheMap29);
        org.apache.openjpa.util.CacheMap cacheMap43 = new org.apache.openjpa.util.CacheMap();
        boolean boolean44 = cacheMap43.isEmpty();
        boolean boolean45 = cacheMap29.containsValue((java.lang.Object) cacheMap43);
        boolean boolean46 = cacheMap2.unpin((java.lang.Object) cacheMap29);
        org.apache.openjpa.util.CacheMap cacheMap47 = new org.apache.openjpa.util.CacheMap();
        cacheMap47.setCacheSize(10);
        java.lang.Object obj51 = cacheMap47.get((java.lang.Object) 100L);
        int int52 = cacheMap47.getCacheSize();
        org.apache.openjpa.util.CacheMap cacheMap54 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection55 = cacheMap54.values();
        org.apache.openjpa.util.CacheMap cacheMap56 = new org.apache.openjpa.util.CacheMap();
        cacheMap56.setCacheSize((int) (byte) 10);
        java.lang.String str59 = cacheMap56.toString();
        org.apache.openjpa.util.CacheMap cacheMap60 = new org.apache.openjpa.util.CacheMap();
        boolean boolean61 = cacheMap60.isEmpty();
        cacheMap56.putAll((java.util.Map) cacheMap60, true);
        boolean boolean64 = cacheMap54.containsKey((java.lang.Object) true);
        java.util.Collection collection65 = cacheMap54.values();
        int int66 = cacheMap54.size();
        org.apache.openjpa.util.CacheMap cacheMap67 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj69 = cacheMap67.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap70 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj72 = cacheMap70.remove((java.lang.Object) (short) 1);
        cacheMap67.putAll((java.util.Map) cacheMap70, false);
        org.apache.openjpa.util.CacheMap cacheMap75 = new org.apache.openjpa.util.CacheMap();
        cacheMap75.setCacheSize((int) (byte) 10);
        boolean boolean79 = cacheMap75.pin((java.lang.Object) 1);
        cacheMap70.putAll((java.util.Map) cacheMap75, true);
        int int82 = cacheMap70.getSoftReferenceSize();
        boolean boolean83 = cacheMap54.unpin((java.lang.Object) cacheMap70);
        cacheMap47.putAll((java.util.Map) cacheMap70);
        java.lang.Object obj85 = cacheMap2.get((java.lang.Object) cacheMap70);
        cacheMap2.setCacheSize(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CacheMap:{}::{}" + "'", str18, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "CacheMap:{}::{}" + "'", str59, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(obj85);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        int int4 = cacheMap0.size();
        cacheMap0.setCacheSize((int) '4');
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap(true);
        int int9 = cacheMap8.getCacheSize();
        java.lang.Object obj10 = cacheMap0.remove((java.lang.Object) cacheMap8);
        java.util.Collection collection11 = cacheMap8.values();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        cacheMap0.putAll((java.util.Map) cacheMap4, true);
        java.lang.Class<?> wildcardClass8 = cacheMap4.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        cacheMap0.readLock();
        java.util.Collection collection11 = cacheMap0.values();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap(false, (int) (short) 10);
        cacheMap0.putAll((java.util.Map) cacheMap14, false);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj19 = cacheMap17.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj22 = cacheMap20.remove((java.lang.Object) (short) 1);
        cacheMap17.putAll((java.util.Map) cacheMap20, false);
        java.util.Set set25 = cacheMap20.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap28 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean30 = cacheMap28.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap();
        cacheMap31.setCacheSize(10);
        java.util.Set set34 = cacheMap31.entrySet();
        boolean boolean35 = cacheMap31.isLRU();
        int int36 = cacheMap31.getCacheSize();
        java.lang.Object obj37 = cacheMap20.put((java.lang.Object) boolean30, (java.lang.Object) cacheMap31);
        int int38 = cacheMap31.getSoftReferenceSize();
        boolean boolean39 = cacheMap31.isLRU();
        cacheMap0.putAll((java.util.Map) cacheMap31, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        int int3 = cacheMap0.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        cacheMap4.setCacheSize((int) (byte) 10);
        java.lang.String str7 = cacheMap4.toString();
        boolean boolean8 = cacheMap4.isEmpty();
        boolean boolean9 = cacheMap4.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        cacheMap10.setCacheSize((int) (byte) 10);
        cacheMap4.putAll((java.util.Map) cacheMap10, false);
        boolean boolean15 = cacheMap0.containsKey((java.lang.Object) cacheMap10);
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(false, (-1));
        cacheMap10.putAll((java.util.Map) cacheMap18, false);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CacheMap:{}::{}" + "'", str7, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) ' ', 1000, (float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        java.lang.Object obj6 = cacheMap0.remove((java.lang.Object) cacheMap4);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        boolean boolean9 = cacheMap8.isEmpty();
        java.util.Set set10 = cacheMap8.entrySet();
        int int11 = cacheMap8.getCacheSize();
        java.lang.Object obj12 = cacheMap4.put((java.lang.Object) false, (java.lang.Object) int11);
        boolean boolean13 = cacheMap4.isEmpty();
        java.util.Set set14 = cacheMap4.getPinnedKeys();
        cacheMap4.clear();
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj19 = new java.lang.Object();
        boolean boolean20 = cacheMap18.pin(obj19);
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap();
        cacheMap21.setCacheSize((int) (byte) 10);
        java.lang.String str24 = cacheMap21.toString();
        org.apache.openjpa.util.CacheMap cacheMap25 = new org.apache.openjpa.util.CacheMap();
        boolean boolean26 = cacheMap25.isEmpty();
        cacheMap21.putAll((java.util.Map) cacheMap25, true);
        java.util.Collection collection29 = cacheMap21.values();
        java.lang.Object obj31 = cacheMap18.put((java.lang.Object) collection29, (java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection34 = cacheMap33.values();
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap();
        cacheMap35.setCacheSize((int) (byte) 10);
        java.lang.String str38 = cacheMap35.toString();
        org.apache.openjpa.util.CacheMap cacheMap39 = new org.apache.openjpa.util.CacheMap();
        boolean boolean40 = cacheMap39.isEmpty();
        cacheMap35.putAll((java.util.Map) cacheMap39, true);
        boolean boolean43 = cacheMap33.containsKey((java.lang.Object) true);
        java.util.Collection collection44 = cacheMap33.values();
        org.apache.openjpa.util.CacheMap cacheMap47 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean49 = cacheMap47.containsValue((java.lang.Object) '4');
        boolean boolean50 = cacheMap33.containsKey((java.lang.Object) boolean49);
        org.apache.openjpa.util.CacheMap cacheMap51 = new org.apache.openjpa.util.CacheMap();
        cacheMap51.setCacheSize((int) (byte) 10);
        java.lang.String str54 = cacheMap51.toString();
        boolean boolean55 = cacheMap51.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap58 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection59 = cacheMap58.values();
        java.lang.Object obj60 = cacheMap51.put((java.lang.Object) 100L, (java.lang.Object) collection59);
        cacheMap51.readLock();
        java.util.Collection collection62 = cacheMap51.values();
        cacheMap51.readLock();
        org.apache.openjpa.util.CacheMap cacheMap64 = new org.apache.openjpa.util.CacheMap();
        boolean boolean65 = cacheMap64.isEmpty();
        java.lang.Object obj67 = cacheMap64.remove((java.lang.Object) 1);
        java.util.Set set68 = cacheMap64.keySet();
        java.lang.Object obj69 = cacheMap33.put((java.lang.Object) cacheMap51, (java.lang.Object) set68);
        cacheMap33.clear();
        cacheMap18.putAll((java.util.Map) cacheMap33, true);
        java.lang.Object obj73 = cacheMap4.remove((java.lang.Object) true);
        java.util.Collection collection74 = cacheMap4.values();
        org.apache.openjpa.util.CacheMap cacheMap75 = new org.apache.openjpa.util.CacheMap();
        cacheMap75.setCacheSize((int) (byte) 10);
        java.lang.String str78 = cacheMap75.toString();
        org.apache.openjpa.util.CacheMap cacheMap79 = new org.apache.openjpa.util.CacheMap();
        boolean boolean80 = cacheMap79.isEmpty();
        cacheMap75.putAll((java.util.Map) cacheMap79, true);
        boolean boolean83 = cacheMap75.isLRU();
        java.lang.String str84 = cacheMap75.toString();
        java.lang.Object obj85 = cacheMap4.get((java.lang.Object) cacheMap75);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "CacheMap:{}::{}" + "'", str24, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "CacheMap:{}::{}" + "'", str38, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "CacheMap:{}::{}" + "'", str54, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "CacheMap:{}::{}" + "'", str78, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "CacheMap:{}::{}" + "'", str84, "CacheMap:{}::{}");
        org.junit.Assert.assertNull(obj85);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = cacheMap2.pin(obj3);
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        cacheMap5.setCacheSize(10);
        java.util.Set set8 = cacheMap5.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection11 = cacheMap10.values();
        cacheMap10.readLock();
        java.lang.Object obj13 = cacheMap5.remove((java.lang.Object) cacheMap10);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj19 = new java.lang.Object();
        boolean boolean20 = cacheMap18.pin(obj19);
        boolean boolean21 = cacheMap18.isLRU();
        cacheMap15.putAll((java.util.Map) cacheMap18, false);
        cacheMap10.putAll((java.util.Map) cacheMap15);
        int int25 = cacheMap15.getCacheSize();
        java.util.Set set26 = cacheMap15.keySet();
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap();
        boolean boolean28 = cacheMap27.isEmpty();
        java.util.Set set29 = cacheMap27.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection32 = cacheMap31.values();
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap();
        cacheMap33.setCacheSize((int) (byte) 10);
        java.lang.String str36 = cacheMap33.toString();
        org.apache.openjpa.util.CacheMap cacheMap37 = new org.apache.openjpa.util.CacheMap();
        boolean boolean38 = cacheMap37.isEmpty();
        java.lang.Object obj39 = cacheMap33.remove((java.lang.Object) cacheMap37);
        java.lang.Object obj40 = cacheMap27.put((java.lang.Object) cacheMap31, obj39);
        java.lang.Object obj41 = cacheMap2.put((java.lang.Object) set26, (java.lang.Object) cacheMap31);
        int int42 = cacheMap2.getSoftReferenceSize();
        boolean boolean43 = cacheMap2.isEmpty();
        int int44 = cacheMap2.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap45 = new org.apache.openjpa.util.CacheMap();
        cacheMap45.setCacheSize((int) (byte) 10);
        java.lang.String str48 = cacheMap45.toString();
        boolean boolean49 = cacheMap45.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap52 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection53 = cacheMap52.values();
        java.lang.Object obj54 = cacheMap45.put((java.lang.Object) 100L, (java.lang.Object) collection53);
        java.lang.String str55 = cacheMap45.toString();
        int int56 = cacheMap45.getSoftReferenceSize();
        boolean boolean57 = cacheMap45.isEmpty();
        java.util.Set set58 = cacheMap45.keySet();
        org.apache.openjpa.util.CacheMap cacheMap60 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection61 = cacheMap60.values();
        org.apache.openjpa.util.CacheMap cacheMap62 = new org.apache.openjpa.util.CacheMap();
        cacheMap62.setCacheSize((int) (byte) 10);
        java.lang.String str65 = cacheMap62.toString();
        org.apache.openjpa.util.CacheMap cacheMap66 = new org.apache.openjpa.util.CacheMap();
        boolean boolean67 = cacheMap66.isEmpty();
        cacheMap62.putAll((java.util.Map) cacheMap66, true);
        boolean boolean70 = cacheMap60.containsKey((java.lang.Object) true);
        cacheMap60.clear();
        java.util.Set set72 = cacheMap60.entrySet();
        java.lang.Object obj73 = cacheMap2.put((java.lang.Object) set58, (java.lang.Object) cacheMap60);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1000 + "'", int25 == 1000);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "CacheMap:{}::{}" + "'", str36, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "CacheMap:{}::{}" + "'", str48, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "CacheMap:{100=[]}::{}" + "'", str55, "CacheMap:{100=[]}::{}");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "CacheMap:{}::{}" + "'", str65, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNull(obj73);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        int int4 = cacheMap0.size();
        cacheMap0.setCacheSize((int) '4');
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap(true);
        int int9 = cacheMap8.getCacheSize();
        java.lang.Object obj10 = cacheMap0.remove((java.lang.Object) cacheMap8);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap13.setCacheSize((int) '4');
        boolean boolean17 = cacheMap13.containsValue((java.lang.Object) 100);
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap();
        cacheMap18.setCacheSize(10);
        java.lang.Object obj22 = cacheMap18.get((java.lang.Object) 100L);
        java.lang.Object obj23 = cacheMap13.remove((java.lang.Object) cacheMap18);
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap();
        cacheMap24.setCacheSize(10);
        java.util.Set set27 = cacheMap24.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection30 = cacheMap29.values();
        cacheMap29.readLock();
        java.lang.Object obj32 = cacheMap24.remove((java.lang.Object) cacheMap29);
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap();
        cacheMap33.setCacheSize(10);
        boolean boolean36 = cacheMap33.isEmpty();
        cacheMap33.writeLock();
        cacheMap29.putAll((java.util.Map) cacheMap33);
        cacheMap18.putAll((java.util.Map) cacheMap29);
        int int40 = cacheMap29.size();
        java.lang.Object obj41 = cacheMap0.remove((java.lang.Object) cacheMap29);
        java.lang.String str42 = cacheMap0.toString();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "CacheMap:{}::{}" + "'", str42, "CacheMap:{}::{}");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean6 = cacheMap4.pin(obj5);
        boolean boolean7 = cacheMap4.isLRU();
        cacheMap1.putAll((java.util.Map) cacheMap4, false);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        cacheMap10.setCacheSize((int) (byte) 10);
        java.lang.String str13 = cacheMap10.toString();
        boolean boolean14 = cacheMap10.isEmpty();
        java.util.Set set15 = cacheMap10.keySet();
        boolean boolean16 = cacheMap1.containsValue((java.lang.Object) set15);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        cacheMap17.setCacheSize(10);
        java.util.Set set20 = cacheMap17.entrySet();
        int int21 = cacheMap17.size();
        cacheMap17.setCacheSize((int) '4');
        org.apache.openjpa.util.CacheMap cacheMap25 = new org.apache.openjpa.util.CacheMap(true);
        int int26 = cacheMap25.getCacheSize();
        java.lang.Object obj27 = cacheMap17.remove((java.lang.Object) cacheMap25);
        org.apache.openjpa.util.CacheMap cacheMap30 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap30.setCacheSize((int) '4');
        boolean boolean34 = cacheMap30.containsValue((java.lang.Object) 100);
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap();
        cacheMap35.setCacheSize(10);
        java.lang.Object obj39 = cacheMap35.get((java.lang.Object) 100L);
        java.lang.Object obj40 = cacheMap30.remove((java.lang.Object) cacheMap35);
        org.apache.openjpa.util.CacheMap cacheMap41 = new org.apache.openjpa.util.CacheMap();
        cacheMap41.setCacheSize(10);
        java.util.Set set44 = cacheMap41.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap46 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection47 = cacheMap46.values();
        cacheMap46.readLock();
        java.lang.Object obj49 = cacheMap41.remove((java.lang.Object) cacheMap46);
        org.apache.openjpa.util.CacheMap cacheMap50 = new org.apache.openjpa.util.CacheMap();
        cacheMap50.setCacheSize(10);
        boolean boolean53 = cacheMap50.isEmpty();
        cacheMap50.writeLock();
        cacheMap46.putAll((java.util.Map) cacheMap50);
        cacheMap35.putAll((java.util.Map) cacheMap46);
        int int57 = cacheMap46.size();
        java.lang.Object obj58 = cacheMap17.remove((java.lang.Object) cacheMap46);
        org.apache.openjpa.util.CacheMap cacheMap59 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj61 = cacheMap59.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap62 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj64 = cacheMap62.remove((java.lang.Object) (short) 1);
        cacheMap59.putAll((java.util.Map) cacheMap62, false);
        java.util.Set set67 = cacheMap62.entrySet();
        java.lang.Object obj68 = cacheMap1.put((java.lang.Object) cacheMap46, (java.lang.Object) set67);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CacheMap:{}::{}" + "'", str13, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1000 + "'", int26 == 1000);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        cacheMap3.setCacheSize((int) (byte) 10);
        boolean boolean7 = cacheMap3.pin((java.lang.Object) 1);
        java.util.Collection collection8 = cacheMap3.values();
        boolean boolean9 = cacheMap3.isLRU();
        java.util.Set set10 = cacheMap3.getPinnedKeys();
        cacheMap3.setCacheSize(32);
        java.lang.Object obj13 = cacheMap0.get((java.lang.Object) cacheMap3);
        int int14 = cacheMap3.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection10 = cacheMap9.values();
        cacheMap9.readLock();
        boolean boolean12 = cacheMap0.containsValue((java.lang.Object) cacheMap9);
        boolean boolean13 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        cacheMap14.setCacheSize(10);
        java.lang.Object obj18 = cacheMap14.get((java.lang.Object) 100L);
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap();
        cacheMap19.setCacheSize((int) (byte) 10);
        java.lang.String str22 = cacheMap19.toString();
        cacheMap14.putAll((java.util.Map) cacheMap19, false);
        int int25 = cacheMap19.size();
        boolean boolean26 = cacheMap0.unpin((java.lang.Object) cacheMap19);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CacheMap:{}::{}" + "'", str22, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap2.setCacheSize((int) '4');
        java.util.Set set5 = cacheMap2.getPinnedKeys();
        int int6 = cacheMap2.getSoftReferenceSize();
        java.util.Set set7 = cacheMap2.entrySet();
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        java.util.Set set10 = cacheMap0.getPinnedKeys();
        cacheMap0.clear();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        cacheMap12.setCacheSize((int) (byte) 10);
        boolean boolean16 = cacheMap12.pin((java.lang.Object) 1);
        java.util.Collection collection17 = cacheMap12.values();
        boolean boolean18 = cacheMap12.isLRU();
        java.util.Set set19 = cacheMap12.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap();
        boolean boolean21 = cacheMap20.isEmpty();
        java.lang.Object obj23 = cacheMap20.remove((java.lang.Object) 1);
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set25 = cacheMap24.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap();
        cacheMap26.setCacheSize((int) (byte) 10);
        java.lang.String str29 = cacheMap26.toString();
        boolean boolean30 = cacheMap26.isEmpty();
        cacheMap24.putAll((java.util.Map) cacheMap26, true);
        cacheMap20.putAll((java.util.Map) cacheMap24, true);
        java.util.Set set35 = cacheMap24.entrySet();
        java.lang.Object obj36 = cacheMap0.put((java.lang.Object) cacheMap12, (java.lang.Object) cacheMap24);
        org.apache.openjpa.util.CacheMap cacheMap37 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj39 = cacheMap37.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap40 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj42 = cacheMap40.remove((java.lang.Object) (short) 1);
        cacheMap37.putAll((java.util.Map) cacheMap40, false);
        org.apache.openjpa.util.CacheMap cacheMap46 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection47 = cacheMap46.values();
        cacheMap46.readLock();
        boolean boolean49 = cacheMap37.containsValue((java.lang.Object) cacheMap46);
        boolean boolean50 = cacheMap37.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap51 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj53 = cacheMap51.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap54 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj56 = cacheMap54.remove((java.lang.Object) (short) 1);
        cacheMap51.putAll((java.util.Map) cacheMap54, false);
        boolean boolean59 = cacheMap51.isLRU();
        cacheMap51.writeLock();
        cacheMap37.putAll((java.util.Map) cacheMap51);
        int int62 = cacheMap51.getSoftReferenceSize();
        cacheMap0.putAll((java.util.Map) cacheMap51);
        org.apache.openjpa.util.CacheMap cacheMap64 = new org.apache.openjpa.util.CacheMap();
        cacheMap64.setCacheSize((int) (byte) 10);
        java.lang.String str67 = cacheMap64.toString();
        boolean boolean68 = cacheMap64.isEmpty();
        java.util.Set set69 = cacheMap64.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap72 = new org.apache.openjpa.util.CacheMap(false, 1);
        boolean boolean73 = cacheMap64.containsKey((java.lang.Object) false);
        cacheMap51.putAll((java.util.Map) cacheMap64);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "CacheMap:{}::{}" + "'", str29, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "CacheMap:{}::{}" + "'", str67, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection2 = cacheMap1.values();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        cacheMap3.setCacheSize((int) (byte) 10);
        java.lang.String str6 = cacheMap3.toString();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        boolean boolean8 = cacheMap7.isEmpty();
        cacheMap3.putAll((java.util.Map) cacheMap7, true);
        boolean boolean11 = cacheMap1.containsKey((java.lang.Object) true);
        cacheMap1.clear();
        java.util.Set set13 = cacheMap1.entrySet();
        cacheMap1.setCacheSize(10);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        int int1 = cacheMap0.getSoftReferenceSize();
        cacheMap0.writeLock();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (-1), (int) (short) 0, 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection2 = cacheMap1.values();
        cacheMap1.setCacheSize(1);
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        int int6 = cacheMap5.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection9 = cacheMap8.values();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        cacheMap10.setCacheSize((int) (byte) 10);
        java.lang.String str13 = cacheMap10.toString();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        boolean boolean15 = cacheMap14.isEmpty();
        cacheMap10.putAll((java.util.Map) cacheMap14, true);
        boolean boolean18 = cacheMap8.containsKey((java.lang.Object) true);
        java.util.Collection collection19 = cacheMap8.values();
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean24 = cacheMap22.containsValue((java.lang.Object) '4');
        boolean boolean25 = cacheMap8.containsKey((java.lang.Object) boolean24);
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap();
        cacheMap26.setCacheSize((int) (byte) 10);
        java.lang.String str29 = cacheMap26.toString();
        boolean boolean30 = cacheMap26.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection34 = cacheMap33.values();
        java.lang.Object obj35 = cacheMap26.put((java.lang.Object) 100L, (java.lang.Object) collection34);
        cacheMap26.readLock();
        java.util.Collection collection37 = cacheMap26.values();
        cacheMap26.readLock();
        org.apache.openjpa.util.CacheMap cacheMap39 = new org.apache.openjpa.util.CacheMap();
        boolean boolean40 = cacheMap39.isEmpty();
        java.lang.Object obj42 = cacheMap39.remove((java.lang.Object) 1);
        java.util.Set set43 = cacheMap39.keySet();
        java.lang.Object obj44 = cacheMap8.put((java.lang.Object) cacheMap26, (java.lang.Object) set43);
        boolean boolean45 = cacheMap5.pin((java.lang.Object) set43);
        boolean boolean46 = cacheMap1.containsKey((java.lang.Object) set43);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CacheMap:{}::{}" + "'", str13, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "CacheMap:{}::{}" + "'", str29, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        boolean boolean4 = cacheMap0.pin((java.lang.Object) 1);
        java.util.Collection collection5 = cacheMap0.values();
        java.lang.String str6 = cacheMap0.toString();
        java.lang.String str7 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(true, 100);
        cacheMap0.putAll((java.util.Map) cacheMap10);
        cacheMap10.readLock();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CacheMap:{}::{}" + "'", str7, "CacheMap:{}::{}");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap2.setCacheSize((int) '4');
        boolean boolean6 = cacheMap2.containsValue((java.lang.Object) 100);
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        cacheMap7.setCacheSize(10);
        java.lang.Object obj11 = cacheMap7.get((java.lang.Object) 100L);
        java.lang.Object obj12 = cacheMap2.remove((java.lang.Object) cacheMap7);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap();
        cacheMap13.setCacheSize(10);
        java.util.Set set16 = cacheMap13.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection19 = cacheMap18.values();
        cacheMap18.readLock();
        java.lang.Object obj21 = cacheMap13.remove((java.lang.Object) cacheMap18);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        cacheMap22.setCacheSize(10);
        boolean boolean25 = cacheMap22.isEmpty();
        cacheMap22.writeLock();
        cacheMap18.putAll((java.util.Map) cacheMap22);
        cacheMap7.putAll((java.util.Map) cacheMap18);
        int int29 = cacheMap18.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap30 = new org.apache.openjpa.util.CacheMap();
        boolean boolean31 = cacheMap30.isEmpty();
        java.lang.Object obj33 = cacheMap30.remove((java.lang.Object) 1);
        org.apache.openjpa.util.CacheMap cacheMap34 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set35 = cacheMap34.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap36 = new org.apache.openjpa.util.CacheMap();
        cacheMap36.setCacheSize((int) (byte) 10);
        java.lang.String str39 = cacheMap36.toString();
        boolean boolean40 = cacheMap36.isEmpty();
        cacheMap34.putAll((java.util.Map) cacheMap36, true);
        cacheMap30.putAll((java.util.Map) cacheMap34, true);
        boolean boolean45 = cacheMap18.containsValue((java.lang.Object) cacheMap34);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "CacheMap:{}::{}" + "'", str39, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        cacheMap3.setCacheSize((int) (byte) 10);
        java.lang.String str6 = cacheMap3.toString();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        boolean boolean8 = cacheMap7.isEmpty();
        cacheMap3.putAll((java.util.Map) cacheMap7, true);
        boolean boolean11 = cacheMap3.isLRU();
        java.lang.Object obj12 = cacheMap0.get((java.lang.Object) boolean11);
        cacheMap0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        java.lang.Object obj6 = cacheMap0.remove((java.lang.Object) cacheMap4);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        boolean boolean9 = cacheMap8.isEmpty();
        java.util.Set set10 = cacheMap8.entrySet();
        int int11 = cacheMap8.getCacheSize();
        java.lang.Object obj12 = cacheMap4.put((java.lang.Object) false, (java.lang.Object) int11);
        boolean boolean13 = cacheMap4.isEmpty();
        java.util.Set set14 = cacheMap4.getPinnedKeys();
        int int15 = cacheMap4.size();
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap();
        cacheMap16.setCacheSize((int) (byte) 10);
        java.lang.String str19 = cacheMap16.toString();
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap();
        boolean boolean21 = cacheMap20.isEmpty();
        cacheMap16.putAll((java.util.Map) cacheMap20, true);
        java.util.Collection collection24 = cacheMap20.values();
        java.lang.Object obj25 = cacheMap4.get((java.lang.Object) collection24);
        java.util.Set set26 = cacheMap4.getPinnedKeys();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap4.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CacheMap:{}::{}" + "'", str19, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) 100);
        cacheMap2.readLock();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        cacheMap0.readLock();
        java.util.Collection collection11 = cacheMap0.values();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        cacheMap12.setCacheSize((int) (byte) 10);
        boolean boolean16 = cacheMap12.pin((java.lang.Object) 1);
        java.util.Collection collection17 = cacheMap12.values();
        boolean boolean18 = cacheMap12.isLRU();
        java.util.Set set19 = cacheMap12.getPinnedKeys();
        boolean boolean21 = cacheMap12.unpin((java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        cacheMap22.setCacheSize((int) (byte) 10);
        java.lang.String str25 = cacheMap22.toString();
        boolean boolean26 = cacheMap22.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection30 = cacheMap29.values();
        java.lang.Object obj31 = cacheMap22.put((java.lang.Object) 100L, (java.lang.Object) collection30);
        java.util.Set set32 = cacheMap22.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap34 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection35 = cacheMap34.values();
        cacheMap34.readLock();
        boolean boolean37 = cacheMap22.pin((java.lang.Object) cacheMap34);
        cacheMap12.putAll((java.util.Map) cacheMap22);
        boolean boolean39 = cacheMap0.containsKey((java.lang.Object) cacheMap22);
        int int40 = cacheMap0.getCacheSize();
        boolean boolean41 = cacheMap0.isLRU();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "CacheMap:{}::{}" + "'", str25, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap();
        cacheMap2.setCacheSize((int) (byte) 10);
        java.lang.String str5 = cacheMap2.toString();
        boolean boolean6 = cacheMap2.isEmpty();
        cacheMap0.putAll((java.util.Map) cacheMap2, true);
        int int9 = cacheMap0.getCacheSize();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj12 = cacheMap10.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap();
        cacheMap13.setCacheSize((int) (byte) 10);
        java.lang.String str16 = cacheMap13.toString();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        boolean boolean18 = cacheMap17.isEmpty();
        cacheMap13.putAll((java.util.Map) cacheMap17, true);
        boolean boolean21 = cacheMap13.isLRU();
        java.lang.Object obj22 = cacheMap10.get((java.lang.Object) boolean21);
        int int23 = cacheMap10.getSoftReferenceSize();
        boolean boolean24 = cacheMap0.containsValue((java.lang.Object) int23);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CacheMap:{}::{}" + "'", str5, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CacheMap:{}::{}" + "'", str16, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) '#', (int) (short) 100, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap2.setCacheSize((int) '4');
        java.util.Set set5 = cacheMap2.getPinnedKeys();
        java.lang.Class<?> wildcardClass6 = set5.getClass();
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        java.lang.Object obj6 = cacheMap0.remove((java.lang.Object) cacheMap4);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        boolean boolean9 = cacheMap8.isEmpty();
        java.util.Set set10 = cacheMap8.entrySet();
        int int11 = cacheMap8.getCacheSize();
        java.lang.Object obj12 = cacheMap4.put((java.lang.Object) false, (java.lang.Object) int11);
        boolean boolean13 = cacheMap4.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj16 = cacheMap14.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj19 = cacheMap17.remove((java.lang.Object) (short) 1);
        cacheMap14.putAll((java.util.Map) cacheMap17, false);
        java.util.Set set22 = cacheMap17.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap();
        int int24 = cacheMap23.getSoftReferenceSize();
        java.lang.Object obj25 = cacheMap4.put((java.lang.Object) set22, (java.lang.Object) cacheMap23);
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj28 = cacheMap26.remove((java.lang.Object) (short) 1);
        int int29 = cacheMap26.getSoftReferenceSize();
        cacheMap23.putAll((java.util.Map) cacheMap26);
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap();
        cacheMap31.setCacheSize((int) (byte) 10);
        java.lang.String str34 = cacheMap31.toString();
        boolean boolean35 = cacheMap31.isEmpty();
        int int36 = cacheMap31.getCacheSize();
        cacheMap26.putAll((java.util.Map) cacheMap31, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "CacheMap:{}::{}" + "'", str34, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        boolean boolean5 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        cacheMap0.putAll((java.util.Map) cacheMap6, false);
        boolean boolean12 = cacheMap0.unpin((java.lang.Object) (short) 10);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap();
        cacheMap13.setCacheSize((int) (byte) 10);
        java.lang.String str16 = cacheMap13.toString();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        boolean boolean18 = cacheMap17.isEmpty();
        java.lang.Object obj19 = cacheMap13.remove((java.lang.Object) cacheMap17);
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap();
        boolean boolean22 = cacheMap21.isEmpty();
        java.util.Set set23 = cacheMap21.entrySet();
        int int24 = cacheMap21.getCacheSize();
        java.lang.Object obj25 = cacheMap17.put((java.lang.Object) false, (java.lang.Object) int24);
        cacheMap17.setSoftReferenceSize((int) (short) 10);
        org.apache.openjpa.util.CacheMap cacheMap28 = new org.apache.openjpa.util.CacheMap();
        cacheMap28.setCacheSize(10);
        java.util.Set set31 = cacheMap28.entrySet();
        boolean boolean32 = cacheMap28.isLRU();
        boolean boolean33 = cacheMap17.containsValue((java.lang.Object) cacheMap28);
        boolean boolean34 = cacheMap0.containsKey((java.lang.Object) cacheMap17);
        cacheMap17.setSoftReferenceSize((int) (short) 10);
        int int37 = cacheMap17.getSoftReferenceSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CacheMap:{}::{}" + "'", str16, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1000 + "'", int24 == 1000);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection10 = cacheMap9.values();
        cacheMap9.readLock();
        boolean boolean12 = cacheMap0.containsValue((java.lang.Object) cacheMap9);
        boolean boolean13 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        cacheMap14.setCacheSize((int) (byte) 10);
        boolean boolean18 = cacheMap14.pin((java.lang.Object) 1);
        java.util.Collection collection19 = cacheMap14.values();
        boolean boolean20 = cacheMap14.isLRU();
        java.util.Set set21 = cacheMap14.getPinnedKeys();
        boolean boolean23 = cacheMap14.unpin((java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap();
        cacheMap24.setCacheSize((int) (byte) 10);
        java.lang.String str27 = cacheMap24.toString();
        boolean boolean28 = cacheMap24.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection32 = cacheMap31.values();
        java.lang.Object obj33 = cacheMap24.put((java.lang.Object) 100L, (java.lang.Object) collection32);
        java.util.Set set34 = cacheMap24.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap36 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection37 = cacheMap36.values();
        cacheMap36.readLock();
        boolean boolean39 = cacheMap24.pin((java.lang.Object) cacheMap36);
        cacheMap14.putAll((java.util.Map) cacheMap24);
        org.apache.openjpa.util.CacheMap cacheMap41 = new org.apache.openjpa.util.CacheMap();
        cacheMap41.setCacheSize((int) (byte) 10);
        java.lang.String str44 = cacheMap41.toString();
        org.apache.openjpa.util.CacheMap cacheMap45 = new org.apache.openjpa.util.CacheMap();
        boolean boolean46 = cacheMap45.isEmpty();
        java.lang.Object obj47 = cacheMap41.remove((java.lang.Object) cacheMap45);
        org.apache.openjpa.util.CacheMap cacheMap49 = new org.apache.openjpa.util.CacheMap();
        boolean boolean50 = cacheMap49.isEmpty();
        java.util.Set set51 = cacheMap49.entrySet();
        int int52 = cacheMap49.getCacheSize();
        java.lang.Object obj53 = cacheMap45.put((java.lang.Object) false, (java.lang.Object) int52);
        cacheMap45.setSoftReferenceSize((int) (short) 10);
        org.apache.openjpa.util.CacheMap cacheMap56 = new org.apache.openjpa.util.CacheMap();
        cacheMap56.setCacheSize(10);
        java.util.Set set59 = cacheMap56.entrySet();
        boolean boolean60 = cacheMap56.isLRU();
        boolean boolean61 = cacheMap45.containsValue((java.lang.Object) cacheMap56);
        cacheMap24.putAll((java.util.Map) cacheMap45, true);
        boolean boolean64 = cacheMap0.containsValue((java.lang.Object) cacheMap24);
        org.apache.openjpa.util.CacheMap cacheMap65 = new org.apache.openjpa.util.CacheMap();
        cacheMap65.setCacheSize((int) (byte) 10);
        java.lang.String str68 = cacheMap65.toString();
        boolean boolean69 = cacheMap65.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap72 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection73 = cacheMap72.values();
        java.lang.Object obj74 = cacheMap65.put((java.lang.Object) 100L, (java.lang.Object) collection73);
        java.util.Set set75 = cacheMap65.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap77 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection78 = cacheMap77.values();
        cacheMap77.readLock();
        boolean boolean80 = cacheMap65.pin((java.lang.Object) cacheMap77);
        cacheMap65.setCacheSize(1);
        boolean boolean83 = cacheMap24.containsKey((java.lang.Object) cacheMap65);
        boolean boolean84 = cacheMap24.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "CacheMap:{}::{}" + "'", str27, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "CacheMap:{}::{}" + "'", str44, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1000 + "'", int52 == 1000);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "CacheMap:{}::{}" + "'", str68, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        java.lang.Object obj6 = cacheMap0.remove((java.lang.Object) cacheMap4);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        boolean boolean9 = cacheMap8.isEmpty();
        java.util.Set set10 = cacheMap8.entrySet();
        int int11 = cacheMap8.getCacheSize();
        java.lang.Object obj12 = cacheMap4.put((java.lang.Object) false, (java.lang.Object) int11);
        cacheMap4.setSoftReferenceSize((int) (short) 10);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        cacheMap15.setCacheSize(10);
        java.util.Set set18 = cacheMap15.entrySet();
        boolean boolean19 = cacheMap15.isLRU();
        boolean boolean20 = cacheMap4.containsValue((java.lang.Object) cacheMap15);
        java.util.Set set21 = cacheMap4.getPinnedKeys();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, 32);
        int int3 = cacheMap2.getSoftReferenceSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        boolean boolean5 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        java.lang.String str9 = cacheMap6.toString();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        boolean boolean11 = cacheMap10.isEmpty();
        cacheMap6.putAll((java.util.Map) cacheMap10, true);
        java.util.Collection collection14 = cacheMap6.values();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        boolean boolean16 = cacheMap15.isEmpty();
        java.util.Set set17 = cacheMap15.entrySet();
        cacheMap15.setCacheSize((int) (short) 0);
        java.util.Set set20 = cacheMap15.getPinnedKeys();
        java.lang.Object obj21 = cacheMap0.put((java.lang.Object) collection14, (java.lang.Object) cacheMap15);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        cacheMap22.setCacheSize(10);
        java.lang.Object obj26 = cacheMap22.get((java.lang.Object) 100L);
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap();
        cacheMap27.setCacheSize((int) (byte) 10);
        java.lang.String str30 = cacheMap27.toString();
        cacheMap22.putAll((java.util.Map) cacheMap27, false);
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap();
        cacheMap33.setCacheSize(10);
        java.util.Set set36 = cacheMap33.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap38 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection39 = cacheMap38.values();
        cacheMap38.readLock();
        java.lang.Object obj41 = cacheMap33.remove((java.lang.Object) cacheMap38);
        org.apache.openjpa.util.CacheMap cacheMap42 = new org.apache.openjpa.util.CacheMap();
        cacheMap42.setCacheSize(10);
        boolean boolean45 = cacheMap42.isEmpty();
        cacheMap42.writeLock();
        cacheMap38.putAll((java.util.Map) cacheMap42);
        org.apache.openjpa.util.CacheMap cacheMap50 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean52 = cacheMap50.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap54 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection55 = cacheMap54.values();
        org.apache.openjpa.util.CacheMap cacheMap56 = new org.apache.openjpa.util.CacheMap();
        cacheMap56.setCacheSize((int) (byte) 10);
        java.lang.String str59 = cacheMap56.toString();
        org.apache.openjpa.util.CacheMap cacheMap60 = new org.apache.openjpa.util.CacheMap();
        boolean boolean61 = cacheMap60.isEmpty();
        cacheMap56.putAll((java.util.Map) cacheMap60, true);
        boolean boolean64 = cacheMap54.containsKey((java.lang.Object) true);
        java.util.Collection collection65 = cacheMap54.values();
        org.apache.openjpa.util.CacheMap cacheMap68 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean70 = cacheMap68.containsValue((java.lang.Object) '4');
        boolean boolean71 = cacheMap54.containsKey((java.lang.Object) boolean70);
        boolean boolean72 = cacheMap50.pin((java.lang.Object) boolean71);
        cacheMap42.putAll((java.util.Map) cacheMap50, false);
        boolean boolean75 = cacheMap27.pin((java.lang.Object) cacheMap42);
        java.util.Set set76 = cacheMap27.getPinnedKeys();
        cacheMap0.putAll((java.util.Map) cacheMap27, true);
        org.apache.openjpa.util.CacheMap cacheMap79 = new org.apache.openjpa.util.CacheMap();
        cacheMap79.setCacheSize((int) (byte) 10);
        boolean boolean83 = cacheMap79.pin((java.lang.Object) 1);
        java.util.Collection collection84 = cacheMap79.values();
        boolean boolean85 = cacheMap79.isLRU();
        java.util.Set set86 = cacheMap79.getPinnedKeys();
        cacheMap79.setCacheSize(32);
        boolean boolean89 = cacheMap0.unpin((java.lang.Object) cacheMap79);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap79.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "CacheMap:{}::{}" + "'", str30, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "CacheMap:{}::{}" + "'", str59, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        java.util.Set set10 = cacheMap0.getPinnedKeys();
        cacheMap0.clear();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        cacheMap12.setCacheSize((int) (byte) 10);
        boolean boolean16 = cacheMap12.pin((java.lang.Object) 1);
        java.util.Collection collection17 = cacheMap12.values();
        boolean boolean18 = cacheMap12.isLRU();
        java.util.Set set19 = cacheMap12.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap();
        boolean boolean21 = cacheMap20.isEmpty();
        java.lang.Object obj23 = cacheMap20.remove((java.lang.Object) 1);
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set25 = cacheMap24.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap();
        cacheMap26.setCacheSize((int) (byte) 10);
        java.lang.String str29 = cacheMap26.toString();
        boolean boolean30 = cacheMap26.isEmpty();
        cacheMap24.putAll((java.util.Map) cacheMap26, true);
        cacheMap20.putAll((java.util.Map) cacheMap24, true);
        java.util.Set set35 = cacheMap24.entrySet();
        java.lang.Object obj36 = cacheMap0.put((java.lang.Object) cacheMap12, (java.lang.Object) cacheMap24);
        java.util.Set set37 = cacheMap24.getPinnedKeys();
        cacheMap24.setCacheSize(100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "CacheMap:{}::{}" + "'", str29, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.lang.Object obj4 = cacheMap0.get((java.lang.Object) 100L);
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        cacheMap5.setCacheSize((int) (byte) 10);
        java.lang.String str8 = cacheMap5.toString();
        cacheMap0.putAll((java.util.Map) cacheMap5, false);
        cacheMap5.setSoftReferenceSize(1000);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        boolean boolean5 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        java.lang.String str9 = cacheMap6.toString();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        boolean boolean11 = cacheMap10.isEmpty();
        cacheMap6.putAll((java.util.Map) cacheMap10, true);
        java.util.Collection collection14 = cacheMap6.values();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        boolean boolean16 = cacheMap15.isEmpty();
        java.util.Set set17 = cacheMap15.entrySet();
        cacheMap15.setCacheSize((int) (short) 0);
        java.util.Set set20 = cacheMap15.getPinnedKeys();
        java.lang.Object obj21 = cacheMap0.put((java.lang.Object) collection14, (java.lang.Object) cacheMap15);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        cacheMap22.setCacheSize(10);
        java.lang.Object obj26 = cacheMap22.get((java.lang.Object) 100L);
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap();
        cacheMap27.setCacheSize((int) (byte) 10);
        java.lang.String str30 = cacheMap27.toString();
        cacheMap22.putAll((java.util.Map) cacheMap27, false);
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap();
        cacheMap33.setCacheSize(10);
        java.util.Set set36 = cacheMap33.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap38 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection39 = cacheMap38.values();
        cacheMap38.readLock();
        java.lang.Object obj41 = cacheMap33.remove((java.lang.Object) cacheMap38);
        org.apache.openjpa.util.CacheMap cacheMap42 = new org.apache.openjpa.util.CacheMap();
        cacheMap42.setCacheSize(10);
        boolean boolean45 = cacheMap42.isEmpty();
        cacheMap42.writeLock();
        cacheMap38.putAll((java.util.Map) cacheMap42);
        org.apache.openjpa.util.CacheMap cacheMap50 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean52 = cacheMap50.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap54 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection55 = cacheMap54.values();
        org.apache.openjpa.util.CacheMap cacheMap56 = new org.apache.openjpa.util.CacheMap();
        cacheMap56.setCacheSize((int) (byte) 10);
        java.lang.String str59 = cacheMap56.toString();
        org.apache.openjpa.util.CacheMap cacheMap60 = new org.apache.openjpa.util.CacheMap();
        boolean boolean61 = cacheMap60.isEmpty();
        cacheMap56.putAll((java.util.Map) cacheMap60, true);
        boolean boolean64 = cacheMap54.containsKey((java.lang.Object) true);
        java.util.Collection collection65 = cacheMap54.values();
        org.apache.openjpa.util.CacheMap cacheMap68 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean70 = cacheMap68.containsValue((java.lang.Object) '4');
        boolean boolean71 = cacheMap54.containsKey((java.lang.Object) boolean70);
        boolean boolean72 = cacheMap50.pin((java.lang.Object) boolean71);
        cacheMap42.putAll((java.util.Map) cacheMap50, false);
        boolean boolean75 = cacheMap27.pin((java.lang.Object) cacheMap42);
        java.util.Set set76 = cacheMap27.getPinnedKeys();
        cacheMap0.putAll((java.util.Map) cacheMap27, true);
        org.apache.openjpa.util.CacheMap cacheMap79 = new org.apache.openjpa.util.CacheMap();
        cacheMap79.setCacheSize(10);
        java.util.Set set82 = cacheMap79.entrySet();
        boolean boolean83 = cacheMap79.isLRU();
        int int84 = cacheMap79.getCacheSize();
        int int85 = cacheMap79.getCacheSize();
        cacheMap27.putAll((java.util.Map) cacheMap79);
        boolean boolean87 = cacheMap79.isLRU();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "CacheMap:{}::{}" + "'", str30, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "CacheMap:{}::{}" + "'", str59, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 10 + "'", int84 == 10);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 10 + "'", int85 == 10);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true, (int) (byte) 100, 10, (float) 1, (int) (byte) -1);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        java.lang.Object obj6 = cacheMap0.remove((java.lang.Object) cacheMap4);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        boolean boolean9 = cacheMap8.isEmpty();
        java.util.Set set10 = cacheMap8.entrySet();
        int int11 = cacheMap8.getCacheSize();
        java.lang.Object obj12 = cacheMap4.put((java.lang.Object) false, (java.lang.Object) int11);
        boolean boolean13 = cacheMap4.isEmpty();
        java.util.Set set14 = cacheMap4.getPinnedKeys();
        int int15 = cacheMap4.size();
        java.lang.String str16 = cacheMap4.toString();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        cacheMap17.setCacheSize(10);
        java.lang.Object obj21 = cacheMap17.get((java.lang.Object) 100L);
        cacheMap17.clear();
        boolean boolean23 = cacheMap17.isLRU();
        boolean boolean24 = cacheMap4.pin((java.lang.Object) boolean23);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap4.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CacheMap:{false=1000}::{}" + "'", str16, "CacheMap:{false=1000}::{}");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean4 = cacheMap2.containsValue((java.lang.Object) '4');
        java.util.Set set5 = cacheMap2.keySet();
        java.util.Set set6 = cacheMap2.getPinnedKeys();
        java.util.Set set7 = cacheMap2.keySet();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        boolean boolean5 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        cacheMap0.putAll((java.util.Map) cacheMap6, false);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean15 = cacheMap13.containsValue((java.lang.Object) '4');
        java.util.Set set16 = cacheMap13.keySet();
        java.lang.String str17 = cacheMap13.toString();
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap();
        cacheMap18.setCacheSize(10);
        java.util.Set set21 = cacheMap18.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection24 = cacheMap23.values();
        cacheMap23.readLock();
        java.lang.Object obj26 = cacheMap18.remove((java.lang.Object) cacheMap23);
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj29 = cacheMap18.get(obj27);
        java.util.Collection collection30 = cacheMap18.values();
        java.lang.Object obj31 = cacheMap6.put((java.lang.Object) str17, (java.lang.Object) collection30);
        cacheMap6.writeLock();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CacheMap:{}::{}" + "'", str17, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, 100, (int) (short) 1, (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        boolean boolean5 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        java.lang.String str9 = cacheMap6.toString();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        boolean boolean11 = cacheMap10.isEmpty();
        cacheMap6.putAll((java.util.Map) cacheMap10, true);
        java.util.Collection collection14 = cacheMap6.values();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        boolean boolean16 = cacheMap15.isEmpty();
        java.util.Set set17 = cacheMap15.entrySet();
        cacheMap15.setCacheSize((int) (short) 0);
        java.util.Set set20 = cacheMap15.getPinnedKeys();
        java.lang.Object obj21 = cacheMap0.put((java.lang.Object) collection14, (java.lang.Object) cacheMap15);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        cacheMap22.setCacheSize(10);
        java.lang.Object obj26 = cacheMap22.get((java.lang.Object) 100L);
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap();
        cacheMap27.setCacheSize((int) (byte) 10);
        java.lang.String str30 = cacheMap27.toString();
        cacheMap22.putAll((java.util.Map) cacheMap27, false);
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap();
        cacheMap33.setCacheSize(10);
        java.util.Set set36 = cacheMap33.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap38 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection39 = cacheMap38.values();
        cacheMap38.readLock();
        java.lang.Object obj41 = cacheMap33.remove((java.lang.Object) cacheMap38);
        org.apache.openjpa.util.CacheMap cacheMap42 = new org.apache.openjpa.util.CacheMap();
        cacheMap42.setCacheSize(10);
        boolean boolean45 = cacheMap42.isEmpty();
        cacheMap42.writeLock();
        cacheMap38.putAll((java.util.Map) cacheMap42);
        org.apache.openjpa.util.CacheMap cacheMap50 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean52 = cacheMap50.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap54 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection55 = cacheMap54.values();
        org.apache.openjpa.util.CacheMap cacheMap56 = new org.apache.openjpa.util.CacheMap();
        cacheMap56.setCacheSize((int) (byte) 10);
        java.lang.String str59 = cacheMap56.toString();
        org.apache.openjpa.util.CacheMap cacheMap60 = new org.apache.openjpa.util.CacheMap();
        boolean boolean61 = cacheMap60.isEmpty();
        cacheMap56.putAll((java.util.Map) cacheMap60, true);
        boolean boolean64 = cacheMap54.containsKey((java.lang.Object) true);
        java.util.Collection collection65 = cacheMap54.values();
        org.apache.openjpa.util.CacheMap cacheMap68 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean70 = cacheMap68.containsValue((java.lang.Object) '4');
        boolean boolean71 = cacheMap54.containsKey((java.lang.Object) boolean70);
        boolean boolean72 = cacheMap50.pin((java.lang.Object) boolean71);
        cacheMap42.putAll((java.util.Map) cacheMap50, false);
        boolean boolean75 = cacheMap27.pin((java.lang.Object) cacheMap42);
        java.util.Set set76 = cacheMap27.getPinnedKeys();
        cacheMap0.putAll((java.util.Map) cacheMap27, true);
        org.apache.openjpa.util.CacheMap cacheMap79 = new org.apache.openjpa.util.CacheMap();
        cacheMap79.setCacheSize((int) (byte) 10);
        boolean boolean83 = cacheMap79.pin((java.lang.Object) 1);
        java.util.Collection collection84 = cacheMap79.values();
        boolean boolean85 = cacheMap79.isLRU();
        java.util.Set set86 = cacheMap79.getPinnedKeys();
        cacheMap79.setCacheSize(32);
        boolean boolean89 = cacheMap0.unpin((java.lang.Object) cacheMap79);
        java.lang.Class<?> wildcardClass90 = cacheMap0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "CacheMap:{}::{}" + "'", str30, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "CacheMap:{}::{}" + "'", str59, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        boolean boolean5 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        java.lang.String str9 = cacheMap6.toString();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        boolean boolean11 = cacheMap10.isEmpty();
        cacheMap6.putAll((java.util.Map) cacheMap10, true);
        java.util.Collection collection14 = cacheMap6.values();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        boolean boolean16 = cacheMap15.isEmpty();
        java.util.Set set17 = cacheMap15.entrySet();
        cacheMap15.setCacheSize((int) (short) 0);
        java.util.Set set20 = cacheMap15.getPinnedKeys();
        java.lang.Object obj21 = cacheMap0.put((java.lang.Object) collection14, (java.lang.Object) cacheMap15);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        cacheMap22.setCacheSize(10);
        java.lang.Object obj26 = cacheMap22.get((java.lang.Object) 100L);
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap();
        cacheMap27.setCacheSize((int) (byte) 10);
        java.lang.String str30 = cacheMap27.toString();
        cacheMap22.putAll((java.util.Map) cacheMap27, false);
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap();
        cacheMap33.setCacheSize(10);
        java.util.Set set36 = cacheMap33.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap38 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection39 = cacheMap38.values();
        cacheMap38.readLock();
        java.lang.Object obj41 = cacheMap33.remove((java.lang.Object) cacheMap38);
        org.apache.openjpa.util.CacheMap cacheMap42 = new org.apache.openjpa.util.CacheMap();
        cacheMap42.setCacheSize(10);
        boolean boolean45 = cacheMap42.isEmpty();
        cacheMap42.writeLock();
        cacheMap38.putAll((java.util.Map) cacheMap42);
        org.apache.openjpa.util.CacheMap cacheMap50 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean52 = cacheMap50.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap54 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection55 = cacheMap54.values();
        org.apache.openjpa.util.CacheMap cacheMap56 = new org.apache.openjpa.util.CacheMap();
        cacheMap56.setCacheSize((int) (byte) 10);
        java.lang.String str59 = cacheMap56.toString();
        org.apache.openjpa.util.CacheMap cacheMap60 = new org.apache.openjpa.util.CacheMap();
        boolean boolean61 = cacheMap60.isEmpty();
        cacheMap56.putAll((java.util.Map) cacheMap60, true);
        boolean boolean64 = cacheMap54.containsKey((java.lang.Object) true);
        java.util.Collection collection65 = cacheMap54.values();
        org.apache.openjpa.util.CacheMap cacheMap68 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean70 = cacheMap68.containsValue((java.lang.Object) '4');
        boolean boolean71 = cacheMap54.containsKey((java.lang.Object) boolean70);
        boolean boolean72 = cacheMap50.pin((java.lang.Object) boolean71);
        cacheMap42.putAll((java.util.Map) cacheMap50, false);
        boolean boolean75 = cacheMap27.pin((java.lang.Object) cacheMap42);
        java.util.Set set76 = cacheMap27.getPinnedKeys();
        cacheMap0.putAll((java.util.Map) cacheMap27, true);
        boolean boolean79 = cacheMap0.isLRU();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "CacheMap:{}::{}" + "'", str30, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "CacheMap:{}::{}" + "'", str59, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        java.util.Set set8 = cacheMap3.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean13 = cacheMap11.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        cacheMap14.setCacheSize(10);
        java.util.Set set17 = cacheMap14.entrySet();
        boolean boolean18 = cacheMap14.isLRU();
        int int19 = cacheMap14.getCacheSize();
        java.lang.Object obj20 = cacheMap3.put((java.lang.Object) boolean13, (java.lang.Object) cacheMap14);
        cacheMap14.readLock();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean4 = cacheMap2.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection7 = cacheMap6.values();
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        cacheMap8.setCacheSize((int) (byte) 10);
        java.lang.String str11 = cacheMap8.toString();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        boolean boolean13 = cacheMap12.isEmpty();
        cacheMap8.putAll((java.util.Map) cacheMap12, true);
        boolean boolean16 = cacheMap6.containsKey((java.lang.Object) true);
        java.util.Collection collection17 = cacheMap6.values();
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean22 = cacheMap20.containsValue((java.lang.Object) '4');
        boolean boolean23 = cacheMap6.containsKey((java.lang.Object) boolean22);
        boolean boolean24 = cacheMap2.pin((java.lang.Object) boolean23);
        java.util.Set set25 = cacheMap2.entrySet();
        java.lang.Object obj27 = cacheMap2.remove((java.lang.Object) 0.0d);
        boolean boolean28 = cacheMap2.isLRU();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap2.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CacheMap:{}::{}" + "'", str11, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        boolean boolean5 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        cacheMap0.putAll((java.util.Map) cacheMap6, false);
        boolean boolean12 = cacheMap0.unpin((java.lang.Object) 1);
        java.lang.String str13 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        cacheMap14.setCacheSize((int) (byte) 10);
        java.lang.String str17 = cacheMap14.toString();
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap();
        boolean boolean19 = cacheMap18.isEmpty();
        cacheMap14.putAll((java.util.Map) cacheMap18, true);
        boolean boolean22 = cacheMap0.containsValue((java.lang.Object) cacheMap18);
        org.apache.openjpa.util.CacheMap cacheMap25 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean27 = cacheMap25.containsValue((java.lang.Object) '4');
        java.util.Set set28 = cacheMap25.keySet();
        java.util.Set set29 = cacheMap25.getPinnedKeys();
        cacheMap25.clear();
        java.lang.Object obj31 = cacheMap18.get((java.lang.Object) cacheMap25);
        int int32 = cacheMap25.getSoftReferenceSize();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap25.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CacheMap:{}::{}" + "'", str13, "CacheMap:{}::{}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CacheMap:{}::{}" + "'", str17, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        cacheMap3.setCacheSize(10);
        java.util.Set set6 = cacheMap3.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection9 = cacheMap8.values();
        cacheMap8.readLock();
        java.lang.Object obj11 = cacheMap3.remove((java.lang.Object) cacheMap8);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = cacheMap16.pin(obj17);
        boolean boolean19 = cacheMap16.isLRU();
        cacheMap13.putAll((java.util.Map) cacheMap16, false);
        cacheMap8.putAll((java.util.Map) cacheMap13);
        int int23 = cacheMap13.getCacheSize();
        java.util.Set set24 = cacheMap13.keySet();
        boolean boolean25 = cacheMap0.containsValue((java.lang.Object) set24);
        boolean boolean26 = cacheMap0.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean31 = cacheMap29.containsValue((java.lang.Object) '4');
        java.util.Set set32 = cacheMap29.keySet();
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap();
        boolean boolean34 = cacheMap33.isEmpty();
        java.lang.Object obj36 = cacheMap33.remove((java.lang.Object) 1);
        java.lang.Object obj37 = cacheMap29.remove((java.lang.Object) 1);
        java.util.Collection collection38 = cacheMap29.values();
        org.apache.openjpa.util.CacheMap cacheMap39 = new org.apache.openjpa.util.CacheMap();
        cacheMap39.setCacheSize((int) (byte) 10);
        java.lang.String str42 = cacheMap39.toString();
        org.apache.openjpa.util.CacheMap cacheMap43 = new org.apache.openjpa.util.CacheMap();
        boolean boolean44 = cacheMap43.isEmpty();
        java.lang.Object obj45 = cacheMap39.remove((java.lang.Object) cacheMap43);
        org.apache.openjpa.util.CacheMap cacheMap47 = new org.apache.openjpa.util.CacheMap();
        boolean boolean48 = cacheMap47.isEmpty();
        java.util.Set set49 = cacheMap47.entrySet();
        int int50 = cacheMap47.getCacheSize();
        java.lang.Object obj51 = cacheMap43.put((java.lang.Object) false, (java.lang.Object) int50);
        boolean boolean52 = cacheMap43.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap53 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj55 = cacheMap53.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap56 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj58 = cacheMap56.remove((java.lang.Object) (short) 1);
        cacheMap53.putAll((java.util.Map) cacheMap56, false);
        java.util.Set set61 = cacheMap56.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap62 = new org.apache.openjpa.util.CacheMap();
        int int63 = cacheMap62.getSoftReferenceSize();
        java.lang.Object obj64 = cacheMap43.put((java.lang.Object) set61, (java.lang.Object) cacheMap62);
        java.lang.Object obj65 = cacheMap0.put((java.lang.Object) collection38, obj64);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1000 + "'", int23 == 1000);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "CacheMap:{}::{}" + "'", str42, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1000 + "'", int50 == 1000);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        java.lang.Object obj6 = cacheMap0.remove((java.lang.Object) cacheMap4);
        java.lang.Object obj8 = cacheMap4.get((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap4.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) (short) 100);
        int int3 = cacheMap2.getSoftReferenceSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean4 = cacheMap2.containsValue((java.lang.Object) '4');
        java.util.Set set5 = cacheMap2.keySet();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        boolean boolean7 = cacheMap6.isEmpty();
        java.lang.Object obj9 = cacheMap6.remove((java.lang.Object) 1);
        java.lang.Object obj10 = cacheMap2.remove((java.lang.Object) 1);
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap();
        cacheMap11.setCacheSize(10);
        java.util.Set set14 = cacheMap11.entrySet();
        int int15 = cacheMap11.size();
        cacheMap11.setCacheSize((int) '4');
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean22 = cacheMap20.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection25 = cacheMap24.values();
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap();
        cacheMap26.setCacheSize((int) (byte) 10);
        java.lang.String str29 = cacheMap26.toString();
        org.apache.openjpa.util.CacheMap cacheMap30 = new org.apache.openjpa.util.CacheMap();
        boolean boolean31 = cacheMap30.isEmpty();
        cacheMap26.putAll((java.util.Map) cacheMap30, true);
        boolean boolean34 = cacheMap24.containsKey((java.lang.Object) true);
        java.util.Collection collection35 = cacheMap24.values();
        org.apache.openjpa.util.CacheMap cacheMap38 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean40 = cacheMap38.containsValue((java.lang.Object) '4');
        boolean boolean41 = cacheMap24.containsKey((java.lang.Object) boolean40);
        boolean boolean42 = cacheMap20.pin((java.lang.Object) boolean41);
        java.lang.Object obj43 = cacheMap11.remove((java.lang.Object) cacheMap20);
        org.apache.openjpa.util.CacheMap cacheMap44 = new org.apache.openjpa.util.CacheMap();
        cacheMap44.setCacheSize((int) (byte) 10);
        boolean boolean48 = cacheMap44.pin((java.lang.Object) 1);
        java.util.Collection collection49 = cacheMap44.values();
        boolean boolean50 = cacheMap44.isLRU();
        java.util.Set set51 = cacheMap44.getPinnedKeys();
        boolean boolean53 = cacheMap44.unpin((java.lang.Object) 0L);
        boolean boolean54 = cacheMap11.pin((java.lang.Object) cacheMap44);
        java.lang.Object obj55 = cacheMap2.get((java.lang.Object) cacheMap44);
        org.apache.openjpa.util.CacheMap cacheMap58 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        org.apache.openjpa.util.CacheMap cacheMap59 = new org.apache.openjpa.util.CacheMap();
        cacheMap59.setCacheSize(10);
        java.lang.Object obj63 = cacheMap59.get((java.lang.Object) 100L);
        java.lang.Object obj65 = cacheMap59.remove((java.lang.Object) (-1.0d));
        cacheMap58.putAll((java.util.Map) cacheMap59, false);
        boolean boolean68 = cacheMap44.containsKey((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "CacheMap:{}::{}" + "'", str29, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        cacheMap0.putAll((java.util.Map) cacheMap4, true);
        boolean boolean8 = cacheMap0.isLRU();
        java.lang.String str9 = cacheMap0.toString();
        boolean boolean10 = cacheMap0.isLRU();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, 1, (int) (short) -1, (float) 100L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        java.util.Set set10 = cacheMap0.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection13 = cacheMap12.values();
        cacheMap12.readLock();
        boolean boolean15 = cacheMap0.pin((java.lang.Object) cacheMap12);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap0.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        java.lang.Object obj6 = cacheMap0.remove((java.lang.Object) cacheMap4);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        boolean boolean9 = cacheMap8.isEmpty();
        java.util.Set set10 = cacheMap8.entrySet();
        int int11 = cacheMap8.getCacheSize();
        java.lang.Object obj12 = cacheMap4.put((java.lang.Object) false, (java.lang.Object) int11);
        boolean boolean13 = cacheMap4.isEmpty();
        java.util.Set set14 = cacheMap4.getPinnedKeys();
        cacheMap4.clear();
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj19 = new java.lang.Object();
        boolean boolean20 = cacheMap18.pin(obj19);
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap();
        cacheMap21.setCacheSize((int) (byte) 10);
        java.lang.String str24 = cacheMap21.toString();
        org.apache.openjpa.util.CacheMap cacheMap25 = new org.apache.openjpa.util.CacheMap();
        boolean boolean26 = cacheMap25.isEmpty();
        cacheMap21.putAll((java.util.Map) cacheMap25, true);
        java.util.Collection collection29 = cacheMap21.values();
        java.lang.Object obj31 = cacheMap18.put((java.lang.Object) collection29, (java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection34 = cacheMap33.values();
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap();
        cacheMap35.setCacheSize((int) (byte) 10);
        java.lang.String str38 = cacheMap35.toString();
        org.apache.openjpa.util.CacheMap cacheMap39 = new org.apache.openjpa.util.CacheMap();
        boolean boolean40 = cacheMap39.isEmpty();
        cacheMap35.putAll((java.util.Map) cacheMap39, true);
        boolean boolean43 = cacheMap33.containsKey((java.lang.Object) true);
        java.util.Collection collection44 = cacheMap33.values();
        org.apache.openjpa.util.CacheMap cacheMap47 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean49 = cacheMap47.containsValue((java.lang.Object) '4');
        boolean boolean50 = cacheMap33.containsKey((java.lang.Object) boolean49);
        org.apache.openjpa.util.CacheMap cacheMap51 = new org.apache.openjpa.util.CacheMap();
        cacheMap51.setCacheSize((int) (byte) 10);
        java.lang.String str54 = cacheMap51.toString();
        boolean boolean55 = cacheMap51.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap58 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection59 = cacheMap58.values();
        java.lang.Object obj60 = cacheMap51.put((java.lang.Object) 100L, (java.lang.Object) collection59);
        cacheMap51.readLock();
        java.util.Collection collection62 = cacheMap51.values();
        cacheMap51.readLock();
        org.apache.openjpa.util.CacheMap cacheMap64 = new org.apache.openjpa.util.CacheMap();
        boolean boolean65 = cacheMap64.isEmpty();
        java.lang.Object obj67 = cacheMap64.remove((java.lang.Object) 1);
        java.util.Set set68 = cacheMap64.keySet();
        java.lang.Object obj69 = cacheMap33.put((java.lang.Object) cacheMap51, (java.lang.Object) set68);
        cacheMap33.clear();
        cacheMap18.putAll((java.util.Map) cacheMap33, true);
        java.lang.Object obj73 = cacheMap4.remove((java.lang.Object) true);
        boolean boolean74 = cacheMap4.isEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "CacheMap:{}::{}" + "'", str24, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "CacheMap:{}::{}" + "'", str38, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "CacheMap:{}::{}" + "'", str54, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        cacheMap0.readLock();
        java.util.Collection collection11 = cacheMap0.values();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap(false, (int) (short) 10);
        cacheMap0.putAll((java.util.Map) cacheMap14, false);
        int int17 = cacheMap14.getCacheSize();
        int int18 = cacheMap14.getCacheSize();
        java.util.Set set19 = cacheMap14.getPinnedKeys();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.writeLock();
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap();
        boolean boolean3 = cacheMap2.isEmpty();
        java.util.Set set4 = cacheMap2.entrySet();
        cacheMap2.setCacheSize((int) (short) 0);
        java.util.Set set7 = cacheMap2.getPinnedKeys();
        cacheMap0.putAll((java.util.Map) cacheMap2);
        int int9 = cacheMap2.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean6 = cacheMap4.pin(obj5);
        boolean boolean7 = cacheMap4.isLRU();
        cacheMap1.putAll((java.util.Map) cacheMap4, false);
        cacheMap1.writeLock();
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set12 = cacheMap11.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap();
        cacheMap13.setCacheSize((int) (byte) 10);
        java.lang.String str16 = cacheMap13.toString();
        boolean boolean17 = cacheMap13.isEmpty();
        cacheMap11.putAll((java.util.Map) cacheMap13, true);
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap();
        cacheMap20.setCacheSize(10);
        java.util.Set set23 = cacheMap20.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap25 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection26 = cacheMap25.values();
        cacheMap25.readLock();
        java.lang.Object obj28 = cacheMap20.remove((java.lang.Object) cacheMap25);
        org.apache.openjpa.util.CacheMap cacheMap30 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj34 = new java.lang.Object();
        boolean boolean35 = cacheMap33.pin(obj34);
        boolean boolean36 = cacheMap33.isLRU();
        cacheMap30.putAll((java.util.Map) cacheMap33, false);
        cacheMap25.putAll((java.util.Map) cacheMap30);
        org.apache.openjpa.util.CacheMap cacheMap41 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection42 = cacheMap41.values();
        org.apache.openjpa.util.CacheMap cacheMap43 = new org.apache.openjpa.util.CacheMap();
        cacheMap43.setCacheSize((int) (byte) 10);
        java.lang.String str46 = cacheMap43.toString();
        org.apache.openjpa.util.CacheMap cacheMap47 = new org.apache.openjpa.util.CacheMap();
        boolean boolean48 = cacheMap47.isEmpty();
        cacheMap43.putAll((java.util.Map) cacheMap47, true);
        boolean boolean51 = cacheMap41.containsKey((java.lang.Object) true);
        java.util.Collection collection52 = cacheMap41.values();
        org.apache.openjpa.util.CacheMap cacheMap55 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean57 = cacheMap55.containsValue((java.lang.Object) '4');
        boolean boolean58 = cacheMap41.containsKey((java.lang.Object) boolean57);
        org.apache.openjpa.util.CacheMap cacheMap59 = new org.apache.openjpa.util.CacheMap();
        cacheMap59.setCacheSize((int) (byte) 10);
        java.lang.String str62 = cacheMap59.toString();
        boolean boolean63 = cacheMap59.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap66 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection67 = cacheMap66.values();
        java.lang.Object obj68 = cacheMap59.put((java.lang.Object) 100L, (java.lang.Object) collection67);
        cacheMap59.readLock();
        java.util.Collection collection70 = cacheMap59.values();
        cacheMap59.readLock();
        org.apache.openjpa.util.CacheMap cacheMap72 = new org.apache.openjpa.util.CacheMap();
        boolean boolean73 = cacheMap72.isEmpty();
        java.lang.Object obj75 = cacheMap72.remove((java.lang.Object) 1);
        java.util.Set set76 = cacheMap72.keySet();
        java.lang.Object obj77 = cacheMap41.put((java.lang.Object) cacheMap59, (java.lang.Object) set76);
        cacheMap41.clear();
        java.lang.Object obj79 = cacheMap13.put((java.lang.Object) cacheMap30, (java.lang.Object) cacheMap41);
        org.apache.openjpa.util.CacheMap cacheMap80 = new org.apache.openjpa.util.CacheMap();
        cacheMap80.writeLock();
        org.apache.openjpa.util.CacheMap cacheMap82 = new org.apache.openjpa.util.CacheMap();
        boolean boolean83 = cacheMap82.isEmpty();
        java.util.Set set84 = cacheMap82.entrySet();
        cacheMap82.setCacheSize((int) (short) 0);
        java.util.Set set87 = cacheMap82.getPinnedKeys();
        cacheMap80.putAll((java.util.Map) cacheMap82);
        java.lang.Object obj89 = cacheMap41.get((java.lang.Object) cacheMap80);
        cacheMap1.putAll((java.util.Map) cacheMap41);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CacheMap:{}::{}" + "'", str16, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "CacheMap:{}::{}" + "'", str46, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "CacheMap:{}::{}" + "'", str62, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertNull(obj89);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.lang.Object obj4 = cacheMap0.get((java.lang.Object) 100L);
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        cacheMap5.setCacheSize((int) (byte) 10);
        java.lang.String str8 = cacheMap5.toString();
        cacheMap0.putAll((java.util.Map) cacheMap5, false);
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap();
        cacheMap11.setCacheSize(10);
        java.util.Set set14 = cacheMap11.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection17 = cacheMap16.values();
        cacheMap16.readLock();
        java.lang.Object obj19 = cacheMap11.remove((java.lang.Object) cacheMap16);
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap();
        cacheMap20.setCacheSize(10);
        boolean boolean23 = cacheMap20.isEmpty();
        cacheMap20.writeLock();
        cacheMap16.putAll((java.util.Map) cacheMap20);
        org.apache.openjpa.util.CacheMap cacheMap28 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean30 = cacheMap28.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap32 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection33 = cacheMap32.values();
        org.apache.openjpa.util.CacheMap cacheMap34 = new org.apache.openjpa.util.CacheMap();
        cacheMap34.setCacheSize((int) (byte) 10);
        java.lang.String str37 = cacheMap34.toString();
        org.apache.openjpa.util.CacheMap cacheMap38 = new org.apache.openjpa.util.CacheMap();
        boolean boolean39 = cacheMap38.isEmpty();
        cacheMap34.putAll((java.util.Map) cacheMap38, true);
        boolean boolean42 = cacheMap32.containsKey((java.lang.Object) true);
        java.util.Collection collection43 = cacheMap32.values();
        org.apache.openjpa.util.CacheMap cacheMap46 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean48 = cacheMap46.containsValue((java.lang.Object) '4');
        boolean boolean49 = cacheMap32.containsKey((java.lang.Object) boolean48);
        boolean boolean50 = cacheMap28.pin((java.lang.Object) boolean49);
        cacheMap20.putAll((java.util.Map) cacheMap28, false);
        boolean boolean53 = cacheMap5.pin((java.lang.Object) cacheMap20);
        java.util.Set set54 = cacheMap5.getPinnedKeys();
        java.util.Set set55 = cacheMap5.getPinnedKeys();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "CacheMap:{}::{}" + "'", str37, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(set55);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        boolean boolean5 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        java.lang.String str9 = cacheMap6.toString();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        boolean boolean11 = cacheMap10.isEmpty();
        cacheMap6.putAll((java.util.Map) cacheMap10, true);
        java.util.Collection collection14 = cacheMap6.values();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        boolean boolean16 = cacheMap15.isEmpty();
        java.util.Set set17 = cacheMap15.entrySet();
        cacheMap15.setCacheSize((int) (short) 0);
        java.util.Set set20 = cacheMap15.getPinnedKeys();
        java.lang.Object obj21 = cacheMap0.put((java.lang.Object) collection14, (java.lang.Object) cacheMap15);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap15.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) -1, (int) '4', (float) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection2 = cacheMap1.values();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        cacheMap3.setCacheSize((int) (byte) 10);
        java.lang.String str6 = cacheMap3.toString();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        boolean boolean8 = cacheMap7.isEmpty();
        cacheMap3.putAll((java.util.Map) cacheMap7, true);
        boolean boolean11 = cacheMap1.containsKey((java.lang.Object) true);
        java.util.Collection collection12 = cacheMap1.values();
        int int13 = cacheMap1.size();
        java.util.Set set14 = cacheMap1.keySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        int int4 = cacheMap0.size();
        cacheMap0.setCacheSize((int) '4');
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean11 = cacheMap9.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection14 = cacheMap13.values();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        cacheMap15.setCacheSize((int) (byte) 10);
        java.lang.String str18 = cacheMap15.toString();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap();
        boolean boolean20 = cacheMap19.isEmpty();
        cacheMap15.putAll((java.util.Map) cacheMap19, true);
        boolean boolean23 = cacheMap13.containsKey((java.lang.Object) true);
        java.util.Collection collection24 = cacheMap13.values();
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean29 = cacheMap27.containsValue((java.lang.Object) '4');
        boolean boolean30 = cacheMap13.containsKey((java.lang.Object) boolean29);
        boolean boolean31 = cacheMap9.pin((java.lang.Object) boolean30);
        java.lang.Object obj32 = cacheMap0.remove((java.lang.Object) cacheMap9);
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap();
        cacheMap33.setCacheSize(10);
        boolean boolean36 = cacheMap33.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap37 = new org.apache.openjpa.util.CacheMap();
        cacheMap37.setCacheSize((int) (byte) 10);
        java.lang.String str40 = cacheMap37.toString();
        org.apache.openjpa.util.CacheMap cacheMap41 = new org.apache.openjpa.util.CacheMap();
        boolean boolean42 = cacheMap41.isEmpty();
        java.lang.Object obj43 = cacheMap37.remove((java.lang.Object) cacheMap41);
        java.util.Set set44 = cacheMap41.keySet();
        java.lang.Object obj45 = cacheMap9.put((java.lang.Object) cacheMap33, (java.lang.Object) cacheMap41);
        org.apache.openjpa.util.CacheMap cacheMap46 = new org.apache.openjpa.util.CacheMap();
        cacheMap46.setCacheSize((int) (byte) 10);
        boolean boolean50 = cacheMap46.pin((java.lang.Object) 1);
        java.util.Collection collection51 = cacheMap46.values();
        boolean boolean52 = cacheMap46.isLRU();
        java.util.Set set53 = cacheMap46.getPinnedKeys();
        boolean boolean55 = cacheMap46.unpin((java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap56 = new org.apache.openjpa.util.CacheMap();
        cacheMap56.setCacheSize((int) (byte) 10);
        java.lang.String str59 = cacheMap56.toString();
        boolean boolean60 = cacheMap56.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap63 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection64 = cacheMap63.values();
        java.lang.Object obj65 = cacheMap56.put((java.lang.Object) 100L, (java.lang.Object) collection64);
        java.util.Set set66 = cacheMap56.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap68 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection69 = cacheMap68.values();
        cacheMap68.readLock();
        boolean boolean71 = cacheMap56.pin((java.lang.Object) cacheMap68);
        cacheMap46.putAll((java.util.Map) cacheMap56);
        org.apache.openjpa.util.CacheMap cacheMap73 = new org.apache.openjpa.util.CacheMap();
        cacheMap73.setCacheSize((int) (byte) 10);
        java.lang.String str76 = cacheMap73.toString();
        org.apache.openjpa.util.CacheMap cacheMap77 = new org.apache.openjpa.util.CacheMap();
        boolean boolean78 = cacheMap77.isEmpty();
        java.lang.Object obj79 = cacheMap73.remove((java.lang.Object) cacheMap77);
        org.apache.openjpa.util.CacheMap cacheMap81 = new org.apache.openjpa.util.CacheMap();
        boolean boolean82 = cacheMap81.isEmpty();
        java.util.Set set83 = cacheMap81.entrySet();
        int int84 = cacheMap81.getCacheSize();
        java.lang.Object obj85 = cacheMap77.put((java.lang.Object) false, (java.lang.Object) int84);
        cacheMap77.setSoftReferenceSize((int) (short) 10);
        org.apache.openjpa.util.CacheMap cacheMap88 = new org.apache.openjpa.util.CacheMap();
        cacheMap88.setCacheSize(10);
        java.util.Set set91 = cacheMap88.entrySet();
        boolean boolean92 = cacheMap88.isLRU();
        boolean boolean93 = cacheMap77.containsValue((java.lang.Object) cacheMap88);
        cacheMap56.putAll((java.util.Map) cacheMap77, true);
        boolean boolean96 = cacheMap41.containsValue((java.lang.Object) cacheMap56);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CacheMap:{}::{}" + "'", str18, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "CacheMap:{}::{}" + "'", str40, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "CacheMap:{}::{}" + "'", str59, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "CacheMap:{}::{}" + "'", str76, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1000 + "'", int84 == 1000);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(set91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        boolean boolean4 = cacheMap0.pin((java.lang.Object) 1);
        java.util.Collection collection5 = cacheMap0.values();
        java.lang.String str6 = cacheMap0.toString();
        java.lang.String str7 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(true, 100);
        cacheMap0.putAll((java.util.Map) cacheMap10);
        cacheMap10.setCacheSize((int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = cacheMap10.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CacheMap:{}::{}" + "'", str7, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        int int5 = cacheMap0.getCacheSize();
        java.lang.String str6 = cacheMap0.toString();
        int int7 = cacheMap0.getSoftReferenceSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        java.lang.Object obj6 = cacheMap0.remove((java.lang.Object) cacheMap4);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        boolean boolean9 = cacheMap8.isEmpty();
        java.util.Set set10 = cacheMap8.entrySet();
        int int11 = cacheMap8.getCacheSize();
        java.lang.Object obj12 = cacheMap4.put((java.lang.Object) false, (java.lang.Object) int11);
        boolean boolean13 = cacheMap4.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj16 = cacheMap14.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj19 = cacheMap17.remove((java.lang.Object) (short) 1);
        cacheMap14.putAll((java.util.Map) cacheMap17, false);
        java.util.Set set22 = cacheMap17.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap();
        int int24 = cacheMap23.getSoftReferenceSize();
        java.lang.Object obj25 = cacheMap4.put((java.lang.Object) set22, (java.lang.Object) cacheMap23);
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap();
        cacheMap26.setCacheSize((int) (byte) 10);
        boolean boolean30 = cacheMap26.pin((java.lang.Object) 1);
        java.util.Collection collection31 = cacheMap26.values();
        java.lang.String str32 = cacheMap26.toString();
        java.lang.String str33 = cacheMap26.toString();
        org.apache.openjpa.util.CacheMap cacheMap36 = new org.apache.openjpa.util.CacheMap(true, 100);
        cacheMap26.putAll((java.util.Map) cacheMap36);
        java.lang.Object obj38 = cacheMap4.remove((java.lang.Object) cacheMap26);
        int int39 = cacheMap4.size();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "CacheMap:{}::{}" + "'", str32, "CacheMap:{}::{}");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "CacheMap:{}::{}" + "'", str33, "CacheMap:{}::{}");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean6 = cacheMap4.pin(obj5);
        boolean boolean7 = cacheMap4.isLRU();
        cacheMap1.putAll((java.util.Map) cacheMap4, false);
        cacheMap1.writeLock();
        int int11 = cacheMap1.getCacheSize();
        java.lang.Class<?> wildcardClass12 = cacheMap1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        boolean boolean4 = cacheMap0.pin((java.lang.Object) 1);
        java.util.Collection collection5 = cacheMap0.values();
        boolean boolean6 = cacheMap0.isLRU();
        java.util.Set set7 = cacheMap0.getPinnedKeys();
        boolean boolean9 = cacheMap0.unpin((java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        cacheMap10.setCacheSize((int) (byte) 10);
        java.lang.String str13 = cacheMap10.toString();
        boolean boolean14 = cacheMap10.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection18 = cacheMap17.values();
        java.lang.Object obj19 = cacheMap10.put((java.lang.Object) 100L, (java.lang.Object) collection18);
        java.util.Set set20 = cacheMap10.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection23 = cacheMap22.values();
        cacheMap22.readLock();
        boolean boolean25 = cacheMap10.pin((java.lang.Object) cacheMap22);
        cacheMap0.putAll((java.util.Map) cacheMap10);
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap();
        cacheMap27.setCacheSize((int) (byte) 10);
        java.lang.String str30 = cacheMap27.toString();
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap();
        boolean boolean32 = cacheMap31.isEmpty();
        java.lang.Object obj33 = cacheMap27.remove((java.lang.Object) cacheMap31);
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap();
        boolean boolean36 = cacheMap35.isEmpty();
        java.util.Set set37 = cacheMap35.entrySet();
        int int38 = cacheMap35.getCacheSize();
        java.lang.Object obj39 = cacheMap31.put((java.lang.Object) false, (java.lang.Object) int38);
        cacheMap31.setSoftReferenceSize((int) (short) 10);
        org.apache.openjpa.util.CacheMap cacheMap42 = new org.apache.openjpa.util.CacheMap();
        cacheMap42.setCacheSize(10);
        java.util.Set set45 = cacheMap42.entrySet();
        boolean boolean46 = cacheMap42.isLRU();
        boolean boolean47 = cacheMap31.containsValue((java.lang.Object) cacheMap42);
        cacheMap10.putAll((java.util.Map) cacheMap31, true);
        cacheMap31.setSoftReferenceSize(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CacheMap:{}::{}" + "'", str13, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "CacheMap:{}::{}" + "'", str30, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1000 + "'", int38 == 1000);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) 10);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        cacheMap0.putAll((java.util.Map) cacheMap4, true);
        java.util.Collection collection8 = cacheMap0.values();
        boolean boolean9 = cacheMap0.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        cacheMap10.setCacheSize(10);
        java.lang.Object obj14 = cacheMap10.get((java.lang.Object) 100L);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        cacheMap15.setCacheSize((int) (byte) 10);
        java.lang.String str18 = cacheMap15.toString();
        cacheMap10.putAll((java.util.Map) cacheMap15, false);
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap();
        cacheMap21.setCacheSize(10);
        java.util.Set set24 = cacheMap21.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection27 = cacheMap26.values();
        cacheMap26.readLock();
        java.lang.Object obj29 = cacheMap21.remove((java.lang.Object) cacheMap26);
        org.apache.openjpa.util.CacheMap cacheMap30 = new org.apache.openjpa.util.CacheMap();
        cacheMap30.setCacheSize(10);
        boolean boolean33 = cacheMap30.isEmpty();
        cacheMap30.writeLock();
        cacheMap26.putAll((java.util.Map) cacheMap30);
        org.apache.openjpa.util.CacheMap cacheMap38 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean40 = cacheMap38.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap42 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection43 = cacheMap42.values();
        org.apache.openjpa.util.CacheMap cacheMap44 = new org.apache.openjpa.util.CacheMap();
        cacheMap44.setCacheSize((int) (byte) 10);
        java.lang.String str47 = cacheMap44.toString();
        org.apache.openjpa.util.CacheMap cacheMap48 = new org.apache.openjpa.util.CacheMap();
        boolean boolean49 = cacheMap48.isEmpty();
        cacheMap44.putAll((java.util.Map) cacheMap48, true);
        boolean boolean52 = cacheMap42.containsKey((java.lang.Object) true);
        java.util.Collection collection53 = cacheMap42.values();
        org.apache.openjpa.util.CacheMap cacheMap56 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean58 = cacheMap56.containsValue((java.lang.Object) '4');
        boolean boolean59 = cacheMap42.containsKey((java.lang.Object) boolean58);
        boolean boolean60 = cacheMap38.pin((java.lang.Object) boolean59);
        cacheMap30.putAll((java.util.Map) cacheMap38, false);
        boolean boolean63 = cacheMap15.pin((java.lang.Object) cacheMap30);
        java.util.Set set64 = cacheMap15.getPinnedKeys();
        cacheMap0.putAll((java.util.Map) cacheMap15, false);
        java.util.Set set67 = cacheMap0.getPinnedKeys();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CacheMap:{}::{}" + "'", str18, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "CacheMap:{}::{}" + "'", str47, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(set67);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection10 = cacheMap9.values();
        cacheMap9.readLock();
        boolean boolean12 = cacheMap0.containsValue((java.lang.Object) cacheMap9);
        boolean boolean13 = cacheMap0.isEmpty();
        java.lang.String str14 = cacheMap0.toString();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CacheMap:{}::{}" + "'", str14, "CacheMap:{}::{}");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.lang.Object obj4 = cacheMap0.get((java.lang.Object) 100L);
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        cacheMap5.setCacheSize((int) (byte) 10);
        java.lang.String str8 = cacheMap5.toString();
        cacheMap0.putAll((java.util.Map) cacheMap5, false);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(true, (int) (byte) 10);
        java.lang.Object obj14 = cacheMap5.remove((java.lang.Object) cacheMap13);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap17.setCacheSize((int) '4');
        boolean boolean21 = cacheMap17.containsValue((java.lang.Object) 100);
        cacheMap17.setCacheSize((int) (short) 1);
        boolean boolean24 = cacheMap5.pin((java.lang.Object) (short) 1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.util.Set set2 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection5 = cacheMap4.values();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        java.lang.String str9 = cacheMap6.toString();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        boolean boolean11 = cacheMap10.isEmpty();
        java.lang.Object obj12 = cacheMap6.remove((java.lang.Object) cacheMap10);
        java.lang.Object obj13 = cacheMap0.put((java.lang.Object) cacheMap4, obj12);
        cacheMap0.setCacheSize((int) (byte) 1);
        java.lang.String str16 = cacheMap0.toString();
        java.util.Set set17 = cacheMap0.getPinnedKeys();
        java.util.Collection collection18 = cacheMap0.values();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CacheMap:{CacheMap:{}::{}=null}::{}" + "'", str16, "CacheMap:{CacheMap:{}::{}=null}::{}");
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        cacheMap0.putAll((java.util.Map) cacheMap4, true);
        java.util.Collection collection8 = cacheMap0.values();
        boolean boolean9 = cacheMap0.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        cacheMap10.setCacheSize(10);
        java.lang.Object obj14 = cacheMap10.get((java.lang.Object) 100L);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        cacheMap15.setCacheSize((int) (byte) 10);
        java.lang.String str18 = cacheMap15.toString();
        cacheMap10.putAll((java.util.Map) cacheMap15, false);
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap();
        cacheMap21.setCacheSize(10);
        java.util.Set set24 = cacheMap21.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection27 = cacheMap26.values();
        cacheMap26.readLock();
        java.lang.Object obj29 = cacheMap21.remove((java.lang.Object) cacheMap26);
        org.apache.openjpa.util.CacheMap cacheMap30 = new org.apache.openjpa.util.CacheMap();
        cacheMap30.setCacheSize(10);
        boolean boolean33 = cacheMap30.isEmpty();
        cacheMap30.writeLock();
        cacheMap26.putAll((java.util.Map) cacheMap30);
        org.apache.openjpa.util.CacheMap cacheMap38 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean40 = cacheMap38.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap42 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection43 = cacheMap42.values();
        org.apache.openjpa.util.CacheMap cacheMap44 = new org.apache.openjpa.util.CacheMap();
        cacheMap44.setCacheSize((int) (byte) 10);
        java.lang.String str47 = cacheMap44.toString();
        org.apache.openjpa.util.CacheMap cacheMap48 = new org.apache.openjpa.util.CacheMap();
        boolean boolean49 = cacheMap48.isEmpty();
        cacheMap44.putAll((java.util.Map) cacheMap48, true);
        boolean boolean52 = cacheMap42.containsKey((java.lang.Object) true);
        java.util.Collection collection53 = cacheMap42.values();
        org.apache.openjpa.util.CacheMap cacheMap56 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean58 = cacheMap56.containsValue((java.lang.Object) '4');
        boolean boolean59 = cacheMap42.containsKey((java.lang.Object) boolean58);
        boolean boolean60 = cacheMap38.pin((java.lang.Object) boolean59);
        cacheMap30.putAll((java.util.Map) cacheMap38, false);
        boolean boolean63 = cacheMap15.pin((java.lang.Object) cacheMap30);
        java.util.Set set64 = cacheMap15.getPinnedKeys();
        cacheMap0.putAll((java.util.Map) cacheMap15, false);
        cacheMap0.clear();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CacheMap:{}::{}" + "'", str18, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "CacheMap:{}::{}" + "'", str47, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(set64);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        boolean boolean5 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        cacheMap0.putAll((java.util.Map) cacheMap6, false);
        cacheMap6.clear();
        cacheMap6.setSoftReferenceSize((int) (short) 0);
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        cacheMap14.setCacheSize(10);
        java.util.Set set17 = cacheMap14.entrySet();
        boolean boolean18 = cacheMap14.isLRU();
        int int19 = cacheMap14.getCacheSize();
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap();
        cacheMap20.setCacheSize((int) (byte) 10);
        java.lang.String str23 = cacheMap20.toString();
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap();
        boolean boolean25 = cacheMap24.isEmpty();
        java.lang.Object obj26 = cacheMap20.remove((java.lang.Object) cacheMap24);
        org.apache.openjpa.util.CacheMap cacheMap28 = new org.apache.openjpa.util.CacheMap();
        boolean boolean29 = cacheMap28.isEmpty();
        java.util.Set set30 = cacheMap28.entrySet();
        int int31 = cacheMap28.getCacheSize();
        java.lang.Object obj32 = cacheMap24.put((java.lang.Object) false, (java.lang.Object) int31);
        boolean boolean33 = cacheMap24.isEmpty();
        java.util.Set set34 = cacheMap24.getPinnedKeys();
        cacheMap24.clear();
        org.apache.openjpa.util.CacheMap cacheMap38 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj39 = new java.lang.Object();
        boolean boolean40 = cacheMap38.pin(obj39);
        org.apache.openjpa.util.CacheMap cacheMap41 = new org.apache.openjpa.util.CacheMap();
        cacheMap41.setCacheSize((int) (byte) 10);
        java.lang.String str44 = cacheMap41.toString();
        org.apache.openjpa.util.CacheMap cacheMap45 = new org.apache.openjpa.util.CacheMap();
        boolean boolean46 = cacheMap45.isEmpty();
        cacheMap41.putAll((java.util.Map) cacheMap45, true);
        java.util.Collection collection49 = cacheMap41.values();
        java.lang.Object obj51 = cacheMap38.put((java.lang.Object) collection49, (java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap53 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection54 = cacheMap53.values();
        org.apache.openjpa.util.CacheMap cacheMap55 = new org.apache.openjpa.util.CacheMap();
        cacheMap55.setCacheSize((int) (byte) 10);
        java.lang.String str58 = cacheMap55.toString();
        org.apache.openjpa.util.CacheMap cacheMap59 = new org.apache.openjpa.util.CacheMap();
        boolean boolean60 = cacheMap59.isEmpty();
        cacheMap55.putAll((java.util.Map) cacheMap59, true);
        boolean boolean63 = cacheMap53.containsKey((java.lang.Object) true);
        java.util.Collection collection64 = cacheMap53.values();
        org.apache.openjpa.util.CacheMap cacheMap67 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean69 = cacheMap67.containsValue((java.lang.Object) '4');
        boolean boolean70 = cacheMap53.containsKey((java.lang.Object) boolean69);
        org.apache.openjpa.util.CacheMap cacheMap71 = new org.apache.openjpa.util.CacheMap();
        cacheMap71.setCacheSize((int) (byte) 10);
        java.lang.String str74 = cacheMap71.toString();
        boolean boolean75 = cacheMap71.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap78 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection79 = cacheMap78.values();
        java.lang.Object obj80 = cacheMap71.put((java.lang.Object) 100L, (java.lang.Object) collection79);
        cacheMap71.readLock();
        java.util.Collection collection82 = cacheMap71.values();
        cacheMap71.readLock();
        org.apache.openjpa.util.CacheMap cacheMap84 = new org.apache.openjpa.util.CacheMap();
        boolean boolean85 = cacheMap84.isEmpty();
        java.lang.Object obj87 = cacheMap84.remove((java.lang.Object) 1);
        java.util.Set set88 = cacheMap84.keySet();
        java.lang.Object obj89 = cacheMap53.put((java.lang.Object) cacheMap71, (java.lang.Object) set88);
        cacheMap53.clear();
        cacheMap38.putAll((java.util.Map) cacheMap53, true);
        java.lang.Object obj93 = cacheMap24.remove((java.lang.Object) true);
        cacheMap14.putAll((java.util.Map) cacheMap24);
        boolean boolean95 = cacheMap6.pin((java.lang.Object) cacheMap24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "CacheMap:{}::{}" + "'", str23, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1000 + "'", int31 == 1000);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "CacheMap:{}::{}" + "'", str44, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "CacheMap:{}::{}" + "'", str58, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "CacheMap:{}::{}" + "'", str74, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        boolean boolean4 = cacheMap0.isLRU();
        int int5 = cacheMap0.getCacheSize();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        java.lang.String str9 = cacheMap6.toString();
        boolean boolean10 = cacheMap6.isEmpty();
        int int11 = cacheMap6.getCacheSize();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        cacheMap15.setCacheSize(10);
        java.lang.Object obj19 = cacheMap15.get((java.lang.Object) 100L);
        java.lang.Object obj21 = cacheMap15.remove((java.lang.Object) (-1.0d));
        cacheMap14.putAll((java.util.Map) cacheMap15, false);
        java.lang.Object obj24 = cacheMap0.put((java.lang.Object) cacheMap6, (java.lang.Object) cacheMap15);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.getPinnedKeys();
        cacheMap0.writeLock();
        org.junit.Assert.assertNotNull(set1);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(false, (int) '#', (int) '#', (float) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        java.util.Set set10 = cacheMap0.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection13 = cacheMap12.values();
        cacheMap12.readLock();
        boolean boolean15 = cacheMap0.pin((java.lang.Object) cacheMap12);
        java.util.Collection collection16 = cacheMap0.values();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap();
        cacheMap2.setCacheSize((int) (byte) 10);
        java.lang.String str5 = cacheMap2.toString();
        boolean boolean6 = cacheMap2.isEmpty();
        cacheMap0.putAll((java.util.Map) cacheMap2, true);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection11 = cacheMap10.values();
        cacheMap10.readLock();
        java.util.Collection collection13 = cacheMap10.values();
        java.lang.Object obj14 = cacheMap2.remove((java.lang.Object) collection13);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        cacheMap15.setCacheSize(10);
        java.lang.Object obj19 = cacheMap15.get((java.lang.Object) 100L);
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap();
        cacheMap20.setCacheSize((int) (byte) 10);
        java.lang.String str23 = cacheMap20.toString();
        cacheMap15.putAll((java.util.Map) cacheMap20, false);
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap();
        cacheMap26.setCacheSize(10);
        java.util.Set set29 = cacheMap26.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection32 = cacheMap31.values();
        cacheMap31.readLock();
        java.lang.Object obj34 = cacheMap26.remove((java.lang.Object) cacheMap31);
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap();
        cacheMap35.setCacheSize(10);
        boolean boolean38 = cacheMap35.isEmpty();
        cacheMap35.writeLock();
        cacheMap31.putAll((java.util.Map) cacheMap35);
        org.apache.openjpa.util.CacheMap cacheMap43 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean45 = cacheMap43.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap47 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection48 = cacheMap47.values();
        org.apache.openjpa.util.CacheMap cacheMap49 = new org.apache.openjpa.util.CacheMap();
        cacheMap49.setCacheSize((int) (byte) 10);
        java.lang.String str52 = cacheMap49.toString();
        org.apache.openjpa.util.CacheMap cacheMap53 = new org.apache.openjpa.util.CacheMap();
        boolean boolean54 = cacheMap53.isEmpty();
        cacheMap49.putAll((java.util.Map) cacheMap53, true);
        boolean boolean57 = cacheMap47.containsKey((java.lang.Object) true);
        java.util.Collection collection58 = cacheMap47.values();
        org.apache.openjpa.util.CacheMap cacheMap61 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean63 = cacheMap61.containsValue((java.lang.Object) '4');
        boolean boolean64 = cacheMap47.containsKey((java.lang.Object) boolean63);
        boolean boolean65 = cacheMap43.pin((java.lang.Object) boolean64);
        cacheMap35.putAll((java.util.Map) cacheMap43, false);
        boolean boolean68 = cacheMap20.pin((java.lang.Object) cacheMap35);
        java.lang.String str69 = cacheMap20.toString();
        cacheMap2.putAll((java.util.Map) cacheMap20);
        org.apache.openjpa.util.CacheMap cacheMap71 = new org.apache.openjpa.util.CacheMap();
        cacheMap71.setCacheSize(10);
        boolean boolean74 = cacheMap2.containsKey((java.lang.Object) cacheMap71);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CacheMap:{}::{}" + "'", str5, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "CacheMap:{}::{}" + "'", str23, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "CacheMap:{}::{}" + "'", str52, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "CacheMap:{}::{}" + "'", str69, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        int int4 = cacheMap0.size();
        int int5 = cacheMap0.getSoftReferenceSize();
        cacheMap0.setSoftReferenceSize((int) (short) 0);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean12 = cacheMap10.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection15 = cacheMap14.values();
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap();
        cacheMap16.setCacheSize((int) (byte) 10);
        java.lang.String str19 = cacheMap16.toString();
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap();
        boolean boolean21 = cacheMap20.isEmpty();
        cacheMap16.putAll((java.util.Map) cacheMap20, true);
        boolean boolean24 = cacheMap14.containsKey((java.lang.Object) true);
        java.util.Collection collection25 = cacheMap14.values();
        org.apache.openjpa.util.CacheMap cacheMap28 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean30 = cacheMap28.containsValue((java.lang.Object) '4');
        boolean boolean31 = cacheMap14.containsKey((java.lang.Object) boolean30);
        boolean boolean32 = cacheMap10.pin((java.lang.Object) boolean31);
        boolean boolean33 = cacheMap0.containsKey((java.lang.Object) boolean32);
        java.util.Set set34 = cacheMap0.getPinnedKeys();
        java.util.Collection collection35 = cacheMap0.values();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap0.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CacheMap:{}::{}" + "'", str19, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(collection35);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        java.util.Set set8 = cacheMap3.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection11 = cacheMap10.values();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        cacheMap12.setCacheSize((int) (byte) 10);
        java.lang.String str15 = cacheMap12.toString();
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap();
        boolean boolean17 = cacheMap16.isEmpty();
        cacheMap12.putAll((java.util.Map) cacheMap16, true);
        boolean boolean20 = cacheMap10.containsKey((java.lang.Object) true);
        java.util.Collection collection21 = cacheMap10.values();
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean26 = cacheMap24.containsValue((java.lang.Object) '4');
        boolean boolean27 = cacheMap10.containsKey((java.lang.Object) boolean26);
        org.apache.openjpa.util.CacheMap cacheMap28 = new org.apache.openjpa.util.CacheMap();
        cacheMap28.setCacheSize((int) (byte) 10);
        java.lang.String str31 = cacheMap28.toString();
        boolean boolean32 = cacheMap28.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection36 = cacheMap35.values();
        java.lang.Object obj37 = cacheMap28.put((java.lang.Object) 100L, (java.lang.Object) collection36);
        cacheMap28.readLock();
        java.util.Collection collection39 = cacheMap28.values();
        cacheMap28.readLock();
        org.apache.openjpa.util.CacheMap cacheMap41 = new org.apache.openjpa.util.CacheMap();
        boolean boolean42 = cacheMap41.isEmpty();
        java.lang.Object obj44 = cacheMap41.remove((java.lang.Object) 1);
        java.util.Set set45 = cacheMap41.keySet();
        java.lang.Object obj46 = cacheMap10.put((java.lang.Object) cacheMap28, (java.lang.Object) set45);
        boolean boolean47 = cacheMap3.containsKey((java.lang.Object) set45);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CacheMap:{}::{}" + "'", str15, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "CacheMap:{}::{}" + "'", str31, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true, (int) (short) 1, (int) 'a', 100.0f, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        boolean boolean5 = cacheMap0.isEmpty();
        boolean boolean6 = cacheMap0.isLRU();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        java.util.Collection collection10 = cacheMap0.values();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap0.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.lang.Object obj4 = cacheMap0.get((java.lang.Object) 100L);
        cacheMap0.setSoftReferenceSize(1);
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        cacheMap7.setCacheSize(10);
        boolean boolean10 = cacheMap7.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap();
        cacheMap11.setCacheSize((int) (byte) 10);
        java.lang.String str14 = cacheMap11.toString();
        boolean boolean15 = cacheMap11.isEmpty();
        boolean boolean16 = cacheMap11.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        cacheMap17.setCacheSize((int) (byte) 10);
        cacheMap11.putAll((java.util.Map) cacheMap17, false);
        boolean boolean23 = cacheMap11.unpin((java.lang.Object) (short) 10);
        boolean boolean24 = cacheMap7.unpin((java.lang.Object) (short) 10);
        boolean boolean25 = cacheMap0.containsKey((java.lang.Object) cacheMap7);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap0.readUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CacheMap:{}::{}" + "'", str14, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = cacheMap2.pin(obj3);
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        cacheMap5.setCacheSize((int) (byte) 10);
        java.lang.String str8 = cacheMap5.toString();
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap();
        boolean boolean10 = cacheMap9.isEmpty();
        cacheMap5.putAll((java.util.Map) cacheMap9, true);
        java.util.Collection collection13 = cacheMap5.values();
        java.lang.Object obj15 = cacheMap2.put((java.lang.Object) collection13, (java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection18 = cacheMap17.values();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap();
        cacheMap19.setCacheSize((int) (byte) 10);
        java.lang.String str22 = cacheMap19.toString();
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap();
        boolean boolean24 = cacheMap23.isEmpty();
        cacheMap19.putAll((java.util.Map) cacheMap23, true);
        boolean boolean27 = cacheMap17.containsKey((java.lang.Object) true);
        java.util.Collection collection28 = cacheMap17.values();
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean33 = cacheMap31.containsValue((java.lang.Object) '4');
        boolean boolean34 = cacheMap17.containsKey((java.lang.Object) boolean33);
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap();
        cacheMap35.setCacheSize((int) (byte) 10);
        java.lang.String str38 = cacheMap35.toString();
        boolean boolean39 = cacheMap35.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap42 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection43 = cacheMap42.values();
        java.lang.Object obj44 = cacheMap35.put((java.lang.Object) 100L, (java.lang.Object) collection43);
        cacheMap35.readLock();
        java.util.Collection collection46 = cacheMap35.values();
        cacheMap35.readLock();
        org.apache.openjpa.util.CacheMap cacheMap48 = new org.apache.openjpa.util.CacheMap();
        boolean boolean49 = cacheMap48.isEmpty();
        java.lang.Object obj51 = cacheMap48.remove((java.lang.Object) 1);
        java.util.Set set52 = cacheMap48.keySet();
        java.lang.Object obj53 = cacheMap17.put((java.lang.Object) cacheMap35, (java.lang.Object) set52);
        cacheMap17.clear();
        cacheMap2.putAll((java.util.Map) cacheMap17, true);
        int int57 = cacheMap2.getCacheSize();
        org.apache.openjpa.util.CacheMap cacheMap58 = new org.apache.openjpa.util.CacheMap();
        cacheMap58.setCacheSize(10);
        boolean boolean61 = cacheMap58.isEmpty();
        int int62 = cacheMap58.getCacheSize();
        java.lang.Object obj63 = cacheMap2.get((java.lang.Object) cacheMap58);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CacheMap:{}::{}" + "'", str22, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "CacheMap:{}::{}" + "'", str38, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 32 + "'", int57 == 32);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: LRUMap max size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) '#', (int) '#', (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.writeLock();
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap();
        boolean boolean3 = cacheMap2.isEmpty();
        java.util.Set set4 = cacheMap2.entrySet();
        cacheMap2.setCacheSize((int) (short) 0);
        java.util.Set set7 = cacheMap2.getPinnedKeys();
        cacheMap0.putAll((java.util.Map) cacheMap2);
        java.lang.Class<?> wildcardClass9 = cacheMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean4 = cacheMap2.containsValue((java.lang.Object) '4');
        java.util.Set set5 = cacheMap2.keySet();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        boolean boolean7 = cacheMap6.isEmpty();
        java.lang.Object obj9 = cacheMap6.remove((java.lang.Object) 1);
        java.lang.Object obj10 = cacheMap2.remove((java.lang.Object) 1);
        boolean boolean11 = cacheMap2.isLRU();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) '#');
        java.lang.String str3 = cacheMap2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap2.setCacheSize((int) '4');
        boolean boolean6 = cacheMap2.containsValue((java.lang.Object) 100);
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        cacheMap7.setCacheSize(10);
        java.lang.Object obj11 = cacheMap7.get((java.lang.Object) 100L);
        java.lang.Object obj12 = cacheMap2.remove((java.lang.Object) cacheMap7);
        boolean boolean13 = cacheMap7.isEmpty();
        int int14 = cacheMap7.getCacheSize();
        java.util.Set set15 = cacheMap7.getPinnedKeys();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        java.util.Set set10 = cacheMap0.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection13 = cacheMap12.values();
        cacheMap12.readLock();
        boolean boolean15 = cacheMap0.pin((java.lang.Object) cacheMap12);
        cacheMap0.setCacheSize(1);
        cacheMap0.setSoftReferenceSize((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.lang.Object obj3 = cacheMap0.remove((java.lang.Object) 1);
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        java.lang.String str9 = cacheMap6.toString();
        boolean boolean10 = cacheMap6.isEmpty();
        cacheMap4.putAll((java.util.Map) cacheMap6, true);
        cacheMap0.putAll((java.util.Map) cacheMap4, true);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        cacheMap15.setCacheSize((int) (byte) 10);
        java.lang.String str18 = cacheMap15.toString();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap();
        boolean boolean20 = cacheMap19.isEmpty();
        java.lang.Object obj21 = cacheMap15.remove((java.lang.Object) cacheMap19);
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap();
        boolean boolean24 = cacheMap23.isEmpty();
        java.util.Set set25 = cacheMap23.entrySet();
        int int26 = cacheMap23.getCacheSize();
        java.lang.Object obj27 = cacheMap19.put((java.lang.Object) false, (java.lang.Object) int26);
        boolean boolean28 = cacheMap19.isEmpty();
        java.util.Set set29 = cacheMap19.getPinnedKeys();
        int int30 = cacheMap19.size();
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap();
        cacheMap31.setCacheSize((int) (byte) 10);
        java.lang.String str34 = cacheMap31.toString();
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap();
        boolean boolean36 = cacheMap35.isEmpty();
        cacheMap31.putAll((java.util.Map) cacheMap35, true);
        java.util.Collection collection39 = cacheMap35.values();
        java.lang.Object obj40 = cacheMap19.get((java.lang.Object) collection39);
        boolean boolean41 = cacheMap0.pin((java.lang.Object) cacheMap19);
        java.lang.Class<?> wildcardClass42 = cacheMap19.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CacheMap:{}::{}" + "'", str18, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1000 + "'", int26 == 1000);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "CacheMap:{}::{}" + "'", str34, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection2 = cacheMap1.values();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        cacheMap3.setCacheSize((int) (byte) 10);
        java.lang.String str6 = cacheMap3.toString();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        boolean boolean8 = cacheMap7.isEmpty();
        cacheMap3.putAll((java.util.Map) cacheMap7, true);
        boolean boolean11 = cacheMap1.containsKey((java.lang.Object) true);
        java.util.Collection collection12 = cacheMap1.values();
        int int13 = cacheMap1.size();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj16 = cacheMap14.remove((java.lang.Object) (short) 1);
        int int17 = cacheMap14.getSoftReferenceSize();
        cacheMap14.clear();
        boolean boolean19 = cacheMap1.containsKey((java.lang.Object) cacheMap14);
        cacheMap14.setCacheSize((int) (byte) 10);
        boolean boolean22 = cacheMap14.isLRU();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        cacheMap3.setCacheSize(10);
        java.lang.Object obj7 = cacheMap3.get((java.lang.Object) 100L);
        java.lang.Object obj9 = cacheMap3.remove((java.lang.Object) (-1.0d));
        cacheMap2.putAll((java.util.Map) cacheMap3, false);
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set13 = cacheMap12.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        cacheMap14.setCacheSize((int) (byte) 10);
        java.lang.String str17 = cacheMap14.toString();
        boolean boolean18 = cacheMap14.isEmpty();
        cacheMap12.putAll((java.util.Map) cacheMap14, true);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection23 = cacheMap22.values();
        cacheMap22.readLock();
        java.util.Collection collection25 = cacheMap22.values();
        java.lang.Object obj26 = cacheMap14.remove((java.lang.Object) collection25);
        boolean boolean27 = cacheMap2.unpin(obj26);
        cacheMap2.setCacheSize((int) '#');
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CacheMap:{}::{}" + "'", str17, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean6 = cacheMap4.pin(obj5);
        boolean boolean7 = cacheMap4.isLRU();
        cacheMap1.putAll((java.util.Map) cacheMap4, false);
        cacheMap4.writeLock();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        boolean boolean4 = cacheMap0.pin((java.lang.Object) 1);
        java.util.Collection collection5 = cacheMap0.values();
        java.util.Collection collection6 = cacheMap0.values();
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = cacheMap9.pin(obj10);
        cacheMap9.setCacheSize(0);
        boolean boolean14 = cacheMap0.containsValue((java.lang.Object) cacheMap9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection10 = cacheMap9.values();
        cacheMap9.readLock();
        boolean boolean12 = cacheMap0.containsValue((java.lang.Object) cacheMap9);
        boolean boolean13 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        cacheMap14.setCacheSize((int) (byte) 10);
        boolean boolean18 = cacheMap14.pin((java.lang.Object) 1);
        java.util.Collection collection19 = cacheMap14.values();
        boolean boolean20 = cacheMap14.isLRU();
        java.util.Set set21 = cacheMap14.getPinnedKeys();
        boolean boolean23 = cacheMap14.unpin((java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap();
        cacheMap24.setCacheSize((int) (byte) 10);
        java.lang.String str27 = cacheMap24.toString();
        boolean boolean28 = cacheMap24.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection32 = cacheMap31.values();
        java.lang.Object obj33 = cacheMap24.put((java.lang.Object) 100L, (java.lang.Object) collection32);
        java.util.Set set34 = cacheMap24.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap36 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection37 = cacheMap36.values();
        cacheMap36.readLock();
        boolean boolean39 = cacheMap24.pin((java.lang.Object) cacheMap36);
        cacheMap14.putAll((java.util.Map) cacheMap24);
        org.apache.openjpa.util.CacheMap cacheMap41 = new org.apache.openjpa.util.CacheMap();
        cacheMap41.setCacheSize((int) (byte) 10);
        java.lang.String str44 = cacheMap41.toString();
        org.apache.openjpa.util.CacheMap cacheMap45 = new org.apache.openjpa.util.CacheMap();
        boolean boolean46 = cacheMap45.isEmpty();
        java.lang.Object obj47 = cacheMap41.remove((java.lang.Object) cacheMap45);
        org.apache.openjpa.util.CacheMap cacheMap49 = new org.apache.openjpa.util.CacheMap();
        boolean boolean50 = cacheMap49.isEmpty();
        java.util.Set set51 = cacheMap49.entrySet();
        int int52 = cacheMap49.getCacheSize();
        java.lang.Object obj53 = cacheMap45.put((java.lang.Object) false, (java.lang.Object) int52);
        cacheMap45.setSoftReferenceSize((int) (short) 10);
        org.apache.openjpa.util.CacheMap cacheMap56 = new org.apache.openjpa.util.CacheMap();
        cacheMap56.setCacheSize(10);
        java.util.Set set59 = cacheMap56.entrySet();
        boolean boolean60 = cacheMap56.isLRU();
        boolean boolean61 = cacheMap45.containsValue((java.lang.Object) cacheMap56);
        cacheMap24.putAll((java.util.Map) cacheMap45, true);
        boolean boolean64 = cacheMap0.containsValue((java.lang.Object) cacheMap24);
        org.apache.openjpa.util.CacheMap cacheMap67 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean69 = cacheMap67.containsValue((java.lang.Object) '4');
        cacheMap24.putAll((java.util.Map) cacheMap67);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "CacheMap:{}::{}" + "'", str27, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "CacheMap:{}::{}" + "'", str44, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1000 + "'", int52 == 1000);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.lang.Object obj4 = cacheMap0.get((java.lang.Object) 100L);
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        cacheMap5.setCacheSize((int) (byte) 10);
        java.lang.String str8 = cacheMap5.toString();
        cacheMap0.putAll((java.util.Map) cacheMap5, false);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(true, (int) (byte) 10);
        java.lang.Object obj14 = cacheMap5.remove((java.lang.Object) cacheMap13);
        cacheMap13.setCacheSize((int) '4');
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.util.Set set2 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection5 = cacheMap4.values();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        java.lang.String str9 = cacheMap6.toString();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        boolean boolean11 = cacheMap10.isEmpty();
        java.lang.Object obj12 = cacheMap6.remove((java.lang.Object) cacheMap10);
        java.lang.Object obj13 = cacheMap0.put((java.lang.Object) cacheMap4, obj12);
        cacheMap0.setCacheSize((int) (byte) 1);
        java.lang.String str16 = cacheMap0.toString();
        java.util.Set set17 = cacheMap0.getPinnedKeys();
        boolean boolean18 = cacheMap0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CacheMap:{CacheMap:{}::{}=null}::{}" + "'", str16, "CacheMap:{CacheMap:{}::{}=null}::{}");
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (-1));
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj8 = cacheMap6.remove((java.lang.Object) (short) 1);
        cacheMap3.putAll((java.util.Map) cacheMap6, false);
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection13 = cacheMap12.values();
        cacheMap12.readLock();
        boolean boolean15 = cacheMap3.containsValue((java.lang.Object) cacheMap12);
        boolean boolean16 = cacheMap3.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj19 = cacheMap17.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj22 = cacheMap20.remove((java.lang.Object) (short) 1);
        cacheMap17.putAll((java.util.Map) cacheMap20, false);
        boolean boolean25 = cacheMap17.isLRU();
        cacheMap17.writeLock();
        cacheMap3.putAll((java.util.Map) cacheMap17);
        int int28 = cacheMap17.getSoftReferenceSize();
        cacheMap2.putAll((java.util.Map) cacheMap17);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) (byte) 10);
        java.util.Collection collection3 = cacheMap2.values();
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        java.lang.Object obj6 = cacheMap0.remove((java.lang.Object) cacheMap4);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        boolean boolean9 = cacheMap8.isEmpty();
        java.util.Set set10 = cacheMap8.entrySet();
        int int11 = cacheMap8.getCacheSize();
        java.lang.Object obj12 = cacheMap4.put((java.lang.Object) false, (java.lang.Object) int11);
        boolean boolean13 = cacheMap4.isEmpty();
        java.util.Set set14 = cacheMap4.getPinnedKeys();
        cacheMap4.clear();
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj19 = new java.lang.Object();
        boolean boolean20 = cacheMap18.pin(obj19);
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap();
        cacheMap21.setCacheSize((int) (byte) 10);
        java.lang.String str24 = cacheMap21.toString();
        org.apache.openjpa.util.CacheMap cacheMap25 = new org.apache.openjpa.util.CacheMap();
        boolean boolean26 = cacheMap25.isEmpty();
        cacheMap21.putAll((java.util.Map) cacheMap25, true);
        java.util.Collection collection29 = cacheMap21.values();
        java.lang.Object obj31 = cacheMap18.put((java.lang.Object) collection29, (java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection34 = cacheMap33.values();
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap();
        cacheMap35.setCacheSize((int) (byte) 10);
        java.lang.String str38 = cacheMap35.toString();
        org.apache.openjpa.util.CacheMap cacheMap39 = new org.apache.openjpa.util.CacheMap();
        boolean boolean40 = cacheMap39.isEmpty();
        cacheMap35.putAll((java.util.Map) cacheMap39, true);
        boolean boolean43 = cacheMap33.containsKey((java.lang.Object) true);
        java.util.Collection collection44 = cacheMap33.values();
        org.apache.openjpa.util.CacheMap cacheMap47 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean49 = cacheMap47.containsValue((java.lang.Object) '4');
        boolean boolean50 = cacheMap33.containsKey((java.lang.Object) boolean49);
        org.apache.openjpa.util.CacheMap cacheMap51 = new org.apache.openjpa.util.CacheMap();
        cacheMap51.setCacheSize((int) (byte) 10);
        java.lang.String str54 = cacheMap51.toString();
        boolean boolean55 = cacheMap51.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap58 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection59 = cacheMap58.values();
        java.lang.Object obj60 = cacheMap51.put((java.lang.Object) 100L, (java.lang.Object) collection59);
        cacheMap51.readLock();
        java.util.Collection collection62 = cacheMap51.values();
        cacheMap51.readLock();
        org.apache.openjpa.util.CacheMap cacheMap64 = new org.apache.openjpa.util.CacheMap();
        boolean boolean65 = cacheMap64.isEmpty();
        java.lang.Object obj67 = cacheMap64.remove((java.lang.Object) 1);
        java.util.Set set68 = cacheMap64.keySet();
        java.lang.Object obj69 = cacheMap33.put((java.lang.Object) cacheMap51, (java.lang.Object) set68);
        cacheMap33.clear();
        cacheMap18.putAll((java.util.Map) cacheMap33, true);
        java.lang.Object obj73 = cacheMap4.remove((java.lang.Object) true);
        java.util.Collection collection74 = cacheMap4.values();
        cacheMap4.setSoftReferenceSize((int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "CacheMap:{}::{}" + "'", str24, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "CacheMap:{}::{}" + "'", str38, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "CacheMap:{}::{}" + "'", str54, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(collection74);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection5 = cacheMap4.values();
        cacheMap4.readLock();
        java.util.Collection collection7 = cacheMap4.values();
        boolean boolean8 = cacheMap0.pin((java.lang.Object) collection7);
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap();
        cacheMap9.setCacheSize((int) (byte) 10);
        java.lang.String str12 = cacheMap9.toString();
        boolean boolean13 = cacheMap9.isEmpty();
        boolean boolean14 = cacheMap9.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        cacheMap15.setCacheSize((int) (byte) 10);
        cacheMap9.putAll((java.util.Map) cacheMap15, false);
        cacheMap15.clear();
        cacheMap15.readLock();
        java.lang.Object obj22 = cacheMap0.remove((java.lang.Object) cacheMap15);
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap();
        cacheMap23.setCacheSize((int) (byte) 10);
        java.lang.String str26 = cacheMap23.toString();
        boolean boolean27 = cacheMap23.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap30 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection31 = cacheMap30.values();
        java.lang.Object obj32 = cacheMap23.put((java.lang.Object) 100L, (java.lang.Object) collection31);
        java.lang.String str33 = cacheMap23.toString();
        int int34 = cacheMap23.getSoftReferenceSize();
        boolean boolean35 = cacheMap23.isEmpty();
        java.util.Set set36 = cacheMap23.keySet();
        boolean boolean37 = cacheMap0.unpin((java.lang.Object) set36);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CacheMap:{}::{}" + "'", str12, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "CacheMap:{}::{}" + "'", str26, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "CacheMap:{100=[]}::{}" + "'", str33, "CacheMap:{100=[]}::{}");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        cacheMap8.setCacheSize((int) (byte) 10);
        boolean boolean12 = cacheMap8.pin((java.lang.Object) 1);
        cacheMap3.putAll((java.util.Map) cacheMap8, true);
        int int15 = cacheMap3.getSoftReferenceSize();
        java.lang.Object obj17 = cacheMap3.remove((java.lang.Object) (-1.0d));
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean22 = cacheMap20.containsValue((java.lang.Object) '4');
        java.util.Set set23 = cacheMap20.keySet();
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap();
        boolean boolean25 = cacheMap24.isEmpty();
        java.lang.Object obj27 = cacheMap24.remove((java.lang.Object) 1);
        java.lang.Object obj28 = cacheMap20.remove((java.lang.Object) 1);
        java.util.Collection collection29 = cacheMap20.values();
        java.lang.Object obj30 = cacheMap3.get((java.lang.Object) cacheMap20);
        cacheMap20.clear();
        int int32 = cacheMap20.size();
        cacheMap20.setSoftReferenceSize(1000);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        int int5 = cacheMap0.getCacheSize();
        java.lang.Class<?> wildcardClass6 = cacheMap0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, (int) 'a', 1, (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        cacheMap0.setCacheSize((int) '4');
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection5 = cacheMap4.values();
        cacheMap4.readLock();
        java.util.Collection collection7 = cacheMap4.values();
        boolean boolean8 = cacheMap0.pin((java.lang.Object) collection7);
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap();
        cacheMap9.setCacheSize((int) (byte) 10);
        java.lang.String str12 = cacheMap9.toString();
        boolean boolean13 = cacheMap9.isEmpty();
        boolean boolean14 = cacheMap9.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        cacheMap15.setCacheSize((int) (byte) 10);
        cacheMap9.putAll((java.util.Map) cacheMap15, false);
        cacheMap15.clear();
        cacheMap15.readLock();
        java.lang.Object obj22 = cacheMap0.remove((java.lang.Object) cacheMap15);
        java.util.Collection collection23 = cacheMap0.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CacheMap:{}::{}" + "'", str12, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        java.util.Set set8 = cacheMap3.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean13 = cacheMap11.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        cacheMap14.setCacheSize(10);
        java.util.Set set17 = cacheMap14.entrySet();
        boolean boolean18 = cacheMap14.isLRU();
        int int19 = cacheMap14.getCacheSize();
        java.lang.Object obj20 = cacheMap3.put((java.lang.Object) boolean13, (java.lang.Object) cacheMap14);
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap();
        cacheMap21.setCacheSize(10);
        java.util.Set set24 = cacheMap21.entrySet();
        int int25 = cacheMap21.size();
        cacheMap21.setCacheSize((int) '4');
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap(true);
        int int30 = cacheMap29.getCacheSize();
        java.lang.Object obj31 = cacheMap21.remove((java.lang.Object) cacheMap29);
        org.apache.openjpa.util.CacheMap cacheMap34 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap34.setCacheSize((int) '4');
        boolean boolean38 = cacheMap34.containsValue((java.lang.Object) 100);
        org.apache.openjpa.util.CacheMap cacheMap39 = new org.apache.openjpa.util.CacheMap();
        cacheMap39.setCacheSize(10);
        java.lang.Object obj43 = cacheMap39.get((java.lang.Object) 100L);
        java.lang.Object obj44 = cacheMap34.remove((java.lang.Object) cacheMap39);
        org.apache.openjpa.util.CacheMap cacheMap45 = new org.apache.openjpa.util.CacheMap();
        cacheMap45.setCacheSize(10);
        java.util.Set set48 = cacheMap45.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap50 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection51 = cacheMap50.values();
        cacheMap50.readLock();
        java.lang.Object obj53 = cacheMap45.remove((java.lang.Object) cacheMap50);
        org.apache.openjpa.util.CacheMap cacheMap54 = new org.apache.openjpa.util.CacheMap();
        cacheMap54.setCacheSize(10);
        boolean boolean57 = cacheMap54.isEmpty();
        cacheMap54.writeLock();
        cacheMap50.putAll((java.util.Map) cacheMap54);
        cacheMap39.putAll((java.util.Map) cacheMap50);
        int int61 = cacheMap50.size();
        java.lang.Object obj62 = cacheMap21.remove((java.lang.Object) cacheMap50);
        cacheMap14.putAll((java.util.Map) cacheMap21, true);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1000 + "'", int30 == 1000);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(obj62);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection2 = cacheMap1.values();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection5 = cacheMap4.values();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        java.lang.String str9 = cacheMap6.toString();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        boolean boolean11 = cacheMap10.isEmpty();
        cacheMap6.putAll((java.util.Map) cacheMap10, true);
        boolean boolean14 = cacheMap4.containsKey((java.lang.Object) true);
        java.util.Collection collection15 = cacheMap4.values();
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean20 = cacheMap18.containsValue((java.lang.Object) '4');
        boolean boolean21 = cacheMap4.containsKey((java.lang.Object) boolean20);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        cacheMap22.setCacheSize((int) (byte) 10);
        java.lang.String str25 = cacheMap22.toString();
        boolean boolean26 = cacheMap22.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection30 = cacheMap29.values();
        java.lang.Object obj31 = cacheMap22.put((java.lang.Object) 100L, (java.lang.Object) collection30);
        cacheMap22.readLock();
        java.util.Collection collection33 = cacheMap22.values();
        cacheMap22.readLock();
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap();
        boolean boolean36 = cacheMap35.isEmpty();
        java.lang.Object obj38 = cacheMap35.remove((java.lang.Object) 1);
        java.util.Set set39 = cacheMap35.keySet();
        java.lang.Object obj40 = cacheMap4.put((java.lang.Object) cacheMap22, (java.lang.Object) set39);
        cacheMap4.writeLock();
        boolean boolean42 = cacheMap1.pin((java.lang.Object) cacheMap4);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "CacheMap:{}::{}" + "'", str25, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Collection collection1 = cacheMap0.values();
        org.junit.Assert.assertNotNull(collection1);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        cacheMap0.setCacheSize((int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        cacheMap8.setCacheSize((int) (byte) 10);
        boolean boolean12 = cacheMap8.pin((java.lang.Object) 1);
        cacheMap3.putAll((java.util.Map) cacheMap8, true);
        int int15 = cacheMap3.getSoftReferenceSize();
        java.lang.Object obj17 = cacheMap3.remove((java.lang.Object) (-1.0d));
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection20 = cacheMap19.values();
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap();
        cacheMap21.setCacheSize((int) (byte) 10);
        java.lang.String str24 = cacheMap21.toString();
        org.apache.openjpa.util.CacheMap cacheMap25 = new org.apache.openjpa.util.CacheMap();
        boolean boolean26 = cacheMap25.isEmpty();
        cacheMap21.putAll((java.util.Map) cacheMap25, true);
        boolean boolean29 = cacheMap19.containsKey((java.lang.Object) true);
        java.util.Collection collection30 = cacheMap19.values();
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean35 = cacheMap33.containsValue((java.lang.Object) '4');
        boolean boolean36 = cacheMap19.containsKey((java.lang.Object) boolean35);
        org.apache.openjpa.util.CacheMap cacheMap37 = new org.apache.openjpa.util.CacheMap();
        cacheMap37.setCacheSize((int) (byte) 10);
        java.lang.String str40 = cacheMap37.toString();
        boolean boolean41 = cacheMap37.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap44 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection45 = cacheMap44.values();
        java.lang.Object obj46 = cacheMap37.put((java.lang.Object) 100L, (java.lang.Object) collection45);
        cacheMap37.readLock();
        java.util.Collection collection48 = cacheMap37.values();
        cacheMap37.readLock();
        org.apache.openjpa.util.CacheMap cacheMap50 = new org.apache.openjpa.util.CacheMap();
        boolean boolean51 = cacheMap50.isEmpty();
        java.lang.Object obj53 = cacheMap50.remove((java.lang.Object) 1);
        java.util.Set set54 = cacheMap50.keySet();
        java.lang.Object obj55 = cacheMap19.put((java.lang.Object) cacheMap37, (java.lang.Object) set54);
        cacheMap19.clear();
        java.lang.Object obj57 = cacheMap3.remove((java.lang.Object) cacheMap19);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap19.writeUnlock();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "CacheMap:{}::{}" + "'", str24, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "CacheMap:{}::{}" + "'", str40, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        cacheMap0.putAll((java.util.Map) cacheMap4, true);
        java.util.Collection collection8 = cacheMap0.values();
        boolean boolean9 = cacheMap0.isLRU();
        boolean boolean10 = cacheMap0.isLRU();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        java.lang.Object obj6 = cacheMap0.remove((java.lang.Object) cacheMap4);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        boolean boolean9 = cacheMap8.isEmpty();
        java.util.Set set10 = cacheMap8.entrySet();
        int int11 = cacheMap8.getCacheSize();
        java.lang.Object obj12 = cacheMap4.put((java.lang.Object) false, (java.lang.Object) int11);
        boolean boolean13 = cacheMap4.isEmpty();
        java.util.Set set14 = cacheMap4.getPinnedKeys();
        int int15 = cacheMap4.size();
        java.lang.Class<?> wildcardClass16 = cacheMap4.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        cacheMap3.setCacheSize(10);
        java.util.Set set6 = cacheMap3.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection9 = cacheMap8.values();
        cacheMap8.readLock();
        java.lang.Object obj11 = cacheMap3.remove((java.lang.Object) cacheMap8);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = cacheMap16.pin(obj17);
        boolean boolean19 = cacheMap16.isLRU();
        cacheMap13.putAll((java.util.Map) cacheMap16, false);
        cacheMap8.putAll((java.util.Map) cacheMap13);
        int int23 = cacheMap13.getCacheSize();
        java.util.Set set24 = cacheMap13.keySet();
        boolean boolean25 = cacheMap0.pin((java.lang.Object) cacheMap13);
        boolean boolean26 = cacheMap13.isLRU();
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1000 + "'", int23 == 1000);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.lang.Object obj3 = cacheMap0.remove((java.lang.Object) 1);
        java.util.Set set4 = cacheMap0.keySet();
        cacheMap0.readLock();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection6 = cacheMap5.values();
        cacheMap5.readLock();
        java.lang.Object obj8 = cacheMap0.remove((java.lang.Object) cacheMap5);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj14 = new java.lang.Object();
        boolean boolean15 = cacheMap13.pin(obj14);
        boolean boolean16 = cacheMap13.isLRU();
        cacheMap10.putAll((java.util.Map) cacheMap13, false);
        cacheMap5.putAll((java.util.Map) cacheMap10);
        int int20 = cacheMap10.getCacheSize();
        java.util.Set set21 = cacheMap10.keySet();
        cacheMap10.clear();
        boolean boolean23 = cacheMap10.isEmpty();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1000 + "'", int20 == 1000);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        int int1 = cacheMap0.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection4 = cacheMap3.values();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        cacheMap5.setCacheSize((int) (byte) 10);
        java.lang.String str8 = cacheMap5.toString();
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap();
        boolean boolean10 = cacheMap9.isEmpty();
        cacheMap5.putAll((java.util.Map) cacheMap9, true);
        boolean boolean13 = cacheMap3.containsKey((java.lang.Object) true);
        java.util.Collection collection14 = cacheMap3.values();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean19 = cacheMap17.containsValue((java.lang.Object) '4');
        boolean boolean20 = cacheMap3.containsKey((java.lang.Object) boolean19);
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap();
        cacheMap21.setCacheSize((int) (byte) 10);
        java.lang.String str24 = cacheMap21.toString();
        boolean boolean25 = cacheMap21.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap28 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection29 = cacheMap28.values();
        java.lang.Object obj30 = cacheMap21.put((java.lang.Object) 100L, (java.lang.Object) collection29);
        cacheMap21.readLock();
        java.util.Collection collection32 = cacheMap21.values();
        cacheMap21.readLock();
        org.apache.openjpa.util.CacheMap cacheMap34 = new org.apache.openjpa.util.CacheMap();
        boolean boolean35 = cacheMap34.isEmpty();
        java.lang.Object obj37 = cacheMap34.remove((java.lang.Object) 1);
        java.util.Set set38 = cacheMap34.keySet();
        java.lang.Object obj39 = cacheMap3.put((java.lang.Object) cacheMap21, (java.lang.Object) set38);
        boolean boolean40 = cacheMap0.pin((java.lang.Object) set38);
        cacheMap0.readLock();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "CacheMap:{}::{}" + "'", str24, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        int int4 = cacheMap0.size();
        cacheMap0.setCacheSize((int) (byte) -1);
        java.util.Set set7 = cacheMap0.getPinnedKeys();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, 32);
        java.lang.String str3 = cacheMap2.toString();
        cacheMap2.setSoftReferenceSize((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, 10);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set4 = cacheMap3.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        cacheMap5.setCacheSize((int) (byte) 10);
        java.lang.String str8 = cacheMap5.toString();
        boolean boolean9 = cacheMap5.isEmpty();
        cacheMap3.putAll((java.util.Map) cacheMap5, true);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection14 = cacheMap13.values();
        cacheMap13.readLock();
        java.util.Collection collection16 = cacheMap13.values();
        java.lang.Object obj17 = cacheMap5.remove((java.lang.Object) collection16);
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap();
        cacheMap18.setCacheSize(10);
        java.lang.Object obj22 = cacheMap18.get((java.lang.Object) 100L);
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap();
        cacheMap23.setCacheSize((int) (byte) 10);
        java.lang.String str26 = cacheMap23.toString();
        cacheMap18.putAll((java.util.Map) cacheMap23, false);
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap();
        cacheMap29.setCacheSize(10);
        java.util.Set set32 = cacheMap29.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap34 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection35 = cacheMap34.values();
        cacheMap34.readLock();
        java.lang.Object obj37 = cacheMap29.remove((java.lang.Object) cacheMap34);
        org.apache.openjpa.util.CacheMap cacheMap38 = new org.apache.openjpa.util.CacheMap();
        cacheMap38.setCacheSize(10);
        boolean boolean41 = cacheMap38.isEmpty();
        cacheMap38.writeLock();
        cacheMap34.putAll((java.util.Map) cacheMap38);
        org.apache.openjpa.util.CacheMap cacheMap46 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean48 = cacheMap46.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap50 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection51 = cacheMap50.values();
        org.apache.openjpa.util.CacheMap cacheMap52 = new org.apache.openjpa.util.CacheMap();
        cacheMap52.setCacheSize((int) (byte) 10);
        java.lang.String str55 = cacheMap52.toString();
        org.apache.openjpa.util.CacheMap cacheMap56 = new org.apache.openjpa.util.CacheMap();
        boolean boolean57 = cacheMap56.isEmpty();
        cacheMap52.putAll((java.util.Map) cacheMap56, true);
        boolean boolean60 = cacheMap50.containsKey((java.lang.Object) true);
        java.util.Collection collection61 = cacheMap50.values();
        org.apache.openjpa.util.CacheMap cacheMap64 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean66 = cacheMap64.containsValue((java.lang.Object) '4');
        boolean boolean67 = cacheMap50.containsKey((java.lang.Object) boolean66);
        boolean boolean68 = cacheMap46.pin((java.lang.Object) boolean67);
        cacheMap38.putAll((java.util.Map) cacheMap46, false);
        boolean boolean71 = cacheMap23.pin((java.lang.Object) cacheMap38);
        java.lang.String str72 = cacheMap23.toString();
        cacheMap5.putAll((java.util.Map) cacheMap23);
        org.apache.openjpa.util.CacheMap cacheMap74 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj76 = cacheMap74.remove((java.lang.Object) (short) 1);
        int int77 = cacheMap74.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap78 = new org.apache.openjpa.util.CacheMap();
        cacheMap78.setCacheSize((int) (byte) 10);
        java.lang.String str81 = cacheMap78.toString();
        boolean boolean82 = cacheMap78.isEmpty();
        boolean boolean83 = cacheMap78.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap84 = new org.apache.openjpa.util.CacheMap();
        cacheMap84.setCacheSize((int) (byte) 10);
        cacheMap78.putAll((java.util.Map) cacheMap84, false);
        boolean boolean89 = cacheMap74.containsKey((java.lang.Object) cacheMap84);
        cacheMap5.putAll((java.util.Map) cacheMap84, false);
        boolean boolean92 = cacheMap2.unpin((java.lang.Object) false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "CacheMap:{}::{}" + "'", str26, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "CacheMap:{}::{}" + "'", str55, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "CacheMap:{}::{}" + "'", str72, "CacheMap:{}::{}");
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "CacheMap:{}::{}" + "'", str81, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection2 = cacheMap1.values();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        cacheMap3.setCacheSize((int) (byte) 10);
        java.lang.String str6 = cacheMap3.toString();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        boolean boolean8 = cacheMap7.isEmpty();
        cacheMap3.putAll((java.util.Map) cacheMap7, true);
        boolean boolean11 = cacheMap1.containsKey((java.lang.Object) true);
        java.util.Collection collection12 = cacheMap1.values();
        int int13 = cacheMap1.size();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj16 = cacheMap14.remove((java.lang.Object) (short) 1);
        int int17 = cacheMap14.getSoftReferenceSize();
        cacheMap14.clear();
        boolean boolean19 = cacheMap1.containsKey((java.lang.Object) cacheMap14);
        cacheMap14.setCacheSize((int) (byte) 10);
        cacheMap14.clear();
        int int23 = cacheMap14.getSoftReferenceSize();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, 10);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        cacheMap3.setCacheSize((int) (byte) 10);
        java.lang.String str6 = cacheMap3.toString();
        boolean boolean7 = cacheMap3.isEmpty();
        boolean boolean8 = cacheMap3.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap();
        cacheMap9.setCacheSize((int) (byte) 10);
        cacheMap3.putAll((java.util.Map) cacheMap9, false);
        boolean boolean15 = cacheMap3.unpin((java.lang.Object) 1);
        java.lang.String str16 = cacheMap3.toString();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        cacheMap17.setCacheSize((int) (byte) 10);
        java.lang.String str20 = cacheMap17.toString();
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap();
        boolean boolean22 = cacheMap21.isEmpty();
        cacheMap17.putAll((java.util.Map) cacheMap21, true);
        boolean boolean25 = cacheMap3.containsValue((java.lang.Object) cacheMap21);
        org.apache.openjpa.util.CacheMap cacheMap28 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean30 = cacheMap28.containsValue((java.lang.Object) '4');
        java.util.Set set31 = cacheMap28.keySet();
        java.util.Set set32 = cacheMap28.getPinnedKeys();
        cacheMap28.clear();
        java.lang.Object obj34 = cacheMap21.get((java.lang.Object) cacheMap28);
        boolean boolean35 = cacheMap2.unpin(obj34);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CacheMap:{}::{}" + "'", str16, "CacheMap:{}::{}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CacheMap:{}::{}" + "'", str20, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        boolean boolean5 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap();
        cacheMap9.setCacheSize((int) (byte) 10);
        java.lang.String str12 = cacheMap9.toString();
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap();
        boolean boolean14 = cacheMap13.isEmpty();
        cacheMap9.putAll((java.util.Map) cacheMap13, true);
        boolean boolean17 = cacheMap7.containsKey((java.lang.Object) true);
        boolean boolean18 = cacheMap0.unpin((java.lang.Object) boolean17);
        java.util.Set set19 = cacheMap0.entrySet();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CacheMap:{}::{}" + "'", str12, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean4 = cacheMap2.containsValue((java.lang.Object) '4');
        java.util.Set set5 = cacheMap2.keySet();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        boolean boolean7 = cacheMap6.isEmpty();
        java.lang.Object obj9 = cacheMap6.remove((java.lang.Object) 1);
        java.lang.Object obj10 = cacheMap2.remove((java.lang.Object) 1);
        java.util.Collection collection11 = cacheMap2.values();
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection14 = cacheMap13.values();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        cacheMap15.setCacheSize((int) (byte) 10);
        java.lang.String str18 = cacheMap15.toString();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap();
        boolean boolean20 = cacheMap19.isEmpty();
        cacheMap15.putAll((java.util.Map) cacheMap19, true);
        boolean boolean23 = cacheMap13.containsKey((java.lang.Object) true);
        java.util.Collection collection24 = cacheMap13.values();
        int int25 = cacheMap13.size();
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj28 = cacheMap26.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj31 = cacheMap29.remove((java.lang.Object) (short) 1);
        cacheMap26.putAll((java.util.Map) cacheMap29, false);
        org.apache.openjpa.util.CacheMap cacheMap34 = new org.apache.openjpa.util.CacheMap();
        cacheMap34.setCacheSize((int) (byte) 10);
        boolean boolean38 = cacheMap34.pin((java.lang.Object) 1);
        cacheMap29.putAll((java.util.Map) cacheMap34, true);
        int int41 = cacheMap29.getSoftReferenceSize();
        boolean boolean42 = cacheMap13.unpin((java.lang.Object) cacheMap29);
        org.apache.openjpa.util.CacheMap cacheMap43 = new org.apache.openjpa.util.CacheMap();
        boolean boolean44 = cacheMap43.isEmpty();
        boolean boolean45 = cacheMap29.containsValue((java.lang.Object) cacheMap43);
        boolean boolean46 = cacheMap2.unpin((java.lang.Object) cacheMap29);
        org.apache.openjpa.util.CacheMap cacheMap47 = new org.apache.openjpa.util.CacheMap();
        cacheMap47.setCacheSize(10);
        java.lang.Object obj51 = cacheMap47.get((java.lang.Object) 100L);
        int int52 = cacheMap47.getCacheSize();
        org.apache.openjpa.util.CacheMap cacheMap54 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection55 = cacheMap54.values();
        org.apache.openjpa.util.CacheMap cacheMap56 = new org.apache.openjpa.util.CacheMap();
        cacheMap56.setCacheSize((int) (byte) 10);
        java.lang.String str59 = cacheMap56.toString();
        org.apache.openjpa.util.CacheMap cacheMap60 = new org.apache.openjpa.util.CacheMap();
        boolean boolean61 = cacheMap60.isEmpty();
        cacheMap56.putAll((java.util.Map) cacheMap60, true);
        boolean boolean64 = cacheMap54.containsKey((java.lang.Object) true);
        java.util.Collection collection65 = cacheMap54.values();
        int int66 = cacheMap54.size();
        org.apache.openjpa.util.CacheMap cacheMap67 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj69 = cacheMap67.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap70 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj72 = cacheMap70.remove((java.lang.Object) (short) 1);
        cacheMap67.putAll((java.util.Map) cacheMap70, false);
        org.apache.openjpa.util.CacheMap cacheMap75 = new org.apache.openjpa.util.CacheMap();
        cacheMap75.setCacheSize((int) (byte) 10);
        boolean boolean79 = cacheMap75.pin((java.lang.Object) 1);
        cacheMap70.putAll((java.util.Map) cacheMap75, true);
        int int82 = cacheMap70.getSoftReferenceSize();
        boolean boolean83 = cacheMap54.unpin((java.lang.Object) cacheMap70);
        cacheMap47.putAll((java.util.Map) cacheMap70);
        java.lang.Object obj85 = cacheMap2.get((java.lang.Object) cacheMap70);
        cacheMap2.setSoftReferenceSize(1000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CacheMap:{}::{}" + "'", str18, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "CacheMap:{}::{}" + "'", str59, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(obj85);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        java.lang.String str10 = cacheMap0.toString();
        int int11 = cacheMap0.getSoftReferenceSize();
        boolean boolean12 = cacheMap0.isEmpty();
        java.util.Set set13 = cacheMap0.keySet();
        cacheMap0.readLock();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CacheMap:{100=[]}::{}" + "'", str10, "CacheMap:{100=[]}::{}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap();
        cacheMap2.setCacheSize((int) (byte) 10);
        java.lang.String str5 = cacheMap2.toString();
        boolean boolean6 = cacheMap2.isEmpty();
        cacheMap0.putAll((java.util.Map) cacheMap2, true);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection11 = cacheMap10.values();
        cacheMap10.readLock();
        java.util.Collection collection13 = cacheMap10.values();
        java.lang.Object obj14 = cacheMap2.remove((java.lang.Object) collection13);
        java.util.Set set15 = cacheMap2.keySet();
        cacheMap2.clear();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CacheMap:{}::{}" + "'", str5, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.util.Set set2 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection5 = cacheMap4.values();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        java.lang.String str9 = cacheMap6.toString();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        boolean boolean11 = cacheMap10.isEmpty();
        java.lang.Object obj12 = cacheMap6.remove((java.lang.Object) cacheMap10);
        java.lang.Object obj13 = cacheMap0.put((java.lang.Object) cacheMap4, obj12);
        org.apache.openjpa.util.CacheMap cacheMap16 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = cacheMap16.pin(obj17);
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap();
        cacheMap19.setCacheSize(10);
        java.util.Set set22 = cacheMap19.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection25 = cacheMap24.values();
        cacheMap24.readLock();
        java.lang.Object obj27 = cacheMap19.remove((java.lang.Object) cacheMap24);
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap32 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj33 = new java.lang.Object();
        boolean boolean34 = cacheMap32.pin(obj33);
        boolean boolean35 = cacheMap32.isLRU();
        cacheMap29.putAll((java.util.Map) cacheMap32, false);
        cacheMap24.putAll((java.util.Map) cacheMap29);
        int int39 = cacheMap29.getCacheSize();
        java.util.Set set40 = cacheMap29.keySet();
        org.apache.openjpa.util.CacheMap cacheMap41 = new org.apache.openjpa.util.CacheMap();
        boolean boolean42 = cacheMap41.isEmpty();
        java.util.Set set43 = cacheMap41.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap45 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection46 = cacheMap45.values();
        org.apache.openjpa.util.CacheMap cacheMap47 = new org.apache.openjpa.util.CacheMap();
        cacheMap47.setCacheSize((int) (byte) 10);
        java.lang.String str50 = cacheMap47.toString();
        org.apache.openjpa.util.CacheMap cacheMap51 = new org.apache.openjpa.util.CacheMap();
        boolean boolean52 = cacheMap51.isEmpty();
        java.lang.Object obj53 = cacheMap47.remove((java.lang.Object) cacheMap51);
        java.lang.Object obj54 = cacheMap41.put((java.lang.Object) cacheMap45, obj53);
        java.lang.Object obj55 = cacheMap16.put((java.lang.Object) set40, (java.lang.Object) cacheMap45);
        int int56 = cacheMap16.getSoftReferenceSize();
        boolean boolean57 = cacheMap4.pin((java.lang.Object) cacheMap16);
        int int58 = cacheMap4.getCacheSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1000 + "'", int39 == 1000);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "CacheMap:{}::{}" + "'", str50, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1000 + "'", int58 == 1000);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        boolean boolean4 = cacheMap0.pin((java.lang.Object) 1);
        java.util.Collection collection5 = cacheMap0.values();
        boolean boolean6 = cacheMap0.isLRU();
        java.util.Set set7 = cacheMap0.getPinnedKeys();
        boolean boolean9 = cacheMap0.unpin((java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        cacheMap10.setCacheSize((int) (byte) 10);
        java.lang.String str13 = cacheMap10.toString();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        boolean boolean15 = cacheMap14.isEmpty();
        cacheMap10.putAll((java.util.Map) cacheMap14, true);
        boolean boolean18 = cacheMap10.isLRU();
        java.lang.Object obj19 = cacheMap0.get((java.lang.Object) cacheMap10);
        java.util.Set set20 = cacheMap0.entrySet();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CacheMap:{}::{}" + "'", str13, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        boolean boolean4 = cacheMap0.pin((java.lang.Object) 1);
        cacheMap0.readLock();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (byte) 100);
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection5 = cacheMap4.values();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        java.lang.String str9 = cacheMap6.toString();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        boolean boolean11 = cacheMap10.isEmpty();
        cacheMap6.putAll((java.util.Map) cacheMap10, true);
        boolean boolean14 = cacheMap4.containsKey((java.lang.Object) true);
        java.util.Collection collection15 = cacheMap4.values();
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean20 = cacheMap18.containsValue((java.lang.Object) '4');
        boolean boolean21 = cacheMap4.containsKey((java.lang.Object) boolean20);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        cacheMap22.setCacheSize((int) (byte) 10);
        java.lang.String str25 = cacheMap22.toString();
        boolean boolean26 = cacheMap22.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection30 = cacheMap29.values();
        java.lang.Object obj31 = cacheMap22.put((java.lang.Object) 100L, (java.lang.Object) collection30);
        cacheMap22.readLock();
        java.util.Collection collection33 = cacheMap22.values();
        cacheMap22.readLock();
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap();
        boolean boolean36 = cacheMap35.isEmpty();
        java.lang.Object obj38 = cacheMap35.remove((java.lang.Object) 1);
        java.util.Set set39 = cacheMap35.keySet();
        java.lang.Object obj40 = cacheMap4.put((java.lang.Object) cacheMap22, (java.lang.Object) set39);
        cacheMap4.writeLock();
        cacheMap2.putAll((java.util.Map) cacheMap4, true);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap4.writeUnlock();
// flaky "2) test338(org.apache.openjpa.generated.cm.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "CacheMap:{}::{}" + "'", str25, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        java.util.Set set5 = cacheMap0.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        java.lang.String str9 = cacheMap6.toString();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        boolean boolean11 = cacheMap10.isEmpty();
        cacheMap6.putAll((java.util.Map) cacheMap10, true);
        boolean boolean14 = cacheMap6.isLRU();
        java.lang.String str15 = cacheMap6.toString();
        java.lang.Object obj16 = cacheMap0.get((java.lang.Object) str15);
        boolean boolean17 = cacheMap0.isLRU();
        boolean boolean18 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap();
        cacheMap19.setCacheSize(10);
        java.util.Set set22 = cacheMap19.entrySet();
        java.lang.Object obj23 = cacheMap0.get((java.lang.Object) set22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CacheMap:{}::{}" + "'", str15, "CacheMap:{}::{}");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap();
        cacheMap2.setCacheSize((int) (byte) 10);
        java.lang.String str5 = cacheMap2.toString();
        boolean boolean6 = cacheMap2.isEmpty();
        cacheMap0.putAll((java.util.Map) cacheMap2, true);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection11 = cacheMap10.values();
        cacheMap10.readLock();
        java.util.Collection collection13 = cacheMap10.values();
        java.lang.Object obj14 = cacheMap2.remove((java.lang.Object) collection13);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        cacheMap15.setCacheSize(10);
        java.lang.Object obj19 = cacheMap15.get((java.lang.Object) 100L);
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap();
        cacheMap20.setCacheSize((int) (byte) 10);
        java.lang.String str23 = cacheMap20.toString();
        cacheMap15.putAll((java.util.Map) cacheMap20, false);
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap();
        cacheMap26.setCacheSize(10);
        java.util.Set set29 = cacheMap26.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection32 = cacheMap31.values();
        cacheMap31.readLock();
        java.lang.Object obj34 = cacheMap26.remove((java.lang.Object) cacheMap31);
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap();
        cacheMap35.setCacheSize(10);
        boolean boolean38 = cacheMap35.isEmpty();
        cacheMap35.writeLock();
        cacheMap31.putAll((java.util.Map) cacheMap35);
        org.apache.openjpa.util.CacheMap cacheMap43 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean45 = cacheMap43.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap47 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection48 = cacheMap47.values();
        org.apache.openjpa.util.CacheMap cacheMap49 = new org.apache.openjpa.util.CacheMap();
        cacheMap49.setCacheSize((int) (byte) 10);
        java.lang.String str52 = cacheMap49.toString();
        org.apache.openjpa.util.CacheMap cacheMap53 = new org.apache.openjpa.util.CacheMap();
        boolean boolean54 = cacheMap53.isEmpty();
        cacheMap49.putAll((java.util.Map) cacheMap53, true);
        boolean boolean57 = cacheMap47.containsKey((java.lang.Object) true);
        java.util.Collection collection58 = cacheMap47.values();
        org.apache.openjpa.util.CacheMap cacheMap61 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean63 = cacheMap61.containsValue((java.lang.Object) '4');
        boolean boolean64 = cacheMap47.containsKey((java.lang.Object) boolean63);
        boolean boolean65 = cacheMap43.pin((java.lang.Object) boolean64);
        cacheMap35.putAll((java.util.Map) cacheMap43, false);
        boolean boolean68 = cacheMap20.pin((java.lang.Object) cacheMap35);
        java.lang.String str69 = cacheMap20.toString();
        cacheMap2.putAll((java.util.Map) cacheMap20);
        org.apache.openjpa.util.CacheMap cacheMap71 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj73 = cacheMap71.remove((java.lang.Object) (short) 1);
        int int74 = cacheMap71.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap75 = new org.apache.openjpa.util.CacheMap();
        cacheMap75.setCacheSize((int) (byte) 10);
        java.lang.String str78 = cacheMap75.toString();
        boolean boolean79 = cacheMap75.isEmpty();
        boolean boolean80 = cacheMap75.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap81 = new org.apache.openjpa.util.CacheMap();
        cacheMap81.setCacheSize((int) (byte) 10);
        cacheMap75.putAll((java.util.Map) cacheMap81, false);
        boolean boolean86 = cacheMap71.containsKey((java.lang.Object) cacheMap81);
        cacheMap2.putAll((java.util.Map) cacheMap81, false);
        org.apache.openjpa.util.CacheMap cacheMap91 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap91.setCacheSize((int) '4');
        boolean boolean95 = cacheMap91.containsValue((java.lang.Object) 100);
        cacheMap91.setCacheSize((int) (short) 1);
        java.lang.String str98 = cacheMap91.toString();
        cacheMap2.putAll((java.util.Map) cacheMap91);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CacheMap:{}::{}" + "'", str5, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "CacheMap:{}::{}" + "'", str23, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "CacheMap:{}::{}" + "'", str52, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "CacheMap:{}::{}" + "'", str69, "CacheMap:{}::{}");
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "CacheMap:{}::{}" + "'", str78, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "CacheMap:{}::{}" + "'", str98, "CacheMap:{}::{}");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        boolean boolean4 = cacheMap0.pin((java.lang.Object) 1);
        java.util.Collection collection5 = cacheMap0.values();
        java.lang.String str6 = cacheMap0.toString();
        boolean boolean7 = cacheMap0.isEmpty();
        java.util.Collection collection8 = cacheMap0.values();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        cacheMap8.setCacheSize((int) (byte) 10);
        boolean boolean12 = cacheMap8.pin((java.lang.Object) 1);
        cacheMap3.putAll((java.util.Map) cacheMap8, true);
        int int15 = cacheMap3.getSoftReferenceSize();
        java.lang.Object obj17 = cacheMap3.remove((java.lang.Object) (-1.0d));
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean22 = cacheMap20.containsValue((java.lang.Object) '4');
        java.util.Set set23 = cacheMap20.keySet();
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap();
        boolean boolean25 = cacheMap24.isEmpty();
        java.lang.Object obj27 = cacheMap24.remove((java.lang.Object) 1);
        java.lang.Object obj28 = cacheMap20.remove((java.lang.Object) 1);
        java.util.Collection collection29 = cacheMap20.values();
        java.lang.Object obj30 = cacheMap3.get((java.lang.Object) cacheMap20);
        int int31 = cacheMap20.getCacheSize();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        java.lang.Object obj6 = cacheMap0.remove((java.lang.Object) cacheMap4);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        boolean boolean9 = cacheMap8.isEmpty();
        java.util.Set set10 = cacheMap8.entrySet();
        int int11 = cacheMap8.getCacheSize();
        java.lang.Object obj12 = cacheMap4.put((java.lang.Object) false, (java.lang.Object) int11);
        cacheMap4.setSoftReferenceSize((int) (short) 10);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        cacheMap15.setCacheSize(10);
        java.util.Set set18 = cacheMap15.entrySet();
        int int19 = cacheMap15.size();
        cacheMap15.setCacheSize((int) (short) 100);
        java.util.Collection collection22 = cacheMap15.values();
        java.util.Collection collection23 = cacheMap15.values();
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj26 = cacheMap24.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj29 = cacheMap27.remove((java.lang.Object) (short) 1);
        cacheMap24.putAll((java.util.Map) cacheMap27, false);
        org.apache.openjpa.util.CacheMap cacheMap34 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap34.setCacheSize((int) '4');
        boolean boolean38 = cacheMap34.containsValue((java.lang.Object) 100);
        org.apache.openjpa.util.CacheMap cacheMap39 = new org.apache.openjpa.util.CacheMap();
        cacheMap39.setCacheSize(10);
        java.lang.Object obj43 = cacheMap39.get((java.lang.Object) 100L);
        java.lang.Object obj44 = cacheMap34.remove((java.lang.Object) cacheMap39);
        org.apache.openjpa.util.CacheMap cacheMap45 = new org.apache.openjpa.util.CacheMap();
        cacheMap45.setCacheSize(10);
        java.util.Set set48 = cacheMap45.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap50 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection51 = cacheMap50.values();
        cacheMap50.readLock();
        java.lang.Object obj53 = cacheMap45.remove((java.lang.Object) cacheMap50);
        org.apache.openjpa.util.CacheMap cacheMap54 = new org.apache.openjpa.util.CacheMap();
        cacheMap54.setCacheSize(10);
        boolean boolean57 = cacheMap54.isEmpty();
        cacheMap54.writeLock();
        cacheMap50.putAll((java.util.Map) cacheMap54);
        cacheMap39.putAll((java.util.Map) cacheMap50);
        boolean boolean61 = cacheMap27.containsValue((java.lang.Object) cacheMap39);
        boolean boolean62 = cacheMap15.unpin((java.lang.Object) cacheMap39);
        cacheMap4.putAll((java.util.Map) cacheMap15, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.lang.Object obj4 = cacheMap0.get((java.lang.Object) 100L);
        java.util.Set set5 = cacheMap0.keySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap2.setCacheSize((int) '4');
        boolean boolean6 = cacheMap2.containsValue((java.lang.Object) 100);
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        cacheMap7.setCacheSize(10);
        java.lang.Object obj11 = cacheMap7.get((java.lang.Object) 100L);
        java.lang.Object obj12 = cacheMap2.remove((java.lang.Object) cacheMap7);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap();
        cacheMap13.setCacheSize(10);
        java.util.Set set16 = cacheMap13.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection19 = cacheMap18.values();
        cacheMap18.readLock();
        java.lang.Object obj21 = cacheMap13.remove((java.lang.Object) cacheMap18);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        cacheMap22.setCacheSize(10);
        boolean boolean25 = cacheMap22.isEmpty();
        cacheMap22.writeLock();
        cacheMap18.putAll((java.util.Map) cacheMap22);
        cacheMap7.putAll((java.util.Map) cacheMap18);
        int int29 = cacheMap18.size();
        org.apache.openjpa.util.CacheMap cacheMap30 = new org.apache.openjpa.util.CacheMap();
        cacheMap30.setCacheSize((int) (byte) 10);
        java.lang.String str33 = cacheMap30.toString();
        org.apache.openjpa.util.CacheMap cacheMap34 = new org.apache.openjpa.util.CacheMap();
        boolean boolean35 = cacheMap34.isEmpty();
        cacheMap30.putAll((java.util.Map) cacheMap34, true);
        boolean boolean38 = cacheMap30.isLRU();
        cacheMap30.setSoftReferenceSize(10);
        org.apache.openjpa.util.CacheMap cacheMap41 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj43 = cacheMap41.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap44 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj46 = cacheMap44.remove((java.lang.Object) (short) 1);
        cacheMap41.putAll((java.util.Map) cacheMap44, false);
        cacheMap30.putAll((java.util.Map) cacheMap44);
        int int50 = cacheMap30.size();
        cacheMap30.clear();
        java.lang.Object obj52 = cacheMap18.get((java.lang.Object) cacheMap30);
        // The following exception was thrown during execution in test generation
        try {
            cacheMap18.readUnlock();
// flaky "3) test345(org.apache.openjpa.generated.cm.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: attempt to unlock read lock, not locked by current thread");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "CacheMap:{}::{}" + "'", str33, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.lang.Object obj4 = cacheMap0.get((java.lang.Object) 100L);
        java.lang.String str5 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj8 = cacheMap6.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj11 = cacheMap9.remove((java.lang.Object) (short) 1);
        cacheMap6.putAll((java.util.Map) cacheMap9, false);
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        cacheMap14.setCacheSize((int) (byte) 10);
        boolean boolean18 = cacheMap14.pin((java.lang.Object) 1);
        cacheMap9.putAll((java.util.Map) cacheMap14, true);
        int int21 = cacheMap9.getSoftReferenceSize();
        java.lang.Object obj23 = cacheMap9.remove((java.lang.Object) (-1.0d));
        java.util.Set set24 = cacheMap9.entrySet();
        java.lang.Object obj25 = cacheMap0.remove((java.lang.Object) cacheMap9);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CacheMap:{}::{}" + "'", str5, "CacheMap:{}::{}");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        int int3 = cacheMap0.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        cacheMap4.setCacheSize((int) (byte) 10);
        java.lang.String str7 = cacheMap4.toString();
        boolean boolean8 = cacheMap4.isEmpty();
        boolean boolean9 = cacheMap4.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        cacheMap10.setCacheSize((int) (byte) 10);
        cacheMap4.putAll((java.util.Map) cacheMap10, false);
        boolean boolean15 = cacheMap0.containsKey((java.lang.Object) cacheMap10);
        cacheMap0.setSoftReferenceSize((int) ' ');
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap();
        cacheMap18.setCacheSize((int) (byte) 10);
        java.lang.String str21 = cacheMap18.toString();
        boolean boolean22 = cacheMap18.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap25 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection26 = cacheMap25.values();
        java.lang.Object obj27 = cacheMap18.put((java.lang.Object) 100L, (java.lang.Object) collection26);
        cacheMap18.readLock();
        java.util.Collection collection29 = cacheMap18.values();
        org.apache.openjpa.util.CacheMap cacheMap30 = new org.apache.openjpa.util.CacheMap();
        cacheMap30.setCacheSize((int) (byte) 10);
        boolean boolean34 = cacheMap30.pin((java.lang.Object) 1);
        java.util.Collection collection35 = cacheMap30.values();
        boolean boolean36 = cacheMap30.isLRU();
        java.util.Set set37 = cacheMap30.getPinnedKeys();
        boolean boolean39 = cacheMap30.unpin((java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap40 = new org.apache.openjpa.util.CacheMap();
        cacheMap40.setCacheSize((int) (byte) 10);
        java.lang.String str43 = cacheMap40.toString();
        boolean boolean44 = cacheMap40.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap47 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection48 = cacheMap47.values();
        java.lang.Object obj49 = cacheMap40.put((java.lang.Object) 100L, (java.lang.Object) collection48);
        java.util.Set set50 = cacheMap40.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap52 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection53 = cacheMap52.values();
        cacheMap52.readLock();
        boolean boolean55 = cacheMap40.pin((java.lang.Object) cacheMap52);
        cacheMap30.putAll((java.util.Map) cacheMap40);
        boolean boolean57 = cacheMap18.containsKey((java.lang.Object) cacheMap40);
        cacheMap40.setSoftReferenceSize((int) (byte) -1);
        org.apache.openjpa.util.CacheMap cacheMap62 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap62.setCacheSize((int) '4');
        java.util.Set set65 = cacheMap62.getPinnedKeys();
        int int66 = cacheMap62.getSoftReferenceSize();
        java.lang.Object obj67 = cacheMap0.put((java.lang.Object) (byte) -1, (java.lang.Object) cacheMap62);
        org.apache.openjpa.util.CacheMap cacheMap68 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj70 = cacheMap68.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap71 = new org.apache.openjpa.util.CacheMap();
        cacheMap71.setCacheSize((int) (byte) 10);
        java.lang.String str74 = cacheMap71.toString();
        org.apache.openjpa.util.CacheMap cacheMap75 = new org.apache.openjpa.util.CacheMap();
        boolean boolean76 = cacheMap75.isEmpty();
        cacheMap71.putAll((java.util.Map) cacheMap75, true);
        boolean boolean79 = cacheMap71.isLRU();
        java.lang.Object obj80 = cacheMap68.get((java.lang.Object) boolean79);
        cacheMap68.setCacheSize((-1));
        boolean boolean83 = cacheMap62.unpin((java.lang.Object) cacheMap68);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CacheMap:{}::{}" + "'", str7, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CacheMap:{}::{}" + "'", str21, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "CacheMap:{}::{}" + "'", str43, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "CacheMap:{}::{}" + "'", str74, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        boolean boolean5 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        cacheMap0.putAll((java.util.Map) cacheMap6, false);
        boolean boolean12 = cacheMap0.unpin((java.lang.Object) 1);
        java.util.Set set13 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        cacheMap14.setCacheSize((int) (byte) 10);
        java.lang.String str17 = cacheMap14.toString();
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap();
        boolean boolean19 = cacheMap18.isEmpty();
        cacheMap14.putAll((java.util.Map) cacheMap18, true);
        java.util.Collection collection22 = cacheMap14.values();
        boolean boolean23 = cacheMap14.isLRU();
        java.lang.Object obj24 = cacheMap0.get((java.lang.Object) cacheMap14);
        java.lang.String str25 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection28 = cacheMap27.values();
        cacheMap27.readLock();
        java.util.Set set30 = cacheMap27.getPinnedKeys();
        java.util.Collection collection31 = cacheMap27.values();
        org.apache.openjpa.util.CacheMap cacheMap32 = new org.apache.openjpa.util.CacheMap();
        cacheMap32.setCacheSize((int) (byte) 10);
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap();
        cacheMap35.setCacheSize(10);
        java.util.Set set38 = cacheMap35.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap40 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection41 = cacheMap40.values();
        cacheMap40.readLock();
        java.lang.Object obj43 = cacheMap35.remove((java.lang.Object) cacheMap40);
        org.apache.openjpa.util.CacheMap cacheMap45 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap48 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj49 = new java.lang.Object();
        boolean boolean50 = cacheMap48.pin(obj49);
        boolean boolean51 = cacheMap48.isLRU();
        cacheMap45.putAll((java.util.Map) cacheMap48, false);
        cacheMap40.putAll((java.util.Map) cacheMap45);
        int int55 = cacheMap45.getCacheSize();
        java.util.Set set56 = cacheMap45.keySet();
        boolean boolean57 = cacheMap32.pin((java.lang.Object) cacheMap45);
        java.lang.Object obj58 = cacheMap27.get((java.lang.Object) cacheMap45);
        cacheMap0.putAll((java.util.Map) cacheMap27, false);
        java.util.Set set61 = cacheMap27.getPinnedKeys();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CacheMap:{}::{}" + "'", str17, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "CacheMap:{}::{}" + "'", str25, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1000 + "'", int55 == 1000);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set61);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection2 = cacheMap1.values();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        cacheMap3.setCacheSize((int) (byte) 10);
        java.lang.String str6 = cacheMap3.toString();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        boolean boolean8 = cacheMap7.isEmpty();
        cacheMap3.putAll((java.util.Map) cacheMap7, true);
        boolean boolean11 = cacheMap1.containsKey((java.lang.Object) true);
        java.util.Collection collection12 = cacheMap1.values();
        int int13 = cacheMap1.size();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj16 = cacheMap14.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj19 = cacheMap17.remove((java.lang.Object) (short) 1);
        cacheMap14.putAll((java.util.Map) cacheMap17, false);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        cacheMap22.setCacheSize((int) (byte) 10);
        boolean boolean26 = cacheMap22.pin((java.lang.Object) 1);
        cacheMap17.putAll((java.util.Map) cacheMap22, true);
        int int29 = cacheMap17.getSoftReferenceSize();
        boolean boolean30 = cacheMap1.unpin((java.lang.Object) cacheMap17);
        java.util.Set set31 = cacheMap17.getPinnedKeys();
        boolean boolean32 = cacheMap17.isLRU();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        java.lang.Object obj6 = cacheMap0.remove((java.lang.Object) cacheMap4);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        boolean boolean9 = cacheMap8.isEmpty();
        java.util.Set set10 = cacheMap8.entrySet();
        int int11 = cacheMap8.getCacheSize();
        java.lang.Object obj12 = cacheMap4.put((java.lang.Object) false, (java.lang.Object) int11);
        cacheMap4.setSoftReferenceSize((int) (short) 10);
        boolean boolean16 = cacheMap4.containsValue((java.lang.Object) true);
        java.lang.String str17 = cacheMap4.toString();
        java.lang.String str18 = cacheMap4.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CacheMap:{false=1000}::{}" + "'", str17, "CacheMap:{false=1000}::{}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CacheMap:{false=1000}::{}" + "'", str18, "CacheMap:{false=1000}::{}");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        int int4 = cacheMap0.size();
        cacheMap0.setCacheSize((int) '4');
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean11 = cacheMap9.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection14 = cacheMap13.values();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        cacheMap15.setCacheSize((int) (byte) 10);
        java.lang.String str18 = cacheMap15.toString();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap();
        boolean boolean20 = cacheMap19.isEmpty();
        cacheMap15.putAll((java.util.Map) cacheMap19, true);
        boolean boolean23 = cacheMap13.containsKey((java.lang.Object) true);
        java.util.Collection collection24 = cacheMap13.values();
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean29 = cacheMap27.containsValue((java.lang.Object) '4');
        boolean boolean30 = cacheMap13.containsKey((java.lang.Object) boolean29);
        boolean boolean31 = cacheMap9.pin((java.lang.Object) boolean30);
        java.lang.Object obj32 = cacheMap0.remove((java.lang.Object) cacheMap9);
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap();
        cacheMap33.setCacheSize(10);
        boolean boolean36 = cacheMap33.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap37 = new org.apache.openjpa.util.CacheMap();
        cacheMap37.setCacheSize((int) (byte) 10);
        java.lang.String str40 = cacheMap37.toString();
        org.apache.openjpa.util.CacheMap cacheMap41 = new org.apache.openjpa.util.CacheMap();
        boolean boolean42 = cacheMap41.isEmpty();
        java.lang.Object obj43 = cacheMap37.remove((java.lang.Object) cacheMap41);
        java.util.Set set44 = cacheMap41.keySet();
        java.lang.Object obj45 = cacheMap9.put((java.lang.Object) cacheMap33, (java.lang.Object) cacheMap41);
        boolean boolean46 = cacheMap41.isEmpty();
        boolean boolean47 = cacheMap41.isLRU();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CacheMap:{}::{}" + "'", str18, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "CacheMap:{}::{}" + "'", str40, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: LRUMap max size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, 2);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = cacheMap2.pin(obj3);
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        cacheMap5.setCacheSize(10);
        java.util.Set set8 = cacheMap5.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection11 = cacheMap10.values();
        cacheMap10.readLock();
        java.lang.Object obj13 = cacheMap5.remove((java.lang.Object) cacheMap10);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj19 = new java.lang.Object();
        boolean boolean20 = cacheMap18.pin(obj19);
        boolean boolean21 = cacheMap18.isLRU();
        cacheMap15.putAll((java.util.Map) cacheMap18, false);
        cacheMap10.putAll((java.util.Map) cacheMap15);
        int int25 = cacheMap15.getCacheSize();
        java.util.Set set26 = cacheMap15.keySet();
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap();
        boolean boolean28 = cacheMap27.isEmpty();
        java.util.Set set29 = cacheMap27.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection32 = cacheMap31.values();
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap();
        cacheMap33.setCacheSize((int) (byte) 10);
        java.lang.String str36 = cacheMap33.toString();
        org.apache.openjpa.util.CacheMap cacheMap37 = new org.apache.openjpa.util.CacheMap();
        boolean boolean38 = cacheMap37.isEmpty();
        java.lang.Object obj39 = cacheMap33.remove((java.lang.Object) cacheMap37);
        java.lang.Object obj40 = cacheMap27.put((java.lang.Object) cacheMap31, obj39);
        java.lang.Object obj41 = cacheMap2.put((java.lang.Object) set26, (java.lang.Object) cacheMap31);
        int int42 = cacheMap2.getSoftReferenceSize();
        cacheMap2.setSoftReferenceSize((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1000 + "'", int25 == 1000);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "CacheMap:{}::{}" + "'", str36, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        cacheMap0.readLock();
        java.util.Collection collection11 = cacheMap0.values();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        cacheMap12.setCacheSize((int) (byte) 10);
        boolean boolean16 = cacheMap12.pin((java.lang.Object) 1);
        java.util.Collection collection17 = cacheMap12.values();
        boolean boolean18 = cacheMap12.isLRU();
        java.util.Set set19 = cacheMap12.getPinnedKeys();
        boolean boolean21 = cacheMap12.unpin((java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        cacheMap22.setCacheSize((int) (byte) 10);
        java.lang.String str25 = cacheMap22.toString();
        boolean boolean26 = cacheMap22.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection30 = cacheMap29.values();
        java.lang.Object obj31 = cacheMap22.put((java.lang.Object) 100L, (java.lang.Object) collection30);
        java.util.Set set32 = cacheMap22.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap34 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection35 = cacheMap34.values();
        cacheMap34.readLock();
        boolean boolean37 = cacheMap22.pin((java.lang.Object) cacheMap34);
        cacheMap12.putAll((java.util.Map) cacheMap22);
        boolean boolean39 = cacheMap0.containsKey((java.lang.Object) cacheMap22);
        org.apache.openjpa.util.CacheMap cacheMap42 = new org.apache.openjpa.util.CacheMap(true, (int) '#');
        cacheMap22.putAll((java.util.Map) cacheMap42, true);
        org.apache.openjpa.util.CacheMap cacheMap45 = new org.apache.openjpa.util.CacheMap();
        cacheMap45.setCacheSize(10);
        java.util.Set set48 = cacheMap45.entrySet();
        boolean boolean49 = cacheMap45.isLRU();
        cacheMap42.putAll((java.util.Map) cacheMap45);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "CacheMap:{}::{}" + "'", str25, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        cacheMap0.putAll((java.util.Map) cacheMap4, true);
        boolean boolean8 = cacheMap0.isLRU();
        cacheMap0.setSoftReferenceSize(10);
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj13 = cacheMap11.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj16 = cacheMap14.remove((java.lang.Object) (short) 1);
        cacheMap11.putAll((java.util.Map) cacheMap14, false);
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection21 = cacheMap20.values();
        cacheMap20.readLock();
        boolean boolean23 = cacheMap11.containsValue((java.lang.Object) cacheMap20);
        cacheMap11.readLock();
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap29 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj30 = new java.lang.Object();
        boolean boolean31 = cacheMap29.pin(obj30);
        boolean boolean32 = cacheMap29.isLRU();
        cacheMap26.putAll((java.util.Map) cacheMap29, false);
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap();
        cacheMap35.setCacheSize((int) (byte) 10);
        java.lang.String str38 = cacheMap35.toString();
        boolean boolean39 = cacheMap35.isEmpty();
        java.util.Set set40 = cacheMap35.keySet();
        boolean boolean41 = cacheMap26.containsValue((java.lang.Object) set40);
        cacheMap11.putAll((java.util.Map) cacheMap26);
        cacheMap26.readLock();
        java.lang.String str44 = cacheMap26.toString();
        boolean boolean45 = cacheMap0.unpin((java.lang.Object) cacheMap26);
        int int46 = cacheMap26.getSoftReferenceSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "CacheMap:{}::{}" + "'", str38, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "CacheMap:{}::{}" + "'", str44, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = cacheMap10.pin(obj11);
        boolean boolean13 = cacheMap10.isLRU();
        cacheMap10.setCacheSize((int) (byte) -1);
        boolean boolean16 = cacheMap3.containsValue((java.lang.Object) cacheMap10);
        java.util.Set set17 = cacheMap10.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj21 = new java.lang.Object();
        boolean boolean22 = cacheMap20.pin(obj21);
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap();
        cacheMap23.setCacheSize(10);
        java.util.Set set26 = cacheMap23.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap28 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection29 = cacheMap28.values();
        cacheMap28.readLock();
        java.lang.Object obj31 = cacheMap23.remove((java.lang.Object) cacheMap28);
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap36 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj37 = new java.lang.Object();
        boolean boolean38 = cacheMap36.pin(obj37);
        boolean boolean39 = cacheMap36.isLRU();
        cacheMap33.putAll((java.util.Map) cacheMap36, false);
        cacheMap28.putAll((java.util.Map) cacheMap33);
        int int43 = cacheMap33.getCacheSize();
        java.util.Set set44 = cacheMap33.keySet();
        org.apache.openjpa.util.CacheMap cacheMap45 = new org.apache.openjpa.util.CacheMap();
        boolean boolean46 = cacheMap45.isEmpty();
        java.util.Set set47 = cacheMap45.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap49 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection50 = cacheMap49.values();
        org.apache.openjpa.util.CacheMap cacheMap51 = new org.apache.openjpa.util.CacheMap();
        cacheMap51.setCacheSize((int) (byte) 10);
        java.lang.String str54 = cacheMap51.toString();
        org.apache.openjpa.util.CacheMap cacheMap55 = new org.apache.openjpa.util.CacheMap();
        boolean boolean56 = cacheMap55.isEmpty();
        java.lang.Object obj57 = cacheMap51.remove((java.lang.Object) cacheMap55);
        java.lang.Object obj58 = cacheMap45.put((java.lang.Object) cacheMap49, obj57);
        java.lang.Object obj59 = cacheMap20.put((java.lang.Object) set44, (java.lang.Object) cacheMap49);
        int int60 = cacheMap20.getSoftReferenceSize();
        cacheMap20.readLock();
        org.apache.openjpa.util.CacheMap cacheMap62 = new org.apache.openjpa.util.CacheMap();
        cacheMap62.setCacheSize(10);
        java.util.Set set65 = cacheMap62.entrySet();
        int int66 = cacheMap62.size();
        int int67 = cacheMap62.getSoftReferenceSize();
        cacheMap62.setSoftReferenceSize((int) (short) 0);
        org.apache.openjpa.util.CacheMap cacheMap72 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean74 = cacheMap72.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap76 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection77 = cacheMap76.values();
        org.apache.openjpa.util.CacheMap cacheMap78 = new org.apache.openjpa.util.CacheMap();
        cacheMap78.setCacheSize((int) (byte) 10);
        java.lang.String str81 = cacheMap78.toString();
        org.apache.openjpa.util.CacheMap cacheMap82 = new org.apache.openjpa.util.CacheMap();
        boolean boolean83 = cacheMap82.isEmpty();
        cacheMap78.putAll((java.util.Map) cacheMap82, true);
        boolean boolean86 = cacheMap76.containsKey((java.lang.Object) true);
        java.util.Collection collection87 = cacheMap76.values();
        org.apache.openjpa.util.CacheMap cacheMap90 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean92 = cacheMap90.containsValue((java.lang.Object) '4');
        boolean boolean93 = cacheMap76.containsKey((java.lang.Object) boolean92);
        boolean boolean94 = cacheMap72.pin((java.lang.Object) boolean93);
        boolean boolean95 = cacheMap62.containsKey((java.lang.Object) boolean94);
        int int96 = cacheMap62.size();
        java.lang.Object obj97 = cacheMap10.put((java.lang.Object) cacheMap20, (java.lang.Object) cacheMap62);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1000 + "'", int43 == 1000);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "CacheMap:{}::{}" + "'", str54, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "CacheMap:{}::{}" + "'", str81, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(collection87);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNull(obj97);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        cacheMap0.putAll((java.util.Map) cacheMap4, true);
        java.util.Collection collection8 = cacheMap0.values();
        boolean boolean9 = cacheMap0.isLRU();
        cacheMap0.clear();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        int int1 = cacheMap0.getSoftReferenceSize();
        int int2 = cacheMap0.getSoftReferenceSize();
        cacheMap0.readLock();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        java.util.Set set10 = cacheMap0.getPinnedKeys();
        cacheMap0.clear();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        cacheMap12.setCacheSize((int) (byte) 10);
        boolean boolean16 = cacheMap12.pin((java.lang.Object) 1);
        java.util.Collection collection17 = cacheMap12.values();
        boolean boolean18 = cacheMap12.isLRU();
        java.util.Set set19 = cacheMap12.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap();
        boolean boolean21 = cacheMap20.isEmpty();
        java.lang.Object obj23 = cacheMap20.remove((java.lang.Object) 1);
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set25 = cacheMap24.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap();
        cacheMap26.setCacheSize((int) (byte) 10);
        java.lang.String str29 = cacheMap26.toString();
        boolean boolean30 = cacheMap26.isEmpty();
        cacheMap24.putAll((java.util.Map) cacheMap26, true);
        cacheMap20.putAll((java.util.Map) cacheMap24, true);
        java.util.Set set35 = cacheMap24.entrySet();
        java.lang.Object obj36 = cacheMap0.put((java.lang.Object) cacheMap12, (java.lang.Object) cacheMap24);
        int int37 = cacheMap0.size();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "CacheMap:{}::{}" + "'", str29, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        java.lang.Object obj6 = cacheMap0.remove((java.lang.Object) cacheMap4);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        boolean boolean9 = cacheMap8.isEmpty();
        java.util.Set set10 = cacheMap8.entrySet();
        int int11 = cacheMap8.getCacheSize();
        java.lang.Object obj12 = cacheMap4.put((java.lang.Object) false, (java.lang.Object) int11);
        boolean boolean13 = cacheMap4.isEmpty();
        java.util.Set set14 = cacheMap4.getPinnedKeys();
        int int15 = cacheMap4.size();
        java.lang.String str16 = cacheMap4.toString();
        cacheMap4.readLock();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CacheMap:{false=1000}::{}" + "'", str16, "CacheMap:{false=1000}::{}");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap2.setCacheSize((int) '4');
        boolean boolean6 = cacheMap2.containsValue((java.lang.Object) 100);
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        cacheMap7.setCacheSize(10);
        java.lang.Object obj11 = cacheMap7.get((java.lang.Object) 100L);
        java.lang.Object obj12 = cacheMap2.remove((java.lang.Object) cacheMap7);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap();
        cacheMap13.setCacheSize(10);
        java.util.Set set16 = cacheMap13.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection19 = cacheMap18.values();
        cacheMap18.readLock();
        java.lang.Object obj21 = cacheMap13.remove((java.lang.Object) cacheMap18);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        cacheMap22.setCacheSize(10);
        boolean boolean25 = cacheMap22.isEmpty();
        cacheMap22.writeLock();
        cacheMap18.putAll((java.util.Map) cacheMap22);
        cacheMap7.putAll((java.util.Map) cacheMap18);
        int int29 = cacheMap18.getSoftReferenceSize();
        org.apache.openjpa.util.CacheMap cacheMap30 = new org.apache.openjpa.util.CacheMap();
        boolean boolean31 = cacheMap30.isEmpty();
        java.lang.Object obj33 = cacheMap30.remove((java.lang.Object) 1);
        org.apache.openjpa.util.CacheMap cacheMap34 = new org.apache.openjpa.util.CacheMap();
        boolean boolean35 = cacheMap34.isEmpty();
        java.util.Set set36 = cacheMap34.entrySet();
        cacheMap34.setCacheSize((int) (short) 0);
        java.util.Set set39 = cacheMap34.getPinnedKeys();
        boolean boolean40 = cacheMap30.unpin((java.lang.Object) set39);
        cacheMap18.putAll((java.util.Map) cacheMap30);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        int int4 = cacheMap0.size();
        cacheMap0.setCacheSize((int) '4');
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean11 = cacheMap9.containsValue((java.lang.Object) '4');
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection14 = cacheMap13.values();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        cacheMap15.setCacheSize((int) (byte) 10);
        java.lang.String str18 = cacheMap15.toString();
        org.apache.openjpa.util.CacheMap cacheMap19 = new org.apache.openjpa.util.CacheMap();
        boolean boolean20 = cacheMap19.isEmpty();
        cacheMap15.putAll((java.util.Map) cacheMap19, true);
        boolean boolean23 = cacheMap13.containsKey((java.lang.Object) true);
        java.util.Collection collection24 = cacheMap13.values();
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean29 = cacheMap27.containsValue((java.lang.Object) '4');
        boolean boolean30 = cacheMap13.containsKey((java.lang.Object) boolean29);
        boolean boolean31 = cacheMap9.pin((java.lang.Object) boolean30);
        java.lang.Object obj32 = cacheMap0.remove((java.lang.Object) cacheMap9);
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap();
        cacheMap33.setCacheSize(10);
        boolean boolean36 = cacheMap33.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap37 = new org.apache.openjpa.util.CacheMap();
        cacheMap37.setCacheSize((int) (byte) 10);
        java.lang.String str40 = cacheMap37.toString();
        org.apache.openjpa.util.CacheMap cacheMap41 = new org.apache.openjpa.util.CacheMap();
        boolean boolean42 = cacheMap41.isEmpty();
        java.lang.Object obj43 = cacheMap37.remove((java.lang.Object) cacheMap41);
        java.util.Set set44 = cacheMap41.keySet();
        java.lang.Object obj45 = cacheMap9.put((java.lang.Object) cacheMap33, (java.lang.Object) cacheMap41);
        java.util.Set set46 = cacheMap9.getPinnedKeys();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CacheMap:{}::{}" + "'", str18, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "CacheMap:{}::{}" + "'", str40, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        int int4 = cacheMap0.size();
        int int5 = cacheMap0.getSoftReferenceSize();
        cacheMap0.setSoftReferenceSize((int) (short) 0);
        boolean boolean8 = cacheMap0.isEmpty();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        boolean boolean5 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        cacheMap0.putAll((java.util.Map) cacheMap6, false);
        cacheMap6.clear();
        cacheMap6.setSoftReferenceSize((int) (short) 0);
        int int14 = cacheMap6.getSoftReferenceSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap2.setCacheSize((int) '4');
        java.util.Set set5 = cacheMap2.getPinnedKeys();
        java.lang.String str6 = cacheMap2.toString();
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap2.setCacheSize((int) '4');
        boolean boolean6 = cacheMap2.containsValue((java.lang.Object) 100);
        int int7 = cacheMap2.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean6 = cacheMap4.pin(obj5);
        boolean boolean7 = cacheMap4.isLRU();
        cacheMap1.putAll((java.util.Map) cacheMap4, false);
        int int10 = cacheMap4.getCacheSize();
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj13 = cacheMap11.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj16 = cacheMap14.remove((java.lang.Object) (short) 1);
        cacheMap11.putAll((java.util.Map) cacheMap14, false);
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection21 = cacheMap20.values();
        cacheMap20.readLock();
        boolean boolean23 = cacheMap11.containsValue((java.lang.Object) cacheMap20);
        boolean boolean24 = cacheMap11.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap25 = new org.apache.openjpa.util.CacheMap();
        cacheMap25.setCacheSize((int) (byte) 10);
        boolean boolean29 = cacheMap25.pin((java.lang.Object) 1);
        java.util.Collection collection30 = cacheMap25.values();
        boolean boolean31 = cacheMap25.isLRU();
        java.util.Set set32 = cacheMap25.getPinnedKeys();
        boolean boolean34 = cacheMap25.unpin((java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap();
        cacheMap35.setCacheSize((int) (byte) 10);
        java.lang.String str38 = cacheMap35.toString();
        boolean boolean39 = cacheMap35.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap42 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection43 = cacheMap42.values();
        java.lang.Object obj44 = cacheMap35.put((java.lang.Object) 100L, (java.lang.Object) collection43);
        java.util.Set set45 = cacheMap35.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap47 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection48 = cacheMap47.values();
        cacheMap47.readLock();
        boolean boolean50 = cacheMap35.pin((java.lang.Object) cacheMap47);
        cacheMap25.putAll((java.util.Map) cacheMap35);
        org.apache.openjpa.util.CacheMap cacheMap52 = new org.apache.openjpa.util.CacheMap();
        cacheMap52.setCacheSize((int) (byte) 10);
        java.lang.String str55 = cacheMap52.toString();
        org.apache.openjpa.util.CacheMap cacheMap56 = new org.apache.openjpa.util.CacheMap();
        boolean boolean57 = cacheMap56.isEmpty();
        java.lang.Object obj58 = cacheMap52.remove((java.lang.Object) cacheMap56);
        org.apache.openjpa.util.CacheMap cacheMap60 = new org.apache.openjpa.util.CacheMap();
        boolean boolean61 = cacheMap60.isEmpty();
        java.util.Set set62 = cacheMap60.entrySet();
        int int63 = cacheMap60.getCacheSize();
        java.lang.Object obj64 = cacheMap56.put((java.lang.Object) false, (java.lang.Object) int63);
        cacheMap56.setSoftReferenceSize((int) (short) 10);
        org.apache.openjpa.util.CacheMap cacheMap67 = new org.apache.openjpa.util.CacheMap();
        cacheMap67.setCacheSize(10);
        java.util.Set set70 = cacheMap67.entrySet();
        boolean boolean71 = cacheMap67.isLRU();
        boolean boolean72 = cacheMap56.containsValue((java.lang.Object) cacheMap67);
        cacheMap35.putAll((java.util.Map) cacheMap56, true);
        boolean boolean75 = cacheMap11.containsValue((java.lang.Object) cacheMap35);
        org.apache.openjpa.util.CacheMap cacheMap76 = new org.apache.openjpa.util.CacheMap();
        cacheMap76.setCacheSize((int) (byte) 10);
        java.lang.String str79 = cacheMap76.toString();
        boolean boolean80 = cacheMap76.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap83 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection84 = cacheMap83.values();
        java.lang.Object obj85 = cacheMap76.put((java.lang.Object) 100L, (java.lang.Object) collection84);
        java.util.Set set86 = cacheMap76.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap88 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection89 = cacheMap88.values();
        cacheMap88.readLock();
        boolean boolean91 = cacheMap76.pin((java.lang.Object) cacheMap88);
        cacheMap76.setCacheSize(1);
        boolean boolean94 = cacheMap35.containsKey((java.lang.Object) cacheMap76);
        cacheMap4.putAll((java.util.Map) cacheMap35, false);
        java.lang.String str97 = cacheMap4.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "CacheMap:{}::{}" + "'", str38, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "CacheMap:{}::{}" + "'", str55, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1000 + "'", int63 == 1000);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "CacheMap:{}::{}" + "'", str79, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNotNull(collection89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "CacheMap:{100=[], false=1000}::{}" + "'", str97, "CacheMap:{100=[], false=1000}::{}");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        java.lang.Object obj6 = cacheMap0.remove((java.lang.Object) cacheMap4);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        boolean boolean9 = cacheMap8.isEmpty();
        java.util.Set set10 = cacheMap8.entrySet();
        int int11 = cacheMap8.getCacheSize();
        java.lang.Object obj12 = cacheMap4.put((java.lang.Object) false, (java.lang.Object) int11);
        boolean boolean13 = cacheMap4.isEmpty();
        java.lang.Class<?> wildcardClass14 = cacheMap4.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection10 = cacheMap9.values();
        cacheMap9.readLock();
        boolean boolean12 = cacheMap0.containsValue((java.lang.Object) cacheMap9);
        cacheMap0.readLock();
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj19 = new java.lang.Object();
        boolean boolean20 = cacheMap18.pin(obj19);
        boolean boolean21 = cacheMap18.isLRU();
        cacheMap15.putAll((java.util.Map) cacheMap18, false);
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap();
        cacheMap24.setCacheSize((int) (byte) 10);
        java.lang.String str27 = cacheMap24.toString();
        boolean boolean28 = cacheMap24.isEmpty();
        java.util.Set set29 = cacheMap24.keySet();
        boolean boolean30 = cacheMap15.containsValue((java.lang.Object) set29);
        cacheMap0.putAll((java.util.Map) cacheMap15);
        java.util.Set set32 = cacheMap15.entrySet();
        java.util.Set set33 = cacheMap15.entrySet();
        java.util.Set set34 = cacheMap15.getPinnedKeys();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "CacheMap:{}::{}" + "'", str27, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        java.util.Set set10 = cacheMap0.getPinnedKeys();
        cacheMap0.clear();
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        cacheMap12.setCacheSize((int) (byte) 10);
        boolean boolean16 = cacheMap12.pin((java.lang.Object) 1);
        java.util.Collection collection17 = cacheMap12.values();
        boolean boolean18 = cacheMap12.isLRU();
        java.util.Set set19 = cacheMap12.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap();
        boolean boolean21 = cacheMap20.isEmpty();
        java.lang.Object obj23 = cacheMap20.remove((java.lang.Object) 1);
        org.apache.openjpa.util.CacheMap cacheMap24 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set25 = cacheMap24.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap();
        cacheMap26.setCacheSize((int) (byte) 10);
        java.lang.String str29 = cacheMap26.toString();
        boolean boolean30 = cacheMap26.isEmpty();
        cacheMap24.putAll((java.util.Map) cacheMap26, true);
        cacheMap20.putAll((java.util.Map) cacheMap24, true);
        java.util.Set set35 = cacheMap24.entrySet();
        java.lang.Object obj36 = cacheMap0.put((java.lang.Object) cacheMap12, (java.lang.Object) cacheMap24);
        java.util.Set set37 = cacheMap0.entrySet();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "CacheMap:{}::{}" + "'", str29, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, (int) ' ', (int) (byte) 100, (float) (short) 1);
        boolean boolean6 = cacheMap4.pin((java.lang.Object) (short) 100);
        java.util.Set set7 = cacheMap4.getPinnedKeys();
        java.util.Set set8 = cacheMap4.entrySet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.lang.Object obj3 = cacheMap0.remove((java.lang.Object) 1);
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        java.lang.String str9 = cacheMap6.toString();
        boolean boolean10 = cacheMap6.isEmpty();
        cacheMap4.putAll((java.util.Map) cacheMap6, true);
        cacheMap0.putAll((java.util.Map) cacheMap4, true);
        java.util.Collection collection15 = cacheMap4.values();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = cacheMap2.pin(obj3);
        cacheMap2.setCacheSize(0);
        int int7 = cacheMap2.getCacheSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.lang.Object obj4 = cacheMap0.get((java.lang.Object) 100L);
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap();
        cacheMap5.setCacheSize((int) (byte) 10);
        java.lang.String str8 = cacheMap5.toString();
        cacheMap0.putAll((java.util.Map) cacheMap5, false);
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj13 = cacheMap11.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj16 = cacheMap14.remove((java.lang.Object) (short) 1);
        cacheMap11.putAll((java.util.Map) cacheMap14, false);
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj22 = new java.lang.Object();
        boolean boolean23 = cacheMap21.pin(obj22);
        boolean boolean24 = cacheMap21.isLRU();
        cacheMap21.setCacheSize((int) (byte) -1);
        boolean boolean27 = cacheMap14.containsValue((java.lang.Object) cacheMap21);
        java.lang.String str28 = cacheMap14.toString();
        cacheMap5.putAll((java.util.Map) cacheMap14, true);
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap33.setCacheSize((int) '4');
        boolean boolean37 = cacheMap33.containsValue((java.lang.Object) 100);
        org.apache.openjpa.util.CacheMap cacheMap38 = new org.apache.openjpa.util.CacheMap();
        cacheMap38.setCacheSize(10);
        java.lang.Object obj42 = cacheMap38.get((java.lang.Object) 100L);
        java.lang.Object obj43 = cacheMap33.remove((java.lang.Object) cacheMap38);
        boolean boolean44 = cacheMap38.isEmpty();
        java.util.Set set45 = cacheMap38.keySet();
        java.lang.Object obj46 = cacheMap14.get((java.lang.Object) cacheMap38);
        java.lang.String str47 = cacheMap14.toString();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "CacheMap:{}::{}" + "'", str28, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "CacheMap:{}::{}" + "'", str47, "CacheMap:{}::{}");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        boolean boolean4 = cacheMap0.pin((java.lang.Object) 1);
        java.util.Collection collection5 = cacheMap0.values();
        boolean boolean6 = cacheMap0.isLRU();
        java.util.Set set7 = cacheMap0.getPinnedKeys();
        boolean boolean9 = cacheMap0.unpin((java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        cacheMap10.setCacheSize((int) (byte) 10);
        java.lang.String str13 = cacheMap10.toString();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        boolean boolean15 = cacheMap14.isEmpty();
        cacheMap10.putAll((java.util.Map) cacheMap14, true);
        boolean boolean18 = cacheMap10.isLRU();
        java.lang.Object obj19 = cacheMap0.get((java.lang.Object) cacheMap10);
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap();
        boolean boolean21 = cacheMap20.isEmpty();
        java.lang.Object obj24 = cacheMap20.put((java.lang.Object) (byte) 0, (java.lang.Object) 0.0d);
        cacheMap10.putAll((java.util.Map) cacheMap20);
        java.lang.Class<?> wildcardClass26 = cacheMap10.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CacheMap:{}::{}" + "'", str13, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        cacheMap3.setCacheSize(2);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        boolean boolean4 = cacheMap0.pin((java.lang.Object) 1);
        java.util.Collection collection5 = cacheMap0.values();
        boolean boolean6 = cacheMap0.isLRU();
        java.util.Set set7 = cacheMap0.getPinnedKeys();
        boolean boolean9 = cacheMap0.unpin((java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        cacheMap10.setCacheSize((int) (byte) 10);
        java.lang.String str13 = cacheMap10.toString();
        boolean boolean14 = cacheMap10.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection18 = cacheMap17.values();
        java.lang.Object obj19 = cacheMap10.put((java.lang.Object) 100L, (java.lang.Object) collection18);
        java.util.Set set20 = cacheMap10.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection23 = cacheMap22.values();
        cacheMap22.readLock();
        boolean boolean25 = cacheMap10.pin((java.lang.Object) cacheMap22);
        cacheMap0.putAll((java.util.Map) cacheMap10);
        java.lang.String str27 = cacheMap0.toString();
        java.util.Set set28 = cacheMap0.entrySet();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CacheMap:{}::{}" + "'", str13, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "CacheMap:{100=[]}::{}" + "'", str27, "CacheMap:{100=[]}::{}");
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection10 = cacheMap9.values();
        cacheMap9.readLock();
        boolean boolean12 = cacheMap0.containsValue((java.lang.Object) cacheMap9);
        boolean boolean13 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj16 = cacheMap14.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj19 = cacheMap17.remove((java.lang.Object) (short) 1);
        cacheMap14.putAll((java.util.Map) cacheMap17, false);
        boolean boolean22 = cacheMap14.isLRU();
        cacheMap14.writeLock();
        cacheMap0.putAll((java.util.Map) cacheMap14);
        int int25 = cacheMap14.getSoftReferenceSize();
        // The following exception was thrown during execution in test generation
        try {
            cacheMap14.writeUnlock();
// flaky "4) test379(org.apache.openjpa.generated.cm.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap2.setCacheSize((int) '4');
        boolean boolean6 = cacheMap2.containsValue((java.lang.Object) 100);
        cacheMap2.setCacheSize((int) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj11 = cacheMap9.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj14 = cacheMap12.remove((java.lang.Object) (short) 1);
        cacheMap9.putAll((java.util.Map) cacheMap12, false);
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection19 = cacheMap18.values();
        cacheMap18.readLock();
        boolean boolean21 = cacheMap9.containsValue((java.lang.Object) cacheMap18);
        boolean boolean22 = cacheMap9.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap();
        cacheMap23.setCacheSize((int) (byte) 10);
        boolean boolean27 = cacheMap23.pin((java.lang.Object) 1);
        java.util.Collection collection28 = cacheMap23.values();
        boolean boolean29 = cacheMap23.isLRU();
        java.util.Set set30 = cacheMap23.getPinnedKeys();
        boolean boolean32 = cacheMap23.unpin((java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap();
        cacheMap33.setCacheSize((int) (byte) 10);
        java.lang.String str36 = cacheMap33.toString();
        boolean boolean37 = cacheMap33.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap40 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection41 = cacheMap40.values();
        java.lang.Object obj42 = cacheMap33.put((java.lang.Object) 100L, (java.lang.Object) collection41);
        java.util.Set set43 = cacheMap33.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap45 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection46 = cacheMap45.values();
        cacheMap45.readLock();
        boolean boolean48 = cacheMap33.pin((java.lang.Object) cacheMap45);
        cacheMap23.putAll((java.util.Map) cacheMap33);
        org.apache.openjpa.util.CacheMap cacheMap50 = new org.apache.openjpa.util.CacheMap();
        cacheMap50.setCacheSize((int) (byte) 10);
        java.lang.String str53 = cacheMap50.toString();
        org.apache.openjpa.util.CacheMap cacheMap54 = new org.apache.openjpa.util.CacheMap();
        boolean boolean55 = cacheMap54.isEmpty();
        java.lang.Object obj56 = cacheMap50.remove((java.lang.Object) cacheMap54);
        org.apache.openjpa.util.CacheMap cacheMap58 = new org.apache.openjpa.util.CacheMap();
        boolean boolean59 = cacheMap58.isEmpty();
        java.util.Set set60 = cacheMap58.entrySet();
        int int61 = cacheMap58.getCacheSize();
        java.lang.Object obj62 = cacheMap54.put((java.lang.Object) false, (java.lang.Object) int61);
        cacheMap54.setSoftReferenceSize((int) (short) 10);
        org.apache.openjpa.util.CacheMap cacheMap65 = new org.apache.openjpa.util.CacheMap();
        cacheMap65.setCacheSize(10);
        java.util.Set set68 = cacheMap65.entrySet();
        boolean boolean69 = cacheMap65.isLRU();
        boolean boolean70 = cacheMap54.containsValue((java.lang.Object) cacheMap65);
        cacheMap33.putAll((java.util.Map) cacheMap54, true);
        boolean boolean73 = cacheMap9.containsValue((java.lang.Object) cacheMap33);
        org.apache.openjpa.util.CacheMap cacheMap74 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj76 = cacheMap74.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap77 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj79 = cacheMap77.remove((java.lang.Object) (short) 1);
        cacheMap74.putAll((java.util.Map) cacheMap77, false);
        org.apache.openjpa.util.CacheMap cacheMap83 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection84 = cacheMap83.values();
        cacheMap83.readLock();
        boolean boolean86 = cacheMap74.containsValue((java.lang.Object) cacheMap83);
        java.util.Set set87 = cacheMap74.keySet();
        java.util.Collection collection88 = cacheMap74.values();
        java.lang.Object obj89 = cacheMap2.put((java.lang.Object) cacheMap9, (java.lang.Object) cacheMap74);
        java.util.Set set90 = cacheMap74.getPinnedKeys();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "CacheMap:{}::{}" + "'", str36, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "CacheMap:{}::{}" + "'", str53, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1000 + "'", int61 == 1000);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertNotNull(collection88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(set90);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true, (int) (byte) -1, (int) (byte) 100, (float) 1, (int) (short) 100);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        cacheMap10.setCacheSize(10);
        java.lang.Object obj14 = cacheMap10.get((java.lang.Object) 100L);
        java.lang.Object obj16 = cacheMap10.remove((java.lang.Object) (-1.0d));
        boolean boolean17 = cacheMap0.containsValue((java.lang.Object) (-1.0d));
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap();
        cacheMap18.setCacheSize(10);
        java.util.Set set21 = cacheMap18.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection24 = cacheMap23.values();
        cacheMap23.readLock();
        java.lang.Object obj26 = cacheMap18.remove((java.lang.Object) cacheMap23);
        org.apache.openjpa.util.CacheMap cacheMap28 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap31 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj32 = new java.lang.Object();
        boolean boolean33 = cacheMap31.pin(obj32);
        boolean boolean34 = cacheMap31.isLRU();
        cacheMap28.putAll((java.util.Map) cacheMap31, false);
        cacheMap23.putAll((java.util.Map) cacheMap28);
        int int38 = cacheMap28.getCacheSize();
        java.util.Set set39 = cacheMap28.keySet();
        java.util.Set set40 = cacheMap28.entrySet();
        java.lang.Object obj41 = cacheMap0.remove((java.lang.Object) set40);
        org.apache.openjpa.util.CacheMap cacheMap42 = new org.apache.openjpa.util.CacheMap();
        cacheMap42.setCacheSize(10);
        boolean boolean45 = cacheMap0.containsKey((java.lang.Object) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1000 + "'", int38 == 1000);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.util.Set set2 = cacheMap0.entrySet();
        int int3 = cacheMap0.getCacheSize();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        cacheMap4.setCacheSize((int) (byte) 10);
        java.lang.String str7 = cacheMap4.toString();
        boolean boolean8 = cacheMap4.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection12 = cacheMap11.values();
        java.lang.Object obj13 = cacheMap4.put((java.lang.Object) 100L, (java.lang.Object) collection12);
        cacheMap4.readLock();
        java.util.Collection collection15 = cacheMap4.values();
        boolean boolean16 = cacheMap0.containsKey((java.lang.Object) collection15);
        java.util.Collection collection17 = cacheMap0.values();
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj20 = cacheMap18.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj23 = cacheMap21.remove((java.lang.Object) (short) 1);
        cacheMap18.putAll((java.util.Map) cacheMap21, false);
        org.apache.openjpa.util.CacheMap cacheMap27 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection28 = cacheMap27.values();
        cacheMap27.readLock();
        boolean boolean30 = cacheMap18.containsValue((java.lang.Object) cacheMap27);
        cacheMap18.readLock();
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap36 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj37 = new java.lang.Object();
        boolean boolean38 = cacheMap36.pin(obj37);
        boolean boolean39 = cacheMap36.isLRU();
        cacheMap33.putAll((java.util.Map) cacheMap36, false);
        org.apache.openjpa.util.CacheMap cacheMap42 = new org.apache.openjpa.util.CacheMap();
        cacheMap42.setCacheSize((int) (byte) 10);
        java.lang.String str45 = cacheMap42.toString();
        boolean boolean46 = cacheMap42.isEmpty();
        java.util.Set set47 = cacheMap42.keySet();
        boolean boolean48 = cacheMap33.containsValue((java.lang.Object) set47);
        cacheMap18.putAll((java.util.Map) cacheMap33);
        cacheMap33.readLock();
        java.lang.Object obj51 = cacheMap0.remove((java.lang.Object) cacheMap33);
        java.lang.Class<?> wildcardClass52 = cacheMap33.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CacheMap:{}::{}" + "'", str7, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "CacheMap:{}::{}" + "'", str45, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.util.Set set2 = cacheMap0.entrySet();
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj6 = cacheMap4.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj9 = cacheMap7.remove((java.lang.Object) (short) 1);
        cacheMap4.putAll((java.util.Map) cacheMap7, false);
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj15 = new java.lang.Object();
        boolean boolean16 = cacheMap14.pin(obj15);
        boolean boolean17 = cacheMap14.isLRU();
        cacheMap14.setCacheSize((int) (byte) -1);
        boolean boolean20 = cacheMap7.containsValue((java.lang.Object) cacheMap14);
        boolean boolean21 = cacheMap0.containsKey((java.lang.Object) cacheMap14);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        cacheMap22.setCacheSize((int) (byte) 10);
        java.lang.String str25 = cacheMap22.toString();
        boolean boolean26 = cacheMap22.isEmpty();
        java.util.Set set27 = cacheMap22.getPinnedKeys();
        boolean boolean28 = cacheMap14.unpin((java.lang.Object) cacheMap22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "CacheMap:{}::{}" + "'", str25, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        boolean boolean5 = cacheMap0.isEmpty();
        java.util.Collection collection6 = cacheMap0.values();
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean11 = cacheMap9.containsValue((java.lang.Object) '4');
        java.util.Set set12 = cacheMap9.keySet();
        java.util.Set set13 = cacheMap9.getPinnedKeys();
        cacheMap9.readLock();
        java.util.Set set15 = cacheMap9.keySet();
        boolean boolean16 = cacheMap0.unpin((java.lang.Object) set15);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        cacheMap17.setCacheSize(10);
        java.lang.Object obj21 = cacheMap17.get((java.lang.Object) 100L);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        cacheMap22.setCacheSize((int) (byte) 10);
        java.lang.String str25 = cacheMap22.toString();
        cacheMap17.putAll((java.util.Map) cacheMap22, false);
        cacheMap17.setCacheSize(0);
        java.util.Collection collection30 = cacheMap17.values();
        cacheMap0.putAll((java.util.Map) cacheMap17);
        org.apache.openjpa.util.CacheMap cacheMap32 = new org.apache.openjpa.util.CacheMap();
        boolean boolean33 = cacheMap32.isEmpty();
        java.util.Set set34 = cacheMap32.entrySet();
        int int35 = cacheMap32.getCacheSize();
        org.apache.openjpa.util.CacheMap cacheMap36 = new org.apache.openjpa.util.CacheMap();
        cacheMap36.setCacheSize((int) (byte) 10);
        java.lang.String str39 = cacheMap36.toString();
        boolean boolean40 = cacheMap36.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap43 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection44 = cacheMap43.values();
        java.lang.Object obj45 = cacheMap36.put((java.lang.Object) 100L, (java.lang.Object) collection44);
        cacheMap36.readLock();
        java.util.Collection collection47 = cacheMap36.values();
        boolean boolean48 = cacheMap32.containsKey((java.lang.Object) collection47);
        java.util.Collection collection49 = cacheMap32.values();
        org.apache.openjpa.util.CacheMap cacheMap50 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj52 = cacheMap50.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap53 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj55 = cacheMap53.remove((java.lang.Object) (short) 1);
        cacheMap50.putAll((java.util.Map) cacheMap53, false);
        org.apache.openjpa.util.CacheMap cacheMap59 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection60 = cacheMap59.values();
        cacheMap59.readLock();
        boolean boolean62 = cacheMap50.containsValue((java.lang.Object) cacheMap59);
        cacheMap50.readLock();
        org.apache.openjpa.util.CacheMap cacheMap65 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap68 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj69 = new java.lang.Object();
        boolean boolean70 = cacheMap68.pin(obj69);
        boolean boolean71 = cacheMap68.isLRU();
        cacheMap65.putAll((java.util.Map) cacheMap68, false);
        org.apache.openjpa.util.CacheMap cacheMap74 = new org.apache.openjpa.util.CacheMap();
        cacheMap74.setCacheSize((int) (byte) 10);
        java.lang.String str77 = cacheMap74.toString();
        boolean boolean78 = cacheMap74.isEmpty();
        java.util.Set set79 = cacheMap74.keySet();
        boolean boolean80 = cacheMap65.containsValue((java.lang.Object) set79);
        cacheMap50.putAll((java.util.Map) cacheMap65);
        cacheMap65.readLock();
        java.lang.Object obj83 = cacheMap32.remove((java.lang.Object) cacheMap65);
        cacheMap0.putAll((java.util.Map) cacheMap32, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "CacheMap:{}::{}" + "'", str25, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1000 + "'", int35 == 1000);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "CacheMap:{}::{}" + "'", str39, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "CacheMap:{}::{}" + "'", str77, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(obj83);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) '#');
        java.util.Collection collection3 = cacheMap2.values();
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap2.setCacheSize((int) '4');
        boolean boolean6 = cacheMap2.containsValue((java.lang.Object) 100);
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set8 = cacheMap7.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap();
        cacheMap9.setCacheSize((int) (byte) 10);
        java.lang.String str12 = cacheMap9.toString();
        boolean boolean13 = cacheMap9.isEmpty();
        cacheMap7.putAll((java.util.Map) cacheMap9, true);
        cacheMap2.putAll((java.util.Map) cacheMap9);
        cacheMap2.setCacheSize((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CacheMap:{}::{}" + "'", str12, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true, 0, 100, (float) 2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 2.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.lang.Object obj4 = cacheMap0.get((java.lang.Object) 100L);
        cacheMap0.clear();
        int int6 = cacheMap0.getSoftReferenceSize();
        cacheMap0.setSoftReferenceSize((int) (short) 0);
        cacheMap0.setSoftReferenceSize(1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        boolean boolean5 = cacheMap0.isEmpty();
        java.util.Collection collection6 = cacheMap0.values();
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        boolean boolean11 = cacheMap9.containsValue((java.lang.Object) '4');
        java.util.Set set12 = cacheMap9.keySet();
        java.util.Set set13 = cacheMap9.getPinnedKeys();
        cacheMap9.readLock();
        java.util.Set set15 = cacheMap9.keySet();
        boolean boolean16 = cacheMap0.unpin((java.lang.Object) set15);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        cacheMap17.setCacheSize(10);
        java.lang.Object obj21 = cacheMap17.get((java.lang.Object) 100L);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        cacheMap22.setCacheSize((int) (byte) 10);
        java.lang.String str25 = cacheMap22.toString();
        cacheMap17.putAll((java.util.Map) cacheMap22, false);
        cacheMap17.setCacheSize(0);
        java.util.Collection collection30 = cacheMap17.values();
        cacheMap0.putAll((java.util.Map) cacheMap17);
        java.lang.String str32 = cacheMap0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "CacheMap:{}::{}" + "'", str25, "CacheMap:{}::{}");
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "CacheMap:{}::{}" + "'", str32, "CacheMap:{}::{}");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true, 1000, 100, (float) 10L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(false, (int) (short) 100);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        boolean boolean8 = cacheMap0.isLRU();
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(true, (int) ' ', (int) (byte) 100, (float) (short) 1);
        boolean boolean15 = cacheMap13.pin((java.lang.Object) (short) 100);
        java.util.Set set16 = cacheMap13.getPinnedKeys();
        boolean boolean17 = cacheMap0.pin((java.lang.Object) cacheMap13);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.util.Set set2 = cacheMap0.entrySet();
        int int3 = cacheMap0.getCacheSize();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        cacheMap4.setCacheSize((int) (byte) 10);
        java.lang.String str7 = cacheMap4.toString();
        boolean boolean8 = cacheMap4.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection12 = cacheMap11.values();
        java.lang.Object obj13 = cacheMap4.put((java.lang.Object) 100L, (java.lang.Object) collection12);
        cacheMap4.readLock();
        java.util.Collection collection15 = cacheMap4.values();
        boolean boolean16 = cacheMap0.containsKey((java.lang.Object) collection15);
        java.util.Collection collection17 = cacheMap0.values();
        int int18 = cacheMap0.getSoftReferenceSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CacheMap:{}::{}" + "'", str7, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.openjpa.util.CacheMap cacheMap1 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection2 = cacheMap1.values();
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        cacheMap3.setCacheSize((int) (byte) 10);
        java.lang.String str6 = cacheMap3.toString();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        boolean boolean8 = cacheMap7.isEmpty();
        cacheMap3.putAll((java.util.Map) cacheMap7, true);
        boolean boolean11 = cacheMap1.containsKey((java.lang.Object) true);
        java.util.Collection collection12 = cacheMap1.values();
        int int13 = cacheMap1.size();
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj16 = cacheMap14.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj19 = cacheMap17.remove((java.lang.Object) (short) 1);
        cacheMap14.putAll((java.util.Map) cacheMap17, false);
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        cacheMap22.setCacheSize((int) (byte) 10);
        boolean boolean26 = cacheMap22.pin((java.lang.Object) 1);
        cacheMap17.putAll((java.util.Map) cacheMap22, true);
        int int29 = cacheMap17.getSoftReferenceSize();
        boolean boolean30 = cacheMap1.unpin((java.lang.Object) cacheMap17);
        cacheMap17.setCacheSize(1000);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CacheMap:{}::{}" + "'", str6, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, 1, 32, (float) (byte) 1);
        int int5 = cacheMap4.getSoftReferenceSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(false, 0, (int) (byte) 100, (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.lang.Object obj4 = cacheMap0.get((java.lang.Object) 100L);
        cacheMap0.setSoftReferenceSize(1);
        int int7 = cacheMap0.getCacheSize();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap(true, (int) '#', (int) 'a', 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Load factor: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap10.setCacheSize((int) '4');
        boolean boolean14 = cacheMap10.containsValue((java.lang.Object) 100);
        org.apache.openjpa.util.CacheMap cacheMap15 = new org.apache.openjpa.util.CacheMap();
        cacheMap15.setCacheSize(10);
        java.lang.Object obj19 = cacheMap15.get((java.lang.Object) 100L);
        java.lang.Object obj20 = cacheMap10.remove((java.lang.Object) cacheMap15);
        org.apache.openjpa.util.CacheMap cacheMap21 = new org.apache.openjpa.util.CacheMap();
        cacheMap21.setCacheSize(10);
        java.util.Set set24 = cacheMap21.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection27 = cacheMap26.values();
        cacheMap26.readLock();
        java.lang.Object obj29 = cacheMap21.remove((java.lang.Object) cacheMap26);
        org.apache.openjpa.util.CacheMap cacheMap30 = new org.apache.openjpa.util.CacheMap();
        cacheMap30.setCacheSize(10);
        boolean boolean33 = cacheMap30.isEmpty();
        cacheMap30.writeLock();
        cacheMap26.putAll((java.util.Map) cacheMap30);
        cacheMap15.putAll((java.util.Map) cacheMap26);
        boolean boolean37 = cacheMap3.containsValue((java.lang.Object) cacheMap15);
        java.util.Set set38 = cacheMap3.keySet();
        cacheMap3.setCacheSize((int) '4');
        org.apache.openjpa.util.CacheMap cacheMap41 = new org.apache.openjpa.util.CacheMap();
        cacheMap41.setCacheSize((int) (byte) 10);
        boolean boolean45 = cacheMap41.pin((java.lang.Object) 1);
        java.util.Collection collection46 = cacheMap41.values();
        java.lang.String str47 = cacheMap41.toString();
        java.lang.String str48 = cacheMap41.toString();
        org.apache.openjpa.util.CacheMap cacheMap51 = new org.apache.openjpa.util.CacheMap(true, 100);
        cacheMap41.putAll((java.util.Map) cacheMap51);
        boolean boolean53 = cacheMap3.containsValue((java.lang.Object) cacheMap41);
        org.apache.openjpa.util.CacheMap cacheMap54 = new org.apache.openjpa.util.CacheMap();
        boolean boolean55 = cacheMap54.isEmpty();
        java.util.Set set56 = cacheMap54.entrySet();
        cacheMap54.setCacheSize((int) (short) 0);
        java.util.Set set59 = cacheMap54.getPinnedKeys();
        cacheMap3.putAll((java.util.Map) cacheMap54, false);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "CacheMap:{}::{}" + "'", str47, "CacheMap:{}::{}");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "CacheMap:{}::{}" + "'", str48, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(set59);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap2.setCacheSize((int) '4');
        boolean boolean6 = cacheMap2.containsValue((java.lang.Object) 100);
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set8 = cacheMap7.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap();
        cacheMap9.setCacheSize((int) (byte) 10);
        java.lang.String str12 = cacheMap9.toString();
        boolean boolean13 = cacheMap9.isEmpty();
        cacheMap7.putAll((java.util.Map) cacheMap9, true);
        cacheMap2.putAll((java.util.Map) cacheMap9);
        org.apache.openjpa.util.CacheMap cacheMap17 = new org.apache.openjpa.util.CacheMap();
        cacheMap17.setCacheSize((int) (byte) 10);
        org.apache.openjpa.util.CacheMap cacheMap20 = new org.apache.openjpa.util.CacheMap();
        cacheMap20.setCacheSize(10);
        java.util.Set set23 = cacheMap20.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap25 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection26 = cacheMap25.values();
        cacheMap25.readLock();
        java.lang.Object obj28 = cacheMap20.remove((java.lang.Object) cacheMap25);
        org.apache.openjpa.util.CacheMap cacheMap30 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj34 = new java.lang.Object();
        boolean boolean35 = cacheMap33.pin(obj34);
        boolean boolean36 = cacheMap33.isLRU();
        cacheMap30.putAll((java.util.Map) cacheMap33, false);
        cacheMap25.putAll((java.util.Map) cacheMap30);
        int int40 = cacheMap30.getCacheSize();
        java.util.Set set41 = cacheMap30.keySet();
        boolean boolean42 = cacheMap17.pin((java.lang.Object) cacheMap30);
        cacheMap17.readLock();
        java.util.Set set44 = cacheMap17.entrySet();
        java.lang.Object obj45 = cacheMap9.remove((java.lang.Object) set44);
        cacheMap9.setSoftReferenceSize(32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CacheMap:{}::{}" + "'", str12, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1000 + "'", int40 == 1000);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        java.lang.Object obj6 = cacheMap0.remove((java.lang.Object) cacheMap4);
        java.util.Collection collection7 = cacheMap0.values();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        cacheMap0.putAll((java.util.Map) cacheMap4, true);
        java.util.Collection collection8 = cacheMap4.values();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection11 = cacheMap10.values();
        cacheMap10.readLock();
        java.util.Set set13 = cacheMap10.getPinnedKeys();
        cacheMap4.putAll((java.util.Map) cacheMap10, true);
        boolean boolean16 = cacheMap10.isEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        boolean boolean5 = cacheMap4.isEmpty();
        cacheMap0.putAll((java.util.Map) cacheMap4, true);
        boolean boolean8 = cacheMap0.isLRU();
        cacheMap0.setSoftReferenceSize(10);
        org.apache.openjpa.util.CacheMap cacheMap11 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj13 = cacheMap11.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap14 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj16 = cacheMap14.remove((java.lang.Object) (short) 1);
        cacheMap11.putAll((java.util.Map) cacheMap14, false);
        cacheMap0.putAll((java.util.Map) cacheMap14);
        java.util.Collection collection20 = cacheMap14.values();
        cacheMap14.clear();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        int int4 = cacheMap0.size();
        cacheMap0.setCacheSize((int) (short) 100);
        java.util.Set set7 = cacheMap0.entrySet();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        boolean boolean3 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        cacheMap4.setCacheSize((int) (byte) 10);
        java.lang.String str7 = cacheMap4.toString();
        boolean boolean8 = cacheMap4.isEmpty();
        boolean boolean9 = cacheMap4.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        cacheMap10.setCacheSize((int) (byte) 10);
        cacheMap4.putAll((java.util.Map) cacheMap10, false);
        boolean boolean16 = cacheMap4.unpin((java.lang.Object) (short) 10);
        boolean boolean17 = cacheMap0.unpin((java.lang.Object) (short) 10);
        cacheMap0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CacheMap:{}::{}" + "'", str7, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set1 = cacheMap0.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap();
        cacheMap2.setCacheSize((int) (byte) 10);
        java.lang.String str5 = cacheMap2.toString();
        boolean boolean6 = cacheMap2.isEmpty();
        cacheMap0.putAll((java.util.Map) cacheMap2, true);
        cacheMap2.setCacheSize(2);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(true, (int) (byte) 10);
        java.lang.Object obj14 = cacheMap2.remove((java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CacheMap:{}::{}" + "'", str5, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        cacheMap2.setCacheSize((int) '4');
        boolean boolean6 = cacheMap2.containsValue((java.lang.Object) 100);
        cacheMap2.setCacheSize((int) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap9 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj11 = cacheMap9.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap12 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj14 = cacheMap12.remove((java.lang.Object) (short) 1);
        cacheMap9.putAll((java.util.Map) cacheMap12, false);
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection19 = cacheMap18.values();
        cacheMap18.readLock();
        boolean boolean21 = cacheMap9.containsValue((java.lang.Object) cacheMap18);
        boolean boolean22 = cacheMap9.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap23 = new org.apache.openjpa.util.CacheMap();
        cacheMap23.setCacheSize((int) (byte) 10);
        boolean boolean27 = cacheMap23.pin((java.lang.Object) 1);
        java.util.Collection collection28 = cacheMap23.values();
        boolean boolean29 = cacheMap23.isLRU();
        java.util.Set set30 = cacheMap23.getPinnedKeys();
        boolean boolean32 = cacheMap23.unpin((java.lang.Object) 0L);
        org.apache.openjpa.util.CacheMap cacheMap33 = new org.apache.openjpa.util.CacheMap();
        cacheMap33.setCacheSize((int) (byte) 10);
        java.lang.String str36 = cacheMap33.toString();
        boolean boolean37 = cacheMap33.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap40 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection41 = cacheMap40.values();
        java.lang.Object obj42 = cacheMap33.put((java.lang.Object) 100L, (java.lang.Object) collection41);
        java.util.Set set43 = cacheMap33.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap45 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection46 = cacheMap45.values();
        cacheMap45.readLock();
        boolean boolean48 = cacheMap33.pin((java.lang.Object) cacheMap45);
        cacheMap23.putAll((java.util.Map) cacheMap33);
        org.apache.openjpa.util.CacheMap cacheMap50 = new org.apache.openjpa.util.CacheMap();
        cacheMap50.setCacheSize((int) (byte) 10);
        java.lang.String str53 = cacheMap50.toString();
        org.apache.openjpa.util.CacheMap cacheMap54 = new org.apache.openjpa.util.CacheMap();
        boolean boolean55 = cacheMap54.isEmpty();
        java.lang.Object obj56 = cacheMap50.remove((java.lang.Object) cacheMap54);
        org.apache.openjpa.util.CacheMap cacheMap58 = new org.apache.openjpa.util.CacheMap();
        boolean boolean59 = cacheMap58.isEmpty();
        java.util.Set set60 = cacheMap58.entrySet();
        int int61 = cacheMap58.getCacheSize();
        java.lang.Object obj62 = cacheMap54.put((java.lang.Object) false, (java.lang.Object) int61);
        cacheMap54.setSoftReferenceSize((int) (short) 10);
        org.apache.openjpa.util.CacheMap cacheMap65 = new org.apache.openjpa.util.CacheMap();
        cacheMap65.setCacheSize(10);
        java.util.Set set68 = cacheMap65.entrySet();
        boolean boolean69 = cacheMap65.isLRU();
        boolean boolean70 = cacheMap54.containsValue((java.lang.Object) cacheMap65);
        cacheMap33.putAll((java.util.Map) cacheMap54, true);
        boolean boolean73 = cacheMap9.containsValue((java.lang.Object) cacheMap33);
        org.apache.openjpa.util.CacheMap cacheMap74 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj76 = cacheMap74.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap77 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj79 = cacheMap77.remove((java.lang.Object) (short) 1);
        cacheMap74.putAll((java.util.Map) cacheMap77, false);
        org.apache.openjpa.util.CacheMap cacheMap83 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection84 = cacheMap83.values();
        cacheMap83.readLock();
        boolean boolean86 = cacheMap74.containsValue((java.lang.Object) cacheMap83);
        java.util.Set set87 = cacheMap74.keySet();
        java.util.Collection collection88 = cacheMap74.values();
        java.lang.Object obj89 = cacheMap2.put((java.lang.Object) cacheMap9, (java.lang.Object) cacheMap74);
        java.lang.Object obj91 = cacheMap9.get((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "CacheMap:{}::{}" + "'", str36, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "CacheMap:{}::{}" + "'", str53, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1000 + "'", int61 == 1000);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertNotNull(collection88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNull(obj91);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = cacheMap10.pin(obj11);
        boolean boolean13 = cacheMap10.isLRU();
        cacheMap10.setCacheSize((int) (byte) -1);
        boolean boolean16 = cacheMap3.containsValue((java.lang.Object) cacheMap10);
        java.util.Set set17 = cacheMap10.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap18 = new org.apache.openjpa.util.CacheMap();
        cacheMap18.setCacheSize((int) (byte) 10);
        java.lang.String str21 = cacheMap18.toString();
        org.apache.openjpa.util.CacheMap cacheMap22 = new org.apache.openjpa.util.CacheMap();
        boolean boolean23 = cacheMap22.isEmpty();
        java.lang.Object obj24 = cacheMap18.remove((java.lang.Object) cacheMap22);
        org.apache.openjpa.util.CacheMap cacheMap26 = new org.apache.openjpa.util.CacheMap();
        boolean boolean27 = cacheMap26.isEmpty();
        java.util.Set set28 = cacheMap26.entrySet();
        int int29 = cacheMap26.getCacheSize();
        java.lang.Object obj30 = cacheMap22.put((java.lang.Object) false, (java.lang.Object) int29);
        boolean boolean31 = cacheMap22.isEmpty();
        java.util.Set set32 = cacheMap22.getPinnedKeys();
        int int33 = cacheMap22.size();
        java.lang.String str34 = cacheMap22.toString();
        org.apache.openjpa.util.CacheMap cacheMap35 = new org.apache.openjpa.util.CacheMap();
        cacheMap35.setCacheSize(10);
        java.lang.Object obj39 = cacheMap35.get((java.lang.Object) 100L);
        cacheMap35.clear();
        boolean boolean41 = cacheMap35.isLRU();
        boolean boolean42 = cacheMap22.pin((java.lang.Object) boolean41);
        boolean boolean43 = cacheMap10.containsValue((java.lang.Object) boolean42);
        cacheMap10.setSoftReferenceSize((int) 'a');
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CacheMap:{}::{}" + "'", str21, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1000 + "'", int29 == 1000);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "CacheMap:{false=1000}::{}" + "'", str34, "CacheMap:{false=1000}::{}");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj2 = cacheMap0.remove((java.lang.Object) (short) 1);
        org.apache.openjpa.util.CacheMap cacheMap3 = new org.apache.openjpa.util.CacheMap();
        java.lang.Object obj5 = cacheMap3.remove((java.lang.Object) (short) 1);
        cacheMap0.putAll((java.util.Map) cacheMap3, false);
        org.apache.openjpa.util.CacheMap cacheMap8 = new org.apache.openjpa.util.CacheMap();
        cacheMap8.setCacheSize((int) (byte) 10);
        boolean boolean12 = cacheMap8.pin((java.lang.Object) 1);
        cacheMap3.putAll((java.util.Map) cacheMap8, true);
        int int15 = cacheMap3.getSoftReferenceSize();
        java.lang.Object obj17 = cacheMap3.remove((java.lang.Object) (-1.0d));
        java.util.Set set18 = cacheMap3.entrySet();
        java.util.Set set19 = cacheMap3.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize(10);
        java.util.Set set3 = cacheMap0.entrySet();
        org.apache.openjpa.util.CacheMap cacheMap5 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection6 = cacheMap5.values();
        cacheMap5.readLock();
        java.lang.Object obj8 = cacheMap0.remove((java.lang.Object) cacheMap5);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap(false);
        org.apache.openjpa.util.CacheMap cacheMap13 = new org.apache.openjpa.util.CacheMap(true, (int) ' ');
        java.lang.Object obj14 = new java.lang.Object();
        boolean boolean15 = cacheMap13.pin(obj14);
        boolean boolean16 = cacheMap13.isLRU();
        cacheMap10.putAll((java.util.Map) cacheMap13, false);
        cacheMap5.putAll((java.util.Map) cacheMap10);
        cacheMap10.setSoftReferenceSize(1);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap7 = new org.apache.openjpa.util.CacheMap(true);
        java.util.Collection collection8 = cacheMap7.values();
        java.lang.Object obj9 = cacheMap0.put((java.lang.Object) 100L, (java.lang.Object) collection8);
        java.lang.String str10 = cacheMap0.toString();
        int int11 = cacheMap0.getSoftReferenceSize();
        boolean boolean12 = cacheMap0.isEmpty();
        boolean boolean13 = cacheMap0.isEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CacheMap:{100=[]}::{}" + "'", str10, "CacheMap:{100=[]}::{}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        boolean boolean4 = cacheMap0.pin((java.lang.Object) 1);
        java.util.Collection collection5 = cacheMap0.values();
        boolean boolean6 = cacheMap0.isLRU();
        java.util.Set set7 = cacheMap0.getPinnedKeys();
        java.lang.String str8 = cacheMap0.toString();
        cacheMap0.writeLock();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CacheMap:{}::{}" + "'", str8, "CacheMap:{}::{}");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.apache.openjpa.util.CacheMap cacheMap2 = new org.apache.openjpa.util.CacheMap(true, (int) (byte) 10);
        boolean boolean3 = cacheMap2.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        cacheMap0.setCacheSize((int) (byte) 10);
        java.lang.String str3 = cacheMap0.toString();
        boolean boolean4 = cacheMap0.isEmpty();
        boolean boolean5 = cacheMap0.isEmpty();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        boolean boolean7 = cacheMap6.isEmpty();
        java.lang.Object obj9 = cacheMap6.remove((java.lang.Object) 1);
        org.apache.openjpa.util.CacheMap cacheMap10 = new org.apache.openjpa.util.CacheMap();
        boolean boolean11 = cacheMap10.isEmpty();
        java.util.Set set12 = cacheMap10.entrySet();
        cacheMap10.setCacheSize((int) (short) 0);
        java.util.Set set15 = cacheMap10.getPinnedKeys();
        boolean boolean16 = cacheMap6.unpin((java.lang.Object) set15);
        java.lang.Object obj17 = cacheMap0.get((java.lang.Object) set15);
        java.util.Set set18 = cacheMap0.getPinnedKeys();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CacheMap:{}::{}" + "'", str3, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.openjpa.util.CacheMap cacheMap0 = new org.apache.openjpa.util.CacheMap();
        boolean boolean1 = cacheMap0.isEmpty();
        java.lang.Object obj3 = cacheMap0.remove((java.lang.Object) 1);
        org.apache.openjpa.util.CacheMap cacheMap4 = new org.apache.openjpa.util.CacheMap();
        java.util.Set set5 = cacheMap4.getPinnedKeys();
        org.apache.openjpa.util.CacheMap cacheMap6 = new org.apache.openjpa.util.CacheMap();
        cacheMap6.setCacheSize((int) (byte) 10);
        java.lang.String str9 = cacheMap6.toString();
        boolean boolean10 = cacheMap6.isEmpty();
        cacheMap4.putAll((java.util.Map) cacheMap6, true);
        cacheMap0.putAll((java.util.Map) cacheMap4, true);
        java.util.Set set15 = cacheMap4.entrySet();
        int int16 = cacheMap4.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CacheMap:{}::{}" + "'", str9, "CacheMap:{}::{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }
}
