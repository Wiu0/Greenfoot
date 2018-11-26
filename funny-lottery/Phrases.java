import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Phrases extends Actor
{

    private String phrase;
    private Phrases(String phrase, int size, World world, int x, int y){
        GreenfootImage im = new GreenfootImage(phrase, size, Color.BLACK, Color.WHITE);
        setImage(im);
        this.phrase = phrase; 
        world.addObject(this, x, y);
    }

    /**
     * Act - do whatever the Title wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //Greenfoot.se;
    } 
    
    public static Phrases build(String phrase, int size, World world, int x, int y){
        Phrases p = new Phrases(phrase, size, world, x, y);
        return p;
    }
}
