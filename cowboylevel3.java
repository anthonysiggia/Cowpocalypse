import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cowboylevel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cowboylevel3 extends GHGJ
{
     private static final double COWBOY_GUN_VELOCITY = 1500.0;
            public void transitionToGameLossWorld()
    {
        World gameLossOverWorld =  new  gameLossOverWorld();
        Greenfoot.setWorld(gameLossOverWorld);
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
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(alienCowEater.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void transitionToGameWonWorld()
    {
        World gameOverWonWorld =  new  gameOverWonWorld();
        Greenfoot.setWorld(gameOverWonWorld);
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
                Greenfoot.playSound("alienshoot1.wav");
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
        if(isGameLoss()){
            transitionToGameLossWorld();
        }
        if(isGameWon()){
            transitionToGameWonWorld();
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
