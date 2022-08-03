import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    public void act() {
        String opcaoParImpar = Greenfoot.ask("Digite 0 para par ou 1 para impar");
        String quantidadeDedos = Greenfoot.ask("Digite a quantidade de dados. Por favor colocar valores de 0 a 10");
        
        int opcao = Integer.parseInt(opcaoParImpar);
        int qtdDedosPlayer1 = Integer.parseInt(quantidadeDedos);
        
        int quantidadeDeDedosNPC = Greenfoot.getRandomNumber(11);
        
        int quantidadeTotalDedos = quantidadeDeDedosNPC + qtdDedosPlayer1;
        
        showText("Quantidade dedos NPC: " + quantidadeDeDedosNPC , 300, 300);
        showText("Total de dedos: " + quantidadeTotalDedos , 300, 200);
        showText("Quantidade dedos Player 1: " + qtdDedosPlayer1 , 300, 250);
        showText("Player 1 escolheu(0-par; 1-impar): " + opcao , 300, 100);
        
        // Como determinar se um numero é par ou impar => quantidadeTotalDedos
        // Todo numero que termina com 0, 2, 4, 6, 8 é par enquanto 1, 3, 5, 7, 9 é impar
        //====== o resto da divisao de qualquer numero por 2 quando é 0 indica que o numero é par e quando o resto é 1 indica que o numero é impar
        
        //15/2 = 7
        //resto = 1
        
        //6/2 = 3
        //resto = 0
        
        int resto = quantidadeTotalDedos - ((quantidadeTotalDedos/2) * 2);
        
        if(resto == opcao){
             showText("Player 1 Ganhou", 300, 50);
        } else {
            showText("Player 1 Perdeu", 300, 50);
        }
        
        Greenfoot.stop();
        
    }
    
}
