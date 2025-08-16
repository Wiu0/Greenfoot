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
        super(1200, 800, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Mosca mosca = new Mosca();
        addObject(mosca,126,98);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,111,283);
        Sapo sapo = new Sapo();
        addObject(sapo,285,193);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,685,678);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,945,224);
        Mosca mosca5 = new Mosca();
        addObject(mosca5,1088,572);
        Mosca mosca6 = new Mosca();
        addObject(mosca6,629,70);
        Mosca mosca7 = new Mosca();
        addObject(mosca7,302,675);
        Mosca mosca8 = new Mosca();
        addObject(mosca8,713,326);
        mosca2.setLocation(127,487);
        Mosca mosca9 = new Mosca();
        addObject(mosca9,438,451);
        sapo.setLocation(405,246);
        Cobra cobra = new Cobra();
        addObject(cobra,731,526);
    }
}
