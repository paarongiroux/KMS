/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kms;

import java.util.ArrayList;
import javax.swing.ImageIcon;
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
public class MenuItemTest {
    
    public MenuItemTest() {
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
     * Test of getPrice method, of class MenuItem.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        double expResult = 5.55;
        MenuItem instance = new MenuItem("Borgar", expResult, true);
        double result = instance.getPrice();
        assertEquals(expResult, result, 5.55);
    }

    /**
     * Test of setPrice method, of class MenuItem.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double expResult = 6.66;
        MenuItem instance = new MenuItem("Borgar", 5.55, true);
        instance.setPrice(expResult);
        double result = instance.getPrice();
        assertEquals(expResult, result, 6.66);
    }

    /**
     * Test of getName method, of class MenuItem.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Borgar";
        MenuItem instance = new MenuItem(expResult, 5.55, true);
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class MenuItem.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String expResult = "Burger";
        MenuItem instance = new MenuItem("Borgar", 5.55, true);
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of checkAvailability method, of class MenuItem.
     */
    @Test
    public void testCheckAvailability() {
        System.out.println("checkAvailability");
        MenuItem instance = new MenuItem("Borgar", 5.55, true);
        boolean expResult = true;
        boolean result = instance.checkAvailability();
        assertEquals(expResult, result);
    }

    /**
     * Test of toggleAvailability method, of class MenuItem.
     */
    @Test
    public void testToggleAvailability() {
        System.out.println("toggleAvailability");
        MenuItem instance = new MenuItem("Borgar", 5.55, true);
        instance.toggleAvailability();
        boolean expResult = false;
        boolean result = instance.checkAvailability();
        assertEquals( expResult, result);
    }

    /**
     * Test of getIngredients method, of class MenuItem.
     */
    @Test
    public void testGetIngredients() {
        System.out.println("getIngredients");
        MenuItem instance = new MenuItem("Borgar", 5.55, true);
        
        // Create an empty arraylist for comparison.
        ArrayList<Ingredient> expResult = new ArrayList<Ingredient>();
        
        ArrayList<Ingredient> result = instance.getIngredients();
        assertEquals(expResult, result);
    }

    /**
     * Test of addIngredient method, of class MenuItem.
     */
    @Test
    public void testAddIngredient() {
        System.out.println("addIngredient");
        boolean expResult = false;
        
        MenuItem instance = new MenuItem("Borgar", 5.55, true);
        instance.addIngredient(new Ingredient("Lettuce", 0.10));
        
        boolean result = instance.getIngredients().isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of removeIngredient method, of class MenuItem.
     */
    @Test
    public void testRemoveIngredient() {
        System.out.println("removeIngredient");
        
        boolean expResult = true;
        
        MenuItem instance = new MenuItem("Borgar", 5.55, true);
        
        Ingredient toRemove = new Ingredient("Lettuce", 0.10);
        
        instance.addIngredient(toRemove);
        instance.removeIngredient(toRemove);
        boolean result = instance.getIngredients().isEmpty();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of removeAllIngredients method, of class MenuItem.
     */
    @Test
    public void testRemoveAllIngredients() {
        System.out.println("removeAllIngredients");
        
        boolean expResult = true;
        
        MenuItem instance = new MenuItem("Borgar", 5.55, true);
        
        Ingredient toRemove1 = new Ingredient("Lettuce", 0.10);
        Ingredient toRemove2 = new Ingredient("Tomato", 0.20);
        Ingredient toRemove3 = new Ingredient("Beef", 0.90);
        
        instance.addIngredient(toRemove1);
        instance.addIngredient(toRemove2);
        instance.addIngredient(toRemove3);
        
        instance.removeAllIngredients();
        
        boolean result = instance.getIngredients().isEmpty();
        
        assertEquals(expResult, result);
    }
    
}
