import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MaoDireita extends Actor
{
    /**
     * Act - do whatever the Mao wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int espera = 0;
    public void act()
    {
        
        if(Greenfoot.isKeyDown("up")) {
            if(espera-- == 0) {
                getWorld().addObject(new Dedo(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
                espera = 10;
            }
            
        }
        
        if(Greenfoot.isKeyDown("down")) {
            
        }
    }
}
