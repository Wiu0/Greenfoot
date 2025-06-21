import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int PONTOS = 0;
    public static GreenfootSound gs = new GreenfootSound("car.mp3");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(200, 600, 1); 
        prepare();
        PONTOS = 0;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Car car = new Car();
        addObject(car,151,558);
        Ambulancia ambulancia = new Ambulancia();
        addObject(ambulancia,29,174);
        CarroAzul carroAzul = new CarroAzul();
        addObject(carroAzul,98,46);
        CarroVerde carroVerde = new CarroVerde();
        addObject(carroVerde,185,298);
    }
    int sec = 0;
    boolean first = true;

    public void act() {
        int scrollAmt = 2 + PONTOS/5; // cells to scroll per act cycle (adjust as needed)
        GreenfootImage bg = new GreenfootImage(getBackground());
        getBackground().drawImage(bg, 0, scrollAmt); // scroll image down
        getBackground().drawImage(bg, 0, scrollAmt - getHeight());
        showText("Pontos: " + PONTOS,120,30);
        if(sec++ == 60) {
            if(Greenfoot.getRandomNumber(20) < 3) {
                addObject(new CarroVerde(), Greenfoot.getRandomNumber(getWidth()), 1);
            }
            if(Greenfoot.getRandomNumber(20) < 2) {
                addObject(new CarroAzul(), Greenfoot.getRandomNumber(getWidth()), 1);
            }
            if(Greenfoot.getRandomNumber(20) < 3) {
                addObject(new Ambulancia(), Greenfoot.getRandomNumber(getWidth()), 1);
            }
            sec = 0;
        }
        if(first) {
            first = false;
            gs.playLoop();
        }
    }
}
