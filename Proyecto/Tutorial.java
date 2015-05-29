import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (Daniel) 
 * Creditos para caracteres Larouss
 */
public class Tutorial extends Icono
{
    private GreenfootSound soundBoton = new GreenfootSound("Sound1.wav");
    public void act() 
    {                       
        if(Greenfoot.mouseClicked(this))
        { 
            World aux = getWorld();
            ((Menu)aux).iniciaTutorial();
            soundBoton.play();
        } 
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
