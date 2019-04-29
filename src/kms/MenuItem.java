/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kms;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Gault
 */
public class MenuItem 
{
    public ImageIcon menuPic;
    
    private String name;
    private double basePrice;
    private boolean isAvailable;
    
    ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
    
    public MenuItem( String inputName, double inputPrice, boolean availability )
    {
        name = inputName;
        basePrice = inputPrice;
        isAvailable = availability;
        menuPic = Menu.getDefaultImg();
           
    }
    
    // Gets the price of a MenuItem with tax included.
    public double getPrice()
    {
        //double salesTax = Menu.getTax();
        //return basePrice + ( basePrice * salesTax );
        return basePrice;
        
    }
    
    public void setPrice( double newPrice )
    {
        basePrice = newPrice;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName( String newName )
    {
        name = newName;
    }
    
    public ImageIcon getImg()
    {
        return menuPic;
    }
    
    public void setImg( String imgLocation )
    {
        ImageIcon newImg = new ImageIcon( imgLocation );
        menuPic = newImg;
    }
    
    public boolean checkAvailability()
    {
        return isAvailable;
    }
    
    public void toggleAvailability()
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
    
    public ArrayList<Ingredient> getIngredients()
    {
        return ingredients;
    }
    
    public void addIngredient( Ingredient toAdd )
    {
        ingredients.add(toAdd);
    }
    
    public boolean removeIngredient( Ingredient toRemove )
    {
        if( ingredients.contains( toRemove ) )
        {
            ingredients.remove( toRemove );
            return true;      
        }
        
        else
        {
            return false;
        }
    }
    
    public void removeAllIngredients()
    {
        ingredients.clear();
    }
    
    public void ifOrdered()
    {
        // Create an instance of the database controller class.
        IngredientDB db = new IngredientDB();
        
        // Iterate through the ingredients list
        for( Ingredient ingredient : ingredients )
        {
            // Remove one unit of each ingredient from the database.
            db.updateIngredient(ingredient, -1);
        }
    }
    
}
