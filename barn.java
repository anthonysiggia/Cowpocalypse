import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class barn extends levels
{
    private long lastFrameTimeMS;
    private double timeStepDuration;
    public barn()
    {  
        lastFrameTimeMS = System.currentTimeMillis();
        timeStepDuration = 1.0 / 60; 
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
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        alien1 alien1 = new alien1();
        addObject(alien1,787,69);
        alien1 alien12 = new alien1();
        addObject(alien12,789,182);
        alien1 alien13 = new alien1();
        addObject(alien13,792,299);
        alien1 alien14 = new alien1();
        addObject(alien14,154,70);
        alien1 alien15 = new alien1();
        addObject(alien15,148,174);
        alien1 alien16 = new alien1();
        addObject(alien16,145,270);
        cow cow = new cow();
        addObject(cow,453,376);
        cow.setLocation(453,372);
        j j = new j();
        addObject(j,870,328);
        j.setLocation(869,328);
        GHGJ gHGJ = new GHGJ();
        addObject(gHGJ,530,85);
        alien1 alien17 = new alien1();
        addObject(alien17,709,114);
        alien1 alien18 = new alien1();
        addObject(alien18,232,111);
        alien18.setLocation(228,112);
        alien1 alien19 = new alien1();
        addObject(alien19,46,152);
        alien19.setLocation(53,118);
        alien1 alien110 = new alien1();
        addObject(alien110,859,121);
        alien110.setLocation(861,111);
        alien17.setLocation(871,218);
        removeObject(alien13);
        alien18.setLocation(68,213);
        alien19.setLocation(56,51);
        removeObject(alien16);
        gHGJ.setLocation(439,92);
        alien110.setLocation(858,55);
        alien17.setLocation(858,178);
        alien1 alien111 = new alien1();
        addObject(alien111,785,316);
        alien1 alien112 = new alien1();
        addObject(alien112,66,322);
        alien19.setLocation(41,109);
    }
}
