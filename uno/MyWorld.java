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
        super(790, 444, 1); 
        //GreenfootSound musicaAbertura = new GreenfootSound("abertura.mp3");
        // musicaAbertura.playLoop();

        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BotaoInicio botaoInicio = new BotaoInicio();
        addObject(botaoInicio,733,213);
        botaoInicio.setLocation(655,388);
        botaoInicio.setLocation(665,411);
        botaoInicio.setLocation(765,352);
        botaoInicio.setLocation(664,399);
        botaoInicio.setLocation(692,354);
    }
}
