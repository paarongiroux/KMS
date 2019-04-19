package kms;

import javax.swing.JFrame;


@SuppressWarnings("serial")
public class UIDisplay extends JFrame
{
  volatile boolean customer = false;
  volatile boolean staff = false;
  volatile boolean log = true;
  volatile boolean appRunning = true;
  LoginMenu login;
  CustomerWindow cw;
  StaffWindow sw;
  Restaurant defaultRestaurant;
  public UIDisplay()
  {
    login = new LoginMenu();
    
    Menu restaurantMenu = new Menu(0.1);
    restaurantMenu.addItem(new MenuItem("Cheeseburger", 5.00, true));
    restaurantMenu.addItem(new MenuItem("Ice Cream", 3.25, true));
    restaurantMenu.addItem(new MenuItem("Lemonade", 1.49, true));
    restaurantMenu.addItem(new MenuItem("Nachos", 6.00, true));
    restaurantMenu.addItem(new MenuItem("Cereal", 0.99, true));
    restaurantMenu.addItem(new MenuItem("Beer", 2.00, true));
    restaurantMenu.addItem(new MenuItem("Chicken Noodle Soup", 4.00, true));
    restaurantMenu.addItem(new MenuItem("House Salad", 5.20, true));
    restaurantMenu.addItem(new MenuItem("BLT Sandwich", 7.00, true));
    defaultRestaurant = new Restaurant(restaurantMenu);
    
    super.setTitle("Kitchen Management System");
    super.setSize(1000,950);
    super.setLocation(100,0);
    super.setResizable(false);
    super.add(login);
    super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    super.setVisible(true);
    
    while (appRunning)
    {
        if(!staff && !customer)
        {
            checkStateLogin();
        }
    }
    
  }
  
  public void checkStateLogin()
  {
      while (!staff && !customer)
      {
          staff = login.Staff();
          customer = login.Customer();
      }
      
      if(customer)
      {
          super.remove(login);
          super.repaint();
          cw = new CustomerWindow(defaultRestaurant);
          super.add(cw);
          super.setVisible(true);
          cw.setTrue();
          checkStateCustomer();
      }
      
      if(staff)
      {
          super.remove(login);
          super.repaint();
          if(sw == null)
          {
              sw = new StaffWindow(defaultRestaurant);
          }
          sw.reformat();
          super.add(sw);
          super.setVisible(true);
          sw.setTrue();
          checkStateStaff();
      }
  }
  
  public void checkStateCustomer()
  {
      while(customer)
      {
          customer = cw.customerStatus();
      }
      super.remove(cw);
      super.repaint();
      login = new LoginMenu();
      super.add(login);
      super.setVisible(true);
      checkStateLogin();
      
  }
  
  public void checkStateStaff()
  {
      while(staff)
      {
          staff = sw.staffStatus();
      }
      super.remove(sw);
      super.repaint();
      login = new LoginMenu();
      super.add(login);
      super.setVisible(true);
      checkStateLogin();
  }

}
