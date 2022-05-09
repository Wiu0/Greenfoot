import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.Map;
import java.util.HashMap;
/**
 * Write a description of class SnakeHead here.
 * 
 * @author wiu
 * @version 202205
 */
public class SnakeHead extends Actor
{
    private static final int MAX_TIME_ON_BORDER;
    public static byte SPEED;
    private Key keyDown;
    private int maxTimeOnBorder;
    private SnakeUnit unit;
    private Map<String, Key> keys;

    static {
        MAX_TIME_ON_BORDER = 500;
    }
    
    public SnakeHead() {
        keyDown = new Key("D", "A", 0);
        keys = new HashMap<>();
        keys.put("w", new Key("w", "s", 270));
        keys.put("s", new Key("s", "w", 90));
        keys.put("d", new Key("d", "a", 0));
        keys.put("a", new Key("a", "d", 180));
        maxTimeOnBorder = MAX_TIME_ON_BORDER;
    }

    public void act()
    {
        //getWorld().showText("x: " + getX() + " y: " + getY(), 300, 50);
        addNewUnit();
        move(SPEED);
        detectTouching();
        shouldDoKeyDown();
        eatLife();
    }

    private void shouldDoKeyDown() {
        String keyPressed = Greenfoot.getKey();
        //getWorld().showText("key: " + keyPressed, 300, 200);
        if(keyPressed == null) return;

        if(!keyPressed.equalsIgnoreCase(keyDown.getAntiKey()) && !keyPressed.equalsIgnoreCase(keyDown.getKey())) {
            Key k = keys.get(keyPressed.toLowerCase());
            setRotation(k.getRotation());
            keyDown.setKeys(k.getKey(), k.getAntiKey(), k.getRotation());
            //getWorld().showText("Rotation point x: " + getX() + " y: " + getY(), 300, 350);
            moveUnit(getX(), getY(), getRotation());
        }

    }

    private void eatLife() {
        if(isTouching(SnakeLife.class)) {
            MyWorld mw = (MyWorld)getWorld();
            mw.removeLife();
            createNewUnit();
            //SPEED += 2;
        }
    }

    private void detectTouching() {
        List<SnakeUnit> units = getObjectsInRange(20, SnakeUnit.class);
        if(isAtEdge()) {
            maxTimeOnBorder--;
            getWorld().showText("Be careful " + maxTimeOnBorder, getWorld().getWidth()/2, getWorld().getHeight()/2);
        } else {
            maxTimeOnBorder = MAX_TIME_ON_BORDER;
             getWorld().showText("", getWorld().getWidth()/2, getWorld().getHeight()/2);
        }
        
        if(maxTimeOnBorder == 0 || (units != null && units.size() > 1)) {
            getWorld().showText("Game Over", getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
        
    }

    private void createNewUnit() {
        if(unit == null) {
            unit = new SnakeUnit();
            unit.setRotation(getRotation());
        } else {
            unit.createNewUnit();
        }
    }

    private void addNewUnit() {

        if(unit == null) return;
        if(getRotation() == 0) {
            getWorld().addObject(unit, getX() - 20, getY());    
        }

        if(getRotation() == 180) {
            getWorld().addObject(unit, getX() + 20, getY());    
        }

        if(getRotation() == 90) {
            getWorld().addObject(unit, getX(), getY() - 20);    
        }

        if(getRotation() == 270) {
            getWorld().addObject(unit, getX(), getY() + 20);    
        }
    }

    private void moveUnit(int x, int y, int r) {
        if(unit == null) return;
        unit.setRotationPoint(x, y, r);
    }
}
