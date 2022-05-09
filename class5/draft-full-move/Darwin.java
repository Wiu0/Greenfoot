import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Arrays;
import java.util.List;
/**
 * Write a description of class Darwin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Darwin extends MovActor
{

    public Darwin() {
        List<String> images = Arrays.asList(new String[]{"darwin/d0.png", "darwin/d1.png", "darwin/d2.png", "darwin/d3.png", "darwin/d4.png", "darwin/d5.png", "darwin/d6.png", "darwin/d7.png", "darwin/d8.png", "darwin/d9.png", "darwin/d10.png", "darwin/d11.png"});
        setIdleImages(images);
        setImage(images.get(0));
        
        setLeftImages(Arrays.asList(new String[]{"bison/bw0.png", "bison/bw1.png", "bison/bw2.png", "bison/bw3.png", "bison/bw4.png", "bison/bw5.png", "bison/bw6.png", "bison/bw7.png"}));
    }

    public void keyMove() {
        if(Greenfoot.isKeyDown("k") || hit) {
            hit = true;
            setImage(nextImage());
        } 
    }

    public List<String> getImages() {
        return Arrays.asList(new String[]{"darwin/punch0.png", "darwin/punch1.png", "darwin/punch2.png", "darwin/punch3.png"});
    }   
}
