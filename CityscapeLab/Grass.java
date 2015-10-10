import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.awt.Rectangle;
/**
 * Write a description of class Grass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grass
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Grass
     */
    public Grass()
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
        int x = 300;
        for(int i=1; i<50; i++){
            g2.setColor(Color.green);
            Rectangle2D.Double grass = new Rectangle2D.Double(x,550,10, 20);
            g2.fill(grass);
            g2.draw(grass);
            x += 30;
        }
    }
}
