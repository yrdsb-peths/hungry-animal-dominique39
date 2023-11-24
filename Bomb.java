import greenfoot.*;
/**
 * Write a description of class Bomb here.
 * 
 * @author Dominique
 * @version v1.0
 */
public class Bomb extends Objs
{
    public void act()
    {
        boom();
        fall();
        
    }
    
    private void boom(){
        if(isTouching(Elephant.class)){
            MyWorld world = (MyWorld) getWorld();
            world.gameover = true;
        }
    }
    
    void fall(){
        setLocation(getX(),getY()+4);
    }
}
