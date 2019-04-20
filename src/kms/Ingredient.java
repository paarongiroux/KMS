/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kms;

/**
 *
 * @author Gault
 */
public class Ingredient 
{
    private String name;
    private double totalPrice;
    private String units;
    private boolean isAvailable = true;
    
    public Ingredient( String inputName, double inputPrice )
    {
        name = inputName;
        totalPrice = inputPrice;
        
    }
    
    public void setName( String newName )
    {
        name = newName;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getPrice()
    {
        return totalPrice;
    }
    
    public void setPrice( double inputPrice )
    {
        totalPrice = inputPrice;
    }
    
    public boolean checkIfAvailable()
    {
        return isAvailable;
    }
    
    public void toggleAvailable()
    {
        if( isAvailable )
        {
            isAvailable = false;
        }
        
        else
        {
            isAvailable = true;
        }
    }
    
    public String getUnits()
    {
        return units;
    }
    
    public void setUnits( String inputUnits )
    {
        units = inputUnits;
    }
    
            
    
}
