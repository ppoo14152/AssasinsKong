import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Vecindad extends World
{
    public Escenarios fondo;
    public Chavito chavo;
    public Chilindrina chilin;
    public Plataforma1 plataforma;
    public Plataforma2 plataforma1;
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
    public Escalera stair7;
    public Paty popis;
    public LifeSpawn barra;
    private int iNivel;
    public Vecindad()
    {    
        super(1020, 544, 1);
        iNivel = 1;
        fondo = new Escenarios(iNivel);
        barra = new LifeSpawn(0);
        chavo = new Chavito();
        chilin = new Chilindrina();
        plataforma = new Plataforma1();
        plataforma1 = new Plataforma2();
        pla1 = new Plataforma();
        pla2 = new Plataforma();
        pla3 = new Plataforma();
        stair = new Escalera();
        stair2 = new Escalera();
        stair3 = new Escalera();
        stair4 = new Escalera();
        stair5 = new Escalera();
        stair6 = new Escalera();
        stair7 = new Escalera();
        popis = new Paty();      
    }

    public void act()
    {
        Aniadir(1);
    }
    
    public void crear()
    {
        barra = new LifeSpawn(0);
        chavo = new Chavito();
        chilin = new Chilindrina();
        plataforma = new Plataforma1();
        plataforma1 = new Plataforma2();
        pla1 = new Plataforma();
        pla2 = new Plataforma();
        pla3 = new Plataforma();
        stair = new Escalera();
        stair2 = new Escalera();
        stair3 = new Escalera();
        stair4 = new Escalera();
        stair5 = new Escalera();
        stair6 = new Escalera();
        stair7 = new Escalera();
        popis = new Paty();
    }

    public void Aniadir(int iAcomodar)
    {
        /**
         * Dependiendo del nivel
         * se añadira un numero determinado de escaleras
         * y pocicion del las plataformas
         */
        iNivel = iAcomodar;
        addObject(barra, 80, 50);
        if(iNivel == 1){
            addObject(new Escenarios(0),(getWidth()/2),(getHeight()/2));
            addObject(pla1,511,245);
            addObject(pla2,473,395);
            addObject(pla3,549,95);
            addObject(plataforma,511,282);
            addObject(stair,280,450);
            addObject(stair2,750,450);
            addObject(stair3,640,298);
            addObject(stair4,465,145);
            addObject(stair5,750,145);
            addObject(chavo,100,485);
            addObject(chilin,700,40);
            addObject(popis,800,50);
        }
        if(iNivel == 2){ 
            addObject(new Escenarios(1),(getWidth()/2),(getHeight()/2));
            addObject(pla1,411,246);
            addObject(pla2,540,395);
            addObject(pla3,571,90);
            addObject(plataforma1,510,282);
            addObject(stair,300,450);
            addObject(stair2,750,450);
            addObject(stair3,500,298);
            addObject(stair4,600,145);
            addObject(stair5,400,145);
            addObject(chavo,100,485);
            addObject(chilin,700,40);
            addObject(p1,950,180);
            addObject(popis,970,120);
        }
        if(iNivel == 3){
            addObject(new Escenarios(3),(getWidth()/2),(getHeight()/2));
            addObject(pla1,511,245);
            addObject(pla2,473,395);
            addObject(pla3,549,95);
            addObject(plataforma,511,282);
            addObject(stair,280,450);
            addObject(stair2,750,450);
            addObject(stair3,640,298);
            addObject(stair4,465,145);
            addObject(stair5,750,145);
            addObject(chavo,100,485);
            addObject(chilin,700,40);
            addObject(popis,800,50);
        }
        if(iNivel == 4){
            addObject(new Escenarios(4),(getWidth()/2),(getHeight()/2));
            addObject(pla1,411,246);
            addObject(pla2,540,395);
            addObject(pla3,571,90);
            addObject(plataforma1,510,282);
            addObject(stair,300,450);
            addObject(stair2,750,450);
            addObject(stair3,500,298);
            addObject(stair4,600,145);
            addObject(stair5,400,145);
            addObject(chavo,100,485);
            addObject(chilin,700,40);
            addObject(p1,950,180);
            addObject(popis,970,120);
        }
        if(iNivel == 5){
            addObject(new Escenarios(5),(getWidth()/2),(getHeight()/2));
            addObject(pla1,511,245);
            addObject(pla2,473,395);
            addObject(pla3,549,95);
            addObject(plataforma,511,282);
            addObject(stair,280,450);
            addObject(stair2,750,450);
            addObject(stair3,640,298);
            addObject(stair4,465,145);
            addObject(stair5,750,145);
            addObject(chavo,100,485);
            addObject(chilin,700,40);
            addObject(popis,800,50);
        }
    }
    public void eliminaVecindad()
    {
        removeObject(popis);
        removeObject(pla1);
        removeObject(pla2);
        removeObject(pla3);
        removeObject(plataforma);
        removeObject(plataforma1);
        removeObject(stair);
        removeObject(stair2);
        removeObject(stair3);
        removeObject(stair4);
        removeObject(stair5);
        removeObject(chilin);
        removeObject(p1);
        crear();
        Aniadir(2);
    }
    
}