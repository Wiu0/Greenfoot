
/**
 * Write a description of class MontyHallLogic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MontyHallLogic  
{
    private byte[] eurekaNumber;
    private byte eurekaNumberPosition;
    private byte amount;

    public MontyHallLogic() {
        eurekaNumber = new byte[] {0, 0, 0};
        amount = 0;
    }

    public void generateEurekaNumber() {
        eurekaNumber = new byte[] {0, 0, 0};
        eurekaNumberPosition = (byte)(Math.random() * 3);
        eurekaNumber[eurekaNumberPosition] = (byte)1;
        amount = 0;
    }

    public byte getEmptyDoor(byte doorPicked) {

        for(byte i = 0; i < 3; i++) {
            if(doorPicked != i && eurekaNumber[i] == 0) {
             return i;   
            }
        }
        return -1;
        //TODO throw Exception
    }

    public byte getFreedomDoor() {
        return eurekaNumberPosition;
    }

    public byte getNumber() {
        return (byte)(amount++);
    }
}
