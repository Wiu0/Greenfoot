import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PedraGrande here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PedraGrande extends Actor
{
    /**
     * Act - do whatever the PedraGrande wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-4);
        
        if(isAtEdge()) {
            turn(79);
        }
     
        if(isTouching(PedraGrande.class)) {
         turn(172);   
        } 
    }
}
