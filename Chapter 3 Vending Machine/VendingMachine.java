

/**
 * Vending machine that gives soda when a token is inserted. 
 * 
 * @author Eric Kim
 * @version 9/21/15
 */
public class VendingMachine
{
    /** description of instance variable x (add comment for each instance variable) */
    private int tokenCount;
    private int canCount;

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine(int token , int can)
    {
        this.tokenCount = token;
        this.canCount = can;
    }

    /**
     * Fills up the vending machine with cans
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void fillUp(int cans)
    {
        canCount += cans;
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
    public void insertToken()
    {
        tokenCount += 1;
        canCount -= 1;
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
    public int getCanCount()
    {
        return canCount;
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
    public int getTokenCount()
    {
        return tokenCount;
    }

}
