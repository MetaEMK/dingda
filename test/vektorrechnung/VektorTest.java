/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vektorrechnung;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author j.benecke2
 */


public class VektorTest {
    Vektor v1 =new Vektor(1,2,3);
    Vektor v2 = new Vektor(2,3,5); 
    public VektorTest() {
        System.out.println("Hallo, is da jemand nee ok");
        System.out.println("ok schüüüs");
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of plus method, of class Vektor.
     */
    @Test
    public void testPlus() {
        System.out.println("plus");
        Vektor that = v1;
        Vektor instance = v2;
        Vektor expResult = new Vektor(3.0,5.0,8.0);
        Vektor result = instance.plus(that);
        assertEquals(expResult.toString(), result.toString());

    }

    /**
     * Test of minus method, of class Vektor.
     */
    @Test
    public void testMinus() {
        System.out.println("minus");
        Vektor that = v1;
        Vektor instance = v2;
        Vektor expResult = new Vektor(1.0,1.0,2.0);
        Vektor result = instance.minus(that);
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of skalar method, of class Vektor.
     */
    @Test
    public void testSkalar() {
        System.out.println("skalar");
        Vektor that = v1;
        Vektor instance = v2;
        double expResult =23;
        double result = instance.skalar(that);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of kreuz method, of class Vektor.
     */
    @Test
    public void testKreuz() {
        System.out.println("kreuz");
        Vektor that = v1;
        Vektor instance = v2;
        Vektor expResult = new Vektor(-1.0,-1.0,1.0);
        Vektor result = instance.kreuz(that);
         assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of quersumme method, of class Vektor.
     */
    @Test
    public void testQuersumme() {
        System.out.println("quersumme");
        Vektor instance = v2;
        double expResult = 10;
        double result = instance.quersumme();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of toString method, of class Vektor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vektor instance = v1;
        String expResult = "(1.0,2.0,3.0)";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
