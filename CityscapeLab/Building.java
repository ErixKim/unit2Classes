import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.awt.Rectangle;
/**
 * Draws a building that varys on size depending on the user input for the number of floors
 * 
 * @author Eric Kim
 * @version 10/10/15
 */
public class Building
{
    /** description of instance variable floors (add comment for each instance variable) 
    */
   
    private int floors; //Gets the user input of the number of floors and changes the building size based off it
    /**
     * Default constructor for objects of class Building
     * @param the number of floors the building has
     */
    public Building(int floors)
    {
       this.floors = floors;
       
       
    }
    

    /**
     * Draws the building with the size based off of the number of floors it has
     *
     * @param   g2 the graphics content
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double body = new Rectangle2D.Double(350,600 - (floors * 10),145, floors * 10);
        g2.setColor(Color.lightGray);
        g2.fill(body);
        g2.draw(body);
        Rectangle2D.Double body1 = new Rectangle2D.Double(500,300,150, 300);
        g2.setColor(Color.black);
        g2.fill(body1);
        g2.draw(body1);
        
        
        
        
    }

    
}
