import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playScreen extends World
{

    /**
     * Constructor for objects of class playScreen.
     * 
     */
    public playScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(545, 390, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        playButton playButton = new playButton();
        addObject(playButton,456,358);
        insaneButton insaneButton = new insaneButton();
        addObject(insaneButton,456,297);
        insaneButton.setLocation(456,300);
        insaneButton.setLocation(456,298);
    }
}
