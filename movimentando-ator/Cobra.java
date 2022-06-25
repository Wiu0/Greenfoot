import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cobra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cobra extends Actor
{
    /**
     * Act - do whatever the Cobra wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Andador a = getWorld().getObjects(Andador.class).get(0);
        turnTowards(a.getX(), a.getY());
        //if(distanciaCobra - distanciaAndandor > 50) {
        //         move(5);
        //}
        
        //if(distanciaCobra - distanciaAndandor < 10) {
        //        move(1);
        //}
   
    }
}
