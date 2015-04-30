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
    int iDireccion;
    int iTipo;
    int iMovimiento;
    int iX;
    int iY;
    public Obstaculos(int iTi)
    {
        obstaculos[0] = new GreenfootImage("manzana.png");
        obstaculos[1] = new GreenfootImage("triciclo.png");
        obstaculos[2] = new GreenfootImage("pelota.png");
        obstaculos[3] = new GreenfootImage("platano.png");
        iDireccion = 2;
        iTipo = iTi;
        setImage( obstaculos[iTi] );
        iMovimiento = 0;
    }

    public void act() 
    {
        setFall();
    }  

    public void setFall()
    {
        if(iDireccion == 1){
            iMovimiento --;
            move(2);
        }
        if(iDireccion == 2){
            iMovimiento++;
            move(-2);
        }
        if(isTouching(Escalera.class)){
            while(isTouching(Escalera.class)){
                setLocation(getX(),getY()+2);
                if(iDireccion == 2){
                    iDireccion = 1;
                } 
                if(iDireccion == 1){
                    iDireccion = 2;
                }
                if(isTouching(Plataforma.class)){
                    if(iDireccion == 2){
                        iMovimiento++;
                        move(-2);
                        //iDireccion = 1;
                    }
                    if(iDireccion == 1){
                        iMovimiento --;
                        move(2);
                       // iDireccion = 2;
                    }
                }
            }
        }
    }
}
