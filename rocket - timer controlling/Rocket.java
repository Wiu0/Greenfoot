import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/** 
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor implements ActionTimer 
{
    private TimerMoviment timer;
    
    public Rocket(){
        timer = new TimerMoviment();
    }

    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void action(){
        Power p = new Power();
        p.setRotation(getRotation());
        getWorld().addObject(p, getX(), getY());
    }

    public void act() {

        move(3);
        if(Greenfoot.isKeyDown("up")){
            turn(-10);
        }else if(Greenfoot.isKeyDown("down")){
            turn(10);
        }else if(Greenfoot.isKeyDown("space")){
            timer.execute(this, 500);
        }
    }    
}
