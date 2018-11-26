import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ItemMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ItemMenu extends Actor
{

    private String worldName;
    private Class<? extends World> worldWillCall;

    public ItemMenu(String worldName, Class<? extends World> worldWillCall){
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
                Greenfoot.setWorld((WiuWorld)worldWillCall.newInstance());
            }catch(Exception e){}
        }
    }    
}
