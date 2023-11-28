import greenfoot.*;
import java.util.*;

/**
 * Write a description of class Apple here.
 * 
 * @author Dominique
 * @version v1.0
 */
public class Apple extends Falling_Objs
{
    static List<Actor> appleList = new ArrayList<Actor>();

    public Apple(){
        appleList.add(this);
    }

    public static Actor getApple(int element){
        return appleList.get(element);
    }

    public static void clearApples(){
        appleList.clear();
    }

    public static int getNum(){
        return appleList.size();
    }

    public void act()
    {
        fall();
        eaten();
    }

    private void eaten(){
        if(isTouching(Elephant.class)){
            MyWorld world = (MyWorld) getWorld();
            world.addscore();
            setLocation(Greenfoot.getRandomNumber(600),0);
        }
    }
}
