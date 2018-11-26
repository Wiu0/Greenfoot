import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hedge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hedge extends Actor
{
    /**
     * Act - do whatever the hedge wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isTouching(Homem.class)){

            removeTouching(Homem.class);

            Greenfoot.stop();

        }       
     
    }    
}
