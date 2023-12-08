import greenfoot.*;

public class Falling_Objs extends Actor
{
    public Falling_Objs() {
        getImage().rotate(Greenfoot.getRandomNumber(60) - 30);
    }
    
    void fall(){
        setLocation(getX(),getY()+4);
        if(getY() >= 795){
            setLocation(Greenfoot.getRandomNumber(1200),0);
        }
    }
}