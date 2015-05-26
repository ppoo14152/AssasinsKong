import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Siguiente here.
 * 
 * @author (DANIEL) 
 * @version (25/05/15)
 */
public class Siguiente extends Icono
{
    private int iTipo;
    private Actor act;
    public Siguiente(int tipo,Actor actor){
        iTipo = tipo;
        act = actor;
    } 

    public void act() 
    {
        if(iTipo == 1){
            this.getImage().scale(40,40);
            if(Greenfoot.mouseClicked(this))
            {
                this.sonidoBoton();
                this.getImage().scale(60,60);
                World aux=getWorld();
                ((Menu)aux).sigTutorial();                            
            }
        }
        if(iTipo == 2){
            if(Greenfoot.mouseClicked(this)){
                this.sonidoBoton();
                World aux=getWorld();
                ((Menu)aux).vuelveMenu();
                getWorld().removeObject(act);
                getWorld().removeObject(this);
            }
        }    
    }   
}
