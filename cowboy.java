// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;
import java.util.*;

/**
 * Write a description of class cowboy here.
 * @author (your name) @version (a version number or a date)
 */
public class cowboy extends Actor
{
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    private static final double COWBOY_GUN_VELOCITY = 1500.0;

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
            Vector2D gunToMouse =  new  Vector2D(mouse.getX() - getX(), mouse.getY() - getY());
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
        Actor door = getOneIntersectingObject(door.class);
        if (0!=true) {
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
