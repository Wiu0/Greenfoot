import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Essa é uma classe de Rocket. Onde o Rocket movimenta para frente 
 * 
 * @author wiu 
 * @version 1.0
 */
public class Rocket extends Actor
{
    public static int velocidade = 2;
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //add your code action here 
        //move(Greenfoot.getRandomNumber(5));
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() - 5);
        }else if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY() + 5);
        }else if(Greenfoot.isKeyDown("left")){
            setLocation(getX() - 5, getY());
            //velocidade -= 2;
        }else if(Greenfoot.isKeyDown("right")){
            setLocation(getX() + 5, getY());
            //velocidade += 2;
        }
    }    
}
