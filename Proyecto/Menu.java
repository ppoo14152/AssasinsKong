import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Menu here.
 * 
 * @author (Daniel)
 * Creditos de codigo para CaracteresLarousse
 * @version (2)
 */
public class Menu extends World
{
    private Tutorial tAyuda;
    private Jugar jJuego;
    private Siguiente sFlecha;
    private Background bEscenario;
    private Background bAyuda;
    private Creditos cQuien;
    private int iIniTutorial;
    private int iCount;
    private boolean iniciaJuego;
    private int contador;
    public Menu()
    {    
        //Crea el mundo del menu
        super(1020, 544, 1); 
        iCount = 0;
        iIniTutorial = 0;
        contador=0;
        iniciaJuego = false;
        setMenu();
    }

    public void act(){
        if(!iniciaJuego)
        {
            if(iIniTutorial == 1)
            {
                if(iCount!=115)
                {
                    iCount++;
                }
                if(iCount == 110)
                {
                    bAyuda = new Background(0,0,0,2);
                    addObject(bAyuda,(getWidth()/2),(getHeight()/2));
                    sFlecha = new Siguiente(1,null);
                    addObject(sFlecha,575,905);
                }
            }  
        }
        else
        {
            contador++;
            if(contador==120){
                Greenfoot.setWorld(new Vecindad());
            }
        }
    }

    public void setMenu(){//Crea El Menu
        iIniTutorial = 0;
        bEscenario = new Background(0,0,0,0);     
        addObject(bEscenario,(getWidth()/2),(getHeight()/2));
        jJuego = new Jugar();
        addObject(jJuego,230,450);
        tAyuda = new Tutorial();
        addObject(tAyuda,480,450);
        cQuien = new Creditos(1);
        addObject(cQuien,730,450);
    }

    public void desapareceTutorial(){
        jJuego.desaparece();
    }

    public void desapareceRecords(){
        jJuego.desaparece();
        tAyuda.desaparece();
    }

    public void desaparecePlay(){
        tAyuda.desaparece();
    }

    public void sigTutorial(){
        bAyuda.sigTutorial();
        iIniTutorial = 0;
    }

    public void iniciaTutorial(){
        iIniTutorial = 1;
    }

    public void quitaTutorial(){
        removeObject(bAyuda);
        removeObject(sFlecha);
        removeObject(bEscenario);
        iIniTutorial = 0;
        iCount = 0;
        setMenu();
    }

    public void vuelveMenu(){      
        setMenu();    
    }

    public void iniciarJuego()
    {
        contador = 0;
        iniciaJuego = true;
    }
}
