import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Andador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Andador extends Actor
{
    /**
     * Act - do whatever the Andador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getWorld().showText("x: " + getX(), 40, 30);
        getWorld().showText("Y: " + getY(), 40, 60);
        //x = 100, y = 30
        // 1 - d: x = 102, y = 30
        // 2 - d: x = 104, y = 30
        // 3 - d: x = 106, y = 30
        // 4 - a: x = 104, y = 30
        if(Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 2, getY());
        }

        if(Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 2, getY());
        }

        if(Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 2);
        }

        if(Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 2);
        }
    }
}
