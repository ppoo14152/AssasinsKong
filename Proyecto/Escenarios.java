import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escenarios here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escenarios extends Actor
{
    public GreenfootImage[] escenario = new GreenfootImage[5];
    private int iTipo;
    public Escenarios(int iTipoVecindad){
        escenario[0] = new GreenfootImage("Cenario-01.bmp");
        escenario[1] = new GreenfootImage("Cenario-02.bmp");
        escenario[2] = new GreenfootImage("Cenario-03.bmp");
        escenario[3] = new GreenfootImage("Cenario-04.bmp");
        escenario[4] = new GreenfootImage("Cenario-05.bmp");
        iTipo = iTipoVecindad;
        setImage( escenario[iTipo] );
    }  
}
