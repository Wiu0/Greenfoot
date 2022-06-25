import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Militar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Militar extends Actor
{
    public void mover() {
        if(Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 3);        
        }
        if(Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 3);
        }
    }

    /**
     * Act - do whatever the Militar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        mover();
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null) {
            atirar();
            recarregar();
            getWorld().showText("Posicao X do mouse é: " + mouse.getX() + " Posicao Y do mouse é: " + mouse.getY(), 300, 200);
            tocarNoAtorPower();
        }
        if(isTouching(Power.class)) {
            getWorld().showText("Game Over ", 300, 200);
            Greenfoot.stop();
        }
    }

    public void atirar() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        getWorld().showText("Botao clicado foi: " + mouse.getButton(), 300, 100);
        if(mouse.getButton() == 1) {
            getWorld().addObject(new Bala(), getX() + 25, getY());
        }  
    }

    public void recarregar() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse.getButton() == 3) {
            getWorld().showText("Nao tem como recarregar", 300, 100);
        }  
    }

    public void tocarNoAtorPower() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        Actor atorQueEstaSobreOMouse = mouse.getActor();
        if(atorQueEstaSobreOMouse != null) {
            if(atorQueEstaSobreOMouse.getClass() == Power.class) {
                if(mouse.getButton() == 2) {
                    atorQueEstaSobreOMouse.setLocation(Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
                }
            }
        }
    }
}
