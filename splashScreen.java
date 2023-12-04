import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class splashScreen extends World
{
private int counter;
 
    /**
     * Constructor for objects of class splashScreen.
     */
    public splashScreen()
    {
        super(600, 400, 1);
 
    }
    public void act()
    
    {
        if (++counter == 200){
            Greenfoot.setWorld(new playScreen());
        }
    }
}
