import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyWorld class directs the user based on their response 
 * 
 * @author (your name) 
 * @version 11292020
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1055, 585, 1);
    }
    public void act()
    {
        //Interact with the user and based on the user response, display the message/instantiate an object of class Instructions
        Greenfoot.delay(100);
        int i = 0;
        while (i < 1){
        String q=Greenfoot.ask("Are you ready to start (yes/no)");
        if (q.contains("yes"))
        {
            String oldScoreS = Greenfoot.ask("If you have played before please enter your previous balance at the end of the game, otherwise, enter 0:");
            String name = Greenfoot.ask("Please enter your name:");
            int oldScoreI = Integer.parseInt(oldScoreS);
            Greenfoot.ask("Welcome " + name + " let's get started! (click enter to proceed)");
            Greenfoot.setWorld(new Instructions());
            i++;
        }
        else 
        {
          q=Greenfoot.ask("Please enter your answer carefully (click enter to try again)"); 
        }   
    }
    }

}
