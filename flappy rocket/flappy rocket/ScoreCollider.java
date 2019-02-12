import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;

public class ScoreCollider extends ShareClass
{
    GreenfootImage image = new GreenfootImage(10,400);
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public ScoreCollider()
    {
       this.GroundSpeed = 6;
       setImage(image);
    }

    /**
     * Act - do whatever the ScoreCollider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.GroundAct();
        checkCollision();
    } 
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public void checkCollision()
    {
        Actor Rocket = getOneIntersectingObject(Rocket.class);
        if(Rocket !=null)
        {
            Game level =(Game) getWorld();
            Score addPoints = level.getScore();
            addPoints.setScore(1);
            getWorld().removeObject(this);
            
        }
        else if (getX() <- getImage().getWidth()){
            getWorld().removeObject(this);
        }
    }
    
    

}
