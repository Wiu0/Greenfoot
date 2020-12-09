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
        super(1000, 700, 1);

        //Forma simples
        addObject(new Airplane(), 20, 350);
        addObject(new Airplane(), 20, 550);
        addObject(new Bird(), 950, 350);
              
        //Forma simples, mas um pouco complexa LOL
        Airplane airplane = new Airplane();
        addObject(airplane, 14, 80);
   
        Airplane airplane2 = new Airplane();
        addObject(airplane2, 200, 80);
        
        //Forma mais completa
        prepare(); 
    }
    
    private void prepare() {
        Bird bird = new Bird();
        addObject(bird, 600, 600); 
    }
}
