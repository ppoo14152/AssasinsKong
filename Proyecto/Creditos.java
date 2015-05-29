import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Creditos here.
 * 
 * @author (Daniel) 
 * @version (25/05/15)
 */
public class Creditos extends Icono
{
    private int iTipo;
    private Creditos cAux;
    private GreenfootImage creditos = new GreenfootImage("Creditos1.jpg");
    private GreenfootSound soundBoton = new GreenfootSound("Sound1.wav");
    public Creditos(int tip){
        desaparece = 0;
        iTipo = tip;
        
        if(tip == 1){
            this.getImage().scale(150,50);
        }

        if(tip == 2){
            setImage(creditos);
        }
    }

    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            soundBoton.play();
            this.getImage().scale(150+10,50+10);
            cAux = new Creditos(2);
            getWorld().addObject(cAux,510,(544/2));
            //getWorld().addObject(cAux,320,(getWorld().getHeight()/2));
            //(getWidth()/2),(getHeight()/2));
            getWorld().addObject(new Siguiente(2,cAux),871,300);
        }
        else{
            if(iTipo == 1){
                this.getImage().scale(150,50);
            }
        }
    }    
}

