import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.Arrays;
/**
 * Write a description of class MovActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovActor extends Actor {

    private static int SPEED = 10;
    private MovementIdle movIdle;
    private MovementLeft movLeft;
    boolean hit = false;

    private void moveLeft() {
        move(SPEED * -1);
        setImage(movLeft.nextImage());
    }

    public void act() {
        if(Greenfoot.isKeyDown("left")) moveLeft();
        else if(Greenfoot.isKeyDown("right")) move(SPEED);
        else setImage(movIdle.nextImage());
        keyMove();  
    }

    public void keyMove() {

    }

    public void setLeftImages(List<String> images) {
        MovementLeft.Builder builder = new MovementLeft.Builder();
        images.stream().forEach(image -> builder.add(image));
        movLeft = builder.build();
    }

    public void setIdleImages(List<String> images) {
        MovementIdle.Builder builder = new MovementIdle.Builder();
        images.stream().forEach(image -> builder.add(image));
        movIdle = builder.build();
    }

    int position = 0;
    public List<String> getImages() {
        return Arrays.asList("");
    }    

    public String nextImage() {
        if(position >= getImages().size()) {
            position = 0;        
            hit = false;
        }
        return getImages().get(position++);
    }
}
