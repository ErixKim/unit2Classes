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
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car
{
    /** description of instance variable x (add comment for each instance variable) */
    
    /**
     * Default constructor for objects of class Car
     */
    public Car()
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
        g2.setStroke(new BasicStroke(30));
        g2.setColor(Color.yellow);
        g2.draw(new Line2D.Float(200, -20, -20, 10));
        Ellipse2D.Double carwheels = new Ellipse2D.Double(50, -50, 50, 50);
        g2.setColor(Color.black);
        g2.fill(carwheels);
        g2.draw(carwheels);
    }

}