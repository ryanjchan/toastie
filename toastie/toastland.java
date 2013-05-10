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
    private int breadCount = 5;
    private int level = 4;
    private int random = 4;
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
    
      public void act() 
    {
        if(score.getScore() == 100)
        {
            level=6;
        }
         if(score.getScore() == 200)
        {
            level=8;
        }
         if(score.getScore() == 500)
        {
            level=10;
        }
        
        random = Greenfoot.getRandomNumber(level);
        random += 4;
        
        if((score.getScore() > 0 && breadCount <= 5))/* && Greenfoot.getRandomNumber(130) < 3)*/ {
            addObject(new bread(random), Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(500));
            breadCount++;
        }
    }

    
    public void incrementScore()
    {
            score.add(10);
            breadCount--;
    }
    
    private void populate()
    {
       
        addObject(new bread(), Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(500));
        addObject(new bread(), Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(500));
        addObject(new bread(), Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(500));
        addObject(new bread(), Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(500));
        addObject(new bread(), Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(500));
        addObject(new enemy(),  Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(500));
          
        
        addObject(life1, 60, 43);
        addObject(life2, 120, 43);
        addObject(life3,180, 43);
        
        addObject(new toastie(),299,442);

        addObject(new obstacle(), 600, 300);
        addObject(new obstacle(), 200, 300);
        
        addObject(score,318 ,43);
   
    }
}
