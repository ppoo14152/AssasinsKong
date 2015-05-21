import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Creditos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creditos extends Icono
{
    /**
     * Act - do whatever the Creditos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int iTipo;
    public Creditos cAux;
    private GreenfootImage creditos = new GreenfootImage("Creditos.jpg");
    public Creditos(int tip){
        desaparece=0;
        if(tip == 1){
            this.getImage().scale(150,50);
        }

        if(tip == 2){
            iTipo=tip;
            setImage(creditos);
        }
    }

    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            this.sonidoBoton();
            this.getImage().scale(150+10,50+10);
            cAux = new Creditos(2);
            getWorld().addObject(cAux,320,(getWorld().getHeight()/2));
            getWorld().addObject(new Siguiente(2,cAux),521,100);
        }
        else{
            if(iTipo == 1){
                this.getImage().scale(150,50);
            }
        }
    }    
}

