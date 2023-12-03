import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class bulllet extends Actor
{
    private Point2D position;
    private Vector2D velocity;
    private Vector2D acceleration;
    private static final double GRAVITY = 7 * 200;

    /**
     * 
     */
    public bulllet()
    {
        position = null;
        velocity =  new Vector2D(0.0, 0.0);
        acceleration =  new Vector2D(0.0, GRAVITY);
    }

    /**
     * 
     */
    public void act()
    {
        updatePhysics();
        Actor alien1 = getOneIntersectingObject(alien1.class);
        if (alien1 != null) {
            World world = getWorld();
            world.removeObject(alien1);
        }
    }

    /**
     * 
     */
    public void setVelocity(Vector2D newValue)
    {
        velocity = newValue;
    }

    /**
     * 
     */
    public void updatePhysics()
    {
        if (position == null) {
            position =  new Point2D(getX(), getY());
        }
        levels world = (levels)getWorld();
        double dt = world.getTimeStepDuration();
        
        Vector2D velocityVariation = Vector2D.multiply(acceleration, dt);
        velocity = Vector2D.add(velocity, velocityVariation);
        
        Vector2D positionVariation = Vector2D.multiply(velocity, dt);
        position.add(positionVariation);
        
        setLocation((int)position.getX(), (int)position.getY());
    }
}
