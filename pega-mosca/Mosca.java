import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mosca here.
 * 
 * @author wiu 
 * @version 20181128
 */
public class Mosca extends Actor
{
    /**
     * Act - do whatever the Mosca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // 0  até limite( random + 1)
        move(Greenfoot.getRandomNumber(10));
        if(Greenfoot.getRandomNumber(100) < 20){
            turn(Greenfoot.getRandomNumber(60) - 45);	
        }/*else if(Greenfoot.getRandomNumber(100) > 80){
        turn(15);	
        }*/
        /*if(isAtEdge()){
        turn(120);
        }*/
        if(isAtLeft()){
            setLocation(getWorld().getWidth(), getY());
        }else if(isAtTop()){
            setLocation(getX(), getWorld().getHeight());
        }
    }    

    public boolean isAtLeft(){
        return getX() < 10;
    }

    public boolean isAtTop(){
        return getY() < 10;
    }
}
