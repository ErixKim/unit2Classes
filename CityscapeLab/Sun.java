import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Write a description of class Sun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sun
{
    /** description of instance variable x (add comment for each instance variable) */
    public String time;
    /**
     * Default constructor for objects of class Sun
     */
    public Sun(String time)
    {
       this.time = time;
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
        
        if (time.equals("y"))
        {
            Ellipse2D.Double sun = new Ellipse2D.Double(650, -50, 200, 200);
            g2.setColor(Color.yellow);
            g2.fill(sun);
            g2.draw(sun);
        }
    
    }
}