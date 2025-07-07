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

import org.apache.openjpa.enhance.PersistenceCapable;
import org.junit.Before;
import org.junit.Test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

/**
 * Test case for {@link ProxyManagerImpl#newCustomProxy(Object, boolean)} to achieve high branch and mutation coverage.
 */
public class ProxyManagerNewCustomLLMTest {

    private ProxyManagerImpl proxyManager;

    // A simple mock proxy for testing the "already proxied" branch
    private static class MockProxy implements Proxy {
        @Override public void setOwner(org.apache.openjpa.kernel.OpenJPAStateManager sm, int field) {}
        @Override public org.apache.openjpa.kernel.OpenJPAStateManager getOwner() { return null; }
        @Override public int getOwnerField() { return 0; }
        @Override public ChangeTracker getChangeTracker() { return null; }
        @Override public Object copy(Object orig) { return null; }
    }

    // A simple POJO for bean proxy testing
    public static class MyPojo {
        private String value;
        public MyPojo() {}
        public String getValue() { return value; }
        public void setValue(String value) { this.value = value; }
    }

    // A bean without a no-arg constructor, making it unproxyable as a bean.
    public static class UnproxyableBean {
        public UnproxyableBean(String name) {}
    }


    @Before
    public void setUp() {
        // Initialize a new manager for each test to ensure isolation
        proxyManager = new ProxyManagerImpl();
    }

    // =================================================================
    // == BRANCH COVERAGE TESTS
    // =================================================================

    @Test
    public void newCustomProxy_withNull_shouldReturnNull() {
        // Test Branch: if (orig == null) -> true
        Proxy proxy = proxyManager.newCustomProxy(null, false);
        assertNull("Proxy should be null for null input.", proxy);
    }

    @Test
    public void newCustomProxy_withExistingProxy_shouldReturnSameInstance() {
        // Test Branch: if (orig instanceof Proxy) -> true
        Proxy originalProxy = new MockProxy();
        Proxy resultProxy = proxyManager.newCustomProxy(originalProxy, false);
        assertSame("Should return the same instance if it's already a Proxy.", originalProxy, resultProxy);
    }

    @Test
    public void newCustomProxy_withManageableEntity_shouldReturnNull() {
        // Test Branch: if (ImplHelper.isManageable(orig)) -> true
        // PersistenceCapable is the marker interface for manageable entities.
        PersistenceCapable manageableObject = mock(PersistenceCapable.class);
        Proxy proxy = proxyManager.newCustomProxy(manageableObject, false);
        assertNull("Proxy should be null for manageable (PersistenceCapable) objects.", proxy);
    }

    @Test
    public void newCustomProxy_withFinalClass_shouldReturnNull() {
        // Test Branch: if (!isProxyable(orig.getClass())) -> true (for final class)
        // String is a final class and thus not proxyable by extension.
        Proxy proxy = proxyManager.newCustomProxy("a final string", false);
        assertNull("Proxy should be null for final classes like String.", proxy);
    }

    @Test
    public void newCustomProxy_withConfiguredUnproxyableType_shouldReturnNull() {
        // Test Branch: if (!isProxyable(orig.getClass())) -> true (for configured class)
        proxyManager.getUnproxyable().add(MyPojo.class.getName());
        Proxy proxy = proxyManager.newCustomProxy(new MyPojo(), false);
        assertNull("Proxy should be null for types configured as unproxyable.", proxy);
    }

    // =================================================================
    // == TYPE-SPECIFIC BRANCH TESTS
    // =================================================================

    @Test
    public void newCustomProxy_withArrayList_shouldReturnCollectionProxy() {
        // Test Branch: if (orig instanceof Collection) -> true
        Collection<String> originalList = new ArrayList<>();
        Proxy proxy = proxyManager.newCustomProxy(originalList, false);

        assertNotNull("Proxy should not be null for an ArrayList.", proxy);
        assertTrue("Proxy should be an instance of Collection.", proxy instanceof Collection);
    }

    @Test
    public void newCustomProxy_withTreeSet_shouldReturnSortedSetProxy() {
        // Test Branch: if (orig instanceof SortedSet) -> true
        Comparator<String> reverseComparator = Comparator.reverseOrder();
        SortedSet<String> originalSet = new TreeSet<>(reverseComparator);
        Proxy proxy = proxyManager.newCustomProxy(originalSet, false);

        assertNotNull(proxy);
        assertTrue(proxy instanceof SortedSet);
        assertEquals("Comparator must be preserved in the proxy.", reverseComparator, ((SortedSet<?>) proxy).comparator());
    }

    @Test
    public void newCustomProxy_withHashMap_shouldReturnMapProxy() {
        // Test Branch: if (orig instanceof Map) -> true
        Map<String, Integer> originalMap = new HashMap<>();
        Proxy proxy = proxyManager.newCustomProxy(originalMap, false);

        assertNotNull("Proxy should not be null for a HashMap.", proxy);
        assertTrue("Proxy should be an instance of Map.", proxy instanceof Map);
    }

