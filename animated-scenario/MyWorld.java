import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    private int imageCount = 0;
    private GreenfootImage bgImage = new GreenfootImage("game-seamless-background-flat-style-2d-vector-10644477.jpg");

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //2771 X 980
        //1000 x 780
        super(1300, 650, 1); 
    }

    public void act() {
        imageCount -= 10; //(or any other value; small -> slow moving, big -> fast movement)
        drawBackgroundImage();
    }

    public void drawBackgroundImage() {
       if (imageCount < -bgImage.getWidth()) {
            imageCount += bgImage.getWidth();
        }
        int temp = imageCount;
        getBackground().drawImage(bgImage, temp, 0);
        getBackground().drawImage(bgImage, temp + bgImage.getWidth(), 0);
    }

}
