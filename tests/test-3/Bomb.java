import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space")) {
            move(4);
        } 
        if (Greenfoot.isKeyDown("w")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("s")) {
            turn(5);
        }  

        if(Greenfoot.isKeyDown("enter")) {
            move(10);
        } 

        if(isTouching(Target.class)) {
            if(Greenfoot.isKeyDown("b")) {
                getWorld().showText("YOU WIN", 500, 100);
                Greenfoot.stop();
            }
        }

        if(isTouching(Baby.class) || isTouching(Animal.class)) {
            getWorld().showText("GAME OVER", 500, 100);
            Greenfoot.stop();
        }
    }
}
