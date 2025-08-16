import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    private static final int GRAVITY_MS = 1;//9.8ms2
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        prepare();
    }

    public void act() {
        runGravity();
    }

    private void runGravity() {
        for(Object o : getObjects(MassiveActor.class)) {
            MassiveActor actor = (MassiveActor) o;
            actor.applyForce();
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MassiveActor massiveActor = new MassiveActor();
        addObject(massiveActor,124,74);
        massiveActor.setLocation(278,17);

        MassiveActor massiveActor2 = new MassiveActor();
        addObject(massiveActor2,74,776);
        removeObject(massiveActor2);
    }
}
