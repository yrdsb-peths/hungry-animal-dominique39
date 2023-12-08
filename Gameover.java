import greenfoot.*;
import java.util.*;

public class Gameover extends World
{
    private Label textLabel;
    private Label scoreLabel;
    private Label instructionLabel;
    
    private List<Actor> allObjects;
    
    public Gameover(World prevWorld, int score)
    {
        super(1200, 800, 1, true);
        createBg(prevWorld);
        
        textLabel = new Label("Game Over!", 100);
        textLabel.setFillColor(Color.RED);
        addObject(textLabel, getWidth()/2, getHeight()/2-100);
        
        scoreLabel = new Label("Your score is "+score, 60);
        scoreLabel.setFillColor(Color.RED);
        addObject(scoreLabel, getWidth()/2, getHeight()/2+50);
        
        instructionLabel = new Label("Press space to restart", 30);
        instructionLabel.setFillColor(Color.ORANGE);
        instructionLabel.setLineColor(Color.YELLOW);
        addObject(instructionLabel, getWidth()/2, getHeight()/2+200);
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("space")){
            backToTitle();
        }
    }   
    
    public void createBg(World prevWorld){
        setBackground(prevWorld.getBackground());
        for(int x = 0; x < prevWorld.getWidth(); x++){
            for(int y = 0; y < prevWorld.getHeight(); y++){
                if(allObjects != null){
                    allObjects.clear();
                }
                
                allObjects = prevWorld.getObjectsAt(x,y,null);
                for(int n = 0; n < allObjects.size(); n++){
                    addObject(allObjects.get(n),x+50,y+50);
                }
            }
        }
    }
    
    public void backToTitle(){        
        textLabel = null;
        scoreLabel = null;
        instructionLabel = null;
        allObjects = null;
        
        Game world = new Game();
        Greenfoot.setWorld(world);
    }
}
