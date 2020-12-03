import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * class DayFourAppleHold instantiates an object based on user input.
 * 
 * @author (your name) 
 * @version 11292020
 */
public class DayFourAppleHold extends World
{

    /**
     * Constructor for objects of class DayFourAppleHold.
     * 
     */
    public DayFourAppleHold()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1050, 585, 1); 
    }
    public void act()
    {
        addObject(new Counter("480"), 955, 50);//creates balance counter
        Greenfoot.delay(10);
        //Selection "1" instantiates object ResultApple
        if (Greenfoot.isKeyDown("1"))
        {
            Greenfoot.setWorld(new ResultApple());
        }
    }
}
