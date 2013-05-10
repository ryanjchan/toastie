import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends bread
{
    private int speed = 2;
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     
        hitObstacle();
        eatBread();
        movement();
        move(speed);
        
    }    
       public void eatBread()
    {
        if (getWorld() != null)
        {
            Actor a = getOneIntersectingObject(bread.class);  
                 
            if(a != null) 
            {  
                getWorld().removeObject(a);
                toastland toastWorld = (toastland) getWorld(); 
                toastWorld.incrementScore();
                speed++;
            }                        
        }
    }
}
