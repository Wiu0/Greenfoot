import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Life here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Life extends Actor
{
    /**
     * Act - do whatever the Life wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if(isAtEdge()){
            turn(120);
        }
        
        move(Greenfoot.getRandomNumber(10) * -1);
        
        if(Greenfoot.getRandomNumber(100) < 10){
            turn(-15);
        }
        
        if(Greenfoot.getRandomNumber(100) > 90){
            turn(15);
        }
    }    
}
