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
        gHGJ.setLocation(508,44);
        removeObject(gHGJ);
        cowboyLevel2 cowboyLevel2 = new cowboyLevel2();
        addObject(cowboyLevel2,493,96);
        alien111.setLocation(745,341);
        removeObject(j);
        alien111.setLocation(779,329);
        doorLevel2 doorLevel2 = new doorLevel2();
        addObject(doorLevel2,867,333);
        alien12.setLocation(830,190);
        alienCowEater alienCowEater = new alienCowEater();
        addObject(alienCowEater,830,190);
        alien12.setLocation(813,164);
        alienCowEater alienCowEater2 = new alienCowEater();
        addObject(alienCowEater2,813,164);
        alien12.setLocation(828,189);
        alienCowEater alienCowEater3 = new alienCowEater();
        addObject(alienCowEater3,828,189);
        alienCowEater alienCowEater4 = new alienCowEater();
        addObject(alienCowEater4,834,161);
        alienCowEater alienCowEater5 = new alienCowEater();
        addObject(alienCowEater5,814,62);
        alien110.setLocation(850,62);
        alienCowEater alienCowEater6 = new alienCowEater();
        addObject(alienCowEater6,850,62);
        alien110.setLocation(831,65);
        alien110.setLocation(849,78);
        alienCowEater alienCowEater7 = new alienCowEater();
        addObject(alienCowEater7,849,78);
        alienCowEater alienCowEater8 = new alienCowEater();
        addObject(alienCowEater8,821,89);
        alien12.setLocation(802,178);
        alienCowEater alienCowEater9 = new alienCowEater();
        addObject(alienCowEater9,802,178);
        alien17.setLocation(838,171);
        alienCowEater alienCowEater10 = new alienCowEater();
        addObject(alienCowEater10,838,171);
        alien14.setLocation(99,76);
        alienCowEater alienCowEater11 = new alienCowEater();
        addObject(alienCowEater11,99,76);
        alienCowEater alienCowEater12 = new alienCowEater();
        addObject(alienCowEater12,119,87);
        alien19.setLocation(69,106);
        alienCowEater alienCowEater13 = new alienCowEater();
        addObject(alienCowEater13,69,106);
        alien18.setLocation(95,147);
        alienCowEater alienCowEater14 = new alienCowEater();
        addObject(alienCowEater14,95,147);
        alien15.setLocation(121,162);
        alienCowEater alienCowEater15 = new alienCowEater();
        addObject(alienCowEater15,121,162);
        alien19.setLocation(66,99);
        alienCowEater alienCowEater16 = new alienCowEater();
        addObject(alienCowEater16,66,99);
        removeObject(alien111);
        removeObject(alien112);
        GHGJ gHGJ2 = new GHGJ();
        addObject(gHGJ2,249,344);
        removeObject(gHGJ2);
    }
}
