// Create a new world with 1024x544 cells with a cell size of 1x1 pixels.
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Vecindad extends World
{
    public Chavito chavo;
    public Plataforma1 plataforma;
    public Escalera stair;
    public Escalera stair2;
    public Escalera stair3;
    public Escalera stair4;
    public Escalera stair5;
    private int iNivel;
    public Vecindad()
    {    
        super(1020, 544, 1); 
        chavo = new Chavito();
        plataforma = new Plataforma1();
        stair = new Escalera();
        stair2 = new Escalera();
        stair3 = new Escalera();
        stair4 = new Escalera();
        stair5 = new Escalera();
        iNivel = 1;
        Aniadir();
    }

    public void Aniadir()
    {
        /**
         * Dependiendo del nivel se añadira una platadforma diferente
         * Tambien se añadira al actor principal del juego en pociciones diferentes
         * Asi como sus respectivos enemigos y obstaculos
         */
        if(iNivel==1){
            addObject(plataforma,511,272);
            addObject(stair,420,425);
            addObject(stair2,302,122);
            addObject(stair3,265,275);
            addObject(stair4,528,275);
            addObject(stair5,680,122);
            addObject(chavo,50,485);
        }
    }
}
