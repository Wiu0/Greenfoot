import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowToPlayWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowToPlayWorld extends GameWorld
{
    /**
     * Constructor for objects of class MontyHall.
     * 
     */
    public HowToPlayWorld(Menu menu)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 390, 1, menu); 
        GreenfootImage gi = new GreenfootImage("Enter Pick a option(Item menu, door, etc).\nEsc: Go back to menu ", 30, Color.BLACK, new Color(0,0,0,0));
        addObject(new Voltar(Color.WHITE, Color.BLACK), 700, 35);
        Actor a = new Info();
        a.setImage(gi);
        addObject(a, 400, 180);
    }
}
