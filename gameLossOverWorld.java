import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class gameLossOverWorld extends World
{
    private GreenfootSound gameLossOverWorld;
    /**
     * Constructor for objects of class gameLossOverWorld.
     */
    public gameLossOverWorld()
    {
        super(355, 400, 1);
        gameLossOverWorld =  new  GreenfootSound("gameover-lose.wav");
        started();
        stopped();
    }
    
     
    
    public void started()
    {
        gameLossOverWorld.playLoop();
    }

    /**
     * 
     */
    public void stopped()
    {
        gameLossOverWorld.stop();
    }
}
