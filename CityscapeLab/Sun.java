import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * Write a description of class Sun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sun
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class Sun
     */
    public Sun(int x, int y)
    {
        xLeft = x;
        yTop = y;
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
        Ellipse2D.Double outerRing = new Ellipse.Double(xLeft, yTop + 10, 60, 10);
    }
}