import greenfoot.*; 

public class CarroInimigo2 extends Actor
{

    public void act()
    {
        setLocation(getX(), getY() + Greenfoot.getRandomNumber(8));

        if(isTouching(CarPlayerOne.class)) {
            Greenfoot.stop();
            getWorld().showText("GAME OVER", 100, 300);
        }
        if(isAtEdge()) {
            getWorld().removeObject(this);
        }  
    }
}
