import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * class DayOne allows user to select/buy one of the given stock options and instantiates object according to user selection
 * 
 * @author (your name) 
 * @version 11292020
 */
public class DayOne extends World
{

    /**
     * Constructor for objects of class DayOne.
     * 
     */
    public DayOne()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1055, 585, 1); 
        
    }
    public void act()
    {
        addObject(new Counter("400"), 955, 50);//creates balance counter with value 400
        //Displays the message based on user input reponse
        Greenfoot.delay(10);
        //Displays message when 'enter' key is pressed
        if (Greenfoot.isKeyDown("enter"))
        {
            System.out.println("IMPORTANT TIPS:");
            System.out.println("Stocks that have been trending down for a long time are likely to shoot back up!");
            System.out.println("Stocks that have been trending up for a long time are likely to shoot back down!");
        }
        // Instantiates DayTwoApple object when "1" is selected
        else if (Greenfoot.isKeyDown("1"))
        {
            Greenfoot.setWorld(new DayTwoApple());
        }
        //Instantiates DayTwoATT object when "2" is selected
        else if (Greenfoot.isKeyDown("2"))
        {
            Greenfoot.setWorld(new DayTwoATT());
        }
    }
}
