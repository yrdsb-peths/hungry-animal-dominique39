import greenfoot.*;
import java.util.*;

public class Game extends World
{
    public static boolean running;
    
    private GreenfootImage bg;
    private Label scoreLabel;
    private Mushroom mushroom = new Mushroom();
    private Elephant character = new Elephant();
    
    private Apple[] apples = new Apple[8];
    private GrnApple[] gapples = new GrnApple[2];
    private ArrayList<Bomb> bombs = new ArrayList(0);

    private int score = 0;
    private int ms = 0;

    public Game(){    
        super(1200, 800, 1, true);

        addObject(character,600,720);
        for(int i = 0; i < apples.length;i++){
            apples[i] = new Apple();
            addObject(apples[i],Greenfoot.getRandomNumber(1200),Greenfoot.getRandomNumber(500));
        }

        for(int i = 0; i < gapples.length;i++){
            gapples[i] = new GrnApple();
            addObject(gapples[i],Greenfoot.getRandomNumber(1200),Greenfoot.getRandomNumber(500));
        }

        //background image
        bg = new GreenfootImage("bg/Ocean_4/5.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);

        //score label
        scoreLabel = new Label("Score: " + score, 50);
        scoreLabel.setFillColor(Color.WHITE);
        addObject(scoreLabel, 100, 50);
    }

    public void act(){
        if(Game.running = true){
            ms++;
            if(ms == 60*15){
                bombs.add(new Bomb());
                addObject(bombs.get(bombs.size()-1), Greenfoot.getRandomNumber(1200), 0);
            }
            if(ms >= 60*30){
                addObject(mushroom, Greenfoot.getRandomNumber(1200), 0);
                ms = 0;
            }
        }
    }

    public void addscore(){
        score++;
        scoreLabel.setValue("Score: " + score);
    }

    public void attractObjs(){
        for(int i = 0; i < apples.length;i++){
            int tempX = apples[i].getX();
            int tempY = apples[i].getY();
            
            int characterX = character.getX();
            int characterY = character.getY();
            if(tempX - characterX < 100 && tempX - characterX > -1){
                apples[i].setLocation(tempX-3,tempY+7);
            }

            if(characterX - tempX < 100 && characterX - tempX > -1){
                apples[i].setLocation(tempX+3,tempY+7);
            }
        }
    }

    public void gameover(){
        Game.running = false;
        
        bg = null;
        scoreLabel = null;
        character = null;
        mushroom = null;
        apples = null;
        gapples = null;
        bombs = null;
        
        
        Gameover toworld = new Gameover(this, score);
        Greenfoot.setWorld(toworld);
    }
}
