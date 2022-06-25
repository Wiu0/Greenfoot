import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fase1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fase1 extends World
{

    /**
     * Constructor for objects of class Fase1.
     * 
     */
    public Fase1()
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
        Mosca mosca = new Mosca();
        addObject(mosca,479,87);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,510,254);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,240,137);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,343,327);
        Mosca mosca5 = new Mosca();
        addObject(mosca5,146,250);
        Mosca mosca6 = new Mosca();
        addObject(mosca6,361,54);
        Sapo sapo = new Sapo();
        addObject(sapo,98,107);
    }
}
