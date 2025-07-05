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
import org.apache.openjpa.util.testUtil.NonProxyableNoValidConstructor;
import org.apache.openjpa.util.testUtil.ObjectType;
import org.apache.openjpa.util.testUtil.ProxyableInstance;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.MockedStatic;

import java.util.*;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class ProxyManagerImplNewCustomProxyTest {

    private ProxyManagerImpl proxyManager;
    private Object obj;
    private final ObjectType objectInstanceType;
    private MockedStatic<ImplHelper> mockImpl;

    public ProxyManagerImplNewCustomProxyTest(ObjectType objectType) throws Exception {
        this.obj = generateObj(objectType);
        this.objectInstanceType = objectType;
    }

    @Parameterized.Parameters(name = "{index}: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {ObjectType.NULL},
                {ObjectType.PROXYABLE},
                {ObjectType.NON_PROXYABLE_FINAL},
                {ObjectType.NON_PROXYABLE_CONSTRUCTOR},
                {ObjectType.PROXY},
                {ObjectType.COLLECTION},
                {ObjectType.MAP},
                {ObjectType.DATE},
                {ObjectType.CALENDAR},
                {ObjectType.MANAGEABLE_TYPE}
        });
    }

    @Before
    public void setUp() {
        proxyManager = new ProxyManagerImpl();

        if (objectInstanceType.equals(ObjectType.PROXY)) {
            // Per il test 'PROXY', l'oggetto di input deve essere un proxy
            obj = proxyManager.newDateProxy(Date.class);
        }

        if (objectInstanceType.equals(ObjectType.MANAGEABLE_TYPE)) {
            // Simula il comportamento di un tipo gestito da OpenJPA
            mockImpl = mockStatic(ImplHelper.class);
            when(ImplHelper.isManageable(any())).thenReturn(true);
        }
    }

    @Test
    public void testNewCustomProxy() {
        Proxy output = proxyManager.newCustomProxy(obj, false);

        checkResult(output);
    }

    private Object generateObj(ObjectType objectType) throws Exception {
        switch (objectType) {
            case NULL:
                return null;

            case PROXY:
            case MANAGEABLE_TYPE:
                // Per questi casi, l'oggetto reale viene gestito nel setUp.
                return new ProxyableInstance();

            case PROXYABLE:
                return new ProxyableInstance();

            case NON_PROXYABLE_FINAL:
                return new NonProxyableInstanceFinal();

            case NON_PROXYABLE_CONSTRUCTOR:
                // Passiamo la classe perché non possiamo istanziarla.
                // Il metodo newCustomProxy dovrebbe comunque gestirla correttamente.
                return NonProxyableNoValidConstructor.class;

            case COLLECTION:
                return new ArrayList<>(Arrays.asList(1, 2));

            case MAP:
                Map<String, Integer> map = new HashMap<>();
                map.put("A", 1);
                return map;

            case DATE:
                return new Date();

            case CALENDAR:
                return Calendar.getInstance();

            default:
                throw new Exception("Tipo di oggetto non valido per il test");
        }
    }

    private void checkResult(Proxy output) {
        // Questo metodo contiene tutte le asserzioni, divise per caso di test
        switch (objectInstanceType) {
            case NULL:
            case MANAGEABLE_TYPE:
            case NON_PROXYABLE_FINAL:
            case NON_PROXYABLE_CONSTRUCTOR:
                // In tutti questi casi, non ci aspettiamo la creazione di un proxy
                Assert.assertNull(output);
                break;

            case PROXY:
                // Se l'oggetto è già un proxy, ci aspettiamo che venga restituita la stessa istanza
                Assert.assertNotNull(output);
                Assert.assertSame(obj, output);
                break;

            case PROXYABLE:
            case COLLECTION:
            case MAP:
            case DATE:
            case CALENDAR:
                Assert.assertNotNull("Il proxy non doveva essere null", output);
                Assert.assertTrue("L'output deve essere un'istanza di Proxy", output instanceof Proxy);
                // Verifica che il proxy sia un sottotipo della classe originale
                Assert.assertTrue("Il proxy deve essere un'istanza del tipo originale", obj.getClass().isAssignableFrom(output.getClass()));
                break;
        }
    }

    @After
    public void tearDown() {
        proxyManager = null;
        obj = null;
        // Chiudiamo il mock statico per evitare interferenze con altri test
        if (mockImpl != null) {
            mockImpl.close();
        }
    }
}