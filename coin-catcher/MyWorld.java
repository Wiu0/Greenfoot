import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int counter = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 550, 1,false); 
        
        addObject (new MarioAlberto(),30,30);
        addObject (new Coin(),70,200);
        addObject (new Coin(),300,320);
      
        Coin1 coin1 = new Coin1();
        addObject (coin1,550,500);
        
        addObject (new Pipe(),245,80);
        
    
        //Cloud cloud0 = new Cloud();
        //addObject (cloud0,100,200);
        
    }
    public void act() {
     counter++;
     if (counter == 150){
        Cloud cloud0 = new Cloud();
        addObject (cloud0,600,150);
        Cloud cloud1 = new Cloud();
        addObject (cloud1,600,350);
        
        Claudio claudio0 = new Claudio();
        addObject (claudio0,0,250);
        Claudio claudio1 = new Claudio();
        addObject (claudio1,0,450);
        
        counter = 0;
        }
 
    }
}
