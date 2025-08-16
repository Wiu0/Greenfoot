import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Meteoro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Meteoro extends Actor
{
    /**
     * Act - do whatever the Meteoro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

        move(-4);
        
        if(isAtEdge()) {
            turn(Greenfoot.getRandomNumber(180));
            move(20);
        }

        if(isTouching(Foguete.class)) {
            getWorld().showText("GAME OVER", 500, 300);
            removeTouching(Foguete.class);
            Greenfoot.stop();
        }
    }
}
