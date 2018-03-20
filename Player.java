
import javax.swing.*;
import java.awt.*;



public class Player 
{
    private String url;
    private ImageIcon sprite;
    
    
    public Player(String fileName)
    {
        url = "src/images/" + fileName;
        sprite = new ImageIcon(url);
    }
    public ImageIcon getIcon()
    {
        return sprite;
    }
}