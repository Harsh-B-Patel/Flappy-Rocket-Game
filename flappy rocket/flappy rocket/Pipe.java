import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pipe extends ShareClass
{
    private static final GreenfootImage Down = new GreenfootImage("pipeup.png");
    private static final GreenfootImage Top = new GreenfootImage("pipedown.png");
    
    public Pipe(String Select){
        this.GroundSpeed=6;
        if(Select == "top"){
        setImage(Top);
        }
        else if (Select =="down"){
            setImage(Down);
        }
    }
    /**
     * Act - do whatever the Pipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.GroundAct();
        removePipe();
    }    
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public void removePipe()
    {
       if(getX() <- getImage().getWidth()){
           getWorld().removeObject(this);
        }
    }

}
