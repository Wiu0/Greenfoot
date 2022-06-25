import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Terrorista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Terrorista extends Actor
{
    /**
     * Act - do whatever the Terrorista wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

        if(Greenfoot.getRandomNumber(100) < 2) {
            setLocation(getX(), Greenfoot.getRandomNumber(400));
        }

        if(Greenfoot.getRandomNumber(100) < 5) {
            getWorld().addObject(new Power(), getX() - 25, getY());
        }

        if(isTouching(Bala.class)){
            removeTouching(Bala.class);
            getWorld().removeObject(this);
            
        }
    }
}
