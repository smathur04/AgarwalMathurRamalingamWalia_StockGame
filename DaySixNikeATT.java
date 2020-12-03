import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DaySixNikeATT here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DaySixNikeATT extends World
{

    /**
     * Constructor for objects of class DaySixNikeATT.
     * 
     */
    public DaySixNikeATT()
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
