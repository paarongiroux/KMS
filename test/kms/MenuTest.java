/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kms;

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
public class MenuTest {
    
    public MenuTest() {
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
     * Test of getTax method, of class Menu.
     */
    @Test
    public void testGetTax() {
        System.out.println("getTax");
        double expResult = 0.0;
        double result = Menu.getTax();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setTax method, of class Menu.
     */
    @Test
    public void testSetTax() {
        System.out.println("setTax");
        double expResult = 0.07;
        Menu instance = new Menu(0.0);
        instance.setTax(expResult);
        double result = instance.getTax();
        assertEquals(expResult, result, 0.07);
    }

    /**
     * Test of getMenuItem method, of class Menu.
     */
    @Test
    public void testAddandGetMenuItem() {
        System.out.println("getMenuItem");
        
        Menu instance = new Menu(0.0);
        MenuItem expResult = new MenuItem("Lettuce", 0.0, true);
        instance.addItem(expResult);
        MenuItem result = instance.getMenuItem("Lettuce");
        assertEquals(expResult, result);
    }
    
}
