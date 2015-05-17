// Create a new world with 1024x544 cells with a cell size of 1x1 pixels.
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Vecindad extends World
{
    public GreenfootImage[] escenario = new GreenfootImage[5];
    public Chavito chavo;
    public Chilindrina chilin;
    public Plataforma1 plataforma;
    public Plataforma1 plataforma1;
    public Plataforma1 plataforma2;
    public Plataformita p1;
    public Plataforma pla1;
    public Plataforma pla2;
    public Plataforma pla3;
    public Escalera stair;
    public Escalera stair2;
    public Escalera stair3;
    public Escalera stair4;
    public Escalera stair5;
    public Escalera stair6;
    public Paty popis;
    public LifeSpawn barra;
    private int iNivel;
    public Vecindad()
    {    
        super(1020, 544, 1); 
        //escenario[0] = new GreenfootImage("Cenario - 01.bmp");
        chavo = new Chavito();
        chilin = new Chilindrina();
        plataforma = new Plataforma1();
        plataforma1 = new Plataforma1();
        pla1 = new Plataforma();
        pla2 = new Plataforma();
        pla3 = new Plataforma();
        stair = new Escalera();
        stair2 = new Escalera();
        stair3 = new Escalera();
        stair4 = new Escalera();
        stair5 = new Escalera();
        stair6 = new Escalera();
        p1 = new Plataformita();
        popis = new Paty();
        iNivel = 1;
        act();
    }

    public void act()
    {
        Aniadir();
    }

    public void Aniadir()
    {
        /**
         * Dependiendo del nivel
         * se añadira un numero determinado de escaleras
         * y pocicion del las plataformas
         */
        if(iNivel == 1){
            //getWorld().addObject(new Escenarios(), 0,700,50);
            addObject(pla1,511,245);
            addObject(pla2,473,395);
            addObject(pla3,549,95);
            addObject(plataforma1,511,282);
            addObject(stair,280,450);
            addObject(stair2,750,450);
            addObject(stair3,640,298);
            addObject(stair4,465,145);
            addObject(stair5,750,145);
            addObject(chavo,100,485);
            addObject(chilin,700,40);
            addObject(p1,930,100);
            addObject(popis,950,50);
        }
    }
}
