import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Estrela here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estrela extends Actor
{
    /**
     * Act - do whatever the Estrela wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-4);
        if(isAtEdge()) {
            turn(Greenfoot.getRandomNumber(180));
            move(20);
        }
    }
}
