import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sapo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sapo extends Actor
{
    /**
     * Act - do whatever the Sapo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(5);
        if(Greenfoot.isKeyDown("up")){
            turn(-6);

        }
        if(Greenfoot.isKeyDown("down")){   
            turn(6); 

        } 
        if(isTouching(Mosca.class)){
        removeTouching(Mosca.class);
        }
    }
}
