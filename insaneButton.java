import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class insaneButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class insaneButton extends playButton
{
    /**
     * Act - do whatever the insaneButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
          Greenfoot.setWorld(new insaneMode());
      }
    }
}
