import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase se encarga de todo lo relacionado con Paty
 * 
 * @author (Mayra Karina) 
 * @version (a version number or a date)
 */
public class Paty extends Actor
{
    public GreenfootImage[] paty = new GreenfootImage[4];
    public void act() 
    {
        paty[0] = new GreenfootImage("paty.png");
        paty[1] = new GreenfootImage("paty2.png");
        paty[2] = new GreenfootImage("cpaty3.png");
    }    
}
