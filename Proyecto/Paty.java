import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase se encarga de todo lo relacionado con Paty
 * 
 * @author (Mayra Karina) 
 * @version (a version number or a date)
 */
public class Paty extends Actor
{
    public GreenfootImage[] paty = new GreenfootImage[3];
    int iAccion;
    public Paty()
    {
        paty[0] = new GreenfootImage("paty.png");
        paty[1] = new GreenfootImage("paty2.png");
        paty[2] = new GreenfootImage("paty3.png");
        iAccion = 0;
    }

    public void act() 
    {
        animacion();
    }

    public void animacion()
    {
        if(iAccion == 0){
            setImage(paty[0]);
        }
        if(iAccion == 7){
            setImage(paty[1]);
        }
        if(iAccion == 14){
            setImage(paty[2]);
        }
    }
}
