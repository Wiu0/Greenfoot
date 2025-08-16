import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hunter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hunter extends Actor
{
    /**
     * Act - do whatever the Hunter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("enter")) {
            move(2);
        } 
        if (Greenfoot.isKeyDown("up")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("down")) {
            turn(5);
        } 
        
        if(isTouching(Foca.class)) {
            removeTouching(Foca.class);
            Greenfoot.stop();
        }
    }
}
