import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cowboy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cowboy extends Actor
{
    /**
     * Act - do whatever the cowboy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            move(1);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        
    }
}
