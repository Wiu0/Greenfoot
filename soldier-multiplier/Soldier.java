import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class soldier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Soldier extends Actor
{
    /**
     * Act - do whatever the soldier wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() - 1);

        if(isTouching(Wall.class)) {
            setLocation(getX(), getY() - 40);
            getWorld().addObject(new Soldier(), getX() - 15, getY() - 40);
            getWorld().addObject(new Soldier(), getX() + 15, getY() - 40);
        }
        if(isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
