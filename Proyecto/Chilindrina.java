import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Esta clase se encarga de todo lo que puede
 * hacer el enemigo, que en este caso
 * es la Chilindrina
 * @author (Mayra Karina) 
 * @version (a version number or a date)
 */
public class Chilindrina extends Actor
{
    public GreenfootImage[] chilindrina = new GreenfootImage[10];//El arreglo de tipo GreenfootImage guarda todas las imagenes que pertenecen al movimiento de el enemigo
    private int iDr;
    private int iAnimacion;
    private Random iRandom;
    public Chilindrina()
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
        iDr = 1;
        iAnimacion = 0;
        iRandom = new Random();
    }

    public void act() 
    {
        animate();
    }  

    public void animate()
    {
        //Si direccion es igual a 1, se mostrara las imagenes del lado derecho, si es izquierda se ostraran del lado derecho
        if(iDr == 1){
            if(iAnimacion == 15){
                setImage(chilindrina[1]);
            }
            if(iAnimacion == 30){
                setImage(chilindrina[3]);
            }
            if(iAnimacion == 45){
                setImage(chilindrina[5]);
            }
            if(iAnimacion == 60){
                setImage(chilindrina[7]);
            }
            if(iAnimacion == 75){
                setImage(chilindrina[9]);
                getWorld().addObject(new Obstaculos(iRandom.nextInt(4)),700,50);
            }
            if(iAnimacion == 90){
                iAnimacion = 0;
            }
            iAnimacion++;
        }
        if(iDr == 2){
            if(iAnimacion == 20){
                setImage(chilindrina[0]);
            }
            if(iAnimacion == 40){
                setImage(chilindrina[2]);
            }
            if(iAnimacion == 60){
                setImage(chilindrina[4]);
            }
            if(iAnimacion == 80){
                setImage(chilindrina[6]);
            }
            if(iAnimacion == 100){
                setImage(chilindrina[8]);
                getWorld().addObject(new Obstaculos(iRandom.nextInt(4)),700,50);
            }
            if(iAnimacion == 120){
                iAnimacion = 0;
            }
            iAnimacion++;
        }
    }   
}