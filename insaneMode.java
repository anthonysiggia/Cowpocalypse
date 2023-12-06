import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class insaneMode extends levels
{
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    private long lastFrameTimeMS;
    private double timeStepDuration;

    /**
     * 
     */
    public insaneMode()
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
        insaneCowboy insaneCowboy = new insaneCowboy();
        addObject(insaneCowboy,142,325);
        alienInsaneMode alienInsaneMode = new alienInsaneMode();
        addObject(alienInsaneMode,768,158);
        cow cow = new cow();
        addObject(cow,89,373);
        j j = new j();
        addObject(j,867,334);
        removeObject(cow);
        insaneCowboy insaneCowboy2 = new insaneCowboy();
        addObject(insaneCowboy2,143,320);
        insaneCowboy.setLocation(204,335);
        insaneCowboy insaneCowboy3 = new insaneCowboy();
        addObject(insaneCowboy3,204,335);
        insaneCowboy insaneCowboy4 = new insaneCowboy();
        addObject(insaneCowboy4,187,340);
        insaneCowboy.setLocation(167,333);
        insaneCowboy insaneCowboy5 = new insaneCowboy();
        addObject(insaneCowboy5,167,333);
        insaneCowboy.setLocation(191,343);
        insaneCowboy insaneCowboy6 = new insaneCowboy();
        addObject(insaneCowboy6,191,343);
        removeObject(insaneCowboy6);
        removeObject(insaneCowboy5);
        removeObject(insaneCowboy4);
        removeObject(insaneCowboy3);
        removeObject(j);
        alienInsaneMode alienInsaneMode2 = new alienInsaneMode();
        addObject(alienInsaneMode2,739,157);
        alienInsaneMode2.setLocation(718,150);
        alienInsaneMode alienInsaneMode3 = new alienInsaneMode();
        addObject(alienInsaneMode3,718,150);
        alienInsaneMode.setLocation(747,158);
        alienInsaneMode alienInsaneMode4 = new alienInsaneMode();
        addObject(alienInsaneMode4,747,158);
        alienInsaneMode.setLocation(779,159);
        alienInsaneMode alienInsaneMode5 = new alienInsaneMode();
        addObject(alienInsaneMode5,779,159);
        alienInsaneMode.setLocation(741,153);
        alienInsaneMode alienInsaneMode6 = new alienInsaneMode();
        addObject(alienInsaneMode6,741,153);
        alienInsaneMode.setLocation(759,150);
        alienInsaneMode alienInsaneMode7 = new alienInsaneMode();
        addObject(alienInsaneMode7,759,150);

        addObject(j,873,321);
        j.setLocation(872,330);
        removeObject(alienInsaneMode7);
        removeObject(alienInsaneMode6);
        removeObject(alienInsaneMode5);
        insaneCowboy.setLocation(159,319);
        insaneCowboy insaneCowboy7 = new insaneCowboy();
        addObject(insaneCowboy7,159,319);
        insaneCowboy.setLocation(173,324);
        insaneCowboy insaneCowboy8 = new insaneCowboy();
        addObject(insaneCowboy8,173,324);
        insaneCowboy.setLocation(190,327);
        insaneCowboy insaneCowboy9 = new insaneCowboy();
        addObject(insaneCowboy9,190,327);
        insaneCowboy insaneCowboy10 = new insaneCowboy();
        addObject(insaneCowboy10,316,305);
        insaneCowboy.setLocation(243,318);
        insaneCowboy insaneCowboy11 = new insaneCowboy();
        addObject(insaneCowboy11,243,318);
        insaneCowboy insaneCowboy12 = new insaneCowboy();
        addObject(insaneCowboy12,397,319);
        insaneCowboy insaneCowboy13 = new insaneCowboy();
        addObject(insaneCowboy13,469,319);
        alienInsaneMode2.setLocation(691,180);
        removeObject(alienInsaneMode4);
        removeObject(insaneCowboy11);
        removeObject(insaneCowboy9);
        removeObject(insaneCowboy10);
        removeObject(insaneCowboy8);
        removeObject(insaneCowboy12);
        removeObject(insaneCowboy13);
        insaneCowboy2.setLocation(155,319);

        addObject(insaneCowboy9,181,328);
        insaneCowboy.setLocation(203,323);
        insaneCowboy insaneCowboy14 = new insaneCowboy();
        addObject(insaneCowboy14,180,325);
        insaneCowboy.setLocation(167,319);
        insaneCowboy insaneCowboy15 = new insaneCowboy();
        addObject(insaneCowboy15,167,319);
        insaneCowboy.setLocation(187,318);
        insaneCowboy insaneCowboy16 = new insaneCowboy();
        addObject(insaneCowboy16,187,318);
        insaneCowboy.setLocation(176,321);
        insaneCowboy insaneCowboy17 = new insaneCowboy();
        addObject(insaneCowboy17,176,321);
        insaneCowboy.setLocation(198,323);
        insaneCowboy insaneCowboy18 = new insaneCowboy();
        addObject(insaneCowboy18,198,323);
        insaneCowboy.setLocation(182,325);
        insaneCowboy insaneCowboy19 = new insaneCowboy();
        addObject(insaneCowboy19,182,325);
        insaneCowboy.setLocation(202,323);
        insaneCowboy insaneCowboy20 = new insaneCowboy();
        addObject(insaneCowboy20,202,323);
        insaneCowboy insaneCowboy21 = new insaneCowboy();
        addObject(insaneCowboy21,194,336);
        insaneCowboy.setLocation(221,330);
        insaneCowboy insaneCowboy22 = new insaneCowboy();
        addObject(insaneCowboy22,221,330);
        insaneCowboy insaneCowboy23 = new insaneCowboy();
        addObject(insaneCowboy23,212,334);
        removeObject(alienInsaneMode3);
        removeObject(j);
        removeObject(alienInsaneMode2);
        removeObject(insaneCowboy21);
        removeObject(insaneCowboy22);
        removeObject(insaneCowboy23);
        removeObject(insaneCowboy19);
        removeObject(insaneCowboy20);
        removeObject(insaneCowboy18);
        removeObject(insaneCowboy17);
        removeObject(insaneCowboy16);
        removeObject(insaneCowboy15);
        removeObject(insaneCowboy9);
        removeObject(insaneCowboy14);
        alienInsaneMode alienInsaneMode8 = new alienInsaneMode();
        addObject(alienInsaneMode8,788,146);
        alienInsaneMode8.setLocation(813,150);
        alienInsaneMode alienInsaneMode9 = new alienInsaneMode();
        addObject(alienInsaneMode9,813,150);
        alienInsaneMode alienInsaneMode10 = new alienInsaneMode();
        addObject(alienInsaneMode10,710,143);
        alienInsaneMode.setLocation(735,158);
        alienInsaneMode alienInsaneMode11 = new alienInsaneMode();
        addObject(alienInsaneMode11,735,158);
        alienInsaneMode9.setLocation(839,160);
        alienInsaneMode alienInsaneMode12 = new alienInsaneMode();
        addObject(alienInsaneMode12,839,160);
        alienCowEater alienCowEater = new alienCowEater();
        addObject(alienCowEater,130,103);
        alienCowEater.setLocation(141,105);
        alienCowEater alienCowEater2 = new alienCowEater();
        addObject(alienCowEater2,141,105);
        alienInsaneMode8.setLocation(783,157);
        alienInsaneMode alienInsaneMode13 = new alienInsaneMode();
        addObject(alienInsaneMode13,783,157);
        alienInsaneMode.setLocation(754,157);
        alienInsaneMode alienInsaneMode14 = new alienInsaneMode();
        addObject(alienInsaneMode14,754,157);
    }
}
