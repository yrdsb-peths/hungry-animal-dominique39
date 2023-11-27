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
    public int score = 0;
    public boolean gameover = false;
    
    Bg background = new Bg();
    Elephant elephant = new Elephant();
    Bomb bomb = new Bomb();
    Mushroom mushroom = new Mushroom();
    
    public MyWorld(){    
        super(600, 400, 1, true);
        Apple.clearApples();
        Apple apple = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        GrnApple gapple = new GrnApple();
        
        addObject(elephant,300,355);
        for(int i = 0; i < Apple.getNum();i++){
            addObject(Apple.getApple(i),Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(150));
        }
        
        //background image
        GreenfootImage bg = new GreenfootImage("bg/Ocean_4/5.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        //score label
        showText("Score: "+score, 300, 20);
    }
    
    public void addscore(){
        score++;
        showText("Score: "+score, 300, 20);
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
}
