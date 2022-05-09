import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monstro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monstro extends Actor
{
    /**
     * Act - do whatever the Monstro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        if(isAtEdge()) {
            turn(Greenfoot.getRandomNumber(359));    
        }
        
        if(Greenfoot.getRandomNumber(100) > 20) {
            move(5);
        }
        
        if(Greenfoot.getRandomNumber(100) < 3) {
            turn(20);
        }
        
        if(Greenfoot.getRandomNumber(100) < 5) {
            turn(-20);
        }
        //0 ... 99
        if(Greenfoot.getRandomNumber(100) < 3) {
            move(5);
        }
        
        if(Greenfoot.getRandomNumber(100) < 5) {
            move(-5);
        }
        
        if(isTouching(Bola.class)) {
            removeTouching(Bola.class);
            Greenfoot.stop();
        }
        
    }
}
