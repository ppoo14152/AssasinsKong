import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends Icono
{
    /**
     * Act - do whatever the Tutorial wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //mueve();                         
        if(Greenfoot.mouseClicked(this))
        { 
            World aux = getWorld();
            ((Menu)aux).iniciaTutorial();
            desaparece=1;
            this.sonidoBoton();
        }
        if(desaparece==1){ desapareceBotonTutorial();}
        mouseSobreBoton();
    }    
    public Tutorial()
    { 
       this.getImage().scale(150,50);
       desaparece = 0;
    }
    public void desaparece(){
        desaparece = 1;
    }
}
