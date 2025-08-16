import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spider extends Actor
{
    /**
     * Act - do whatever the Spider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(2);
        if(Greenfoot.isKeyDown("a")) {
            turn(-10);
        } else if (Greenfoot.isKeyDown("d")) {
            turn(10);
        }
        if(isTouching(Fly.class)) {
            removeTouching(Fly.class);
            Greenfoot.stop();
        }
    }
}
