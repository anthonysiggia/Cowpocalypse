import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playButton extends Actor
{
    public void act() 
    {
if (Greenfoot.mouseMoved(this))
        {
            setImage("playButton3_highlighted.png");
        }
if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("playButton3.jpeg");
        }
}
}
