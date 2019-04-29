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
public class IngredientDBTest {
    
    public IngredientDBTest() {
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
     * Test of addIngredientToDB method, of class IngredientDB.
     * Note: this requires a fresh database.
     */
    @Test
    public void testAddIngredientToDB() {
        System.out.println("addIngredientToDB");
        Ingredient ingredient = new Ingredient("lettuce", 0.10);
        double startingNumUnits = 100;
        IngredientDB instance = new IngredientDB();
        boolean expResult = true;
        boolean result = instance.addIngredientToDB(ingredient, startingNumUnits);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateIngredient method, of class IngredientDB.
     * Note: this requires that an instance of lettuce was added to the DB.
     */
    @Test
    public void testUpdateIngredient() {
        System.out.println("updateIngredient");
        Ingredient ingredient = null;
        double change = -1.0;
        IngredientDB instance = new IngredientDB();
        boolean expResult = true;
        boolean result = instance.updateIngredient(ingredient, change);
        assertEquals(expResult, result);
    }
    
}
