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
        movement();
      //  hitBread();
        // Add your action code here.
    }    
    
  /*  public void hitBread()
    {
        if (getWorld() != null)
        {
            Actor bread = getOneObjectAtOffset(0, 0 , bread.class);
            if (bread != null)
            {
                toastland toastWorld = (toastland) getWorld(); 
                Score scoreCounter = toastland.getScoreCounter();
                scoreCounter.add(5);
                getWorld().removeObject(enemy);
                getWorld().removeObject(this);
            }
        }
    }*/
    
    public void movement()
    {
           
        if (Greenfoot.isKeyDown("right"))
        {
            turn(5);
        }
        if (Greenfoot.isKeyDown("left"))
        {   
            turn(-5);
        }
        //Move fowards
        if(Greenfoot.isKeyDown("up"))
        {
            move(2);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            move(-2);
        }
    }
}
