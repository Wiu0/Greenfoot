import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 760, 1); 
        List<String> list = ImageSearcher.findAllImage(TypeImage.WORLD);
        writeOptions(list);
    }
    
    private void writeOptions(List<String> list){
        //java.lang.String string, int size, Color foreground, Color background, Color outline
        Phrases title = Phrases.build("Escolha a fase", 35, this, getWidth()/2, 20);
        int moveX = 70, moveY = 60;
        for(String l : list){
            if(".DS_Store".equals(l)) continue;//TODO refactory 
            new PhraseImage(l, 25, this, 10 + moveX, moveY, l);
            moveX += 300;
        }
    }
}
