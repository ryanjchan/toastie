import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class toastie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class toastie extends Actor
{
    /**
     * Act - do whatever the toastie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement(4);
        hitEnemy();
        hitBread();
        
    }    
    
     public void hitEnemy()
    {
        if (getWorld() != null)
        {
            Actor a = getOneIntersectingObject(enemy.class);  
                 
            if(a != null) 
            {  
                Greenfoot.stop();
            }                        
        }
    }
    public void hitBread()
    {
        if (getWorld() != null)
        {
            Actor a = getOneIntersectingObject(bread.class);  
                 
            if(a != null) 
            {  
                getWorld().removeObject(a);
                toastland toastWorld = (toastland) getWorld(); 
                toastWorld.incrementScore();
            }                        
        }
    }
    public void hitWall()
    {
        Actor wall = getOneIntersectingObject(obstacle.class);
        if (wall !=null )
        {
            World background = getWorld();
            Greenfoot.stop();
        }
    }
    
    public void move(int xVel, int yVel)
    {
        Actor wall = getOneIntersectingObject(obstacle.class);
        if (wall !=null )
        {
            setLocation(getX(), getY());
        } else {
            setLocation(getX() + xVel, getY() + yVel);
        }
        
        
    }
    
    public void movement(int scale)
    {   
        if (Greenfoot.isKeyDown("right"))
        {
            move(scale, 0);
        }
        if (Greenfoot.isKeyDown("left"))
        {   
            move(-scale, 0);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            move(0, -scale);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            move(0, scale);
        }
    }
}
