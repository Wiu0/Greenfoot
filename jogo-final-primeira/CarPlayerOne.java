import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CarPlayerOne extends Actor
{
    public void act()
    {
        if(Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 5, getY()); 
        }
        if(Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 5, getY());
        }
        if(Greenfoot.isKeyDown("space")) {
            setLocation(getX(), getY() - 5);
        }
        if(Greenfoot.isKeyDown("r")) {
            setLocation(getX(), getY() + 5);
        }
    }
}
