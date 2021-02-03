import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FIre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire extends Actor
{
    /**
     * Act - do whatever the FIre wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isTouching(Baby.class)){
            Greenfoot.stop();
        }
        
        int x = getX();
        int y = getY();
        setLocation(x, y + Greenfoot.getRandomNumber(15));

        boolean chegouNoLimiteDaTela = isAtEdge();
        if(chegouNoLimiteDaTela == true){
            int posicaoX = Greenfoot.getRandomNumber(1000);
            Fire f = new Fire();
            f.setRotation(180);
            getWorld().addObject(f, posicaoX, 10);
            getWorld().removeObject(this);
        }
        
    }    
}
