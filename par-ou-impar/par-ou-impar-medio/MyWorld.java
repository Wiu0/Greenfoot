import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    private Par par = new Par();
    private Impar impar = new Impar();
    boolean podePedirQuantidadeDedos;
    byte quantidadeDedos = 0;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        podePedirQuantidadeDedos = false;
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(par,113,49);
        addObject(impar,473,49);
    }

    public void act() {

        if(Greenfoot.mouseClicked(par)) {
            showText("Clique Par", getWidth()/2, getHeight()/2);
            podePedirQuantidadeDedos = true;
        }
        if(Greenfoot.mouseClicked(impar)) {
            showText("Clique Impar", getWidth()/2, getHeight()/2);
            podePedirQuantidadeDedos = true;
        }

        if(podePedirQuantidadeDedos) {
            if(Greenfoot.isKeyDown("up")) {
                showText("Quantidade de dedos: " + (++quantidadeDedos), getWidth()/2, getHeight()/2);
            } else if(Greenfoot.isKeyDown("down")){
                showText("Quantidade de dedos: " + (--quantidadeDedos), getWidth()/2, getHeight()/2);
            }
            String key = Greenfoot.getKey();
            byte valor;
            try {
                valor = Byte.parseByte(key);
                if(valor == 0 && quantidadeDedos == 1) {
                    quantidadeDedos = 10;
                    valor = 10;
                }
                if(valor > -1 && valor < 10) {
                    quantidadeDedos = valor;
                }
                showText("Quantidade de dedos: " + quantidadeDedos, getWidth()/2, getHeight()/2);
            } catch (Exception e) {

            }
        }

    }
}
