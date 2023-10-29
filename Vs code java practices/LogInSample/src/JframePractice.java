import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
//import javax.swing.border.Border;

public class JframePractice {
    void main()
    {
        JFrame frame = new JFrame(); //creating a new frame
        frame.setSize(1300,730); //sets dimensions
      
        frame.setTitle("Practise Jframe"); // Sets the title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closes the Frame
        frame.setResizable(true); // allow resizability
        ImageIcon image = new ImageIcon("4OAxDXv4RdUeg38JYi.gif");
        frame.setIconImage(image.getImage()); //sets the image o changng the logo
        frame.getContentPane().setBackground(Color.BLUE); //modifies the background
        JPanel panel = new JPanel();
        
        panel.setSize(50, 80);
        panel.setBackground(Color.gray);
        panel.setLayout(new BorderLayout());
        JButton button = new JButton("Click me");
        button.setFocusable(false);
        button.setSize(10,10);
        JTextField field = new JTextField("Hi there");
        field.getAlignmentY();
        field.setSize(30, 20);
        panel.add(button, BorderLayout.CENTER);
        panel.add(field, BorderLayout.NORTH);
        frame.setVisible(true);// sets visibility to be true
        frame.add(panel);

    }
    
}
