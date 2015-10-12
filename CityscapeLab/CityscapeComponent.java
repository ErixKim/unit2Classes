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
    /** Defining the objects as instance variables
     */
    private Building building;
    private Sun sun;
    private Road road;
    private Bus bus;
    private Bus bus2;
    private Grass grass;
    private Moon moon;
    private int numfloors;
    private String citytime;
    private int animation;
   
    public CityscapeComponent(int floors,String time)
    {
        numfloors = floors;
        citytime = time;
    }
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     * @param g2 the graphics content
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
        
       bus2.draw(g2);
       
       bus.draw(g2);
       
       
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     * Creates two bus objects and translates their y values based off the integer value animation
     */
    public void nextFrame()
    {
        animation += 10;
        this.bus = new Bus(215, 50 + animation);
        this.bus2 = new Bus(185, 300 - animation);
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
