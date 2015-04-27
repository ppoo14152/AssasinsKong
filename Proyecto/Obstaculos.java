import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Todos las cosas que lanzara la chilindrina
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstaculos extends Chilindrina
{
    public GreenfootImage[] obstaculos = new GreenfootImage[4];
    public void act() 
    {
        obstaculos[0] = new GreenfootImage("manzana.png");
        obstaculos[1] = new GreenfootImage("triciclo.png");
        obstaculos[2] = new GreenfootImage("pelota.png");
        obstaculos[3] = new GreenfootImage("platano.png");
    }    
}
