import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Seal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seal extends Actor
{
    /**
     * Act - do whatever the Seal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-5);
        if(isTouching(Fish.class)) {
            removeTouching(Fish.class);
        }
        if(isAtEdge()) {
            turn(Greenfoot.getRandomNumber(360));
        }
        if(isTouching(Asteroid.class)) {
           turn(Greenfoot.getRandomNumber(360));
        }
    }
}
