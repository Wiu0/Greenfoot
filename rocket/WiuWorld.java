import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WiuWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WiuWorld extends World
{

    public static MyWorld world = null;
    public static final int WIDTH_WORLD = 1200;
    public static final int HEIGHT_WORLD = 750;
    
    static{
        if(world == null){
            world = new MyWorld();
        }
    }
      public static MyWorld getItSelf(){
        return world;
    }
    /**
     * Constructor for objects of class WiuWorld.
     * 
     */
    public WiuWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1xpixels.
        super(WIDTH_WORLD, HEIGHT_WORLD, 1); 
    }
}
