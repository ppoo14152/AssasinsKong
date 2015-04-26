import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Thread;
public class Chavito extends Actor
{
    public GreenfootImage[] chavo = new GreenfootImage[13];//El arreglo de tipo GreenfootImage guarda todas las imagenes que pertenecen al movimiento del actor
    private boolean isAbove;
    private int walkTimer;
    private int iBandera;
    private int iBandera2;
    private int iCount;
    private int iDireccion;
    public Chavito()
    {
        chavo[0] = new GreenfootImage("chavo1.png");//camina1
        chavo[1] = new GreenfootImage("chavo1_izq.png");//camina1 izq
        chavo[2] = new GreenfootImage("chavo2.png");//camina2
        chavo[3] = new GreenfootImage("chavo2_izq.png");//camina2 izq
        chavo[4] = new GreenfootImage("chavo3.png");//agachado
        chavo[5] = new GreenfootImage("chavo3_izq.png");//agachado izq
        chavo[6] = new GreenfootImage("chavo4.png");//subir escalera
        chavo[7] = new GreenfootImage("chavo5.png");//brinco
        chavo[8] = new GreenfootImage("chavo5_izq.png");//brinco izq
        chavo[9] = new GreenfootImage("chavo6.png");//medio muerto
        chavo[10] = new GreenfootImage("chavo6_izq.png");//medio muerto izq
        chavo[11] = new GreenfootImage("chavo7.png");//muerto
        chavo[12] = new GreenfootImage("chavo7_izq.png");//muerto izq
        walkTimer = 0;
        iBandera = 0;
        iBandera2 = 0; 
        iCount = 0;
        iDireccion = 0;
        isAbove = false;
    }
    //Esta clase se encarga de todo lo que puede hacer el chavo siempre y cuando este tenga aun vida//
    public void act()
    {
        setActions();
    }
    //setActions() se encarga de checar que tecla esta presionada para asi determinar que hacer//
    public void setActions()
    {
        int iCoorY = getY();
        setJump();
        setCrouch();
        setMove();  
        setUpStairs();
    }

    public void setJump()
    {
        if (Greenfoot.isKeyDown("space")){
            iBandera = 1;
        }
        if (iBandera==1 || iBandera2==1){
            if(iBandera==1){
                if(iDireccion == 0){
                    setImage(chavo[7]);
                }
                if(iDireccion == 1){
                    setImage(chavo[8]);
                }
                setLocation(getX(),getY()-1);
                iCount++;
                if(iCount==65){
                    iBandera=0;
                    iBandera2=1;
                }
            }

            if(iBandera2==1){
                if(iDireccion == 0){
                    setImage(chavo[7]);
                }
                if(iDireccion == 1){
                    setImage(chavo[8]);
                }
                setLocation(getX(),getY()+1);
                iCount--;
                if(iCount==0){
                    iBandera2=0;
                    if(iDireccion == 0){
                        setImage(chavo[0]);
                    }
                    if(iDireccion == 1){
                        setImage(chavo[1]);
                    }
                }
            }
        }
    }

    public void setCrouch()
    {
        if (Greenfoot.isKeyDown("down")){
            if(iDireccion == 0){
                setImage(chavo[4]);
            }
            if(iDireccion == 1){
                setImage(chavo[5]);
            }    
        }
    }

    public void setMove()
    {
        if(getX()<970){
            if (Greenfoot.isKeyDown("right")){
                iDireccion = 0;
                move(walkTimer);
                walkTimer ++;
                if(walkTimer == 0){
                    setImage(chavo[0]);
                }
                if(walkTimer == 3){
                    setImage(chavo[2]);
                }
                if(walkTimer == 6){
                    walkTimer = 0;
                    setImage(chavo[0]);
                }

            }
        }
        if(getX()>50){
            if (Greenfoot.isKeyDown("left")){
                iDireccion = 1;
                move(walkTimer);
                walkTimer --;
                if(walkTimer == 0){
                    setImage(chavo[1]);
                }
                if(walkTimer == -3){
                    setImage(chavo[3]);
                }
                if(walkTimer == -6)
                {
                    walkTimer = 0;
                    setImage(chavo[1]);
                }
            }
        }
    }

    public void setUpStairs()
    {
        if(isTouching(Escalera.class)){
            if(Greenfoot.isKeyDown("up")){
                setImage(chavo[6]);
                setLocation(getX(),getY()-1);
                if(!isTouching(Escalera.class)){
                    if(iDireccion == 0){
                        setImage(chavo[0]);
                    }
                    if(iDireccion == 1){
                        setImage(chavo[1]);
                    } 
                    isAbove = true;
                }
            }
        }
    }

}
