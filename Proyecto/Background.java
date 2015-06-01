import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Se encarga de colocar todas las imagens de fondo tales como elmenu
 * Tutoriales y Creditos
 * @author (Daniel) 
 * Creditos para CaracteresLarouse.
 * @version (26/05/15)
 */
public class Background extends Actor
{
    private GreenfootImage menu  = new GreenfootImage("Fondo.jpg");
    private GreenfootImage tutorial1;
    private GreenfootImage tutorial2;
    private GreenfootImage tutorial3; 
    private int iNum;
    private int x1;
    private int y1;
    private int vel;
    private int tutorial;
    private int tBack;
    private int iVel;
    private int iNivel = 1;
    public Background(int iPos, int x, int y, int iFondo){
        iNivel = 1;
        tBack = iFondo;
        if(tBack == 0){
            setImage(menu);
        }
        if(tBack == 1){                     
            iNum = iPos;
            x1 = x;
            y1 = y;  
            iVel = 1;
        } 
        if(tBack == 2){
            cargaImagenesTutorial();
        }
    }

    public void act() 
    {
        if(tBack == 0){
            setLocation(this.getX()-iVel,this.getY());
            if(getX() == -400){       
                this.returnPos();
            }
        }
        if(tBack == 2){
            Tutorial();
        }   
    }  

    public void returnPos(){
        setLocation(950,200);
    }

    public void cargaImagenesTutorial(){
        tutorial1 = new GreenfootImage("Tutorial1.png");
        tutorial2 = new GreenfootImage("Tutorial2.jpg");
        tutorial3 = new GreenfootImage("Tutorial3.jpg");      
    }

    public void sigTutorial(){
        if(tutorial != 400){
            tutorial++;
        }
        if(tutorial == 400){
            World aux = getWorld(); 
            ((Menu)aux).quitaTutorial();
        }
    }

    public void Tutorial(){
        if(tutorial == 0){
            setImage(tutorial1);
        }
        if(tutorial == 200){
            setImage(tutorial2);
        }
        if(tutorial == 400){
            setImage(tutorial3);
        } 
        sigTutorial();
    }

}