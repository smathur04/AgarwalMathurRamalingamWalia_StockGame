import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * class DayTwoApple instantiates object or displays message according to user selection
 * 
 * @author (your name) 
 * @version 11292020
 */
public class DayTwoApple extends World
{
    
    /**
     * Constructor for objects of class DayTwoApple.
     * 
     */
    public DayTwoApple()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1055, 585, 1);  
    }
    public void act()
    {
        Greenfoot.delay(300);
        String q=Greenfoot.ask("Please enter the word next to continue!");
        // selection 'next' instantiates object DayThreeApple
        if (q.contains("next"))
        {
            Greenfoot.setWorld(new DayThreeApple());
        }
        //Displays message when 'next' is not typed
        else 
        {
          q=Greenfoot.ask("Please restart the program and enter you answer carefully next time"); 
        }    
    }
}
