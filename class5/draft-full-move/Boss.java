import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Arrays;
import java.util.List;
/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends MovActor
{

    public Boss() {
        List<String> images = Arrays.asList(new String[]{"b0.png", "b1.png", "b2.png", "b3.png", "b4.png", "b5.png"});
        setIdleImages(images);
        setImage(images.get(0));
    }
}
