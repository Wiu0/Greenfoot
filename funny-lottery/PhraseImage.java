import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PhraseImage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhraseImage extends Actor
{
    private String imageName;
    private Phrases oPhrase;
    
    public PhraseImage(String phrase, int size, World world, int x, int y, String imageName){
        oPhrase = Phrases.build(phrase, size, world, x, y);
        this.imageName = imageName;
        world.addObject(this, x + 80, y + 130);
        switchImage();
    }
    /**
     * Act - do whatever the PhraseImage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        if(Greenfoot.mouseClicked(oPhrase) || Greenfoot.mouseClicked(this)) getWorld().setBackground(imageName);
    }    
    
    public void switchImage(){
        setImage(imageName);
    }
}
