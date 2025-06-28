import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuStart extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MenuStart()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(200, 600, 1); 
        prepare();
    }

    public void act() {
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlayButton playButton = new PlayButton();
        addObject(playButton,103,164);
    }
}
