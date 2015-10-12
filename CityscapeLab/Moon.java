import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Draws a moon object depending on whether the user wants it to be morning or night
 * 
 * @author Eric Kim
 * @version 10/10/15
 */
public class Moon
{
    // instance variable time is user dependent and determines whether to draw moon or not
    private String time;

    /**
     * Constructor for objects of class Moon
     * @param time is user dependent
     */
    public Moon(String time)
    {
        this.time = time;
    }

    /**
     * Checks if the user answered n for time and draws the moon if the user did say n
     * 
     * @param  g2 the graphics content
     */
    public void draw(Graphics2D g2)
    {
      
        if (time.equals("n")){
            
            Ellipse2D.Double moon = new Ellipse2D.Double(650, -50, 200, 200);
            g2.setColor(Color.lightGray);
            g2.fill(moon);
            g2.draw(moon);
        }
    
    }
}
