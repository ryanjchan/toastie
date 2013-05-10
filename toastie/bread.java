import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bagels here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bread extends Actor
{
    /**
     * Act - do whatever the bagels wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int speed = 6;
    
    public bread()
    {
            speed = 5;
    }
    public bread(int speed)
    {
        this.speed = speed;
    }
    public void act() 
    {
        hitObstacle();
        movement();
        move(speed);
        
        
        
        
        // Add your action code here.
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
