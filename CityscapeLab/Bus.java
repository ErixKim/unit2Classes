import java.awt.Color;
import java.awt.geom.Line2D;
import java.awt.*;
import javax.swing.*;
import java.awt.Graphics2D;
/**
 * Write a description of class Bus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bus
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Bus
     */
    public Bus()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.yellow);
        g2.setStroke(new BasicStroke(10));
        
        int y1 = 30;
        int y2 = 10;
        for(int i=1; i<7; i++){
            int x1 = 215;
            int x2 = 215;
            
            g2.draw(new Line2D.Float(x1,y1,x2,y2));
            y1 += 70;
            y2 += 70;
            x1 = 185;
            x2 = 185;
            g2.draw(new Line2D.Float(x1,y1,x2,y2));
        }
    
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public void drive(Graphics2D g2)
    {
        g2.setColor(Color.yellow);
        g2.setStroke(new BasicStroke(10));
        int y1 = 32;
        int y2 = 12;
        for (int i=1; i<7; i++){
            int x1 = 215;
            int x2 = 215;
            g2.draw(new Line2D.Float(x1,y1,x2,y2));
            y1 += 2;
            y2 += 2;
            x1 = 185;
            x2 = 185;
            g2.draw(new Line2D.Float(x1,y1,x2,y2));
        }
    }

}
