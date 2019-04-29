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
public class IngredientTest {
    
    public IngredientTest() {
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
     * Test of setName method, of class Ingredient.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String expResult = "Tomato";
        Ingredient instance = new Ingredient("Lettuce", 0.10);
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Ingredient.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Lettuce";
        Ingredient instance = new Ingredient(expResult, 0.10);
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrice method, of class Ingredient.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        double expResult = 0.10;
        Ingredient instance = new Ingredient("Lettuce", expResult);
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.10);
    }

    /**
     * Test of setPrice method, of class Ingredient.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double expResult = 1.0;
        Ingredient instance = new Ingredient("Lettuce", 0.10);
        instance.setPrice(expResult);
        double result = instance.getPrice();
        assertEquals( expResult, result, 1.0 );
    }

    /**
     * Test of checkIfAvailable method, of class Ingredient.
     */
    @Test
    public void testCheckIfAvailable() {
        System.out.println("checkIfAvailable");
        Ingredient instance = new Ingredient("Lettuce", 0.10);
        // Default value for availability is false.
        boolean expResult = false;
        boolean result = instance.checkIfAvailable();
        assertEquals(expResult, result);
    }

    /**
     * Test of toggleAvailable method, of class Ingredient.
     */
    @Test
    public void testToggleAvailable() {
        System.out.println("toggleAvailable");
        Ingredient instance = new Ingredient("Lettuce", 0.10);
        // Default value for availability is false, so 
        // toggling the default should return true.
        boolean expResult1 = true;
        boolean expResult2 = false;
        instance.toggleAvailable();
        boolean result1 = instance.checkIfAvailable();
        assertEquals(expResult1, result1);
        
        // Toggle the availability back to false.
        instance.toggleAvailable();
        boolean result2 = instance.checkIfAvailable();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of getUnits method, of class Ingredient.
     */
    @Test
    public void testGetandSetUnits() {
        System.out.println("getUnits");
        Ingredient instance = new Ingredient("Lettuce", 0.10);
        String expResult = "ounces";
        instance.setUnits(expResult);
        String result = instance.getUnits();
        assertEquals(expResult, result);
    }
    
}
