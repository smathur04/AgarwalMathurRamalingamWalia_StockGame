import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  class DayFourATTHold instantiates object based on user input.
 * 
 * @author (your name) 
 * @version 11292020
 */
public class DayFourATTHold extends World
{

    /**
     * Constructor for objects of class DayFourATTHold.
     * 
     */
    public DayFourATTHold()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1055, 585, 1); 
    }
    public void act()
    {
        addObject(new Counter("500"), 955, 50);//creates balance counter
        Greenfoot.delay(10);
        // instantiates object ResultATT when user presses 1
        if (Greenfoot.isKeyDown("1"))
        {
            Greenfoot.setWorld(new ResultATT());
        }
    }
}
