import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class gameOverWonWorld extends World
{
    private GreenfootSound gameMusic;

    /**
     * Constructor for objects of class gameOverWonWorld.
     */
    public gameOverWonWorld()
    {
        super(355, 400, 1);
        gameMusic =  new  GreenfootSound("gameover-win.wav");
    }

    /**
     * 
     */
    public void started()
    {
        gameMusic.playLoop();
    }

    /**
     * 
     */
    public void stopped()
    {
        gameMusic.stop();
    }
}
