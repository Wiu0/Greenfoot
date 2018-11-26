import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Initializer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Initializer extends Actor
{
    public Initializer(){
        getWorld().addObject(new Word("Abelha"), getWorld().getWidth()/2, getWorld().getHeight()/2);  
    }
    
    /**
     * Act - do whatever the Initializer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
