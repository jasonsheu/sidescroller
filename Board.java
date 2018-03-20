import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class Board extends JPanel implements ActionListener 
{
    private ImageIcon background, qIcon, wIcon, eIcon, rIcon;
    private Timer timer;
    private int x,y;
    private Player p;
    public Board()
    {
        background = new ImageIcon("src/images/storm.gif");
        qIcon = new ImageIcon("src/images/qIcon.png");
        setDoubleBuffered(true);
        x = y = 0;
        timer = new Timer(25, this);
        timer.start();
        p = new Player("20.gif");
    }
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(background.getImage(), 0, 0, this);
        g2d.drawImage(qIcon.getImage(), 0, 0, this);
        
        g2d.drawImage(p.getIcon().getImage(), x, y, this);
        Toolkit.getDefaultToolkit().sync();
      
    }
    //getters and setters
    public ImageIcon getBG()
    {
        return background;
    }
    public void setQIcon(ImageIcon q)
    {
        qIcon = q;
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        x += 0;
        y += 0;
        repaint();
    }
    private class keyUpdater extends KeyAdapter
    {
        @Override
        public void keyTyped( KeyEvent e )
        {
            
            
        }
    }
    
    
}