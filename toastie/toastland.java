import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class toastland here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class toastland extends World
{
    life life1 = new life();
    life life2 = new life();
    life life3  = new life();
    score score = new score();
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
    
    public void incrementScore()
    {
            score.add(10);
    }
    
    private void populate()
    {
       
        addObject(new bread(), 321, 544);
        addObject(new bread(), 300, 300);
        
        addObject(life1, 60, 43);
        addObject(life2, 120, 43);
        addObject(life3,180, 43);
        
        addObject(new toastie(),299,442);

        addObject(new obstacle(), 300, 300);
        
        addObject(score,318 ,43);
   
    }
}
