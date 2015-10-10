import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private Building building;
    private Sun sun;
    private Road road;
    private Bus bus;
    private Grass grass;
    private Moon moon;
    private int numfloors;
    private String citytime;
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    public CityscapeComponent(int floors,String time)
    {
        numfloors = floors;
        citytime = time;
    }
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method on each object in your Cityscape
        // ...
       
        
       Road road = new Road();
        
       road.draw(g2);
        
       Building building = new Building(numfloors);
        
       building.draw(g2);
       
       Grass grass = new Grass();
       
       grass.draw(g2);
        
       Sun sun = new Sun(citytime);
        
       sun.draw(g2);
          
       Moon moon = new Moon(citytime);
        
       moon.draw(g2);
        
       Bus bus = new Bus();
       
       bus.draw(g2);
       
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        bus.drive();
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
