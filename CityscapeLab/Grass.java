import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.awt.Rectangle;
/**
 * Creates grass on the ground
 * 
 * @author Eric Kim
 * @version 10/10/15
 */
public class Grass
{
    
    

    /**
     * Constructor for objects of class Grass
     */
    public Grass()
    {
        
    }

    /**
     * Uses a for loop to draw multiple grass objects on the ground
     * 
     * @param g2 the graphics content
    
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
