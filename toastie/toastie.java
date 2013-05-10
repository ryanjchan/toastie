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
    int lastX = 0;
    int lastY = 0;
    String vector = "";
    
    public void toastie() {
        lastX = getX();
        lastY = getY();
    }
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

    
    public void move(int xVel, int yVel, String direction)
    {
        Actor wall = getOneIntersectingObject(obstacle.class);
        
        int currentX  = getX();
        int currentY  = getY();
        int newX = currentX  + xVel;
        int newY = currentY  + yVel;
        if (wall !=null )
        {
            if (vector == "right") {
                if (newX > currentX) {
                    setLocation(currentX, newY);
                } else {
                    setLocation(newX, newY);
                }
            }
            if (vector == "left") {
                if (newX < currentX) {
                    setLocation(currentX, newY);
                } else {
                    setLocation(newX, newY);
                }
            }
            if (vector == "up") {
                if (newY < currentY) {
                    setLocation(newX, currentY);
                } else {
                    setLocation(newX, newY);
                }
            }
             if (vector == "down") {
                if (newY > currentY) {
                    setLocation(newX, currentY);
                } else {
                    setLocation(newX, newY);
                }
            }
            
        } else {            
            setLocation(getX() + xVel, getY() + yVel);
            if(direction.length() != 0) {
                vector = direction;
            }
        
        }
        
        
    }
    
    public void movement(int scale)
    {   
        String direction = "";
        int x = 0;
        int y = 0;
        if (Greenfoot.isKeyDown("right"))
        {
            direction = "right";
            x = scale;            
        }
        if (Greenfoot.isKeyDown("left"))
        {   
            direction = "left";
            x = -scale;
        }
        if(Greenfoot.isKeyDown("up"))
        {
            direction = "up";
            y = -scale;
        }
        if(Greenfoot.isKeyDown("down"))
        {
            direction = "down";
            y = scale;
        }
        //System.out.println("last: " + lastX  + ", " + lastY);
        //System.out.println("vector: " + vector);
        //System.out.println("direction: " + direction);        
        move(x, y, direction);        
    }
}
