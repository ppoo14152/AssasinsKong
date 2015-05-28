import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Cada que el jugador coma una torta
 * Aumentara 1 nivel su barra 
 * De Vida
 * @author (Daniel) 
 * @version (36/05/15)
 */
public class Torta extends Chilindrina
{
    private GreenfootImage tortaDeJamon;
    private int iDireccion;
    private int iX;
    private int iY;
    private Random iRandom;
    private int iNum;
    private Boolean onFloor;
    public Torta(){
        tortaDeJamon = new GreenfootImage("torta.png");
        iDireccion = -1;
        setImage(tortaDeJamon);
        iRandom = new Random();
        iNum = iRandom.nextInt(2);
        onFloor = false;
    }

    public void act() {
        setWhatCanItDo();
    }   

    public void setWhatCanItDo(){
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
        if(isTouching(Chavito.class) == true){
            getWorld().removeObject(this);
        }
        
    }

}
