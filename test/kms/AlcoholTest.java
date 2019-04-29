/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kms;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gault
 */
public class AlcoholTest {
    
    public AlcoholTest() {
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
     * Test of setStateTax method, of class Alcohol.
     */
    @Test
    public void testSetStateTax() 
    {
        System.out.println("setStateTax");
        double tax = 0.0;
        Alcohol instance = new Alcohol( "Martini", 5.40, true );
        instance.setStateTax(tax);
    }

    /**
     * Test of getStateTax method, of class Alcohol.
     */
    @Test
    public void testGetStateTax() 
    {
        System.out.println("getStateTax");
        Alcohol instance = new Alcohol( "Martini", 5.40, true );
        double expResult = 0.07;
        instance.setStateTax(expResult);
        double result = instance.getStateTax();
        assertEquals( expResult, result, 0.07 );
    }

    /**
     * Test of getPrice method, of class Alcohol.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Alcohol instance = new Alcohol( "Martini", 5.40, true );
        double tax = 0.07;
        instance.setStateTax(tax);
        double expResult = 5.778;
        double result = instance.getPrice();
        assertEquals(expResult, result, 5.778);
    }
    
}
