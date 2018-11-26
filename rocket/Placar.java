import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Placar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Placar extends Actor
{
    public static int PONTOS = 0;
    /**
     * Act - do whatever the Placar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getWorld().showText("PONTOS: " + PONTOS, 60, 50);
        if(PONTOS == -1){
            getWorld().showText("GAME OVER", getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }    
}
