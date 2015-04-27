import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase es la encargada de controlar la barra de vida del jugador
 * .
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifeSpawan extends Chavito
{
    public GreenfootImage[] life = new GreenfootImage[6];
    public void act() 
    {
        life[0] = new GreenfootImage("Life (1).png");
        life[1] = new GreenfootImage("Life (2).png");
        life[2] = new GreenfootImage("Life (3).png");
        life[3] = new GreenfootImage("Life (4).png");
        life[4] = new GreenfootImage("Life (5).png");
        life[5] = new GreenfootImage("Life (6).png");
    }    
}
