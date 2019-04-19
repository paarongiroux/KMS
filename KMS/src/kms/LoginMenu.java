package kms;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class LoginMenu extends JPanel implements MouseListener
{
    private Image background;
    private boolean customer = false;
    private boolean staff = false;
    
    public LoginMenu()
    {
        addMouseListener(this);
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        ImageIcon bg = new ImageIcon(this.getClass().getResource("assets/Login.png"));
        background = bg.getImage();
        Graphics2D g2d = (Graphics2D) (Graphics) g;
        g2d.drawImage(background, 0, 0, this);
    }
    
    public boolean Customer()
    {
        return customer;
    }
    
    public boolean Staff()
    {
        return staff;
    }
    
    @Override
    public void mouseClicked ( MouseEvent e )
    {
        if (e.getX() > 278 && e.getX() < 727 && e.getY() > 223 && e.getY() < 312)
        {
            customer = true;
        }
        else if (e.getX() > 278 && e.getX() < 727 && e.getY() > 397 && e.getY() < 486)
        {
            staff = true;
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
