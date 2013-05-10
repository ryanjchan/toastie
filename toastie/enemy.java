import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends Actor
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
  
    
      
        
        
      public void hitObstacle()
    {
        if (getWorld() != null)
        {
            Actor a = getOneIntersectingObject(obstacle.class);  
                 
            if(a != null) 
            {  
                turn(180);
                move(5);
           
            }                        
        }
    }
    
    public void incrementSpeed(int increment)
    {
        speed=increment;
    }
    public void movement()
    {
        int num = Greenfoot.getRandomNumber(200);
        if(num == 1)
        {
            
            turn(90);
        } else if(num == 199){
            turn(270);
        }
        if(edge())
        {
            turn(180);
            move(5);
        }
        
    }
    
    public boolean edge()
    {
        if(getX() < 10 || getX() > getWorld().getWidth() - 35)  
            return true;  
        if(getY() < 10 || getY() > getWorld().getHeight() - 35)  
            return true;  
        else  
            return false;
    }
}


