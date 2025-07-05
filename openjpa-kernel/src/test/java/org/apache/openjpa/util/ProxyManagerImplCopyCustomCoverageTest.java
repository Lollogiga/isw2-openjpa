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

import org.apache.openjpa.util.testUtil.NonProxyableInstanceFinal;
import org.apache.openjpa.util.testUtil.ObjectType;
import org.apache.openjpa.util.testUtil.ProxyableInstance;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ProxyManagerImplCopyCustomCoverageTest {

    private ProxyManagerImpl proxyManager;
    private Object obj;
    private final ObjectType objectInstanceType;

    public ProxyManagerImplCopyCustomCoverageTest(ObjectType objectType) {
        this.objectInstanceType = objectType;
    }

    @Parameterized.Parameters(name = "{index}: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                // Questo caso farà sì che proxy sia NON nullo
                {ObjectType.PROXYABLE_BEAN},
                // Questo caso farà sì che proxy sia nullo
                {ObjectType.NON_PROXYABLE_BEAN}
        });
    }

    @Before
    public void setUp() {
        proxyManager = new ProxyManagerImpl();
        this.obj = generateInitialObject();
    }

    private Object generateInitialObject() {
        switch (objectInstanceType) {
            case PROXYABLE_BEAN:
                return new ProxyableInstance();
            case NON_PROXYABLE_BEAN:
                return new NonProxyableInstanceFinal();
            default:
                return null;
        }
    }

    @Test
    public void testCopyCustomTernaryOperator() {
        Object copy = proxyManager.copyCustom(obj);

        if (objectInstanceType == ObjectType.PROXYABLE_BEAN) {
            // Ramo proxy != null: ci aspettiamo una copia valida
            Assert.assertNotNull(copy);
            Assert.assertTrue("La copia deve essere un'istanza del tipo corretto", copy instanceof ProxyableInstance);
        } else if (objectInstanceType == ObjectType.NON_PROXYABLE_BEAN) {
            // Ramo proxy == null: ci aspettiamo null
            Assert.assertNull(copy);
        }
    }
}