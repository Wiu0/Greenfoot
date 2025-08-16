import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Anne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Anne extends Actor
{
    /**
     * Act - do whatever the Anne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(getNeighbours(40, true, Block.class).size() > 0) {
            return;
        }
        if(Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 2, getY());    
        } else if(Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 2, getY());   
        } else if(Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 2);   
        } else if(Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 2);   
        }
    }
}