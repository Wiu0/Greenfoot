import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + 2);
        if(getY() > getWorld().getHeight() - 50) {
            getWorld().showText("GAME OVER", getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
        Actor a = getOneIntersectingObject(Soldier.class);
        if(a != null) {
            getWorld().removeObject(a);
            getWorld().removeObject(this);
        }
    }
}
