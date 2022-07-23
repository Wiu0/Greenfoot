import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MontyHall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MontyHall extends GameWorld
{

    /**
     * Constructor for objects of class MontyHall.
     * 
     */
    public MontyHall(Menu menu)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 390, 1, menu); 
        GreenfootImage gi = new GreenfootImage("montyHall.png");
        gi.scale(800, 390);
        setBackground(gi);
        addObject(new Voltar(Color.WHITE, Color.BLACK), 700, 20);
    }
    
    public void act() {
        super.act();
    }
}
