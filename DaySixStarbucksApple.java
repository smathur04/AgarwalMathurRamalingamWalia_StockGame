import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * class DaySixStarbucksApple instantiates object based on user input.
 * 
 * @author (your name) 
 * @version 11292020
 */
public class DaySixStarbucksApple extends World
{

    /**
     * Constructor for objects of class DaySixStarbucksApple.
     * 
     */
    public DaySixStarbucksApple()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1055, 585, 1); 
    }
    public void act()
    {
        Greenfoot.delay(10);
        //Selection "1" instantiates object ResultAppleStarbucks
        if (Greenfoot.isKeyDown("1"))
        {
            Greenfoot.setWorld(new NewResultStarbApp());
        }
    }
}
