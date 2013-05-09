import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color; 

/**
 * Write a description of class obstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obstacle extends Actor
{
    /**
     * Act - do whatever the obstacle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void obstacle()
    {
        GreenfootImage image;  
        image = new GreenfootImage(20, 20);  
        image.setColor(Color.RED);  
        image.fillRect(0, 0, image.getWidth(), image.getHeight());  
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    

    
}
