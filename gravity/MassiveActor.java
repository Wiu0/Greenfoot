import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.time.Duration;
import java.time.OffsetDateTime;
/**
 * Write a description of class MassiveActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MassiveActor extends Actor
{
    private int gravityAcceleration = 1;
    private double normalAcceleration = 0;
    private long timeFalling = 0;
    private OffsetDateTime startTimeFalling = OffsetDateTime.now();
    private int move = 2;
    private int normal = 0;
    /**
     * Act - do whatever the MassiveActor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getWorld().showText("T: " + timeFalling + " V:" + move + "m/s2", 300, 100);
        getWorld().showText("Normal: " + normal + "m/s2", 300, 80);
       if(Greenfoot.isKeyDown("d")) {
           setNormal(80);
       }
        // Add your action code here.
    }

    //S = So + Vo. t ± (at²)/2
    /*
     * S — distância total percorrida após o lançamento, dada em metros;
    So — distância inicial já percorrida, dada em metros;
    Vo — velocidade inicial do objeto, dada em m/s;
    t — tempo de movimento em segundos;
    a — valor da aceleração em m/s².
     */
    public void applyForce() {
        //900 = 0 + 0. t+-(1.tˆ2)/2
        //900 = +-(tˆ2)/2
        //450 = +t2
        //t = 450R2
        setLocation(getX(), getY() + move - normal);
        downForce();
        normalForce();
        //setLocation(getX(), getY() + gravityAcceleration - ((int)normalAcceleration));
    }

    private void downForce() {

        //OffsetDateTime moment = OffsetDateTime.now();
        //Duration difference = Duration.between(startTimeFalling, moment);
        //timeFalling = difference.getSeconds();
        //gravityAcceleration += gravityAcceleration;

    }

    private void normalForce() {

        if(Greenfoot.isKeyDown("space")) {
            if(normal < 8) {
                normal++;    
            }

        } else {
            if(normal > 0) {
                normal--;
            }
        }
        if(getY() + 1 == getWorld().getHeight()) {
            // normalAcceleration = gravityAcceleration;
            move = 0;
        } else { 
            move = 2;
        }
        // normalAcceleration += 0.9;
    }
    
    protected void setNormal(int normal) {
        this.normal = normal;
    }
}
