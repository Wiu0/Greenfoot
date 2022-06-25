import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends Actor
{
    int sangueFoguete = 25;
    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getWorld().showText("Sangue: " + sangueFoguete, 800, 10);
        move(-5);
        if(isTouching(Rocket.class)) {
            sangueFoguete = sangueFoguete - 1;
            
        }
        if(isAtEdge()) {
            turn(Greenfoot.getRandomNumber(360));
        }
        if(isTouching(Asteroid.class)) {
           turn(Greenfoot.getRandomNumber(360));
        }
        
        if(sangueFoguete < 0) {
            removeTouching(Rocket.class);
            getWorld().showText("GAME OVER", 500, 100);
            Greenfoot.stop();
        }
        
    }
}
