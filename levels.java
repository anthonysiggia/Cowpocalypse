import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class levels extends World
{
    private long lastFrameTimeMS;
    private double timeStepDuration; 
    /**
     * Constructor for objects of class levels.
     */
    public levels()
    {
        super(900, 400, 1);
        lastFrameTimeMS = System.currentTimeMillis();
        timeStepDuration = 1.0 / 60; 
    }
    
    public void started()
    {
        lastFrameTimeMS = System.currentTimeMillis();
    }

    public void act()
    {
        timeStepDuration = (System.currentTimeMillis() - lastFrameTimeMS) / 1000.0;
        lastFrameTimeMS = System.currentTimeMillis();
    }

    public double getTimeStepDuration()
    {
        return timeStepDuration;
    }
}
