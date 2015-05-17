import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Todos las cosas que lanzara la chilindrina
 * 
 * @author (Daniel) 
 * @version (16/05/15)
 */
public class Obstaculos extends Chilindrina
{
    public GreenfootImage[] obstaculos = new GreenfootImage[4];
    private int iDireccion;
    private int iTipo;
    private int iX;
    private int iY;
    private Random iRandom;
    private int iNum;
    private Boolean bTouch;
    public Obstaculos(int iTi)
    {
        obstaculos[0] = new GreenfootImage("manzana.png");
        obstaculos[1] = new GreenfootImage("triciclo.png");
        obstaculos[2] = new GreenfootImage("pelota.png");
        obstaculos[3] = new GreenfootImage("platano.png");
        iDireccion = 1;
        iTipo = iTi;
        setImage( obstaculos[iTi] );
        iRandom = new Random();
        iNum = iRandom.nextInt(2);
        bTouch = false;
    }

    public void act() 
    {
        setFall();
    }  

    public void setFall()
    {
        if(bTouch == false){
            if(iDireccion == 1){
                move(2);
            }
            if(iDireccion == 2){
                move(-2);
            }
        }
        if(isTouching(Escalera.class)){
            bTouch = true;
            while((isTouching(Escalera.class)) && (bTouch == true)){
                setLocation(getX(),getY()+2);
                if(isTouching(Plataforma.class)){
                    if(iDireccion == 2){
                        iDireccion = 1;
                    }
                    if(iDireccion == 1){
                        iDireccion = 2;
                    } 
                    bTouch = false;
                }
            }
        }
        if( getX()<1 && getY()> 1018){
            World destroy;
            destroy = getWorld();
            destroy.removeObject(this);
        }
    }
}
