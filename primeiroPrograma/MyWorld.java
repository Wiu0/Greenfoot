import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esse é o mundo do Wiu
 * 
 * @author wiu
 * @version 1.0
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
       addObject(new Rocket(), 100, 200);
       addObject(new Rock(), 590, 200);
       addObject(new Rock(), 590, 100);
       addObject(new Rock(), 590, 300);
    }
}
