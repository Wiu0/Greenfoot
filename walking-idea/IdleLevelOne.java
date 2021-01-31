import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IdleLevelOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IdleLevelOne extends Actor
{
     int timerLevelOne = 0;
    /**
     * Act - do whatever the WalkerLevelOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        timerLevelOne++;
        if(timerLevelOne == 7) {
            //Image file name: player-idle-1.png   Image url: file:/Users/wiu/programming/greenfoot/workspace/Greenfoot/walking-idea/images/player-idle-1.png  greenfoot.GreenfootImage@6940a7ff
            //Suggest new methods on Image: getFileName an getURL
            if(getImage().toString().contains("player-idle-1.png")){
                setImage("player-idle-2.png");
            } else if(getImage().toString().contains("player-idle-2.png")){
                setImage("player-idle-3.png");
            }else if(getImage().toString().contains("player-idle-3.png")){
                setImage("player-idle-4.png");
            }else if(getImage().toString().contains("player-idle-4.png")){
                setImage("player-idle-5.png");
            }else if(getImage().toString().contains("player-idle-5.png")){
                setImage("player-idle-6.png");
            }else if(getImage().toString().contains("player-idle-6.png")){
                setImage("player-idle-7.png");
            }else if(getImage().toString().contains("player-idle-7.png")){
                setImage("player-idle-8.png");
            }else{
                setImage("player-idle-1.png");
            }
            timerLevelOne = 0;
        }
    }   
}
