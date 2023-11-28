// WARNING: This file is auto-generated and any changes to it will be overwritten
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
        velocity =  new  Vector2D(0.0, 0.0);
        acceleration =  new  Vector2D(0.0, GRAVITY);
    }

    /**
     * 
     */
    public void act()
    {
        updatePhysics();
        Actor alien1 = getOneIntersectingObject(alien1.class);
        if (alien1 != null) {
            World forrest = getWorld();
            forrest.removeObject(alien1);
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
        /* Initial position*/
        if (position == null) {
            position =  new  Point2D(getX(), getY());
        }
        /* Get time step duration*/
        forrest world = (forrest)getWorld();
        double dt = world.getTimeStepDuration();
        /* Update velocity*/
        Vector2D velocityVariation = Vector2D.multiply(acceleration, dt);
        velocity = Vector2D.add(velocity, velocityVariation);
        /* Update position*/
        Vector2D positionVariation = Vector2D.multiply(velocity, dt);
        position.add(positionVariation);
        /* Set new actor position*/
        setLocation((int)position.getX(), (int)position.getY());
    }
}
