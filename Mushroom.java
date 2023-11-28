import greenfoot.*;
/**
 * Write a description of class Mushroom here.
 * 
 * @author Dominique
 * @version v1.0
 */
public class Mushroom extends Falling_Objs
{
    /*private boolean mushroomBoost = false;
    private int mushroomBoostTime = 0;

    public void act()
    {
        fall();
        eaten();
        boostTimeCountdown();
    }

    void fall(){
        setLocation(getX(),getY()+4);
        if(getY() >= 795){
            MyWorld world = (MyWorld) getWorld();
            world.removeMushroom();
        }
    }

    private void eaten(){
        if(isTouching(Elephant.class)){
            MyWorld world = (MyWorld) getWorld();
            world.removeMushroom();
            mushroomBoost = true;
            mushroomBoostTime = 1000*15;
            world.attractObjs();
        }
    }

    private void boostTimeCountdown() {
        if(mushroomBoost == true){
            mushroomBoostTime--;
            if(mushroomBoostTime <= 0){
                mushroomBoost = false;
            }
        }
    }*/
}
