import greenfoot.*;
/**
 * Write a description of class Falling_Objs here.
 * 
 * @author Dominique
 * @version v1.0
 */
public class Falling_Objs extends Actor
{
    public void act()
    {

    }

    void fall(){
        setLocation(getX(),getY()+4);
        if(getY() >= 795){
            setLocation(Greenfoot.getRandomNumber(1200),0);

        }
    }
}
