import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sapo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sapo extends Actor
{
    int pontos  = 0;
    /**
     * Act - do whatever the Sapo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);
        if(Greenfoot.isKeyDown("w")) turn(-2);
        if(Greenfoot.isKeyDown("s")) turn(2);
        
        getWorld().showText("Score: " + pontos, getWorld().getWidth() - 60, 20);
        
        if(isTouching(Mosca.class)) {
            removeTouching(Mosca.class);
            pontos++;
        }
        
        if(pontos == 3) {
            Greenfoot.setWorld(new Fase2());    
        }
    }
}
