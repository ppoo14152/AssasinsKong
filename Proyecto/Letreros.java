import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Muestra en pantalla distintos tipos de mensaje segun el edo del juego
 * 
 * @author (Daniel) 
 * @version (2)
 */
public class Letreros extends Chavito
{
    private GreenfootImage[] letras = new GreenfootImage[3];//El arreglo de tipo GreenfootImage guarda todas las imagenes que pertenecen a los letreros de peder, ganar y sig nivel
    private int iEstado;
    /**
     * Act - do whatever the Letreros wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Letreros(int iEdos)
    {
        letras[0] = new GreenfootImage("perdiste.png");
        letras[1] = new GreenfootImage("ganaste.png");
        letras[2] = new GreenfootImage("siguiente.png");
        iEstado = iEdos;
        setImage( letras[iEdos] );
    }
    public void act() 
    {
        
        
    }    
}
