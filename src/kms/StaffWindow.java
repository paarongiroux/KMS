package kms;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StaffWindow extends JPanel implements MouseListener
{
    private Image background;
    private Image menu;
    private Image orderList;
    private boolean staff = true;
    private Restaurant restaurant;
    private static String ordersList = "<html>";
    private JLabel ordersText = new JLabel("");
    
    public StaffWindow(Restaurant restaurant)
    {
        addMouseListener(this);
        this.restaurant = restaurant;
        formatOrders();
    }
    
    public boolean staffStatus()
    {
        return staff;
    }
    public void setTrue()
    {
        staff = true;
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        ImageIcon bg = new ImageIcon(this.getClass().getResource("assets/bg.png"));
        ImageIcon m = new ImageIcon(this.getClass().getResource("assets/menubar.png"));
        ImageIcon ol = new ImageIcon(this.getClass().getResource("assets/StaffOrderList.png"));
       
        background = bg.getImage();
        menu = m.getImage();
        orderList = ol.getImage();
        
        Graphics2D g2d = (Graphics2D) (Graphics) g;
        g2d.drawImage(background, 0, 0, this);
        g2d.drawImage(menu, 0, 0, this);
        g2d.drawImage(orderList, 50, 100, this);

        ordersText.setBounds(105,175,140,590);
        ordersText.setText(ordersList +"</html>");
        super.add(ordersText);
        
        
    }
    
    public void formatOrders()
    {
        Order currentOrder;
        for (int i = 0; i < restaurant.numOrders(); i++)
        {
           currentOrder = restaurant.getOrder(i);
           ordersList += " Order " + (i+1) + ": ";
           if (!restaurant.getOrder(i).status())
           {
               ordersList += "IN PROGRESS <br>";
           }
           else if(restaurant.getOrder(i).status())
           {
               ordersList += "COMPLETED <br>";
           }
           
           for (MenuItem item: currentOrder.getOrderList())
           {
               ordersList += " - " + item.getName() + "<br>";
           }
           ordersList += "<br>";
        }
    }
    
    public void reformat()
    {
        ordersList = "<html>";
        formatOrders();
        repaint();
    }
    

    @Override
    public void mouseClicked ( MouseEvent e )
    {
      //click log out button
        if(107<e.getX() && e.getX() < 227 && 8 < e.getY() && e.getY() < 45)
        {
            staff = false;
            
        }
        
    }

    @Override
    public void mousePressed ( MouseEvent e )
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased ( MouseEvent e )
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered ( MouseEvent e )
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited ( MouseEvent e )
    {
        // TODO Auto-generated method stub
        
    }

}
