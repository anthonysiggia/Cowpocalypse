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
        alienCowEater alienCowEater5 = new alienCowEater();
        addObject(alienCowEater5,690,302);
        alienCowEater alienCowEater6 = new alienCowEater();
        addObject(alienCowEater6,797,328);
        alienCowEater alienCowEater7 = new alienCowEater();
        addObject(alienCowEater7,751,312);
        alienCowEater5.setLocation(717,321);
        alienCowEater alienCowEater8 = new alienCowEater();
        addObject(alienCowEater8,717,321);
        alienCowEater6.setLocation(767,337);
        alienCowEater alienCowEater9 = new alienCowEater();
        addObject(alienCowEater9,767,337);
        alienCowEater.setLocation(840,92);
        alienCowEater alienCowEater10 = new alienCowEater();
        addObject(alienCowEater10,840,92);
        alienCowEater alienCowEater11 = new alienCowEater();
        addObject(alienCowEater11,805,106);
        alienCowEater alienCowEater12 = new alienCowEater();
        addObject(alienCowEater12,777,96);
        alienCowEater12.setLocation(747,99);
        alienCowEater alienCowEater13 = new alienCowEater();
        addObject(alienCowEater13,747,99);
        alienCowEater13.setLocation(726,106);
        alienCowEater alienCowEater14 = new alienCowEater();
        addObject(alienCowEater14,726,106);
        alienCowEater.setLocation(779,103);
        alienCowEater alienCowEater15 = new alienCowEater();
        addObject(alienCowEater15,779,103);
        cowboylevel3.setLocation(425,96);
        alienCowEater4.setLocation(45,325);
        alienCowEater alienCowEater16 = new alienCowEater();
        addObject(alienCowEater16,45,325);
        alienCowEater4.setLocation(67,318);
        alienCowEater alienCowEater17 = new alienCowEater();
        addObject(alienCowEater17,67,318);
        alienCowEater17.setLocation(93,318);
        alienCowEater alienCowEater18 = new alienCowEater();
        addObject(alienCowEater18,93,318);
        alienCowEater17.setLocation(114,323);
        alienCowEater alienCowEater19 = new alienCowEater();
        addObject(alienCowEater19,114,323);
        alienCowEater4.setLocation(83,331);
        alienCowEater alienCowEater20 = new alienCowEater();
        addObject(alienCowEater20,83,331);
        alienCowEater2.setLocation(55,81);
        alienCowEater alienCowEater21 = new alienCowEater();
        addObject(alienCowEater21,55,81);
        alienCowEater2.setLocation(59,82);
        alienCowEater alienCowEater22 = new alienCowEater();
        addObject(alienCowEater22,59,82);
        alienCowEater alienCowEater23 = new alienCowEater();
        addObject(alienCowEater23,70,85);
        alienCowEater2.setLocation(69,93);
        alienCowEater alienCowEater24 = new alienCowEater();
        addObject(alienCowEater24,69,93);
        alienCowEater2.setLocation(66,90);
        alienCowEater alienCowEater25 = new alienCowEater();
        addObject(alienCowEater25,66,90);
        alienCowEater alienCowEater26 = new alienCowEater();
        addObject(alienCowEater26,707,327);
        alienCowEater5.setLocation(748,325);
        alienCowEater alienCowEater27 = new alienCowEater();
        addObject(alienCowEater27,748,325);
        alienCowEater6.setLocation(798,322);
        alienCowEater alienCowEater28 = new alienCowEater();
        addObject(alienCowEater28,798,322);
        alienCowEater alienCowEater29 = new alienCowEater();
        addObject(alienCowEater29,818,329);
        alienCowEater3.setLocation(840,330);
        alienCowEater alienCowEater30 = new alienCowEater();
        addObject(alienCowEater30,840,330);
        alienCowEater6.setLocation(791,330);
        alienCowEater alienCowEater31 = new alienCowEater();
        addObject(alienCowEater31,791,330);
        alienCowEater6.setLocation(772,326);
        alienCowEater alienCowEater32 = new alienCowEater();
        addObject(alienCowEater32,772,326);
        alienCowEater5.setLocation(732,325);
        alienCowEater alienCowEater33 = new alienCowEater();
        addObject(alienCowEater33,732,325);
        alienCowEater6.setLocation(778,326);
        alienCowEater alienCowEater34 = new alienCowEater();
        addObject(alienCowEater34,778,326);
        alienCowEater.setLocation(737,114);
        alienCowEater alienCowEater35 = new alienCowEater();
        addObject(alienCowEater35,737,114);
        alienCowEater.setLocation(783,103);
        alienCowEater alienCowEater36 = new alienCowEater();
        addObject(alienCowEater36,783,103);
        alienCowEater.setLocation(812,107);
        alienCowEater alienCowEater37 = new alienCowEater();
        addObject(alienCowEater37,812,107);
        alienCowEater.setLocation(760,122);
        alienCowEater alienCowEater38 = new alienCowEater();
        addObject(alienCowEater38,760,122);
        alienCowEater.setLocation(785,116);
        alienCowEater alienCowEater39 = new alienCowEater();
        addObject(alienCowEater39,785,116);
        alienCowEater.setLocation(801,119);
        alienCowEater alienCowEater40 = new alienCowEater();
        addObject(alienCowEater40,801,119);
        alienCowEater2.setLocation(62,83);
        alienCowEater alienCowEater41 = new alienCowEater();
        addObject(alienCowEater41,62,83);
        alienCowEater2.setLocation(75,82);
        alienCowEater alienCowEater42 = new alienCowEater();
        addObject(alienCowEater42,75,82);
        alienCowEater alienCowEater43 = new alienCowEater();
        addObject(alienCowEater43,80,85);
        alienCowEater4.setLocation(58,323);
        alienCowEater alienCowEater44 = new alienCowEater();
        addObject(alienCowEater44,58,323);
        alienCowEater4.setLocation(69,327);
        alienCowEater alienCowEater45 = new alienCowEater();
        addObject(alienCowEater45,69,327);
        alienCowEater4.setLocation(83,327);
        alienCowEater alienCowEater46 = new alienCowEater();
        addObject(alienCowEater46,83,327);
        removeObject(alienCowEater40);
        removeObject(alienCowEater39);
        removeObject(alienCowEater38);
        removeObject(alienCowEater37);
        removeObject(alienCowEater35);
        removeObject(alienCowEater36);
        removeObject(alienCowEater15);
        removeObject(alienCowEater34);
        removeObject(alienCowEater32);
        removeObject(alienCowEater33);
        removeObject(alienCowEater31);
        removeObject(alienCowEater28);
        removeObject(alienCowEater27);
        removeObject(alienCowEater26);
        removeObject(alienCowEater9);
        removeObject(alienCowEater46);
        removeObject(alienCowEater45);
        removeObject(alienCowEater44);
        removeObject(alienCowEater20);
        removeObject(alienCowEater43);
        removeObject(alienCowEater42);
        removeObject(alienCowEater41);
        removeObject(alienCowEater25);
        cow cow10 = new cow();
        addObject(cow10,369,253);
        cow cow11 = new cow();
        addObject(cow11,426,255);
        cow8.setLocation(471,275);
        cow cow12 = new cow();
        addObject(cow12,471,275);
        cow9.setLocation(542,274);
        cow cow13 = new cow();
        addObject(cow13,542,274);
        cow13.setLocation(555,236);
        cow cow14 = new cow();
        addObject(cow14,555,236);
        cow10.setLocation(388,230);
        cow cow15 = new cow();
        addObject(cow15,388,230);
        cow3.setLocation(446,236);
        cow cow16 = new cow();
        addObject(cow16,446,236);
        cow8.setLocation(407,281);
        cow cow17 = new cow();
        addObject(cow17,407,281);
        cow3.setLocation(482,271);
        cow cow18 = new cow();
        addObject(cow18,482,271);
        cow3.setLocation(493,246);
        cow cow19 = new cow();
        addObject(cow19,493,246);
        cow cow20 = new cow();
        addObject(cow20,543,261);
        cow cow21 = new cow();
        addObject(cow21,488,296);
        cow8.setLocation(447,274);
        cow cow22 = new cow();
        addObject(cow22,447,274);
        cow3.setLocation(476,262);
        cow cow23 = new cow();
        addObject(cow23,476,262);
        cow10.setLocation(408,266);
        cow cow24 = new cow();
        addObject(cow24,408,266);
        cow3.setLocation(516,268);
        cow cow25 = new cow();
        addObject(cow25,516,268);
        alienCowEater3.setLocation(857,325);
        cow3.setLocation(481,266);
        cow cow26 = new cow();
        addObject(cow26,481,266);
        alienCowEater alienCowEater47 = new alienCowEater();
        addObject(alienCowEater47,794,326);
        alienCowEater alienCowEater48 = new alienCowEater();
        addObject(alienCowEater48,866,331);
        alienCowEater alienCowEater49 = new alienCowEater();
        addObject(alienCowEater49,862,333);
        alienCowEater3.setLocation(823,330);
        alienCowEater alienCowEater50 = new alienCowEater();
        addObject(alienCowEater50,823,330);
        alienCowEater3.setLocation(804,334);
        alienCowEater alienCowEater51 = new alienCowEater();
        addObject(alienCowEater51,804,334);
        alienCowEater5.setLocation(764,324);
        alienCowEater alienCowEater52 = new alienCowEater();
        addObject(alienCowEater52,764,324);
        alienCowEater5.setLocation(728,328);
        alienCowEater alienCowEater53 = new alienCowEater();
        addObject(alienCowEater53,728,328);
    }
}
