import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * class ResultATTNike instantiates object based on user input.
 * 
 * @author (your name) 
 * @version 11292020
 */
public class ResultATTNike extends World
{

    /**
     * Constructor for objects of class ResultATTNike.
     * 
     */
    public ResultATTNike()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1055, 585, 1); 
    }
    public void act()
    {
        Greenfoot.delay(10);
        //Instantiate Review object when 'enter' key is pressed
        if (Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new Review());
        }
    }
}
