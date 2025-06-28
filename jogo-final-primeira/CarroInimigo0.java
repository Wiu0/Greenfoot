import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CarroInimigo0 extends Actor
{
    public void act()
    {
        setLocation(getX(), getY() + 6);
    
        if(isTouching(CarPlayerOne.class)) {
            Greenfoot.stop();
            getWorld().showText("GAME OVER", 100, 300);
        }
         
        if(isAtEdge()) {
            getWorld().removeObject(this);
        }   
    }
}
