import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class forrest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class forrest extends World
{

    /**
     * Constructor for objects of class forrest.
     * 
     */
    public forrest()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        cowboy cowboy = new cowboy();
        addObject(cowboy,40,348);
        cowboy.setLocation(43,360);
        cowboy.setLocation(48,364);
        cowboy.setLocation(48,363);
        cowboy.setLocation(49,354);
        alien alien = new alien();
        addObject(alien,536,312);
        cow1 cow1 = new cow1();
        addObject(cow1,305,336);
    }
}
