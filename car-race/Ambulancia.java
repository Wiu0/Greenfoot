import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inimigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ambulancia extends Actor
{
    /**
     * Act - do whatever the Inimigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + 4);
        if(isTouching(Car.class)) {
            Greenfoot.stop();
            getWorld().showText("GAME OVER", getWorld().getWidth()/2, getWorld().getHeight()/2);
            //MyWorld.gs.stop();
            new GreenfootSound("hit.mp3").play();

        }
        if(isAtEdge()) {
            getWorld().removeObject(this);
            RaceTrack.PONTOS++;
        }
    }
}
