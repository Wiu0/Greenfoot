import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Objects;

/**
 * Write a description of class SoldierCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoldierCreator extends Actor
{
    /**
     * Act - do whatever the SoldierCreator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left")) {
            move(-5);    
        } else if(Greenfoot.isKeyDown("right")) {
            move(5);
        }
        
        if(Objects.nonNull(Greenfoot.getMouseInfo()) && Greenfoot.getMouseInfo().getButton() == 1 && Greenfoot.getRandomNumber(100) < 50) {
            getWorld().addObject(new Soldier(), getX(), getY() - 20);
        }
    }
}
