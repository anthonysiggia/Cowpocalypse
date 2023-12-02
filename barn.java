import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class barn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class barn extends World
{
    private long lastFrameTimeMS;
    private double timeStepDuration;

    public forrest()
    {  
        super(900, 400, 1);
        lastFrameTimeMS = System.currentTimeMillis();
        timeStepDuration = 1.0 / 60; // seems to be the default

        prepare();
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
    /**
     * Constructor for objects of class barn.
     * 
     */
    public barn()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 400, 1); 
    }
}
