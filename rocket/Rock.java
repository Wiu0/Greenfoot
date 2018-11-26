import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Rock extends Actor
{
    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isAtEdge()){
            turn(120);
        }

        move(Greenfoot.getRandomNumber(8) * -1);

        if(Greenfoot.getRandomNumber(100) < 10){
            turn(-15);
        }

        if(Greenfoot.getRandomNumber(100) > 90){
            turn(15);
        }

        if(isTouching(Rocket.class)){
            Placar.PONTOS--;
            setLocation(Greenfoot.getRandomNumber(1200), 
            Greenfoot.getRandomNumber(800));
        }
    }    
}
