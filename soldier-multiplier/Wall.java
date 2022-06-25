import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Actor
{
    /**
     * Act - do whatever the Wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int SPEED = 2;
    public void act()
    {
        
        getWorld().showText("", getX(), getY() - 50);
        if(isAtEdge()) {
            SPEED *= -1;
        }
        
        setLocation(getX() + SPEED, getY());
        getWorld().showText("x2", getX() + SPEED, getY() - 50);
        
    }
}
