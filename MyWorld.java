import greenfoot.*;
import java.util.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author Dominique
 * @version v1.0
 */
public class MyWorld extends World
{
    private int score = 0;

    Bomb bomb = new Bomb();
    Elephant elephant = new Elephant();
    Mushroom mushroom = new Mushroom();
    private SimpleTimer bombtimer = new SimpleTimer();
    private SimpleTimer mushtimer = new SimpleTimer();

    public MyWorld(){    
        super(1200, 800, 1, true);
        Apple.clearApples();
        Apple apple = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        Apple apple7 = new Apple();
        Apple apple8 = new Apple();
        GrnApple gapple = new GrnApple();
        GrnApple gapple2 = new GrnApple();
        bombtimer.mark();
        mushtimer.mark();

        addObject(elephant,600,720);
        for(int i = 0; i < Apple.getNum();i++){
            addObject(Apple.getApple(i),Greenfoot.getRandomNumber(1200),Greenfoot.getRandomNumber(500));
        }

        //background image
        Bg background = new Bg();
        GreenfootImage bg = new GreenfootImage("bg/Ocean_4/5.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);

        //score label
        showText("Score: 0", 600, 20);
    }

    public void act(){
        if(bombtimer.millisElapsed() > 1000*15){
            addObject(bomb, Greenfoot.getRandomNumber(1200),0);
            bombtimer.mark();
        }

        if(mushtimer.millisElapsed() > 1000*30){
            addObject(mushroom, Greenfoot.getRandomNumber(1200),0);
            mushtimer.mark();
        }
    }

    public void addscore(){
        score++;
        showText("Score: "+score, 600, 20);
    }

    public void attractObjs(){
        for(int i = 0; i < Apple.getNum();i++){
            Actor temp = Apple.getApple(i);
            if(temp.getX() - elephant.getX() < 100 && temp.getX() - elephant.getX() > -1){
                temp.setLocation(temp.getX()-3,temp.getY()+7);
            }

            if(elephant.getX() - temp.getX() < 100 && elephant.getX() - temp.getX() > -1){
                temp.setLocation(temp.getX()+3,temp.getY()+7);
            }
        }
    }
    
    public void removeMushroom(){
        removeObject(mushroom);
    }

    public void gameOver(){

    }
}
