import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.awt.Rectangle;
/**
 * Write a description of class Building here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class Building
     */
    public Building()
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
        Rectangle2D.Double body = new Rectangle2D.Double(350,350,150, 250);
        g2.setColor(Color.lightGray);
        g2.fill(body);
        g2.draw(body);
        Rectangle2D.Double body1 = new Rectangle2D.Double(500,300,150, 300);
        g2.setColor(Color.black);
        g2.fill(body1);
        g2.draw(body1);
        
        g2.setColor(Color.green);
        int x = 0;
        for(int i=1; i<50; i++){
            Rectangle2D.Double grass = new Rectangle2D.Double(x,530,10, 50);
            g2.fill(grass);
            g2.draw(grass);
            x += 30;
        }
    }

    
}
