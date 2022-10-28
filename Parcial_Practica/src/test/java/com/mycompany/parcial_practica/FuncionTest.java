/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.parcial_practica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GUSTAVO ORTIZ
 */
public class FuncionTest {
    
    public FuncionTest() {
    }
    

    /**
     * Test of ObtenerAccion method, of class Funcion.
     */
    @Test
    public void testObtenerAccion1() {
        System.out.println("ObtenerAccion1");
        Funcion instance = new Funcion();
        String expResult = "Actualizar";
        String result = instance.ObtenerAccion("si",true);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testObtenerAccion2() {
        System.out.println("ObtenerAccion2");
        Funcion instance = new Funcion();
        String expResult = "Matricular";
        String result = instance.ObtenerAccion("no",true);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testObtenerAccion3() {
        System.out.println("ObtenerAccion3");
        Funcion instance = new Funcion();
        String expResult = "actualizar";
        String result = instance.ObtenerAccion("porConfirmar",true);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
