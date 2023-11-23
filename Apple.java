import greenfoot.*;
/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    public void act()
    {
        if(getY()==400){
            setLocation(Greenfoot.getRandomNumber(600),0);
        }
    }
}
