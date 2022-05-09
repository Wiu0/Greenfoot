import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nave extends Actor
{
    /**
     * Act - do whatever the Nave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space")) {
            move(3);
        }
 
        if(Greenfoot.isKeyDown("up")) {
            turn(-5);
        }
        
        if(Greenfoot.isKeyDown("p")){
           //FAZER O LASER ACONTECER
           Laser tiro = new Laser();
           tiro.setRotation(getRotation());
           MyWorld myWorld = (MyWorld) getWorld();
           myWorld.addObject(tiro, getX(), getY());
        }
    }
}
