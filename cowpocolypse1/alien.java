// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class alien here.
 * @author (your name) @version (a version number or a date)
 */
public class alien extends Actor
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Act - do whatever the alien wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-2);
        Actor cow = getOneIntersectingObject(cow1.class);
        if (cow != null) {
            World world = getWorld();
            world.removeObject(cow);
        }
    }
}
