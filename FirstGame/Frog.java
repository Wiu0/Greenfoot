import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Actor
{
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left")){
            turn(15);
        }else if(Greenfoot.isKeyDown("right")){
            turn(-15);
        }
        move(3);
        if(isTouching(Fly.class)){
            removeTouching(Fly.class);
        }
    }    
}
