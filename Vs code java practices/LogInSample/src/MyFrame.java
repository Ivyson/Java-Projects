import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
MyFrame()
{
    this.setSize(420,420);
    this.setTitle("The new Jframe");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.getContentPane().setBackground(Color.CYAN);
    //ImageIcon image = new ImageIcon("18309498_SL-111719-25140-24.jpg");
    //this.setIconImage(getIconImage());
    this.setVisible(true);
    
}
public static void main(String[] args)
    {
         new MyFrame();
    
    }

}