import greenfoot.*;

public class Mushroom extends Falling_Objs
{
    private boolean mushroomBoost = false;
    private int mushroomBoostTime = 0;

    public void act()
    {
        if(Game.running == true){
            eaten();
            boostTimeCountdown();
            fall();
        }
    }

    void fall(){
        setLocation(getX(),getY()+4);
        if(getY() >= 795){
            World world = (Game) getWorld();
            world.removeObject(this);
        }
    }

    private void eaten(){
        if(isTouching(Elephant.class)){
            mushroomBoost = true;
            mushroomBoostTime = 1000*15;
        }
    }

    private void boostTimeCountdown() {
        if(mushroomBoost == true){
            mushroomBoostTime--;
            Game world = (Game) getWorld();
            world.attractObjs();
            if(mushroomBoostTime <= 0){
                mushroomBoost = false;
            }
        }
    }
}
