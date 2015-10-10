import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Write a description of class Moon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moon
{
    // instance variables - replace the example below with your own
    public String time;

    /**
     * Constructor for objects of class Moon
     */
    public Moon(String time)
    {
        this.time = time;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
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
