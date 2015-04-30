import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escenarios here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escenarios extends Actor
{
    public GreenfootImage[] vecindad = new GreenfootImage[5];
    public Escenarios()
    {
        vecindad[0] = new GreenfootImage("Cenario-01.bmp");
        vecindad[1] = new GreenfootImage("Cenario-02.bmp");
        vecindad[2] = new GreenfootImage("Cenario-03.bmp");
        vecindad[3] = new GreenfootImage("Cenario-04.bmp");
        vecindad[4] = new GreenfootImage("Cenario-05.bmp");
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
