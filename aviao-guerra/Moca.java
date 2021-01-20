import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Moca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moca extends Actor
{
    String nomeImagemAtual = "im1.jpeg";
    /**
     * Act - do whatever the Moca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.

        if(Greenfoot.isKeyDown("up")){
            if(nomeImagemAtual.equals("im1.jpeg")){
                nomeImagemAtual = "im2.jpeg";
            } else {
                if(nomeImagemAtual.equals("im2.jpeg")){
                    nomeImagemAtual = "im3.jpeg";
                } else{
                    if(nomeImagemAtual.equals("im3.jpeg")){
                        nomeImagemAtual = "im4.jpeg";
                    } else {
                        if(nomeImagemAtual.equals("im4.jpeg")){
                            nomeImagemAtual = "im1.jpeg";
                        }
                    }
                }
            }
        } 
        setImage(nomeImagemAtual);
    }    
}
