import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * class DayThreeApple instantiates object or displays message according to user selection
 * Selection "1" instantiates object DayFourAppleSell and Selection "2" instantiates object DayFourAppleHold
 * @author  
 * @version 11292020
 */
public class DayThreeApple extends World
{

    /**
     * Constructor for objects of class DayThreeApple.
     * 
     */
    public DayThreeApple()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1055, 585, 1);  
    }
    public void act()
    {
        addObject(new Counter("352"), 955, 50);//creates balance counter
        Greenfoot.delay(10);
        //Message is displyed when 'enter' key is pressed
        if (Greenfoot.isKeyDown("enter"))
        {
            System.out.println("IMPORTANT TIPS:");
            System.out.println("Stocks that have been trending down for a long time are likely to shoot back up!");
            System.out.println("Stocks that have been trending up for a long time are likely to shoot back down!");
        }
        //Selection "1" instantiates object DayFourAppleSell
        if (Greenfoot.isKeyDown("1"))
        {
            Greenfoot.setWorld(new DayFourAppleSell());
        }
        //Selection "2" instantiates object DayFourAppleHold
        if (Greenfoot.isKeyDown("2"))
        {
            Greenfoot.setWorld(new DayFourAppleHold());
        }
    }
}
