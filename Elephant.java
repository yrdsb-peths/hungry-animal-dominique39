import greenfoot.*;
/**
 * Write a description of class elephant here.
 * 
 * @author Dominique
 * @version v1.0
 */
public class Elephant extends Actor
{
    MyWorld world = (MyWorld) getWorld();

    //animate
    GreenfootImage[] left = new GreenfootImage[8];
    GreenfootImage[] right = new GreenfootImage[8];
    private int imageIndex = 0;
    private int facing;

    //move
    private int moveVelocity = 4;

    private int boostTime = 0;

    public Elephant(){        
        //images initiation
        for(int i = 0; i < 8; i++){
            left[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            right[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            left[i].scale(100,100);
            right[i].scale(100,100);
            left[i].mirrorHorizontally();
        }
        setImage("images/elephant_idle/idle0.png");
    }

    public void act(){
        if(MyWorld.running = true){
            move();
            animate();
            mushroomBoost();
        }
    }

    private void move(){
        if(Greenfoot.isKeyDown("shift")){
            moveVelocity = 8;
        }else{
            moveVelocity = 4;
        }

        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")){
            move(-moveVelocity);
            facing = -1;
        }

        if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")){
            move(moveVelocity);
            facing = 1;
        }

        if(getX() <= 1){
            setLocation(1190, getY());
        }

        if(getX() >= 1199){
            setLocation(1, getY());
        }
    }

    private void animate(){
        imageIndex += 1;
        if(imageIndex>=70){
            imageIndex = 0;
        }

        if(facing < 0){
            setImage(left[imageIndex/10]);
        }else{
            setImage(right[imageIndex/10]);
        }
    }

    private void mushroomBoost(){
        if(isTouching(Mushroom.class)){
            removeTouching(Mushroom.class);
            boostTime = 900;
        }

        if(boostTime > 0){
            boostTime--;
            MyWorld world = (MyWorld) getWorld();
            world.attractObjs();
        }
    }
}
