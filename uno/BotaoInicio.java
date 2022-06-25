import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotaoInicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BotaoInicio extends Actor
{
    public BotaoInicio() {
        GreenfootImage startImage = new GreenfootImage("start.png");
        startImage.scale(120, 120);
        setImage(startImage);    
    }
    
    /**
     * Act - do whatever the BotaoInicio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        if(mouse != null) {
            if(mouse.getActor() != null) {
                if(mouse.getActor().getClass() == BotaoInicio.class && mouse.getButton() == 1){
                    Greenfoot.setWorld(new Fase1());
                }     
            }
        }
        
    }
}
