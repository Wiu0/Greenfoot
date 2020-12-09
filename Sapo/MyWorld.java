import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author wiu
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
        
        super(600, 400, 1); 
        
        Sapo S = new Sapo ();
        addObject(S,51,201);
        
        Mosca M = new Mosca ();
        addObject(M,449,211);
        
        Cobra C = new Cobra ();
        addObject(C,150,110);
        
        
    }
 }
