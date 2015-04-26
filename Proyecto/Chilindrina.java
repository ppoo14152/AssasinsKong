import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase se encarga de todo lo que puede
 * hacer el enemigo, que en este caso
 * es la Chilindrina
 * @author (Mayra Karina) 
 * @version (a version number or a date)
 */
public class Chilindrina extends Actor
{
    public GreenfootImage[] chilindrina = new GreenfootImage[14];//El arreglo de tipo GreenfootImage guarda todas las imagenes que pertenecen al movimiento de el enemigo
    public void act() 
    {
        chilindrina[0] = new GreenfootImage("chilin1.png");
        chilindrina[1] = new GreenfootImage("chilin1_izq.png");
        chilindrina[2] = new GreenfootImage("chilin2.png");
        chilindrina[3] = new GreenfootImage("chilin2_izq.png");
        chilindrina[4] = new GreenfootImage("chilin3.png");
        chilindrina[5] = new GreenfootImage("chilin3_izq.png");
        chilindrina[6] = new GreenfootImage("chilin4.png");
        chilindrina[7] = new GreenfootImage("chilin4_izq.png");
        chilindrina[8] = new GreenfootImage("chilin5.png");
        chilindrina[9] = new GreenfootImage("chilin5_izq.png");
        chilindrina[10] = new GreenfootImage("chilin6.png");
        chilindrina[11] = new GreenfootImage("chilin6_izq.png");
        chilindrina[12] = new GreenfootImage("chilin7.png");
        chilindrina[13] = new GreenfootImage("chilin7_izq.png");
    }    
}