import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    int bolinhasUsadas = 180;
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() {
        int idade = 18;
        if(idade < 13) {
            move(13 - Greenfoot.getRandomNumber(idade));
        } else {
            if(idade > 12 && idade < 15) {
                move(idade - Greenfoot.getRandomNumber(idade));    
            } else {
                if(idade >= 15 && idade < 20) {
                    move(idade - Greenfoot.getRandomNumber(idade));
                } else  {
                    turn(-1);
                }if(idade > 19) {
                    move(13 - Greenfoot.getRandomNumber(19 - idade));
                } else {
                    if(idade == 18) {
                        isAtEdge();
                    } else {
                        setLocation(idade, 18);
                    }
                }
            }
        }
    }   

    public void act1()
    {
        // Add your action code here. 
        int botaoMouseClicado = 0;
        MouseInfo m = Greenfoot.getMouseInfo();
        if (m != null) {
            botaoMouseClicado = m.getButton();
        }
        getWorld().showText("Balas :" + bolinhasUsadas, 50, 200);
        if (bolinhasUsadas == 0){
            Greenfoot.stop();
            getWorld().showText("GAME OVER!!!! MUNIÇÃO ACABOU.", 400, 100);
        }
        if(Greenfoot.isKeyDown("w")){
            move(3);
        }
        if(Greenfoot.isKeyDown("a")){
            turn(-3);
        }
        if(Greenfoot.isKeyDown("d")){
            turn(3);
        }
        if (botaoMouseClicado == 1 && bolinhasUsadas > 0){
            Power power = new Power();
            power.setRotation(getRotation());
            getWorld().addObject(power, getX(), getY());
            bolinhasUsadas--;
        }
    }
}