    @Test
    public void newCustomProxy_withTreeMap_shouldReturnSortedMapProxy() {
        // Test Branch: if (orig instanceof SortedMap) -> true
        Comparator<String> customComparator = String.CASE_INSENSITIVE_ORDER;
        SortedMap<String, Integer> originalMap = new TreeMap<>(customComparator);
        Proxy proxy = proxyManager.newCustomProxy(originalMap, false);

        assertNotNull(proxy);
        assertTrue(proxy instanceof SortedMap);
        assertEquals("Comparator must be preserved in the proxy.", customComparator, ((SortedMap<?, ?>) proxy).comparator());
    }

    @Test
    public void newCustomProxy_withDate_shouldReturnDateProxy() {
        // Test Branch: if (orig instanceof Date) -> true
        Date originalDate = new Date();
        Proxy proxy = proxyManager.newCustomProxy(originalDate, false);

        assertNotNull("Proxy should not be null for a Date.", proxy);
        assertTrue("Proxy should be an instance of Date.", proxy instanceof Date);
        assertEquals("Time value should be copied.", originalDate.getTime(), ((Date) proxy).getTime());
    }

    @Test
    public void newCustomProxy_withTimestamp_shouldCopyNanos() {
        // Test Branch: if (orig instanceof Timestamp) -> true
        Timestamp originalTimestamp = new Timestamp(System.currentTimeMillis());
        originalTimestamp.setNanos(123456);

        Proxy proxy = proxyManager.newCustomProxy(originalTimestamp, false);

        assertNotNull(proxy);
        assertTrue(proxy instanceof Timestamp);
        assertEquals("Nanoseconds should be copied for Timestamps.", 123456, ((Timestamp) proxy).getNanos());
    }

    @Test
    public void newCustomProxy_withCalendar_shouldReturnCalendarProxy() {
        // Test Branch: if (orig instanceof Calendar) -> true
        Calendar originalCalendar = new GregorianCalendar();
        Proxy proxy = proxyManager.newCustomProxy(originalCalendar, false);

        assertNotNull("Proxy should not be null for a Calendar.", proxy);
        assertTrue("Proxy should be an instance of Calendar.", proxy instanceof Calendar);
        assertEquals("Time in millis should be copied.", originalCalendar.getTimeInMillis(), ((Calendar) proxy).getTimeInMillis());
    }

    @Test
    public void newCustomProxy_withProxyableBean_shouldReturnBeanProxy() {
        // Test Fallback Branch: ProxyBean logic
        MyPojo pojo = new MyPojo();
        Proxy proxy = proxyManager.newCustomProxy(pojo, false);

        assertNotNull("Proxy should not be null for a proxyable POJO.", proxy);
        assertTrue("Proxy should be an instance of MyPojo.", proxy instanceof MyPojo);
    }

    @Test
    public void newCustomProxy_withUnproxyableBean_shouldReturnNull() {
        // Test Fallback Branch: if (proxy == null) -> true
        // This bean lacks a no-arg constructor, so getFactoryProxyBean should fail.
        UnproxyableBean bean = new UnproxyableBean("test");
        Proxy proxy = proxyManager.newCustomProxy(bean, false);

        assertNull("Proxy should be null for a bean without a valid constructor.", proxy);
    }

    // =================================================================
    // == MUTATION COVERAGE TESTS
    // =================================================================

    @Test
    public void newCustomProxy_withEmptyArrayList_shouldReturnEmptyProxy() {
        // Kills mutants that mishandle empty collections (Boundary Mutant)
        Collection<String> originalList = new ArrayList<>();
        Proxy proxy = proxyManager.newCustomProxy(originalList, false);

        Collection<?> proxiedList = (Collection<?>) proxy;
        assertTrue("Proxy of an empty list should be empty.", proxiedList.isEmpty());
    }

    @Test
    public void newCustomProxy_withPopulatedArrayList_shouldCopyElements() {
        // Kills mutants that delete `c.addAll(orig)` (Statement Deletion)
        Collection<String> originalList = new ArrayList<>();
        originalList.add("test-element");

        Proxy proxy = proxyManager.newCustomProxy(originalList, false);

        Collection<?> proxiedList = (Collection<?>) proxy;
        assertEquals("Proxy collection should have the same size.", 1, proxiedList.size());
        assertTrue("Proxy collection should contain the original elements.", proxiedList.contains("test-element"));
    }

    @Test
    public void newCustomProxy_withPopulatedHashMap_shouldCopyEntries() {
        // Kills mutants that delete `m.putAll(orig)` (Statement Deletion)
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("key1", 123);

        Proxy proxy = proxyManager.newCustomProxy(originalMap, false);

        Map<?, ?> proxiedMap = (Map<?, ?>) proxy;
        assertEquals("Proxy map should have the same size.", 1, proxiedMap.size());
        assertEquals("Proxy map should contain the original values.", 123, proxiedMap.get("key1"));
    }
}