import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{

    private int score = 0;
    private String text;
    private int StringLength;
    
    public Score()
    {
        this("");
    }
   public Score(String prefix)
    {
        text = prefix;
        StringLength = (text.length() +2 ) *30;
       
        setImage(new GreenfootImage(StringLength, 24));
        GreenfootImage image = getImage();
        Font font = image.getFont();
        image.setFont(font.deriveFont(24.0F));  // use larger font
        
        updateImage();
    }
    public void act() 
    {
        // Add your action code here.
        updateImage();
    }    
    
     public void add(int num)
    {
        score+=num;
    }
      public int getScore()
    {
        return score;
    }
    private void updateImage()
    {
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + score, 1, 18);
    }
}
