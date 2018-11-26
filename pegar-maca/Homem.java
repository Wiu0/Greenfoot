import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class homem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Homem extends Actor
{
    /**
     * Act - do whatever the homem wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(Greenfoot.getRandomNumber(5));
        //turn(15);
        if(Greenfoot.isKeyDown("up")){
            turn(-15);
        }
        if(Greenfoot.isKeyDown("down")){
            turn(15);
        }
        
        if(isTouching(Apple.class)){
        
        
        
       removeTouching(Apple.class);}
        
        
        
     
    }    
}
