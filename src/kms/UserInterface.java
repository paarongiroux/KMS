package kms;

import javax.swing.JFrame;


@SuppressWarnings("serial")
public class UserInterface extends JFrame
{

  public UserInterface()
  {
    CustomerWindow cw = new CustomerWindow();
    super.setTitle("Kitchen Management System");
    super.setSize(1000,950);
    super.setLocation(100,0);
    super.setResizable(false);
    super.add(cw);
    super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    super.setVisible(true);
  }

}
