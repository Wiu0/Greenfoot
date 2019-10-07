import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Actor
{
    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5);
        if(isTouching(Fire.class)){
            removeTouching(Fire.class);
            int posicaoX = Greenfoot.getRandomNumber(1000);
            Fire f = new Fire();
            f.setRotation(180);
            getWorld().addObject(f, posicaoX, 10);
        }
        boolean chegouNoLimiteDaTela = isAtEdge();
        if(chegouNoLimiteDaTela == true){
            getWorld().removeObject(this);

        }    
    }
}