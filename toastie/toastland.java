import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class toastland here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class toastland extends World
{

    /**
     * Constructor for objects of class toastland.
     * 
     */
    public toastland()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        populate();
    }
    
    private void populate()
    {
       
        addObject(new bread(), 321, 544);
        addObject(new bread(), 300, 300);
        
        addObject(new life(), 60, 43);
        addObject(new life(), 120, 43);
        addObject(new life(),180, 43);
   
    }
}
