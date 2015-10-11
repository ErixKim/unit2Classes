import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Draws a sun depending on the instance variable time
 * 
 * @author Eric Kim
 * @version 10/10/15
 */
public class Sun
{
    /** description of instance variable time (add comment for each instance variable) */
    private String time; //User dependent instance variable and determines whether to draw the sun or not
    /**
     * Default constructor for objects of class Sun
     * @param instance variable time 
     */
    public Sun(String time)
    {
       this.time = time;
    }
    /**
     * Checks if time is set equal to "y" and draws the sun if it is
     *
     * @param   g2 the graphics content
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