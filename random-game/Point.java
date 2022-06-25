import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class point here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Point extends Actor
{

    /**
     * Act - do whatever the point wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.getRandomNumber(100) < 10) {
            if(getImage().toString().contains("beeper.png")) {
                setImage(new GreenfootImage(1, 1));
            } else {
                setImage("beeper.png");
            }
        }
    }
}
