import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cavaleiro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cavaleiro extends Actor
{
    String nome = "";
    public void act()
    {
        if(nome.equals("")) {
            if(isTouching(Mago.class)) {
                nome = Greenfoot.ask("Qual seu nome?");
            }
        }

        if(Greenfoot.isKeyDown("d")) {
            getWorld().showText("", getX(), getY() + 30);
            setLocation(getX() + 3, getY());
        }

        if(Greenfoot.isKeyDown("a")) {
            getWorld().showText("", getX(), getY() + 30);
            setLocation(getX() - 3, getY());
        }

        if(Greenfoot.isKeyDown("w")) {
            getWorld().showText("", getX(), getY() + 30);
            setLocation(getX(), getY() - 3);    
        }

        if(Greenfoot.isKeyDown("s")) {
            getWorld().showText("", getX(), getY() + 30);
            setLocation(getX(), getY() + 3);
        }
        
        getWorld().showText(nome, getX(), getY() + 30);
    }
}
