import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.geom.Arc2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.awt.geom.Line2D;
import java.awt.*;
import javax.swing.*;
/**
 * Draws a road for cars
 * 
 * @author Eric Kim
 * @version 10/10/15
 */
public class Road
{
    /** description of instance variable x (add comment for each instance variable) */
    
    /**
     * Default constructor for objects of class Bridge
     */
    public Road()
    {
        
        
    }
    
    /**
     * Draws the road with a black and orange line
     *
   
     * @param   g2 the graphics content
     */
    public void draw(Graphics2D g2)
    {
        
        
        g2.setColor(Color.lightGray);
        g2.setStroke(new BasicStroke(50));
        g2.draw(new Line2D.Float(200, 550, 200, -500));
        g2.setColor(Color.orange);
        g2.setStroke(new BasicStroke(10));
        g2.draw(new Line2D.Float(200, 600, 200, -500));
       
       
    }
}
