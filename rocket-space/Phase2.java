import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Phase2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Phase2 extends World
{

    /**
     * Constructor for objects of class Phase2.
     * 
     */
    public Phase2()
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
        Fish fish = new Fish();
        addObject(fish,58,185);
        Seal seal = new Seal();
        addObject(seal,532,213);
        Food food = new Food();
        addObject(food,476,89);
        Food food2 = new Food();
        addObject(food2,583,369);
        Food food3 = new Food();
        addObject(food3,37,40);
        Seal seal2 = new Seal();
        addObject(seal2,40,351);
    }
}
