import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase es la encargada de controlar la barra de vida del jugador
 * 
 * @author (Daniel) 
 * @version (25/04/2015)
 */
public class LifeSpawn extends Chavito
{
    private GreenfootImage[] life = new GreenfootImage[6];
    private int iVida;
    public LifeSpawn(int iTi)
    {
        life[0] = new GreenfootImage("LifeSpawn1.png");
        life[1] = new GreenfootImage("LifeSpawn2.png");
        life[2] = new GreenfootImage("LifeSpawn3.png");
        life[3] = new GreenfootImage("LifeSpawn4.png");
        life[4] = new GreenfootImage("LifeSpawn5.png");
        life[5] = new GreenfootImage("LifeSpawn6.png");
        setImage( life[iTi] );
    }
    public void act(int iTi){ 
        //setImage( life[iTi] );
    }    
}
