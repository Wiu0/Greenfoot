import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.Arrays;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World 
{
    private GreenfootImage gi = new GreenfootImage("back/b0.png");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 673, 1); 
        images = Arrays.asList(new String[]{"back/b0.png","back/b1.png", "back/b2.png","back/b3.png","back/b4.png","back/b5.png","back/b6.png","back/b7.png"});
        prepare();
        act();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
    
    public void act() {
        gi = new GreenfootImage(nextImage());
        gi.scale(gi.getWidth() * 2, gi.getHeight() * 2);
        setBackground(gi);
    }
    
    protected List<String> images;
    private int position = 0;
    
    public String nextImage() {
        if(position >= images.size()) position = 0;        
        return images.get(position++);
    }
}
