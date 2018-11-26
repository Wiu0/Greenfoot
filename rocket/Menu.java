import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends WiuWorld
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        ItemMenu item = new ItemMenu("Iniciar", MyWorld.class);
        ItemMenu item2 = new ItemMenu("Configurar", null);
        ItemMenu item3 = new ItemMenu("Sair", Exit.class);
        
        addObject(item, getWidth() / 2, getHeight()/2 - 80);
        addObject(item2, getWidth() / 2, getHeight()/2 );
        addObject(item3, getWidth() / 2, getHeight()/2 + 80);
        
        
    }
}
