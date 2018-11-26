import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Item Menu is a class that save a World class to be called. This example call the World
 * when the player use the mouse to click on the picked option.
 * @author wiu
 * @version 1.0 - 17 AUG 2018
 */
public class ItemMenu extends Actor
{

    private String worldName;
    private Class worldWillCall;

    public ItemMenu(String worldName, Class worldWillCall){
        this.worldName = worldName;
        this.worldWillCall = worldWillCall;
    }

    /**
     * Act - do whatever the ItemMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getWorld().showText(worldName, getX(), getY());
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            try{
                Greenfoot.setWorld((World)worldWillCall.newInstance());
            }catch(Exception e){}
        }
    }    
}
