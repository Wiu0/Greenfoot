import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends Actor
{
    public byte myself = 0;

    public Door(int width, int height, byte number) {
        setTheImage("door-closed.jpg", width, height);
        myself = number;        
    }

    private void setTheImage(String name, int width, int height) {
        GreenfootImage gi = new GreenfootImage(name);
        gi.scale(width, height);
        setImage(gi);
    }

    /**
     * Act - do whatever the Door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getWorld().showText("corret " + ((MyWorld)getWorld()).getMontyHall().getFreedomDoor(), getWorld().getWidth()/2, 30);
        getWorld().showText("Door " + myself, getX(), getY());
        validEvent();
    }

    private void validEvent() {
        
        if(Greenfoot.isKeyDown("enter") && getOneIntersectingObject(Arrow.class) != null) {
            MontyHallLogic mh = ((MyWorld)getWorld()).getMontyHall();
            showOption(mh.getEmptyDoor(myself));

        }
    }

    private void showOption(byte option) {
        getWorld().showText("porta " + option + " está vazia. Deseja trocar?", 300, 30);
        Actor a = ((MyWorld)getWorld()).getDoors(option);
        ((Door)a).setTheImage("door-empty.jpg", 181, 187);
        
        //byte p = myself;
        //if(s.equalsIgnoreCase("s")) {
        //    p = option;
        //} 

        //if(p == ((MyWorld)getWorld()).getMontyHall().getFreedomDoor()) {
        //    getWorld().showText("You win", getWorld().getWidth()/2, 50);
        //} else {
        //    getWorld().showText("You lose", getWorld().getWidth()/2, 50);
       // }
        //Greenfoot.stop();

    }

}
