import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class apple here.
 * 
 * @author (Dayane) 
 * @version (1.0)
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-1 *Greenfoot.getRandomNumber(5));
        turn(Greenfoot.getRandomNumber(10));
        
     
 
       
      
    }
}
