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
    Elephant elephant = new Elephant();
    
    public MyWorld(){    
        super(600, 400, 1, true);
        Apple.clearApples();
        Apple apple = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        GrnApple gapple = new GrnApple();
        Bomb bomb = new Bomb();
        Mushroom mushroom = new Mushroom();
        
        addObject(mushroom, 300, 0);
        addObject(elephant,300,300);
        for(int i = 0; i < Apple.getNum();i++){
            addObject(Apple.getApple(i),Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(150));
        }
        
    }
    
    public void addscore(){
        score++;
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
