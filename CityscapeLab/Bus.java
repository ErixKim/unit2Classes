import java.awt.Color;
import java.awt.geom.Line2D;
import java.awt.*;
import javax.swing.*;
import java.awt.Graphics2D;
/**
 * Draws two buses that move
 * 
 * @author Eric Kim 
 * @version 10/10/15
 */
public class Bus
{
    // instance variables - replace the example below with your own
    private int xLeft; //x cordinate of rectangle
    private int yTop; // y cordinate of rectangle
    private Rectangle bus; //instance variable of bus 1
    private Rectangle bus2; //instance variable of bus 2
    /**
     * Constructor for objects of class Bus
     * @param x the x coordinate of the rectangle object
     * @param y the y coordinate of the rectangle object
     */
    public Bus(int x, int y)
    {
        xLeft = x;
        yTop = y;
        this.bus = new Rectangle(xLeft , yTop , 2, 20); 
        this.bus2 = new Rectangle(xLeft, yTop , 2 , 20);
    }
    /**
     * Draws the two buses
     * 
     * @param  g2 the graphics content
     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.yellow);
        g2.fill(this.bus);
        g2.draw(this.bus);
        g2.fill(this.bus2);
        g2.draw(this.bus2);
    }

}
