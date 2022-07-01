import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    private MontyHallLogic o;
    private Door[] doors;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(540, 240, 1); 
        o = new MontyHallLogic();
        o.generateEurekaNumber(); 
        int widthDoor = 181, heightDoor = 187;
        doors = new Door[]{
            new Door(widthDoor, heightDoor, o.getDoor()), 
            new Door(widthDoor, heightDoor, o.getDoor().getNextDoor()),
            new Door(widthDoor, heightDoor, o.getDoor().getNextDoor().getNextDoor())
        };
        build();
    }

    private void build() {
          
        addObject(doors[0], 92, (int)(getHeight() * 0.6));
        addObject(doors[1], 273, (int)(getHeight() * 0.6));
        addObject(doors[2], 454, (int)(getHeight() * 0.6));
        Arrow a = new Arrow();
        addObject(a, 72, (int)(getHeight() * 0.5));
        
        
    }
    
    public MontyHallLogic getMontyHall() {
        return o;
    }
    
    public Door getDoors(int door) {
        return doors[door];
    }
}
