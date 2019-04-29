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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Gault
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({kms.MenuItemTest.class, kms.AlcoholTest.class, 
    kms.assets.AssetsSuite.class, kms.IngredientTest.class, 
    kms.MenuTest.class, kms.IngredientDBTest.class})
public class KmsSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
