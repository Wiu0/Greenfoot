import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Seahorse extends Actor
{
    public void act() {
        
        if(isTouching(Dica.class)) {
            Greenfoot.ask("Vá até o ponto piscante para passar de fase");
            removeTouching(Dica.class);
        }
        
        if(Greenfoot.isKeyDown("d")) {
            move(1);
            setRotation(0);
        }
        if(Greenfoot.isKeyDown("a")) {
            move(1);
            setRotation(180);
        }
        if(Greenfoot.isKeyDown("w")) {
            move(1);
            setRotation(270);
        }
        if(Greenfoot.isKeyDown("s")) {
            move(1);
            setRotation(90);
        }
    }
}
