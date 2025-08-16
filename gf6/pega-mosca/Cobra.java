import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cobra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cobra extends Actor
{
    /**
     * Act - do whatever the Cobra wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(Greenfoot.getRandomNumber(10));
        turn(13 - Greenfoot.getRandomNumber(25));
        if(isAtEdge()) {
            turn(90);
            move(20);  
        }
        
        if(isTouching(Sapo.class)) {
            removeTouching(Sapo.class);
            Greenfoot.stop();
        }
        
    }
}
