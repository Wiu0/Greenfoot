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
        super(600, 950, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bus bus = new Bus();
        addObject(bus,147,657);
        Car car = new Car();
        addObject(car,263,791);
        Car car2 = new Car();
        addObject(car2,403,647);
        Bus bus2 = new Bus();
        addObject(bus2,486,789);
        car.setLocation(72,790);
        bus.setLocation(48,650);
        car2.setLocation(164,677);
        bus2.setLocation(164,828);
        Human human = new Human();
        addObject(human,476,532);
        Chicken chicken = new Chicken();
        addObject(chicken,302,535);
    }
}
