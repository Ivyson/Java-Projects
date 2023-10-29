/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mainpackage;

/**
 *
 * @author Sam
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Date;
 import javax.swing.JButton;
import javax.swing.JLabel;
public class Cells extends JButton{
    
    private Date date;
    private boolean title;
    private boolean tday;
    
    public Cells()
    {
        setContentAreaFilled(false);
        setBorder(null);
        setHorizontalAlignment(JLabel.CENTER);
    }
    public void setDate(Date date)
    {
    this.date =  date;
    }
    public void asTitle()
    {
        title = true;
    }
    public boolean isTitle()
    {
    return title; 
   }
    public void currentMonth(boolean act)
    {
    if(act)
    {
        setForeground(new Color(68, 68, 68));
    }else
    {
     setForeground(new Color(169, 169, 169));
    }
    }
    public void setdaytoday()
    {
        tday = true;
        setForeground(Color.white);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if(title)
        {
            g.setColor(Color.red);
            g.drawLine(0, getHeight()-1, getWidth(), getHeight()-1);
        }
        if(tday)
        {
            Graphics2D g1 = (Graphics2D)g;
            g1.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g1.setColor(new Color(153,153,255));
            int x,y;
            x = getWidth()/2 -15; y = getHeight()/2 -15;
            g1.fillRoundRect(x, y, 30, 30, 100, 100);
        }
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
