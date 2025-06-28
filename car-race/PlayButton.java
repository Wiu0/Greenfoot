import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayButton extends Actor
{
    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space")) {
            switchWorld();
        }
        if(Greenfoot.mouseClicked(this)) {
            switchWorld();
        }
    }

    private void switchWorld() {
        Greenfoot.setWorld(new RaceTrack());
    }
}
