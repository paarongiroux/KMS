package kms;


import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.awt.event.MouseListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class CustomerWindow extends JPanel implements MouseListener 
{

    /**
     * 
     */
    private static final long serialVersionUID = 7367719478690167709L;
    
    private Image background;
    private Image menu;
    private Image menubox;
    private Image orderlist;
    private Image confirmation;
    private boolean customer = true;
    private static double orderTotal;
    private static double orderTax;
    private static double totalAfterTax;
    private static String orderList = "<html>";
    private JLabel orderText = new JLabel("");
    private DecimalFormat df = new DecimalFormat("###.##");
    private int conX = 1000;
    private int conY = 1000;
    private boolean confirmationBox = false;
    private Menu restaurantMenu;
    private Restaurant restaurant;
    private ImageIcon f = new ImageIcon(this.getClass().getResource("assets/finished.png"));
    private Order order;

    ImageIcon c = new ImageIcon(this.getClass().getResource("assets/confirmation.png"));
    //confirmation = c.getImage();
    
    public CustomerWindow(Restaurant restaurant)
    {
        addMouseListener(this);
        orderText.setBounds(0,0,100,100);//805,875,140,590);
        confirmation = c.getImage();
        restaurantMenu = restaurant.getMenu();
        this.restaurant = restaurant;
        order = new Order(restaurant.numOrders());
        orderList = "<html>";
        orderTotal = 0.0;
        totalAfterTax = 0.0;
        
    }
    
    public boolean customerStatus()
    {
        return customer;
    }
    public void setTrue()
    {
        customer = true;
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        ImageIcon bg = new ImageIcon(this.getClass().getResource("assets/bg.png"));
        ImageIcon m = new ImageIcon(this.getClass().getResource("assets/menubar.png"));
        ImageIcon mb = new ImageIcon(this.getClass().getResource("assets/menubox.png"));
        ImageIcon ol = new ImageIcon(this.getClass().getResource("assets/orderlist.png"));
        background = bg.getImage();
        menu = m.getImage();
        menubox = mb.getImage();
        orderlist = ol.getImage();
        Graphics2D g2d = (Graphics2D) (Graphics) g;
        g2d.drawImage(background, 0, 0, this);
        g2d.drawImage(menu, 0, 0, this);
        g2d.drawImage(menubox, 50, 100, this);
        g2d.drawImage(orderlist, 800, 100, this);
        g2d.drawImage(confirmation, conX, conY, this);
        g2d.setColor(Color.WHITE);
        g2d.drawString("$" + df.format(totalAfterTax), 810,800);
        g2d.drawString("Sales Tax: $" + df.format(orderTax) , 805, 760);
        orderText.setBounds(805,175,140,590);
        super.add(orderText);
    }
    
    @Override
    public void mouseClicked ( MouseEvent e )
    {
        if (!confirmationBox) {
            //cheeseburger
            if (50<e.getX() && e.getX()<281 && 100 < e.getY() && e.getY()< 365)
            {
                orderTotal += restaurantMenu.getMenuItemPrice("Cheeseburger");
                order.addItem(restaurantMenu.getMenuItem("Cheeseburger"));
                orderList += "Cheeseburger....$5.00<br>";
            }
            //ice cream
            else if (281<e.getX() && e.getX() < 515 && 100 < e.getY() && e.getY()< 365)
            {
                orderTotal += restaurantMenu.getMenuItemPrice("Ice Cream");
                order.addItem(restaurantMenu.getMenuItem("Ice Cream"));
                orderList += "Ice Cream.......$3.25<br>";
            }
            //lemonade
            else if(515<e.getX() && e.getX() < 800 && 100 < e.getY() && e.getY()< 365)
            {
                orderTotal += restaurantMenu.getMenuItemPrice("Lemonade");
                order.addItem(restaurantMenu.getMenuItem("Lemonade"));
                orderList += "Lemonade........$1.49<br>";
            }
            //nachos
            else if(50<e.getX() && e.getX()<281 && 365< e.getY() && e.getY() < 634)
            {
                orderTotal += restaurantMenu.getMenuItemPrice("Nachos");
                order.addItem(restaurantMenu.getMenuItem("Nachos"));
                orderList += "Nachos..........$6.00<br>";
            }
            //cereal
            else if(281<e.getX() && e.getX() < 515 && 365< e.getY() && e.getY() < 634)
            {
                orderTotal += restaurantMenu.getMenuItemPrice("Cereal");
                order.addItem(restaurantMenu.getMenuItem("Cereal"));
                orderList += "Cereal..........$0.99<br>";
            }
            //beer
            else if(515<e.getX() && e.getX() < 800 && 365< e.getY() && e.getY() < 634)
            {
                orderTotal += restaurantMenu.getMenuItemPrice("Beer");
                order.addItem(restaurantMenu.getMenuItem("Beer"));
                orderList += "Beer............$2.00<br>";
            }
            //chicken noodle soup
            else if(50<e.getX() && e.getX()<281 && 634 < e.getY() && e.getY() < 900)
            {
                orderTotal += restaurantMenu.getMenuItemPrice("Chicken Noodle Soup");
                order.addItem(restaurantMenu.getMenuItem("Chicken Noodle Soup"));
                orderList +="Chicken Soup.....$4.00<br>";
            }
            //house salad
            else if(281<e.getX() && e.getX() < 515 && 634 < e.getY() && e.getY() < 900)
            {
                orderTotal += restaurantMenu.getMenuItemPrice("House Salad");
                order.addItem(restaurantMenu.getMenuItem("House Salad"));
                orderList += "House Salad.....$5.20<br>";
            }
            //BLT
            else if(515<e.getX() && e.getX() < 800 && 634 < e.getY() && e.getY() < 900)
            {
                orderTotal += restaurantMenu.getMenuItemPrice("BLT Sandwich");
                order.addItem(restaurantMenu.getMenuItem("BLT Sandwich"));
                orderList += "BLT.............$7.00<br>";
            }
            //confirm order
            else if(800 < e.getX() && e.getX() < 950 && 813 < e.getY() && e.getY() < 900)
            {
                conX = 170;
                conY = 325;
                confirmationBox = true;
            }
            orderText.setText(orderList +"</html>");
            orderTax = orderTotal * restaurantMenu.getTax();
            totalAfterTax = orderTax + orderTotal;
        }
        else if (confirmationBox)
        {
            if (238 < e.getX() && e.getX() < 379 && 563 < e.getY() && e.getY() < 605)
            {
                confirmationBox = false;
                conX = 1000;
                conY = 1000;
            }
            if (463 < e.getX() && e.getX() < 602 && 563 < e.getY() && e.getY() < 605)
            {
                confirmation = f.getImage();
                restaurant.addOrder(order);
            }
            
        }
        //click log out button
        if(107<e.getX() && e.getX() < 227 && 8 < e.getY() && e.getY() < 45)
        {
            customer = false;
            
        }
        repaint();
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
