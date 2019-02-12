import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * this class is the clss that makes the rocket.
 * here it defines its controls, its reactions to obstructions, and how it moves/works
 * 
 * @author (harsh) 
 * @version (3.1.0)
 */
public class Rocket extends ShareClass
{
    private double Velocity = 0;
    private static final double GravityFactor = 0.5;
    private static final double Jump = -7 ;
   
    /**
     * the method Movement is used to define how the rocket would move
     */
    private void Movement()
    {
        if ( Greenfoot.isKeyDown("space") == true || Greenfoot.mouseClicked(null) == 
        true) 
        {
            Velocity = Jump; // velocity is jump height
        }
    }

    
    /**
     * applies gravity to rocket to allow it to fall
     */
    public void GravityFactorApplier()
    {
        setLocation(getX(), (int)(getY() + Velocity)); // gerts currnt velocity
        Velocity = Velocity + GravityFactor; // adds gravity factor (this makes the rocket go down)
    }

    
   /**
    * Act - do whatever the rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * this method will execute act for rocket.
    */
    public void act() 
    {
        // runs various methods from this class
        GravityFactorApplier();
        Movement();
        Rotation();
        ChecksCollision();
    }  
    

    /**
     * this method will rotate the rocket according to its speed.
     */
    private void Rotation ()
    {
        if ( Velocity < 1 )
        {
            setRotation(-40);
        }
        else if ( Velocity < 8 )
        {
            setRotation(0);
        }
        else if ( Velocity < 12 )
        {
            setRotation(40);
        }
        else if ( Velocity < 30)
        {
            setRotation(90);
        }
    }
    
    /**
     * this method will check if collison takes place with ground and pipe 
     */
    public void ChecksCollision()
    {
        // clling methods from ground and pipe classes 
        Actor Ground = getOneIntersectingObject(Ground.class); 
        Actor Pipe = getOneIntersectingObject(Pipe.class);
        if (Pipe !=null || Ground != null)
        {
            if  (Ground != null){
            setLocation(getX(), 332); // didnt collide
        }
            Greenfoot.stop(); // collides
        }
    }

}