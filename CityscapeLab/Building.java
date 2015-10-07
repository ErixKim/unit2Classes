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
   
    public int floors;
    /**
     * Default constructor for objects of class Building
     */
    public Building(int floors)
    {
       this.floors = floors;
       
       
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
        Rectangle2D.Double body = new Rectangle2D.Double(350,600 - (floors * 10),145, floors * 50);
        g2.setColor(Color.lightGray);
        g2.fill(body);
        g2.draw(body);
        Rectangle2D.Double body1 = new Rectangle2D.Double(500,300,150, 300);
        g2.setColor(Color.black);
        g2.fill(body1);
        g2.draw(body1);
        
        
        int x = 0;
        int y = 0;
        for(int i=1; i<50; i++){
            g2.setColor(Color.green);
            Rectangle2D.Double grass = new Rectangle2D.Double(x,530,10, 50);
            g2.fill(grass);
            g2.draw(grass);
            x += 30;
            y += 1;
            g2.setColor(Color.black);
            Rectangle2D.Double floorboundary = new Rectangle2D.Double(350,600 - (floors * 10) + (floors * y) , 145 , 3);
            g2.fill(floorboundary);
            g2.draw(floorboundary);
            
        }
    }

    
}
