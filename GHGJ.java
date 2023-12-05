import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GHGJ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GHGJ extends Actor
{
    private static final double COWBOY_GUN_VELOCITY = 1500.0;
            public void transitionToGameLossWorld()
    {
        World forrest1 = getWorld();
        forrest1.stopped();
        World gameLossOverWorld =  new  gameLossOverWorld();
        gameLossOverWorld.started();
        Greenfoot.setWorld(gameLossOverWorld);
    }
              public void transitionToBarnWorld()
    {
        World barn =  new  barn();
        Greenfoot.setWorld(barn);
    }
      public boolean level2()
    {
        World  world = getWorld();
        if (world.getObjects(j.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean isGameLoss()
    {
        World world = getWorld();
        if (world.getObjects(cow.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * 
     */
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null) {
            Vector2D gunToMouse =  new  Vector2D(mouse.getX() - getX(), mouse.getY() - getY());
            double adjacent = gunToMouse.getX();
            double opposite = gunToMouse.getY();
            double angleRadians = Math.atan2(opposite, adjacent);
            double angleDegrees = Math.toDegrees(angleRadians);
            setRotation((int)angleDegrees);
        }
        if (mouse != null) {
            Vector2D gunToMouse =  new  Vector2D(mouse.getX() - (getX()), mouse.getY() - getY());
            alignWithVector(gunToMouse);
            if (Greenfoot.mouseClicked(null)) {
                gunToMouse.normalize();
                gunToMouse = Vector2D.multiply(gunToMouse, COWBOY_GUN_VELOCITY);
                bulllet bullet =  new  bulllet();
                bullet.setVelocity(gunToMouse);
                getWorld().addObject(bullet, getX(), getY());
            }
        }
        if (Greenfoot.isKeyDown("right")) {
            move(2);
        }
        if (Greenfoot.isKeyDown("left")) {
            move(-2);
        }
        Actor j = getOneIntersectingObject(j.class);
        if (j != null) {
            World world = getWorld();
            world.removeObject(j);
        }
        
        if (isGameLoss()) {
            transitionToGameLossWorld();
        }
        if (level2()){
            transitionToBarnWorld();
        }
    }
    /**
     * 
     */
    public void alignWithVector(Vector2D v)
    {
        double adjacent = v.getX();
        double opposite = v.getY();
        double angleRadians = Math.atan2(opposite, adjacent);
        double angleDegrees = Math.toDegrees(angleRadians);
        setRotation((int)angleDegrees);
    }
    }

