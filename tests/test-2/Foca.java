import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Foca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Foca extends Actor
{
    /**
     * Act - do whatever the Foca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space")) {
            move(4);
        } 
        if (Greenfoot.isKeyDown("w")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("s")) {
            turn(5);
        }  
        
        if(isTouching(Fish.class)) {
            removeTouching(Fish.class);
        }
    }
}
