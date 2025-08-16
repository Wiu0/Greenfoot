import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
 
    private int sequenciaImagem = 1;
    private static final int CONTROL_TIME_FRAME_DEFAULT = 30;
    private static int CONTROL_TIME_FRAME = 30;
    
    public void act()
    {
        doIdle();
    }
    
    private void doIdle() {
        move(1);
        if(sequenciaImagem == 3) {
            sequenciaImagem = 1;
        }
        if(CONTROL_TIME_FRAME-- == 0) {
            CONTROL_TIME_FRAME = CONTROL_TIME_FRAME_DEFAULT;
            setImage("frame-"+ sequenciaImagem++ + ".png");
            return;
        }
        
    }
}
