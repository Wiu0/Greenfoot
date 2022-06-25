import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CaixaDialogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaixaDialogo extends Actor
{
    String teclaClicada = "";
    String frase = "";
    
    
    public void act()
    {
        teclaClicada = Greenfoot.getKey();
        if(teclaClicada != null) {
            if((teclaClicada.equals("tab") || teclaClicada.equals("control") == false)) {
                if(teclaClicada.equals("enter")) {
                    teclaClicada = "";
                    if(frase.trim().equals("info") || frase.trim().equals("information") || frase.trim().equals("conta ai")) {
                        getWorld().showText("AQUI TEM UMA INFO", getWorld().getWidth()/2, getWorld().getHeight()/2);
                    }
                    if(frase.trim().equals("proxima missao")) {
                        getWorld().showText("VOCE DEVE IR ATE TAL LUGAR", getWorld().getWidth()/2, getWorld().getHeight()/2);
                    }
                }

                if(teclaClicada.equals("space")){
                    teclaClicada = " ";
                }
                frase =  frase + teclaClicada;
                getWorld().showText(frase, getX(), getY());
            }
        }

    }
}
