import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MonstroStalker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MonstroStalker extends Actor
{
    /**
     * Act - do whatever the MonstroStalker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(getWorld().getObjects(Bola.class).size() > 0 ) {
            turnTowards(getWorld().getObjects(Bola.class).get(0).getX(), getWorld().getObjects(Bola.class).get(0).getY());
            move(1);
        }
        
            if(isTouching(Bola.class)) {
            removeTouching(Bola.class);
            Greenfoot.stop();
        }
    }
}
