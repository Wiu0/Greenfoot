import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends Actor
{
    private int pos[] = new int[]{72, 253, 434};
    private byte jumpPosition = -1;
    private int position = 0;
    
    public Arrow() {
        setTheImage("arrow.png", 50, 60);
        setRotation(90);
        
    }

    private void setTheImage(String name, int width, int height) {
        GreenfootImage gi = new GreenfootImage(name);
        gi.scale(width, height);
        setImage(gi);
    }

    /**
     * Act - do whatever the Arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delay = 0;
    public void act()
    {
        
        if(delay > 0) {
            delay--;
            return;
        }
        
        if(Greenfoot.isKeyDown("left") && position > 0) {
            setLocation(pos[--position], getY());
            delay = 25;
        }
        
        if(Greenfoot.isKeyDown("right") && position < 2) {
            setLocation(pos[++position], getY());
            delay = 25;
        }
    }
    
    public void setJumpPositions(byte position) {
         jumpPosition = position;
    }
}
