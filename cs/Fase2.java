import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fase2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fase2 extends GenericWorld
{
    Exemplo e;
    /**
     * Constructor for objects of class Fase2.
     * 
     */
    public Fase2(GenericWorld fase0, Exemplo e)
    {    
        super(600, 400, 1); 
        setWorldRight(fase0);
        this.e = e;
    }

    boolean first = true;
    public void act() {
        if(first) {
            addObject(e, 1, e.getY());
            first = false;
        }
    }

}
