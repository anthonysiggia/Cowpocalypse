import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class alienCowEater extends alien1
{
    public void act()
    {
        Actor cow = getOneIntersectingObject(cow.class);
        if (cow != null) {
            World world = getWorld();
            world.removeObject(cow);
            world.addObject(new alienCowEater(),Greenfoot.getRandomNumber(1),Greenfoot.getRandomNumber(1));
        }
        Actor bulllet = getOneIntersectingObject(bulllet.class);
        if (bulllet != null) {
            World forrest = getWorld();
            forrest.removeObject(bulllet);
        }
        moveAround();
        Actor GHGJ = getOneIntersectingObject(GHGJ.class);
        if (GHGJ != null) {
            World forrest = getWorld();
            forrest.removeObject(GHGJ);
        }
        World world = getWorld();
         if (isGameLost()) {
            transitionToGameLossWorld();
        }   

    }
          public void transitionToGameLossWorld()
    {
        World gameLossOverWorld =  new  gameLossOverWorld();
        Greenfoot.setWorld(gameLossOverWorld);
    }

    public boolean isGameLost()
    {
        World world = getWorld();
        if (world.getObjects(GHGJ.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * 
     */
    public void moveAround()
    {
        move(-3);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }
    
}

    
    

