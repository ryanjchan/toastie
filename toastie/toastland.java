import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class toastland here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class toastland extends World
{
    
    Score score = new Score();
    private int breadCount = 5;
    private int level = 4;
    private int random = 4;
    private int lives = 3;
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
        if(score.getScore() == 1000)
        {
             addObject(new enemy(),  Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(500));
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
       
        addObject(new bread(), 20, Greenfoot.getRandomNumber(500));
       addObject(new bread(), 20, Greenfoot.getRandomNumber(500));
             addObject(new bread(), 20, Greenfoot.getRandomNumber(500));
                addObject(new bread(), 20, Greenfoot.getRandomNumber(500));
                  addObject(new bread(), 20, Greenfoot.getRandomNumber(500));
        addObject(new enemy(),  Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(500));
          
        
            
        
        
        addObject(new toastie(),299,442);

        addObject(new obstacle(), 300, 300);
        
        addObject(score,430 ,43);
   
    }
}
