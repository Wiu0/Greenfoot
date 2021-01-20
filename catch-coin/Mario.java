import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mario extends Actor
{
    /**
     * Act - do whatever the Mario wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
     //SE O JOGADOR APERTAR A tecla "D" O MARIO TEM QUE MOVIMENTAR 3cm para direita
        //if(condicao){
        //    ACAO A SER FEITA
        //    ACAO
        //    ACAO
        //    ...
        //}
        //SE => if(Condicao)
        //Condicao = O JOGADOR APERTAR A tecla "D" => Greenfoot.isKeyDown();
        //Greenfoot.isKeyDown("d"))
        if(Greenfoot.isKeyDown("d")){
            //O MARIO TEM QUE MOVIMENTAR 3cm para direita
            setRotation(0);
            move(3);
        }
        //outro codigo para voltar para tras, so que com outra letra
        //SE O JOGADOR APERTAR A tecla "A" O MARIO TEM QUE MOVIMENTAR 3cm para esquerda
         if(Greenfoot.isKeyDown("a")){
            //O MARIO TEM QUE MOVIMENTAR 3cm para direita
            setRotation(0);
            move(-3);
        }
        
        //SE O JOGADOR APERTAR A tecla "W" O MARIO TEM QUE MOVIMENTAR 3cm para cima
          if(Greenfoot.isKeyDown("w")){
            //O MARIO TEM QUE MOVIMENTAR 3cm para direita
            setRotation(270);
            move(3);
        }
        
         //SE O JOGADOR APERTAR A tecla "S" O MARIO TEM QUE MOVIMENTAR 3cm para Baixo
          if(Greenfoot.isKeyDown("s")){
            //O MARIO TEM QUE MOVIMENTAR 3cm para direita
            setRotation(90);
            move(3);
        }
    }    
}
