import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Exemplo extends Actor
{
    int indiceImagemAtual = 2;
    int tempoAnimacao = 0;

    public void act()
    {
        if(getWorld().getWidth() - 3 > getX()) {
            ((GenericWorld)getWorld()).switchWorldLeft();
        }
        
          if(3 < getX()) {
            ((GenericWorld)getWorld()).switchWorldRight();
        }
        
        if(tempoAnimacao == 20) {
            if(indiceImagemAtual == 3) {
                indiceImagemAtual = 1;
            }
            setImage("frame-" + indiceImagemAtual + ".png");
            indiceImagemAtual++;
            tempoAnimacao = 0;
        }
        tempoAnimacao++;
        
        if(Greenfoot.isKeyDown("a")) {
            move(-4);
        }
        
        if(Greenfoot.isKeyDown("d")) {
            move(4);
        }
    }
}
