import greenfoot.*;

public class Title extends World
{
    public static boolean demo;
    Label textLabel;
    Label instructionLabel;
    Elephant character;
    Apple food;

    public Title()
    {   super(1200, 800, 1, true);
        demo = true;

        textLabel = new Label("Hungry Animal", 120);
        textLabel.setFillColor(Color.RED);
        addObject(textLabel, 600, 200);

        instructionLabel = new Label("Press space to Start", 30);
        instructionLabel.setFillColor(Color.ORANGE);
        instructionLabel.setLineColor(Color.YELLOW);
        addObject(instructionLabel, 600, 600);
        
        character = new Elephant();
        addObject(character, 200, 500);
        
        food = new Apple();
        addObject(food, 900, 500);
        
        GreenfootImage bg = new GreenfootImage("bg/Ocean_4/5.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
    }

    public void act(){
        if(Greenfoot.isKeyDown("space")){
            toGame();
        }
    }

    public void toGame(){
        textLabel = null;
        instructionLabel = null;
        character = null;
        food = null;

        Game world = new Game();
        Greenfoot.setWorld(world);
        Game.running = true;
        demo = false;
    }
}
