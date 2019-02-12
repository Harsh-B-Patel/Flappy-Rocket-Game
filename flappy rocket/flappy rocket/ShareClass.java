import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A class which acts as sub class of actor
 * has all the actor classes as subclesses
 * 
 * @author Harsh
 * @version 3.1.0
 */
public class ShareClass extends Actor
{
    public int GroundSpeed;
    /**
     * This method sets the location of the ground.
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void GroundAct() 
    {
        // Add your action code here.
        setLocation(getX() - this.GroundSpeed, getY());
        
    }    
}
