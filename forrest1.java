import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class forrest1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class forrest1 extends levels
{
    private long lastFrameTimeMS;
    private double timeStepDuration;
public forrest1()
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
        addObject(alien1,751,329);
        alien1.setLocation(790,328);
        alien1 alien12 = new alien1();
        addObject(alien12,790,328);
        alien1.setLocation(790,340);
        alien1.setLocation(787,328);
        alien1 alien13 = new alien1();
        addObject(alien13,697,331);
        alien1 alien14 = new alien1();
        addObject(alien14,640,326);
        alien14.setLocation(641,333);
        alien14.setLocation(380,41);
        alien13.setLocation(595,61);
        alien1 alien15 = new alien1();
        addObject(alien15,499,232);
        alien1 alien16 = new alien1();
        addObject(alien16,575,326);
        alien1.setLocation(801,73);
        alien1 alien17 = new alien1();
        addObject(alien17,760,79);
        alien17.setLocation(759,77);
        alien1 alien18 = new alien1();
        addObject(alien18,657,198);
        j j = new j();
        addObject(j,865,322);
        j.setLocation(876,322);
        cow cow = new cow();
        addObject(cow,169,367);

        alien16.setLocation(551,295);
        GHGJ gHGJ = new GHGJ();
        addObject(gHGJ,90,295);
        alien1 alien19 = new alien1();
        addObject(alien19,490,95);
        alien1 alien110 = new alien1();
        addObject(alien110,557,217);
        alien18.setLocation(613,198);
        alien1 alien111 = new alien1();
        addObject(alien111,613,198);
        alien1 alien112 = new alien1();
        addObject(alien112,716,208);
        alien1 alien113 = new alien1();
        addObject(alien113,778,193);
        alien1 alien114 = new alien1();
        addObject(alien114,604,331);
        alien1 alien115 = new alien1();
        addObject(alien115,652,332);
        alien1 alien116 = new alien1();
        addObject(alien116,713,336);
        alien1 alien117 = new alien1();
        addObject(alien117,846,188);
        alien1 alien118 = new alien1();
        addObject(alien118,648,69);
        alien1 alien119 = new alien1();
        addObject(alien119,709,91);
        alien15.setLocation(463,271);
        alien1 alien120 = new alien1();
        addObject(alien120,662,197);
        alien1 alien121 = new alien1();
        addObject(alien121,506,150);
        alien1 alien122 = new alien1();
        addObject(alien122,435,64);
        alien1 alien123 = new alien1();
        addObject(alien123,328,51);
        alien1 alien124 = new alien1();
        addObject(alien124,242,83);
        alien15.setLocation(507,309);
        alien1 alien125 = new alien1();
        addObject(alien125,507,309);
        alien15.setLocation(507,329);
        alien1 alien126 = new alien1();
        addObject(alien126,525,82);
        alien1 alien127 = new alien1();
        addObject(alien127,326,204);
}
}
