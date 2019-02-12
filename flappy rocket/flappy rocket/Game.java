import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot)
import java.io.*;
/**
 * this is the main class of the pogram where everything is being called and run.
 * 
 * @author Harsh and Dhruv 
 * @version 3.1.0
 */
public class Game extends World
{
    private int PipeCounter;
    private Score scoreCounter =  new Score();
    /**
     * Constructor for objects of class Game.
     * 
     */
    public Game() throws java.io.FileNotFoundException, java.io.IOException

    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        Greenfoot.setSpeed(50 + Recursion(scoreCounter.getScore())); // speed increases with points
        
        setPaintOrder(Score.class, Ground.class,Rocket.class,Pipe.class);
        Rocket gamePlayer = new Rocket(); // clalling a class
        addObject(gamePlayer, 190 , getHeight() /2); // adding player(rocket) to the ground.
        
        Ground ground = new Ground(); // calling a class 
        addObject(ground, 309, getHeight()-25); // adding ground to screen
        
        addObject(scoreCounter, getWidth()/2+25,30); // making score counter
        scoreCounter.setScore(0); // initial score is zero
        
               
       

}
    /**
     *  Act - do whatever the game wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * this method will execute act for game.
     */
    public void act()
    {
        // calls method to be executed.
        CreateGround();
        CreatePipe();
    }
    
    /**
     * this method is used to create ground.
     * it also loops the image as it ends.
     *
     */
    private void CreateGround()
    {
        if (getObjects(Ground.class).size() < 2)
        {
          Ground loopingGround = new Ground();
          addObject(loopingGround, 955, getHeight() - 25);
    }
}


    
    /**
     * this method is used to create pipe.
     * it also loops both of the images as it ends.
     */
    public void CreatePipe()
    {
       ScoreCollider scoreCol=new ScoreCollider();
        
       // top and bottom pipes 
       Pipe topPipe = new Pipe("top");
       Pipe dowPipe = new Pipe("down");
       
       int PipeSpacing = 200;
       
       GreenfootImage Image = dowPipe.getImage();
       
       int numOfPipes = Greenfoot.getRandomNumber(10)+4;
       
       PipeCounter++;
       if (PipeCounter ==50){
           if(getObjects(Pipe.class).size()<numOfPipes){
            addObject(dowPipe, getWidth(), getHeight()/2 + Image.getHeight()- Greenfoot.getRandomNumber(100)-10);
            addObject(topPipe, getWidth(), dowPipe.getY() - Image.getHeight() -PipeSpacing);
            addObject(scoreCol, getWidth()+20, getHeight()/2);
        }
        PipeCounter=0;
        }
    }


    /**
     * this method gets the score of the game.
     */
    public Score getScore()
    {
        
        return scoreCounter;
    }
    
    
    /**
     * this method is responsible for recurssion
     * it takes in the score and returns an number sccording to fibinoci sequence.
     * @return a
     * @Param score
     */
    public int Recursion(int score)
{
    if (score < 2){
    return 1;
}
    else{
        
            int a = Recursion(score-2) + Recursion(score-1); // recursion
            return a;
            
        }
       


}}
