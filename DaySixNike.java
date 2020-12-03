import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * class DaySixNike instantiates object based on user input.
 * 
 * @author (your name) 
 * @version 11292020
 */
public class DaySixNike extends World
{

    /**
     * Constructor for objects of class DaySixNike.
     * 
     */
    public DaySixNike()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1055, 585, 1); 
    }
    public void act()
    {
        Greenfoot.delay(10);
        //Selection "1" instantiates object ResultATTNike
        if (Greenfoot.isKeyDown("1"))
        {
            Greenfoot.setWorld(new ResultAppleNike());
        }
    }
}
