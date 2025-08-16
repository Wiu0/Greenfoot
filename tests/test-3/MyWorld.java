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
        Bomb bomb = new Bomb();
        addObject(bomb,27,86);
        Guard guard = new Guard();
        addObject(guard,887,200);
        guard.setLocation(872,-3);
        Target target = new Target();
        addObject(target,965,92);
        guard.setLocation(861,12);
        Animal animal = new Animal();
        addObject(animal,640,175);
        animal.setLocation(640,190);
        Baby baby = new Baby();
        addObject(baby,469,0);
        Baby baby2 = new Baby();
        addObject(baby2,311,200);
    }
}
