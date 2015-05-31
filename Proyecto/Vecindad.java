import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Vecindad extends World
{
    private Niveles level;
    private Chavito chavo;
    private Chilindrina chilin;
    private Plataforma1 plataforma;
    private Plataforma2 plataforma1;
    private Plataformita p1;
    private Plataforma pla1;
    private Plataforma pla2;
    private Plataforma pla3;
    private Escalera stair;
    private Escalera stair2;
    private Escalera stair3;
    private Escalera stair4;
    private Escalera stair5;
    private Escalera stair6;
    private Escalera stair7;
    private Paty popis;
    private Vecindad1 esc1;
    private Vecindad2 esc2;
    private Vecindad3 esc3;
    private Vecindad4 esc4;
    private Vecindad5 esc5;
    private int iNivel;
    private LifeSpawn barra;
    private Niveles nivel1;
    public Vecindad()
    {    
        super(1020, 544, 1);
        barra = new LifeSpawn(0);
        nivel1 = new Niveles(0);
        iNivel = 1;
        level = new Niveles(0);
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
        esc1 = new Vecindad1();
        esc2 = new Vecindad2();
        esc3 = new Vecindad3();
        esc4 = new Vecindad4();
        esc5 = new Vecindad5();
    }

    public void act()
    {
        setAddObjects(iNivel);
    }

    public void setAddObjects(int iAcomodar)
    {
        /**
         * Dependiendo del nivel
         * se añadiran en cierto orden las ecaleras
         * y tambien las plataformas.
         */
        iNivel = iAcomodar;
        if(iNivel == 1){
            addObject(esc1,(getWidth()/2),(getHeight()/2));
            addObject(barra,80,50);
            addObject(nivel1,970,25);
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
            addObject(chilin,600,40);
            addObject(popis,800,50);
        }
        if(iNivel == 2){ 
            addObject(esc2,(getWidth()/2),(getHeight()/2));
            addObject(barra,80,50);
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
            addObject(chilin,600,40);
            addObject(popis,800,50);
        }
        if(iNivel == 3){
            addObject(esc3,(getWidth()/2),(getHeight()/2));
            addObject(barra,80,50);
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
            addObject(chilin,600,40);
            addObject(popis,800,50);
        }
        if(iNivel == 4){
            addObject(esc4,(getWidth()/2),(getHeight()/2));
            addObject(barra,80,50);
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
            addObject(chilin,600,40);
            addObject(popis,800,50);
        }
        if(iNivel == 5){
            addObject(esc5,(getWidth()/2),(getHeight()/2));
            addObject(barra,80,50);
            addObject(new Niveles(4),970,25);
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
            addObject(chilin,600,40);
            addObject(popis,800,50);
        }
    }

    public void eliminaVecindad(int Acomodar)
    {
        if(Acomodar == 1){
            removeObject(esc1);
        }
        if(Acomodar == 2){
            removeObject(esc2);
        }
        if(Acomodar == 3){
            removeObject(esc3);
        }
        if(Acomodar == 4){
            removeObject(esc4);
        }
        if(Acomodar == 5){
            removeObject(esc5);
        }
        removeObject(barra);
        removeObject(nivel1);
        removeObject(chavo);
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
    }

    public void setCreate(int Acomodar)
    {
        if(Acomodar == 1){
            esc1 = new Vecindad1();
            nivel1 = new Niveles(0);
        }
        if(Acomodar == 2){
            esc2 = new Vecindad2();
            nivel1 = new Niveles(1);
        }
        if(Acomodar == 3){
            esc3 = new Vecindad3();
            nivel1 = new Niveles(2);
        }
        if(Acomodar == 4){
            esc4 = new Vecindad4();
            nivel1 = new Niveles(3);
        }
        if(Acomodar == 5){
            esc5 = new Vecindad5();
            nivel1 = new Niveles(4);
        }
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
}