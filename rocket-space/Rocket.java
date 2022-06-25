import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        if(Greenfoot.isKeyDown("w")) {
            turn(-5);
        }
        if(Greenfoot.isKeyDown("s")) {
            turn(5);
        }
        if(getX() > 950){
            Greenfoot.setWorld(new Phase2());
        }
    }
}
