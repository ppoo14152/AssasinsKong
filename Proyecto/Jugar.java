import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugar extends Icono
{
    /**
     * Act - do whatever the Jugar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {                        
        if(Greenfoot.mouseClicked(this))
        {
            this.sonidoBoton();
            desaparece = 1; 
            World aux=getWorld();            
            ((Menu)aux).iniciarJuego();
            //Greenfoot.setWorld(new StickmanWorld());
        }
        if(desaparece==1)
        {
            desapareceBotonPlay();
        }
        mouseSobreBoton();
    }

    public Jugar()
    {         
        this.getImage().scale(150,50);
        desaparece=0;
    }

    public void desaparece()
    {
        desaparece=1;
    }
}
