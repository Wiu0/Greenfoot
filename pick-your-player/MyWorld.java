import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    AvatarOne avatarOne;
    AvatarTwo avatarTwo;
    AvatarThree avatarThree; 
    int actorPicked = 1;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(600, 400, 1); 
        prepare();
    }

    private void prepare()
    {
        ButtonStart buttonStart = new ButtonStart();
        addObject(buttonStart,492,308);
        avatarOne = new AvatarOne();
        avatarTwo = new AvatarTwo();
        avatarThree = new AvatarThree();

        addObject(avatarOne,127,80);
        addObject(avatarTwo,126,183);
        addObject(avatarThree,124,275);
        setImagePicked();
    }
    double time = 60;
    public void act() {
        showText("T: " + actorPicked, 200, 100);
        mouseLogic();
        if(delay(0.1)) return;

        keyboardLogic();
    }

    private void mouseLogic() {
        if(Greenfoot.mouseClicked(avatarOne)) {
            actorPicked = 1;
        }
        if(Greenfoot.mouseClicked(avatarTwo)) {
            actorPicked = 2;
        } 
        if(Greenfoot.mouseClicked(avatarThree)) {
            actorPicked = 3;
        }
        setImagePicked();
    }

    private void keyboardLogic() {
        if(Greenfoot.isKeyDown("up")) {
            if(actorPicked == 1) {
                actorPicked = 4;
            }
            actorPicked--;
            setImagePicked();
        } else if(Greenfoot.isKeyDown("down")) {
            if(actorPicked == 3) {
                actorPicked = 0;
            }
            actorPicked++;
            setImagePicked();
        }
    }

    private boolean delay(double secs) {
        if(time-- > 0) {
            return true;
        }
        time = 60 * secs;
        return false;
    }

    private void setImagePicked() {
        avatarOne.setImage("bee.png");
        avatarTwo.setImage("camel.png");
        avatarThree.setImage("frog.png");
        if(actorPicked == 1) {
            avatarOne.setImage("bee-select.png");    
        }
        if(actorPicked == 2) {
            avatarTwo.setImage("camel-select.png"); 
        }
        if(actorPicked == 3) {
            avatarThree.setImage("frog-select.png"); 
        }
    }
}
