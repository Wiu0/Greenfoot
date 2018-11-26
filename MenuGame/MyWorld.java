import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The main World class must add the ItemMenu to show some options to the player
 * 
 * @author wiu
 * @version 1.0 Date: 17-AUG-2018
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    private void prepare(){
        ItemMenu item = new ItemMenu("Play", PlayedWorld.class);
        ItemMenu item2 = new ItemMenu("Configuration", ConfigWorld.class);
        ItemMenu item3 = new ItemMenu("Exit", Exit.class);

        addObject(item, getWidth() / 2, getHeight()/2 - 80);
        addObject(item2, getWidth() / 2, getHeight()/2 );
        addObject(item3, getWidth() / 2, getHeight()/2 + 80);

    }
}
