import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Word here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Word extends Actor
{
    private String text;
   
    public Word(String text){
        this.text = text;
        showText();
    } 
    
    private void showText(){
        GreenfootImage g = new GreenfootImage("a", 24, Color.BLACK, Color.WHITE);
        setImage(g);
    }
    
    /**
     * Act - do whatever the Word wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        // Add your action code here.
    }    
}
