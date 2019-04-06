package kms;

import javax.swing.JFrame;


@SuppressWarnings("serial")
public class UIDisplay extends JFrame
{
  volatile boolean customer = false;
  volatile boolean staff = false;
  volatile boolean appRunning = true;
  LoginMenu login;
  CustomerWindow cw;
  public UIDisplay()
  {
    login = new LoginMenu();
    
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
          cw = new CustomerWindow();
          super.add(cw);
          super.setVisible(true);
      }
      else
      {
          //add staff
      }
  }
  
//  public void checkStateCustomer()
//  {
//      
//  }
//  
//  public void checkStateStaff()
//  {
//      
//  }

}
