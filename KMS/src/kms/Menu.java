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
    private ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
    
    
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
    
    public MenuItem getMenuItem(String name)
    {
        for( MenuItem item : menuItems )
        {
            if (item.getName() == name)
            {
                return item;
            }
        }
        return null;
    }
    
    public double getMenuItemPrice(String name)
    {
        for( MenuItem item : menuItems )
        {
            if (item.getName() == name)
            {
                return item.getPrice();
            }
        }
        return 0;
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
