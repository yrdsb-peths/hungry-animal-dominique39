import greenfoot.*;
/**
 * Write a description of class GrnApple here.
 * 
 * @author Dominique
 * @version v1.0
 */
public class GrnApple extends Apple
{
    public GrnApple(){
        super();
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
            world.addscore();
            setLocation(Greenfoot.getRandomNumber(600),0);
        }
    }

}
