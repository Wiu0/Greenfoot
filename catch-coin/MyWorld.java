import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        Coin coin = new Coin();
        addObject(coin, 50, 70);
        Coin coin2 = new Coin();
        addObject(coin2, 50, 330);
        Coin coin3 = new Coin();
        addObject(coin3, 550, 330);
        Coin coin4 = new Coin();
        addObject(coin4, 550, 70);
        
        Mario mario = new Mario();
        addObject(mario, 300, 200);
    }
}
