import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground extends ShareClass
{
    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * this method will execute act for ground.
     */
    public void act() 
    {
       this.GroundAct(); 
       
       // calling method 
       LoopGround();
    }



    /**
     * makes a contructor called Ground.
     */
    
    public Ground()
    {
        this.GroundSpeed = 5; 
    }


    /**
     * Looping of the image of ground
     *
     */
    public void LoopGround()
    {
        if (getX() < - getImage().getWidth() / 2)
        {
            getWorld().removeObject(this); // to loop ground
        }

}
}
