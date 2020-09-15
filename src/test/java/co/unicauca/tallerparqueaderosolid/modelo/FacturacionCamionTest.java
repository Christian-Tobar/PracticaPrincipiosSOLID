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
public class FacturacionCamionTest {
    
    public FacturacionCamionTest() {
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
     * Test of calcularCosto method, of class FacturacionCamion.
     */
    @Test
    public void testCalcularCosto1() {
        System.out.println("calcularCosto");
        double horas = 24.0;
        FacturacionCamion instance = new FacturacionCamion();
        int expResult = 15000;
        int result = instance.calcularCosto(horas);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testCalcularCosto2() {
        System.out.println("calcularCosto");
        double horas = 12.0;
        FacturacionCamion instance = new FacturacionCamion();
        int expResult = 10000;
        int result = instance.calcularCosto(horas);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testCalcularCosto3() {
        System.out.println("calcularCosto");
        double horas = 3.0;
        FacturacionCamion instance = new FacturacionCamion();
        int expResult = 10000;
        int result = instance.calcularCosto(horas);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testCalcularCosto4() {
        System.out.println("calcularCosto");
        double horas = 36.0;
        FacturacionCamion instance = new FacturacionCamion();
        int expResult = 22500;
        int result = instance.calcularCosto(horas);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testCalcularCosto5() {
        System.out.println("calcularCosto");
        double horas = 13.0;
        FacturacionCamion instance = new FacturacionCamion();
        int expResult = 15000;
        int result = instance.calcularCosto(horas);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
