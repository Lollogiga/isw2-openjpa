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
import org.apache.openjpa.util.testUtil.ProxyableInstance;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.util.*;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class ProxyManagerImplCopyCustomTest {

    private ProxyManagerImpl proxyManager;
    private Object obj;
    private final ObjectType objectInstanceType;
    private MockedStatic<ImplHelper> mockImpl;

    public ProxyManagerImplCopyCustomTest(ObjectType objectType) {
        this.objectInstanceType = objectType;
    }

    @Parameterized.Parameters(name = "{index}: {0}")
    public static Collection<Object[]> data() {
        // Analisi eseguita in black-box al fine di avere un'alta coverage fin da subito:
        // Questi scenari coprono ogni ramo 'if' del metodo copyCustom

        return Arrays.asList(new Object[][]{
                {ObjectType.NULL},                 // if (orig == null)
                {ObjectType.PROXY},                // if (orig instanceof Proxy)
                {ObjectType.MANAGEABLE_TYPE},      // if (ImplHelper.isManageable(orig))
                {ObjectType.COLLECTION},           // if (orig instanceof Collection)
                {ObjectType.MAP},                  // if (orig instanceof Map)
                {ObjectType.DATE},                 // if (orig instanceof Date)
                {ObjectType.CALENDAR},             // if (orig instanceof Calendar)
                {ObjectType.PROXYABLE}             // L'ultimo caso, per ProxyBean
        });
    }

    @Before
    public void setUp() {
        proxyManager = new ProxyManagerImpl();
        // Genera l'oggetto di input basandosi sullo scenario di test
        this.obj = generateInitialObject();

        if (objectInstanceType.equals(ObjectType.MANAGEABLE_TYPE)) {
            mockImpl = mockStatic(ImplHelper.class);
            when(ImplHelper.isManageable(any())).thenReturn(true);
        }
    }

    private Object generateInitialObject() {
        switch (objectInstanceType) {
            case NULL:
                return null;
            case PROXY:
                //Modified for remove mutation 294
                Proxy proxyMock = Mockito.mock(Proxy.class);
                Date copiedDate = new Date(12345);
                Mockito.when(proxyMock.copy(proxyMock)).thenReturn(copiedDate);
                return proxyMock;
            case COLLECTION:
                return new ArrayList<>(Arrays.asList("test"));
            case MAP:
                Map<String, String> map = new HashMap<>();
                map.put("key", "value");
                return map;
            case DATE:
                return new Date();
            case CALENDAR:
                return Calendar.getInstance();
            case MANAGEABLE_TYPE:
            case PROXYABLE:
                return new ProxyableInstance();
            default:
                return null;
        }
    }

    @Test
    public void testCopyCustom() {
        // Act: esegue il metodo da testare
        Object copy = proxyManager.copyCustom(obj);

        // Assert: verifica che il risultato sia corretto per lo scenario corrente
        assertResult(copy);
    }

    private void assertResult(Object copy) {
        switch (objectInstanceType) {
            case NULL:
            case MANAGEABLE_TYPE:
                Assert.assertNull(copy);
                break;

            case PROXY:
                // Caso speciale per la copia di un proxy
                Assert.assertNotNull(copy);
                Assert.assertNotSame("La copia non deve essere la stessa istanza dell'originale", obj, copy);
                // La copia deve essere un'istanza della classe base, NON del proxy
                Assert.assertTrue(copy instanceof Date);
                Assert.assertFalse("La copia non deve più essere un'istanza di Proxy", copy instanceof Proxy);
                Assert.assertEquals(new Date(12345), copy);
                break;

            case COLLECTION:
            case MAP:
            case DATE:
            case CALENDAR:
            case PROXYABLE:
                Assert.assertNotNull(copy);
                Assert.assertNotSame("La copia non deve essere la stessa istanza dell'originale", obj, copy);
                Assert.assertEquals("La classe della copia deve corrispondere all'originale", obj.getClass(), copy.getClass());
                break;
        }
    }


    @After
    public void tearDown() {
        proxyManager = null;
        obj = null;
        // Chiude il mock statico per non interferire con altri test
        if (mockImpl != null) {
            mockImpl.close();
        }
    }
}