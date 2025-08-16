import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Terrorista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Terrorista extends Actor
{
    static int quantidade = 0;
    /**
     * Act - do whatever the Terrorista wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getWorld().showText("Kills: " + quantidade, 300, 80);
        if(Greenfoot.getRandomNumber(100) < 2) {
            setLocation(getX(), Greenfoot.getRandomNumber(400));
        }

        if(Greenfoot.getRandomNumber(100) < 5) {
            getWorld().addObject(new Power(), getX() - 25, getY());
        }

        if(isTouching(Bala.class)){
            getWorld().addObject(new Terrorista(), 513, Greenfoot.getRandomNumber(400));
            removeTouching(Bala.class);
            quantidade ++;
            getWorld().removeObject(this);
            
        }
    }
}
