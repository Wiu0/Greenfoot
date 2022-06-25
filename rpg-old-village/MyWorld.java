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
        super(2300,900, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Cavaleiro cavaleiro = new Cavaleiro();
        addObject(cavaleiro,54,193);
        Mago mago = new Mago();
        addObject(mago,533,52);
        mago.setLocation(2133,328);
        mago.setLocation(2100,186);
        mago.setLocation(2090,179);
        cavaleiro.setLocation(325,636);
        mago.setLocation(2044,248);
        mago.setLocation(2033,281);
    }
    
    
    public void act() {
        if(Greenfoot.isKeyDown("space") && Greenfoot.isKeyDown("enter")) {
            CaixaDialogo caixa = new CaixaDialogo();
            addObject(caixa, getWidth()/2, 30);
        }
    }
}
