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
        super(300, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Animal animal = new Animal();
        addObject(animal,52,79);
        Animal animal2 = new Animal();
        addObject(animal2,258,235);
        Animal animal3 = new Animal();
        addObject(animal3,259,412);
        Animal animal4 = new Animal();
        addObject(animal4,43,533);
        Animal animal5 = new Animal();
        addObject(animal5,250,636);
        animal2.setLocation(254,202);
        animal.setLocation(53,87);
        animal3.setLocation(253,370);
        animal.setLocation(39,124);
        animal4.setLocation(31,511);
        animal5.setLocation(262,593);
        Spider spider = new Spider();
        addObject(spider,146,760);
        animal5.setLocation(259,664);
        animal.setLocation(39,99);
        animal4.setLocation(44,530);
        Fly fly = new Fly();
        addObject(fly,148,25);
    }
}
