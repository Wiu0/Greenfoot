import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Phase4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Phase4 extends World
{

    /**
     * Constructor for objects of class Phase4.
     * 
     */
    public Phase4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 200, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Carro carro = new Carro();
        addObject(carro,78,89);
        Carro carro2 = new Carro();
        addObject(carro2,573,102);
        carro2.setLocation(575,102);
        removeObject(carro2);
        PedraGrande pedraGrande = new PedraGrande();
        addObject(pedraGrande,930,65);
        PedraGrande pedraGrande2 = new PedraGrande();
        addObject(pedraGrande2,934,151);
    }
}
