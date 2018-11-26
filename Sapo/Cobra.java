import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cobra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cobra extends Actor
{
    /**
     * Act - do whatever the Cobra wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
{
        // Add your action code here.
        move(-5);
        if(Greenfoot.getRandomNumber(10) < 5){
            turn(5);
           
    }else{
      turn(-5);
      
    } 
    if(isAtEdge()){
    turn(160);
}
}

}
