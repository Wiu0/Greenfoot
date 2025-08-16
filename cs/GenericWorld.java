import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GenericWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GenericWorld extends World
{
    private GenericWorld gDireita;
    private GenericWorld gEsquerda;
    private GenericWorld gCima;
    private GenericWorld gBaixo;
    
    public GenericWorld(int w, int h, int p)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(w, h, p); 
    }

    public void setWorldLeft(GenericWorld gWorld) {
        gEsquerda = gWorld; 
    }
    
    public void setWorldRight(GenericWorld gWorld) {
        gDireita = gWorld; 
    }  
    public void switchWorldLeft() {
        Greenfoot.setWorld(gEsquerda); 
    }
    
    public void switchWorldRight() {
        Greenfoot.setWorld(gDireita); 
    }
}
