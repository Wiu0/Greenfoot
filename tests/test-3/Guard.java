import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Guard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guard extends Actor
{
    /**
     * Act - do whatever the Guard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(2);
        if(Greenfoot.getRandomNumber(10) < 2) {
            move(10 + Greenfoot.getRandomNumber(10));    
        }
        
        if(isAtEdge()) {
            turn(Greenfoot.getRandomNumber(200));
            move(5);
        }
        if(isTouching(Bomb.class)) {
            getWorld().showText("GAME OVER", 500, 100);
            removeTouching(Bomb.class);
            Greenfoot.stop();
        }
    }
}
