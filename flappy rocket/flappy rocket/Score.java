import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
import greenfoot.Font;
import java.io.*;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    public int scoreGained = 0;
    public static int hscore = 0;
    
    public Score() throws java.io.FileNotFoundException, java.io.IOException{
        GreenfootImage scoreImage = new GreenfootImage(68, 30);
        setImage(scoreImage);
        
        PrintWriter writer = new PrintWriter("highscores.txt");
        String name = Greenfoot.ask("your name");
        writer.println(name);
        writer.println(" your previous score was " + hscore);
        writer.close();
        hscore=0;
        
    }
    
    
    public void setScore (int SessionScore) 
    {
        hscore = hscore + SessionScore;
        scoreGained = scoreGained + SessionScore;
        GreenfootImage scoreImage =getImage();
        scoreImage.clear();
        
        
        
        Color c = new Color(127,127,127,127);
        scoreImage.setColor(c);
        scoreImage.fill();
        
        Font f = new Font ("impact", 32);
        scoreImage.setFont(f);
        scoreImage.setColor(Color.BLACK);
        scoreImage.drawString("" + scoreGained,0,30);
        scoreImage.setColor(Color.WHITE);
        scoreImage.drawString(""+ scoreGained ,0,30);
        setImage(scoreImage);
        
        
    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public int getScore()
    {
       
        return scoreGained;
    }
    
   
    
    
    





}

