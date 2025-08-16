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
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rocket rocket = new Rocket();
        addObject(rocket,49,184);
        Rock rock = new Rock();
        addObject(rock,396,69);
        Rock rock2 = new Rock();
        addObject(rock2,486,210);
        Rock rock3 = new Rock();
        addObject(rock3,458,294);
        Et et = new Et();
        addObject(et,482,23);
        Et et2 = new Et();
        addObject(et2,505,388);
        Et et3 = new Et();
        addObject(et3,19,39);
        et2.setLocation(520,357);
        rock.setLocation(323,96);
    }
}
