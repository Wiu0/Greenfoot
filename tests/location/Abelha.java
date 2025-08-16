import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Abelha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Abelha extends Actor
{
    /**
     * Act - do whatever the Abelha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
        getWorld().showText("x:" + getX(), 300, 200);
        getWorld().showText("Y:" + getY(), 300, 160);
        
        if (Greenfoot.isKeyDown("R")) {
            int posicaoXAleatoria = Greenfoot.getRandomNumber(600);
            int posicaoYAleatoria = Greenfoot.getRandomNumber(400);
            setLocation(posicaoXAleatoria, posicaoYAleatoria);
        }
        if (Greenfoot.isKeyDown("W")) {
            setLocation(getX(), getY() - 1);        
        }
        if (Greenfoot.isKeyDown("S")) {
            setLocation(getX(), getY() + 1);
        }
        if (Greenfoot.isKeyDown("D")) {
            setLocation(getX() + 1, getY());
        }
        if (Greenfoot.isKeyDown("A")) {
            setLocation(getX() - 1, getY());
        }
    }
}
