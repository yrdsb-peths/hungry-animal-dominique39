import greenfoot.*;

public class Falling_Objs extends Actor
{
    void fall(){
        setLocation(getX(),getY()+4);
        if(getY() >= 795){
            setLocation(Greenfoot.getRandomNumber(1200),0);
        }
    }
}