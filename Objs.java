import greenfoot.*;
/**
 * Write a description of class Objs here.
 * 
 * @author Dominique
 * @version v1.0
 */
public class Objs extends Actor
{
    public void act()
    {
        
    }
    
    void fall(){
        setLocation(getX(),getY()+4);
        if(getY() >= 395){
            setLocation(Greenfoot.getRandomNumber(600),0);
        }
    }
}
