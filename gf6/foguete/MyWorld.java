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
        super(1000, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Foguete foguete = new Foguete();
        addObject(foguete,62,106);
        Foguete foguete2 = new Foguete();
        addObject(foguete2,92,242);
        Meteoro meteoro = new Meteoro();
        addObject(meteoro,477,159);
        Meteoro meteoro2 = new Meteoro();
        addObject(meteoro2,480,236);
        Meteoro meteoro3 = new Meteoro();
        addObject(meteoro3,480,326);
        removeObject(foguete2);
        foguete.setLocation(74,255);
        meteoro.setLocation(549,163);
        meteoro2.setLocation(637,208);
        meteoro.setLocation(558,18);
        meteoro2.setLocation(605,209);
        meteoro3.setLocation(600,371);
        meteoro3.setLocation(176,792);
        meteoro2.setLocation(630,801);
        meteoro2.setLocation(1190,245);
        meteoro.setLocation(895,17);
        Meteoro meteoro4 = new Meteoro();
        addObject(meteoro4,896,775);
        meteoro4.setLocation(857,782);
        Meteoro meteoro5 = new Meteoro();
        addObject(meteoro5,1188,566);
        Estrela estrela = new Estrela();
        addObject(estrela,698,35);
        Estrela estrela2 = new Estrela();
        addObject(estrela2,60,501);
        Estrela estrela3 = new Estrela();
        addObject(estrela3,961,482);
        Estrela estrela4 = new Estrela();
        addObject(estrela4,297,35);
    }
}
