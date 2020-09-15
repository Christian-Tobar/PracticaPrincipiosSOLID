/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tallerparqueaderosolid.modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chris
 */
public class FacturacionCarroTest {
    
    public FacturacionCarroTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcularCosto method, of class FacturacionCarro.
     */
@Test
    public void testCalcularCosto1() {
        System.out.println("calcularCosto");
        double horas = 1.0;
        FacturacionCarro instance = new FacturacionCarro();
        int expResult = 2000;
        int result = instance.calcularCosto(horas);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testCalcularCosto2() {
        System.out.println("calcularCosto");
        double horas = 0.3;
        FacturacionCarro instance = new FacturacionCarro();
        int expResult = 2000;
        int result = instance.calcularCosto(horas);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testCalcularCosto3() {
        System.out.println("calcularCosto");
        double horas = 2.0;
        FacturacionCarro instance = new FacturacionCarro();
        int expResult = 3000;
        int result = instance.calcularCosto(horas);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
     @Test
    public void testCalcularCosto4() {
        System.out.println("calcularCosto");
        double horas = 24;
        FacturacionCarro instance = new FacturacionCarro();
        int expResult = 25000;
        int result = instance.calcularCosto(horas);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testCalcularCosto5() {
        System.out.println("calcularCosto");
        double horas = 1.5;
        FacturacionCarro instance = new FacturacionCarro();
        int expResult = 2500;
        int result = instance.calcularCosto(horas);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
