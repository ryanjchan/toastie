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
    public void act() 
    {
        movement();
        move(3);
        
        
        
        // Add your action code here.
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
