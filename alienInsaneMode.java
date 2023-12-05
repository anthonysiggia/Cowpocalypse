import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class alienInsaneMode extends alien1
{

    /**
     * Act - do whatever the alienInsaneMode wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    { 
        World world = getWorld();
         world.addObject(new alienCowEater(),Greenfoot.getRandomNumber(21),Greenfoot.getRandomNumber(23));
        Actor GHGJ = getOneIntersectingObject(GHGJ.class);
        if (GHGJ != null) {
            World forrest = getWorld();
            forrest.removeObject(GHGJ);
        }
        moveAround();
        }

    public void moveAround()
    {
        move(1);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }
    }

