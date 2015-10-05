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
 * Write a description of class Bridge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bridge
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class Bridge
     */
    public Bridge()
    {
        
        
    }
    
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double platform = new Rectangle2D.Double(300,300,600, 60);
        g2.setColor(Color.lightGray);
        g2.fill(platform);
        g2.setStroke(new BasicStroke(10));
        g2.draw(new Line2D.Float(400, 0, -20, 500));
        //*Arc2D.Double bridge = new Arc2D.Double(50 , 50 , 100,100,0,180);
        //*g2.setColor(Color.yellow);
        //*g2.fill(bridge);
       
    }
}
