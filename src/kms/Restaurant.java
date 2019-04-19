package kms;

import java.util.ArrayList;

public class Restaurant
{
    private ArrayList<Order> orders = new ArrayList<Order>();
    
    private Menu menu;
    
    public Restaurant(Menu menu)
    {
        this.menu = menu;
    }
    
    public void addOrder(Order order)
    {
        orders.add(order);
    }
    
    public void finishOrder(Order order)
    {
        order.finishOrder();
    }
    
    public Menu getMenu()
    {
        return menu;
    }
    
    public int numOrders()
    {
        return orders.size();
    }
    
    public Order getOrder(int index)
    {
        if (index < orders.size())
        {
            return orders.get(index);
        }
        return null;
    }
}
