import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugar here.
 * 
 * @author (Daniel) 
 * Creditos Caracteres Larousse.
 */
public class Jugar extends Icono
{
    private GreenfootSound soundBoton = new GreenfootSound("Sound1.wav");
    public void act() 
    {                        
        if(Greenfoot.mouseClicked(this))
        {
            //this.sonidoBoton();
            soundBoton.play();
            World aux=getWorld();            
            ((Menu)aux).iniciarJuego();
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
