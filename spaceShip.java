import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class spaceShip extends levels
{
    private long lastFrameTimeMS;
    private double timeStepDuration;
    /**
     * 
     */
    public spaceShip()
    {
        lastFrameTimeMS = System.currentTimeMillis();
        timeStepDuration = 1.0 / 60;
        prepare();
    }

    /**
     * 
     */
    public void started()
    {
        lastFrameTimeMS = System.currentTimeMillis();
    }

    /**
     * 
     */
    public void act()
    {
        timeStepDuration = (System.currentTimeMillis() - lastFrameTimeMS) / 1000.0;
        lastFrameTimeMS = System.currentTimeMillis();
    }

    /**
     * 
     */
    public double getTimeStepDuration()
    {
        return timeStepDuration;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        alienCowEater alienCowEater = new alienCowEater();
        addObject(alienCowEater,787,195);
        alienCowEater.setLocation(807,86);
        alienCowEater alienCowEater2 = new alienCowEater();
        addObject(alienCowEater2,51,71);
        alienCowEater alienCowEater3 = new alienCowEater();
        addObject(alienCowEater3,853,331);
        alienCowEater alienCowEater4 = new alienCowEater();
        addObject(alienCowEater4,39,331);
        cowboylevel3 cowboylevel3 = new cowboylevel3();
        addObject(cowboylevel3,477,156);
        cow cow = new cow();
        addObject(cow,171,179);
        cow.setLocation(170,180);
        cow cow2 = new cow();
        addObject(cow2,170,180);
        cowboylevel3.setLocation(492,233);
        cow cow3 = new cow();
        addObject(cow3,492,233);
        cow cow4 = new cow();
        addObject(cow4,292,58);
        cowboylevel3.setLocation(533,77);
        cow cow5 = new cow();
        addObject(cow5,533,77);
        cow cow6 = new cow();
        addObject(cow6,310,129);
        cow5.setLocation(586,80);
        cow cow7 = new cow();
        addObject(cow7,586,80);
        cow cow8 = new cow();
        addObject(cow8,447,312);
        cow cow9 = new cow();
        addObject(cow9,533,312);
    }
}
