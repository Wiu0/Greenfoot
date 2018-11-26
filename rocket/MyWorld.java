import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author wiu 
 * @version 1.0
 */
public class MyWorld extends WiuWorld
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        // super(790, 650, 1);super(1200, 780, 1);
        Greenfoot.setWorld(new Menu());
        prepare();
    }
    
    public void prepare(){
       Placar.PONTOS = 2;
       Rocket rocket = new Rocket();
       addObject(rocket, 100, 380);
       addObject(new Rock(), 1200, 20);
       addObject(new Rock(), 1200, 200);
       addObject(new Rock(), 1200, 450);
       addObject(new Rock(), 1200, 700);
       addObject(new Life(), 1200, 600);
       addObject(new Placar(), 0, 0);
        
    }
    

}
