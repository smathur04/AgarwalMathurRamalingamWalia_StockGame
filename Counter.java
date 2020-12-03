import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Counter(String balance) 
    {
        //creates the display counter, with parameter defined in the world subclasses
        GreenfootImage img = new GreenfootImage(200, 80);
        //creates new blank image with size 200, 80
        img.drawString ("Balance ($): " + balance, 10, 50);
        //draws string at location 10, 50 in the image
        setImage(img);
    }
}
