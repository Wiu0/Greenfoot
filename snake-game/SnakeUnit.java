import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnakeUnit here.
 * 
 * @author wiu
 * @version 202205
 */
public class SnakeUnit extends Actor
{
    private SnakeUnit unit;
    private int rotationPointX;
    private int rotationPointY;
    private int rotationValue;

    public void act()
    {

        //getWorld().showText("Rotation UNit point x: " + rotationPointX + " y: " + rotationPointY, 100, 100);
        if(isRotationPoint()){
            setRotation(rotationValue);    
            moveUnit(getX(), getY(), getRotation());
        }
        //getWorld().showText("x: " + getX() + " y: " + getY(), 50, 50);
        move(SnakeHead.SPEED);
        addNewUnit();
    }

    protected void createNewUnit() {
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

    private boolean isRotationPoint() {
        return getX() == rotationPointX && getY() == rotationPointY;
    }

    public void setRotationPoint(int x, int y, int r) {
        rotationPointX = x;
        rotationPointY = y;
        rotationValue = r;
    }

    private void moveUnit(int x, int y, int r) {
        if(unit == null) return;
        unit.setRotationPoint(x, y, r);
    }

}
