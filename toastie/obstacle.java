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
    int width = 50;
    int height = 200;
    
    public void obstacle(int width, int height)
    {
        width = width;
        height = height;
    }
    public void act() 
    {
        GreenfootImage image;
        image = new GreenfootImage(width, height);  
        image.setColor(Color.BLUE);  
        image.fillRect(0, 0, image.getWidth(), image.getHeight());  
        this.setImage(image);
    }    

    
}
