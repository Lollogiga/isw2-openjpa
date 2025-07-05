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

import org.apache.openjpa.util.testUtil.ObjectType;
import org.apache.openjpa.util.testUtil.ProxyableInstance; // Usiamo questa classe
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.sql.Timestamp;
import java.util.*;

@RunWith(Parameterized.class)
public class ProxyManagerImplNewCustomProxyCoverageTest {

    private ProxyManagerImpl proxyManager;
    private Object obj;
    private final ObjectType objectInstanceType;

    public ProxyManagerImplNewCustomProxyCoverageTest(ObjectType objectType) {
        this.objectInstanceType = objectType;
    }

    @Parameterized.Parameters(name = "{index}: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {ObjectType.SORTED_SET_WITH_COMPARATOR},
                {ObjectType.SORTED_MAP_WITH_COMPARATOR},
                {ObjectType.TIMESTAMP},
                {ObjectType.PROXYABLE_BEAN}
        });
    }

    @Before
    public void setUp() {
        proxyManager = new ProxyManagerImpl();
        this.obj = generateInitialObject();
    }

    private Object generateInitialObject() {
        switch (objectInstanceType) {
            case SORTED_SET_WITH_COMPARATOR:
                return new TreeSet<>(Comparator.reverseOrder());
            case SORTED_MAP_WITH_COMPARATOR:
                return new TreeMap<>(Comparator.reverseOrder());
            case TIMESTAMP:
                Timestamp ts = new Timestamp(System.currentTimeMillis());
                ts.setNanos(123456);
                return ts;
            case PROXYABLE_BEAN:
                return new ProxyableInstance();
            default:
                return null;
        }
    }

    @Test
    public void testNewCustomProxyCoverage() {
        Proxy proxy = proxyManager.newCustomProxy(obj, false);

        Assert.assertNotNull("Il proxy non deve essere null", proxy);

        switch (objectInstanceType) {
            case SORTED_SET_WITH_COMPARATOR:
                Assert.assertTrue("Il proxy deve essere un SortedSet", proxy instanceof SortedSet);
                break;
            case SORTED_MAP_WITH_COMPARATOR:
                Assert.assertTrue("Il proxy deve essere un SortedMap", proxy instanceof SortedMap);
                break;
            case TIMESTAMP:
                Assert.assertTrue("Il proxy deve essere un Timestamp", proxy instanceof Timestamp);
                Assert.assertEquals("I nanosecondi devono essere mantenuti",
                        ((Timestamp) obj).getNanos(), ((Timestamp) proxy).getNanos());
                break;
            case PROXYABLE_BEAN:
                Assert.assertTrue("Il proxy deve essere un'istanza di ProxyableInstance",
                        proxy instanceof ProxyableInstance);
                break;
        }
    }
}