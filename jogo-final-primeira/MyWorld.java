import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(200, 600, 1); 
        prepare();
    }

    public void act() {
        if(Greenfoot.getRandomNumber(200) < 2) {
            addObject(new CarroInimigo0(), Greenfoot.getRandomNumber(200), 0);
        }
        if(Greenfoot.getRandomNumber(300) < 4) {
            addObject(new CarroInimigo2(), Greenfoot.getRandomNumber(200), 0);
        }
    }

    private void prepare()
    { 
        CarPlayerOne carPlayerOne = new CarPlayerOne();
        addObject(carPlayerOne,98,550);
        CarroInimigo0 carroInimigo0 = new CarroInimigo0();
        addObject(carroInimigo0,43,50);
        CarroInimigo2 carroInimigo2 = new CarroInimigo2();
        addObject(carroInimigo2,166,115);
    }
}
