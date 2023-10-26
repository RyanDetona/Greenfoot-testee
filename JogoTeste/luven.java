import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class luven here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class luven extends World
{
    public int temp=10;
    public int temp1=10;
    /**
     * Constructor for objects of class luven.
     * 
     */
    public luven()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }
    public void act(){
        if(Greenfoot.isKeyDown("enter")){
        setBackground(new GreenfootImage("tela6.png"));
  
    }
    }
}
