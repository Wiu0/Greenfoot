import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bus extends Actor
{
    /**
     * Act - do whatever the Bus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
      setLocation(getX(), getY() + 5);
      
      if(isAtEdge()){
          setLocation(Greenfoot.getRandomNumber(300), 0);
      }
      
      if(isTouching(Car.class)) {
          getWorld().showText("GAME OVER", 150, 450);
          Greenfoot.stop();
      }
    }
}
