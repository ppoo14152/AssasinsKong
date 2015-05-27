import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Thread;  
public class Chavito extends Actor  
{
    private GreenfootImage[] chavo = new GreenfootImage[14];//El arreglo de tipo GreenfootImage guarda todas las imagenes que pertenecen al movimiento del actor
    private boolean isAbove;   //  Se activa cuando esta sobre una plataforma
    private boolean inStair;
    private boolean gravity;
    private boolean bWin;
    private boolean isTouch;
    private int upStair;   
    private int walkTimer;
    private int iBandera;
    private int iBandera2;
    private int iCount;
    private int iDireccion;
    private int iLife;
    private int iAnimacion;
    private int iEdo;
    private int iNivel;
    private int iAuxiliar;
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
        chavo[13] = new GreenfootImage("chavo4_izq.png");//subir
        iLife = 0;
        upStair = 0;
        walkTimer = 0;
        iBandera = 0;
        iBandera2 = 0; 
        iCount = 0;
        iDireccion = 0;
        iAnimacion = 0;
        iEdo = 0;
        iNivel = 1;
        iAuxiliar = 0;
        isAbove = false;
        gravity = false;
        inStair = false;
        bWin = false;
        isTouch = false;
    }
    //Esta clase se encarga de todo lo que puede hacer el chavo siempre y cuando este tenga aun vida//
    public void act()
    {
        if(iLife < 6){
            setActions();  //Ejecuta todas las acciones que puede realizar el actor 
        }    
        if(iLife == 6){
            setDead(); //Corresponde a la animacion de la muerte del chavo =(
        }
    }
    //setActions() se encarga de checar que tecla esta presionada para asi determinar que hacer//
    public void setActions()
    {
        setJump();   //metodo que ejecuta el salto
        setCrouch();   //metodo que ejecuta para agacharse 
        setMove();    //metodo que ejecuta el movimiento 
        setUpStairs();     //metodo que ejecuta subir escaleras
        setDownStairs();    //metodo que ejecuta el bajar escaleras
        setGravity();       //metodo que ejecuta la gravedad cuando cae de una plataforma  
        setWin();   //si win es true el jugador gana, si no pierde
        setTouch(); //Si es tocado por un obstaculo pierde vida
    }

    public void setJump()
    {
        if (Greenfoot.isKeyDown("space")){
            iBandera = 1;
        }
        if (iBandera == 1 || iBandera2 == 1){
            if(iBandera==1){
                if(iDireccion == 0){
                    setImage(chavo[7]);
                }
                if(iDireccion == 1){
                    setImage(chavo[8]);
                }
                setLocation(getX(),getY()-1);
                iCount++;
                if(iCount == 65 || isTouching(Plataformita.class)==true){
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
                if(iCount == 0 || isTouching(Plataformita.class)){
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
        if (Greenfoot.isKeyDown("down") && !isTouching(Escalera.class)){
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
        if(getX()<970 && inStair == false){
            if (Greenfoot.isKeyDown("right")){
                iDireccion = 0;
                move(walkTimer);
                walkTimer ++;
                if(gravity == false){
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
        }
        if(getX()>50 && inStair == false){
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
        if( getY() < 400){
            isAbove = true;
        }
        if( isTouching(Escalera.class) ){
            if(Greenfoot.isKeyDown("up")){
                upStair++;
                setImage(chavo[6]);
                setLocation(getX(),getY()-1);
                if(iDireccion == 0){
                    if(upStair == 0){
                        setImage(chavo[0]);
                    }
                    if(upStair == 10){
                        setImage(chavo[13]);
                    }
                    if(upStair == 20){
                        upStair = 0;
                        setImage(chavo[0]);
                    }
                }
                if(iDireccion == 1){
                    if(upStair == 0){
                        setImage(chavo[1]);
                    }
                    if(upStair == 10){
                        setImage(chavo[13]);
                    }
                    if(upStair == 20){
                        upStair = 0;
                        setImage(chavo[1]);
                    }
                }
            }
        }
    }

    public void setDownStairs()
    {
        if(isTouching(Escalera.class) && Greenfoot.isKeyDown("down") && getY()<475 && isAbove == true){
            upStair++;
            setImage(chavo[6]);
            setLocation(getX(),getY()+1);
            if(iDireccion == 0){
                if(upStair == 0){
                    setImage(chavo[0]);
                }
                if(upStair == 10){
                    setImage(chavo[13]);
                }
                if(upStair == 20){
                    upStair = 0;
                    setImage(chavo[0]);
                }
            }
            if(iDireccion == 1){
                if(upStair == 0){
                    setImage(chavo[1]);
                }
                if(upStair == 10){
                    setImage(chavo[13]);
                }
                if(upStair == 20){
                    upStair = 0;
                    setImage(chavo[1]);
                }
            } 
            if(getY() == 475 ){//no esta tocando plataforma
                isAbove = false;
                inStair = false;
            }
        }
    }

    public void setGravity()
    {
        if((isAbove == true) && !isTouching(Plataforma1.class)){
            while(getY() < 475){
                setLocation(getX(),getY()+1);
                if(iDireccion == 0){
                    setImage(chavo[0]);                    
                }
                if(iDireccion == 1){
                    setImage(chavo[1]);                   
                }
                if(getY() == 475){
                    if(iDireccion == 0){
                        setImage(chavo[4]);                    
                    }
                    if(iDireccion == 1){
                        setImage(chavo[5]);                   
                    }
                    isAbove = false;
                }
            }              
        }
    }

    public void setWin()
    {
        if(isTouching(Paty.class)){
            bWin = true;
            if(iNivel < 5){
                getWorld().addObject(new Letreros( 1 ), 500, 300);
                getWorld().addObject(new Letreros( 2 ), 500, 700);
            }
            if(iNivel == 5){
                getWorld().addObject(new Letreros( 1 ), 500, 300);
            }
            for(int iCount = 0; iCount < 200; iCount++);
            if(iNivel < 5){
                World wAux1;
                World wAux2;
                wAux1 = getWorld();
                wAux2 = getWorld();
                //getWorld().removeObject(Letreros(1));
                ((Vecindad)wAux1).eliminaVecindad(iNivel);
            }
        }
    }

    public void setTouch()
    {
        //getWorld().addObject(new LifeSpawn( iLife ), 80, 50);
        if(!isTouching(Obstaculos.class)){
            isTouch = false;
        }
        if(isTouching(Obstaculos.class) && isTouch == false){
            isTouch = true;
            iLife = iLife + 1;
        }
        if(isTouching(Torta.class) && isTouch == false){
            isTouch = true;
            iLife = iLife - 1;
            //getWorld().removeObject(Torta);
        }
    }

    public void setDead()
    {
        if(iAnimacion == 0){
            if(iDireccion == 0){
                setImage(chavo[9]);
            }
            if(iDireccion == 1){
                setImage(chavo[11]);
            }
        }
        if(iAnimacion == 15){
            if(iDireccion == 0){
                setImage(chavo[10]);
            }
            if(iDireccion == 1){
                setImage(chavo[12]);
            }
        }
        if(iAnimacion == 20){
            getWorld().addObject(new Letreros( 0 ), 500, 300);
        }
        iAnimacion++;
    }
}