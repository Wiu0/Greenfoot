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
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Monstro monstro = new Monstro();
        addObject(monstro,85,368);
        Monstro monstro2 = new Monstro();
        addObject(monstro2,85,268);
        Monstro monstro3 = new Monstro();
        addObject(monstro3,85,168);
        Bola bola = new Bola();
        addObject(bola,450,202);
        Poder poder = new Poder();
        addObject(poder,33,36);
        Poder poder2 = new Poder();
        addObject(poder2,30,327);
        MonstroStalker monstroStalker = new MonstroStalker();
        addObject(monstroStalker,188,60);
    }
}
