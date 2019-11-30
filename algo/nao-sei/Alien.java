import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Actor
{
    int pontos = 0;
    /**
     * Act - do whatever the Alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      
      if(Greenfoot.isKeyDown("space")){
          pontos = pontos + 1;
      }
      getWorld().showText("Pontos :" + pontos, 800, 30);
    }    
}
