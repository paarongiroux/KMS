/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kms;

import java.util.ArrayList;

/**
 *
 * @author Gault
 */
public class Menu 
{
    private static double tax;
    private ArrayList<MenuItem> menuItems;
    
    
    public Menu(double stateTax)
    {
        tax = stateTax;
    }
    
    public static double getTax()
    {
        return tax;
    }
    
    public void setTax( double newTax )
    {
        tax = newTax;
    }
    
    public void addItem(MenuItem item)
    {
        menuItems.add(item);
    }
    
    // TODO
    // Iterates through the menuItems ArrayList and adds them to the display.
    public void displayMenuItems()
    {
        for( MenuItem item : menuItems )
        {
            
        }
    }
    
    
    
}
