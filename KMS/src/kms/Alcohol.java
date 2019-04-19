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
public class Alcohol extends MenuItem
{
    private double stateTax;
    
    public Alcohol( String inputName, double inputPrice, boolean isAvailable )
    {
        super( inputName, inputPrice, isAvailable );
    }
    
    public void setStateTax( double tax )
    {
        stateTax = tax;
    }
    
    public double getStateTax()
    {
        return stateTax;
    }
    
    @Override
    public double getPrice()
    {
        double basePrice = super.getPrice();
        return basePrice + ( basePrice * stateTax ) ;
    }
    
    
    
    
    
}
