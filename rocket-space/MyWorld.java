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
        super(1000, 200, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rocket rocket = new Rocket();
        addObject(rocket,67,110);
        Asteroid asteroid = new Asteroid();
        addObject(asteroid,956,32);
        Asteroid asteroid2 = new Asteroid();
        addObject(asteroid2,958,107);
        asteroid2.setLocation(955,107);
        asteroid2.setLocation(961,153);
        asteroid.setLocation(909,93);
        asteroid.setLocation(931,126);
        asteroid2.setLocation(951,154);
        Asteroid asteroid3 = new Asteroid();
        addObject(asteroid3,953,66);
    }
}
