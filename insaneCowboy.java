import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class insaneCowboy extends GHGJ
{
      private static final double COWBOY_GUN_VELOCITY = 1500.0;
     
    
        public void gameOverWon()
    {
        World gameLossOverWorld =  new  gameLossOverWorld();
        Greenfoot.setWorld(gameLossOverWorld);
    }
     public boolean endInsane()
    {
        World  world = getWorld();
        if (world.getObjects(alienInsaneMode.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
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
            move(5);
        }
        if (Greenfoot.isKeyDown("left")) {
            move(-5);
        }
        Actor j = getOneIntersectingObject(j.class);
        if (j != null) {
            World world = getWorld();
            world.removeObject(j);
        }
        if(endInsane()){
            gameOverWon();
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
