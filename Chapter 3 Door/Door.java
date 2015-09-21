

/**
 * A 
 * The
 * 
 * @author Eric Kim
 * @version 15 September 2015
 */
public class Door
{
    /** description of instance variable x (add comment for each instance variable) */
    private String name;
    private String state;
    
    /**
     * Default constructor for objects of class Door
     * @param String name is the name of the door, String state is the status of the door
     */
    public Door(String name, String state)
    {
         this.name = name;
         this.state = state;
    }

    /**
     *Changes the doors state to close
     
     * @post    State of door is set to close
     
     */
    public void close()
    {
        state = "close";
    }

    /**
     Changes the doors state to open
     
     * @post    State of door is set to open
     */
    public void open()
    {
        state = "open";
    }


    /**
     Allows user to get the name of the String name
     
    
     * @return  Status of String name
     */
    public String getName()
    {
        return this.name;
    }


    /**
     * Allows user to get the status of the doors state
     *
     * 
     * @return  Status of String State
     */
    public String getState()
    {
        return this.state;
    }
    

    /**
     * Allows user to replace the name for the Door
     *
     
     * @post    Replaces the name
     * @param   Current name of the door
     */
    public void setName(String newName)
    {
        this.name = newName;
    }
    

    /**
     Allows user to replace the state for the door
     *
     
     * @post    replaces the state of the door
     * @param   Current state of the door
     */
    public void setState(String newState)
    {
        this.state = newState;
    }

    
}


