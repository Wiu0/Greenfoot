import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RaceTrack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaceTrack extends World
{

    /**
     * Constructor for objects of class RaceTrack.
     * 
     */
    public RaceTrack()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 900, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Car car = new Car();
        addObject(car,161,848);
        Bus bus = new Bus();
        addObject(bus,153,56);
        Bus bus2 = new Bus();
        addObject(bus2,260,193);
        Bus bus3 = new Bus();
        addObject(bus3,48,122);
    }
}
