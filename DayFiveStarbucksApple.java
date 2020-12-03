import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * class DayFiveStarbucksApple instantiates object or displays message based on user input.
 * 
 * @author (your name) 
 * @version 11292020
 */
public class DayFiveStarbucksApple extends World
{

    /**
     * Constructor for objects of class DayFiveStarbucksApple.
     * 
     */
    public DayFiveStarbucksApple()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1055, 585, 1); 
    }
    public void act()
    {
        addObject(new Counter("260"), 955, 50);//creates balance counter
        Greenfoot.delay(10);
        //Message is displyed when 'enter' key is pressed
        if (Greenfoot.isKeyDown("enter"))
        {
            System.out.println("IMPORTANT TIPS:");
            System.out.println("Major global events can cause the stock market to respond dramatically in either direction.");
            System.out.println("Market crashes can cause many people to sell their owned stocks, further lowering the value of the stock.");
            System.out.println("Although the prices will fall quickly, they will rebound some time in the future.");
        }
        //Selection "1" instantiates object DaySixStarbucksApple
        else if (Greenfoot.isKeyDown("1"))
        {
            Greenfoot.setWorld(new NewResultStarbApp());
        }
        //Selection "2" instantiates object DaySixStarbucks
        else if (Greenfoot.isKeyDown("2"))
        {
            Greenfoot.setWorld(new DaySixStarbucks());
        }
    }
}
