import java.awt.*;
import javax.swing.*;


public class Game extends JFrame 
{
    public Game()
    {
        initUI();
    }
    void initUI()
    {   
        Board b = new Board();
        add(b);
        ImageIcon bg = b.getBG();
        int width = bg.getIconWidth();
        int height = bg.getIconHeight();
        
        setSize(width, height);
        
     
        
        setTitle("Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run()
            {
                Game scroller = new Game();
                scroller.setVisible(true);
            }
        });
    }
}