import greenfoot.*;

public class GrnApple extends Apple
{
    public GrnApple(){
        super();
    }

    public void act()
    {
        if(Game.running == true){
            fall();
            eaten();
        }
    }

    private void eaten(){
        if(isTouching(Elephant.class)){
            Game world = (Game) getWorld();
            world.addscore();
            world.addscore();
            setLocation(Greenfoot.getRandomNumber(600),0);
        }
    }

}
