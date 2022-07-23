import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ItemMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ItemMenu extends Actor
{
    int delay = 10;
    boolean selected = false;
    /**
     * Act - do whatever the ItemMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String text;
    Color colorF, colorB;
    
    public ItemMenu(String text) {
        this.text = text;
        colorF = Color.BLACK;
        colorB = Color.WHITE;
    }

    public void act()
    {
        if(selected) {
            setSelectText(colorF, colorB);
            
            if(delay > 0) {
                delay--;
            }
            if(colorF == Color.BLACK) {
                colorF = Color.WHITE;
                colorB = Color.BLACK;
            } else {
                colorB = Color.WHITE;
                colorF = Color.BLACK;
            }
            delay = 25;    
        }
    }
    public void setUnselectText() {
        selected = false;
        setImage(new GreenfootImage(text, 25, Color.BLACK, new Color(0, 0, 0, 0)));
    }

    public void setSelectText() {
        setSelectText(Color.BLACK, Color.WHITE);
    }

    public void setSelectText(Color colorF, Color colorB) {
        setImage(new GreenfootImage(text, 25, colorF, colorB));
    }
    
    public void setSelect() {
        selected = true;
    }
}
