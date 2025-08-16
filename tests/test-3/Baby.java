import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baby extends Actor
{
    /**
     * Act - do whatever the Baby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(1);
        if(Greenfoot.getRandomNumber(10) < 2) {
            move(4 + Greenfoot.getRandomNumber(10));    
        }
        
        if(isAtEdge()) {
            turn(Greenfoot.getRandomNumber(200));
            move(5);
        }
    }
}
