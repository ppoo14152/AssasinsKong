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
    private GreenfootImage[] obstaculos = new GreenfootImage[4];
    private int iDireccion;
    private int iTipo;
    private int iX;
    private int iY;
    private Random iRandom;
    private int iNum;
    private Boolean onFloor;
    public Obstaculos(int iTi)
    {
        obstaculos[0] = new GreenfootImage("manzana.png");
        obstaculos[1] = new GreenfootImage("triciclo.png");
        obstaculos[2] = new GreenfootImage("pelota.png");
        obstaculos[3] = new GreenfootImage("platano.png");
        iDireccion = -1;
        iTipo = iTi;
        setImage( obstaculos[iTi] );
        iRandom = new Random();
        iNum = iRandom.nextInt(2);
        onFloor = false;
    }

    public void act() 
    {
        setFall();
    }  

    public void setFall()
    {
        /**
         * Mientras onFloor sea falso significa que el obstaculo se esta moviendo en las plataformas
         * Si onFloor es verdadero el obstaculo se esta moviendo en el piso
         */
        if(onFloor == false){
            if(isTouching(Escalera.class) || (!isTouching(Plataforma.class))){
                setLocation(getX(),getY()+2);
            }
            if(!isTouching(Escalera.class) || (isTouching(Plataforma.class))){
                if(iDireccion == 1){
                    move(2);
                }
                if(iDireccion == -1){
                    move(-2);
                }
            }
            if((isTouching(Escalera.class)) && (!isTouching(Plataforma.class))){
                iDireccion = ((iDireccion) * (-1));
            }
            if( (getY()==500)){
                onFloor = true;
            }
        }
        if(onFloor == true){
            if(iDireccion == 1){
                move(2);
            }
            if(iDireccion == -1){
                move(-2);
            }
            if( (getX()<=20) || (getX()>1000) ){
                getWorld().removeObject(this);
            }
        }

    }
}
