import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MarioAlberto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MarioAlberto extends Actor
{
    /**
     * Act - do whatever the MarioAlberto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //if(Greenfoot.isKeyDown("d")){
        //    setRotation(0);
        //    move(3);
        //}
        //if(Greenfoot.isKeyDown("a")){
        //    setRotation(0);
        //    move(-3);
        //}
        //if(Greenfoot.isKeyDown("w")){
        //    setRotation(270);
        //    move(3);
        //}
        //if(Greenfoot.isKeyDown("s")){
        //    setRotation(90);
        //    move(3);
        //} */
        
        if(Greenfoot.isKeyDown("w")){setLocation(getX(),getY()-4 );} 
        if(Greenfoot.isKeyDown("S")){setLocation(getX(),getY()+4 );}
        if(Greenfoot.isKeyDown("A")){setImage("MarioS2.png"); setLocation(getX()-4 ,getY());}
        if(Greenfoot.isKeyDown("D")){setImage("MarioS1.png"); setLocation(getX()+4 ,getY());}
        
        removeTouching(Coin.class);
       
        
        if(isTouching(Cloud.class)){
         getWorld().addObject(new GameOver(),getWorld().getWidth()/2,getWorld().getHeight()/2);
         Greenfoot.stop();
        }
        if(isTouching(Claudio.class)){
         getWorld().addObject(new GameOver(),getWorld().getWidth()/2,getWorld().getHeight()/2);
         Greenfoot.stop();
        }
        if(isTouching(Coin1.class)){
         getWorld().addObject(new YouWin(),getWorld().getWidth()/2,getWorld().getHeight()/2);
         Greenfoot.stop();
        }
    }
}
