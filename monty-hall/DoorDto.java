/**
 * Write a description of class DoorDto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoorDto  
{
   private boolean open;
   private boolean eureka;
   private DoorDto door;
   private byte id;

   public DoorDto(boolean eureka) {
       this.eureka = eureka;
       this.door = door;
       id = 0;
   }
   
   private void setId(byte id) {
       this.id = id;
   }
   
   public byte getId() {
       return id;
   }
   
   public void setNextDoor(DoorDto door) {
       door.setId((byte)(id + 1));
       this.door = door;
   }
   
   public DoorDto getNextDoor() {
       return door;
   }
   
   public void open() {
       this.open = true;
   }
   
   public boolean isOpen() {
       return open;
   }
   
   public boolean isEureka() {
       return eureka;
   }
}
