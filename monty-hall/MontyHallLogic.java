
/**
 * Write a description of class MontyHallLogic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MontyHallLogic  
{
    private DoorDto doors;
    private byte eurekaNumberPosition;
    private byte amount;
    
    public DoorDto getDoor() {
        return doors;
    }

    public void generateEurekaNumber() {
        int pos = (byte)(Math.random() * 3);
        DoorDto d = null;
        for(int i = 0; i < 3; i++) {
            if(d == null) {
                d = new DoorDto(i == pos);   
                doors = d;
            } else {
                DoorDto dd = new DoorDto(i == pos);
                d.setNextDoor(dd);
                d = dd;
            }
        }
    }

    public DoorDto getEmptyDoor(byte doorPicked) {
        DoorDto d = doors;
        while(d.isEureka() || d.getId() == doorPicked) d = d.getNextDoor();
        return d;
    }

    public DoorDto getFreedomDoor() {
        DoorDto d = doors;
        while(!d.isEureka()) d = d.getNextDoor();
        return d;
    }
}
