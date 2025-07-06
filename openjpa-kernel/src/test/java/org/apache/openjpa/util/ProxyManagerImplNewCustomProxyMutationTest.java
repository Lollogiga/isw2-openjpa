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

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.*;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ProxyManagerImplNewCustomProxyMutationTest {

    private final ProxyManagerImpl proxyManager = new ProxyManagerImpl();
    private final String KEY = "K1";
    private final String VALUE = "V1";


    //Mutation 351
    @Test
    public void testNonProxyableClass_returnsNull() {
        // GIVEN an object of a class that is not proxyable
        Object nonProxyable = new Object();

        // WHEN newCustomProxy is called
        Proxy result = proxyManager.newCustomProxy(nonProxyable, false);

        // THEN it should return null
        assertNull("Expected null for non-proxyable class", result);
    }


    //Mutation 333
    @Test
    public void testMap_putAllCalled() {
        // GIVEN a map with content
        Map<String, String> original = new HashMap<>();
        original.put(KEY, VALUE);

        Proxy proxy = proxyManager.newCustomProxy(original, false);

        assertTrue(proxy instanceof Map);
        Map<?, ?> proxiedMap = (Map<?, ?>) proxy;
        assertEquals("Map content must be preserved", VALUE, proxiedMap.get(KEY));
    }

    //Mutation 338
    @Test
    public void testDate_setTimeCalled() {
        Date original = new Date(123456789L);

        Proxy proxy = proxyManager.newCustomProxy(original, false);

        assertTrue(proxy instanceof Date);
        assertEquals("Date time must be preserved", original.getTime(), ((Date) proxy).getTime());
    }

    //Mutation 346
    @Test
    public void testCalendar_setTimeInMillisCalled() {
        Calendar original = Calendar.getInstance();
        original.setTimeInMillis(987654321L);

        Proxy proxy = proxyManager.newCustomProxy(original, false);

        assertTrue(proxy instanceof Calendar);
        assertEquals("Calendar time must be preserved", original.getTimeInMillis(), ((Calendar) proxy).getTimeInMillis());
    }

}
