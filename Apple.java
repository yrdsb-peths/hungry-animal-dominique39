import greenfoot.*;
import java.util.*;

public class Apple extends Falling_Objs
{
    public void act()
    {
        if(Game.running == true){
            eaten();
            fall();
        }
    }

    private void eaten(){
        if(isTouching(Elephant.class)){
            Game world = (Game) getWorld();
            world.addscore();
            setLocation(Greenfoot.getRandomNumber(600),0);
        }
    }
}
