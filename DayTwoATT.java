import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * class DayTwoATT instantiates object based on user input..
 * 
 * @author (your name) 
 * @version 11292020
 */
public class DayTwoATT extends World
{

    /**
     * Constructor for objects of class DayTwoATT.
     * 
     */
    public DayTwoATT()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1055, 585, 1);  
    }
    public void act()
    {
        addObject(new Counter("450"), 955, 50);//creates balance counter
        Greenfoot.delay(300);
        String q=Greenfoot.ask("Please enter the word next to continue!");
        // user input "next" instantiates object DayThreeATT
        if (q.contains("next"))
        {
            Greenfoot.setWorld(new DayThreeATT());
        }
        else 
        {
          q=Greenfoot.ask("Please restart the program and enter you answer carefully next time"); 
        }    
    }
}
