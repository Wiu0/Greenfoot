import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WalkerLevelOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WalkerLevelOne extends Actor
{
    
    /**
     * Act - do whatever the WalkerLevelOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
        if(Greenfoot.isKeyDown("d")) {
            //Image file name: player-idle-1.png   Image url: file:/Users/wiu/programming/greenfoot/workspace/Greenfoot/walking-idea/images/player-idle-1.png  greenfoot.GreenfootImage@6940a7ff
            //Suggest new methods on Image: getFileName an getURL
            if(getImage().toString().contains("player-run-1.png")){
                setImage("player-run-2.png");
            } else if(getImage().toString().contains("player-run-2.png")){
                setImage("player-run-3.png");
            }else if(getImage().toString().contains("player-run-3.png")){
                setImage("player-run-4.png");
            }else if(getImage().toString().contains("player-run-4.png")){
                setImage("player-run-5.png");
            }else if(getImage().toString().contains("player-run-5.png")){
                setImage("player-run-6.png");
            }else{
                setImage("player-run-1.png");
            }
        } else {
             setImage("player-idle-1.png");
        }
        
    }    
}
