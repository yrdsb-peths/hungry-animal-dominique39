import greenfoot.*;
/**
 * Write a description of class GrnApple here.
 * 
 * @author Dominique
 * @version v1.0
 */
public class Mushroom extends Objs
{
    public void act()
    {
        fall();
    }
    
    void fall(){
        setLocation(getX(),getY()+4);
    }
}
