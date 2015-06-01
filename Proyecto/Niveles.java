import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Muestra en pantalla el no. de nivel
 * que esta en juego
 * 
 * @author (Daniel) 
 * @version (27/05/15)
 * Corresponde a la imagen que indica en que nivel jugamos
 */
public class Niveles extends Actor
{
    private GreenfootImage[] levels = new GreenfootImage[5];
    public Niveles(int iCual){
        levels[0] = new GreenfootImage("Nivel1.jpg");
        levels[1] = new GreenfootImage("Nivel2.jpg");
        levels[2] = new GreenfootImage("Nivel3.jpg");
        levels[3] = new GreenfootImage("Nivel4.jpg");
        levels[4] = new GreenfootImage("Nivel5.jpg");
        setImage(levels[iCual]);
    }
    public void act(){ 
   
        // Add your action code here.
    }    
}
