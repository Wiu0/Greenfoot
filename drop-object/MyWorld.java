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
        Baby nomeMenosLetras = new Baby();
        nomeMenosLetras.setRotation(90);
        addObject(nomeMenosLetras, 500, 680);
       
        criarFire();
        criarFire();
        criarFire();
        criarFire();
        
    }
    public void criarFire(){
        int x = Greenfoot.getRandomNumber(1000);
        Fire f = new Fire();
        f.setRotation(180);
        addObject(f, x, 10);
    }
    
    public void act() {
        if(Greenfoot.getRandomNumber(100) < 2) {
            addObject(new Coin(), Greenfoot.getRandomNumber(1000), 0);
        }
    }
}
