import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Icono extends Actor
{
    /**
     * Act - do whatever the Buttons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int iNum;
    protected int desaparece;
    private GreenfootSound soundBoton;
    public void act() 
    {
        iNum = 0;
        soundBoton = new GreenfootSound("Sound1.wav");
    }
    
    public void mouseSobreBoton(){
        if(Greenfoot.mouseMoved(this)){
            this.getImage().scale(160,60);
        }
        else{
            this.getImage().scale(150,50);
        }      
    }
    
    public void desapareceBotonPlay(){
        iNum++;
        turn(10);   
        if(iNum == 36){ 
            World aux = getWorld();
            ((Menu)aux).desapareceTutorial();
            iNum = 0;
            getWorld().removeObject(this);
        }   
        
        desapareceBotonRecords();
        desapareceBotonTutorial();
    }
    
    public void desapareceBotonTutorial(){
        iNum++;
        turn(10);   
        if(iNum == 36){ 
            World aux = getWorld();
            ((Menu)aux).desapareceRecords();
            iNum = 0;
            getWorld().removeObject(this);
        }    
    }
    
    public void desapareceBotonRecords(){
        iNum++;
        turn(10);   
        if(iNum == 36){ 
            World aux = getWorld();
            ((Menu)aux).desapareceRecords();
            iNum = 0;
            getWorld().removeObject(this);
        }    
    }
    
    public void sonidoBoton()
    {        
      //soundBoton.play();
    }
    
}
