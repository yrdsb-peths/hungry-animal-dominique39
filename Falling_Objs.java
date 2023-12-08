import greenfoot.*;

public class Falling_Objs extends Actor
{
    public Falling_Objs(){
        if(Title.demo == false){
            getImage().rotate(Greenfoot.getRandomNumber(360));
        }
    }

    void fall(){
        setLocation(getX(),getY()+4);
        if(getY() >= 795){
            setLocation(Greenfoot.getRandomNumber(1200),0);
            getImage().rotate(Greenfoot.getRandomNumber(360));
        }
    }
}