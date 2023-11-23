import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author Dominique
 * @version v1.0
 */
public class MyWorld extends World
{
    public MyWorld(){    
        super(600, 400, 1);

        Elephant elephant = new Elephant();
        addObject(elephant,300,300);
    }
}
