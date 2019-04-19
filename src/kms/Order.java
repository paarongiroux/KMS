package kms;

import java.util.ArrayList;

public class Order
{
    private ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
    private int tableNumber;
    boolean completed;
    
    public Order(int tableNumber)
    {
        this.tableNumber = tableNumber;
        completed = false;
    }
    
    public void addItem(MenuItem item)
    {
        menuItems.add(item);
    }
    
    public void removeItem(MenuItem item)
    {
        //TO DO
    }
    
    public void finishOrder()
    {
        completed = true;
    }
    
    public boolean status()
    {
        return completed;
    }
    
    public ArrayList<MenuItem> getOrderList()
    {
        return menuItems;
    }
}
