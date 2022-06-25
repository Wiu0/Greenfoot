import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space")) {
            move(3);
        }
        if(Greenfoot.isKeyDown("r")) {
            move(-3);
        }
        
        if(Greenfoot.isKeyDown("space") && Greenfoot.isKeyDown("d")) {
            turn(2);
        }
        
        if(Greenfoot.isKeyDown("space") && Greenfoot.isKeyDown("a")) {
            turn(-2);
        }
        
           if(Greenfoot.isKeyDown("r") && Greenfoot.isKeyDown("d")) {
            turn(2);
        }
        
        if(Greenfoot.isKeyDown("r") && Greenfoot.isKeyDown("a")) {
            turn(-2);
        }
        
        if(isAtEdge()) {
            getWorld().showText("BATEUUUU", 600, 100);
        }
    }
}
