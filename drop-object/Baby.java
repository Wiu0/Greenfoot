import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baby extends Actor
{
    static int score = 0;
    public void verificarSeApertouEsquerdaEMover(){
        boolean usuarioApertouEsquerda = Greenfoot.isKeyDown("left");
        if(usuarioApertouEsquerda == true){
            int x = getX();
            int y = getY();
            setLocation(x - 5, y);
        }
    }

    public void verificarSeApertouDireitaEMover(){
        boolean usuarioApertouDireita = Greenfoot.isKeyDown("right");
        if(usuarioApertouDireita == true){
            int x = getX();
            int y = getY();
            setLocation(x + 5, y);
        }
    }

    public void verificarSeApertouEspacoEMover(){
        boolean usuarioApertouEspaco = Greenfoot.isKeyDown("space");
        if(usuarioApertouEspaco == true){
            Rock r = new Rock();
            r.setRotation(270);
            getWorld().addObject(r, getX(), getY());
        }
    }

    /**
     * Act - do whatever the Baby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */ 
    public void act() 
    {
        getWorld().showText("Score: " + score, 900, 100);
        if(isTouching(Coin.class)) {
            score++;
            removeTouching(Coin.class);
        }
        verificarSeApertouEsquerdaEMover();
        verificarSeApertouDireitaEMover();
        verificarSeApertouEspacoEMover();
   
    }
}
