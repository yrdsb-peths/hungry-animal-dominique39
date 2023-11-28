import greenfoot.*;
/**
 * Write a description of class Bomb here.
 * 
 * @author Dominique
 * @version v1.0
 */
public class Bomb extends Falling_Objs
{
    public void act()
    {
        if(MyWorld.running = true){
            boom();
            fall();
        }
    }

    private void boom(){
        if(isTouching(Elephant.class)){
            MyWorld world = (MyWorld) getWorld();
            world.gameover();
        }
    }
}
