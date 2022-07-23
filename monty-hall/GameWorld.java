import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{
    Menu menu;

    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    public GameWorld(int width, int height, int pixelSize, Menu menu)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(width, height, pixelSize); 
        this.menu = menu;
    }

    public void act() {
        if(Greenfoot.isKeyDown("A")) {
            Greenfoot.setWorld(menu);
        }
    }
}
