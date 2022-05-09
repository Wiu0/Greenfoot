/**
 * Write a description of class Key here.
 * 
 * @author wiu
 * @version 202205
 */
public class Key  
{
    private String key;
    private String antiKey;     
    private int rotation;

    public Key() {
        this("", "", 0);
    }

    public Key(String key, String antiKey, int rotation) {
        this.key = key;
        this.antiKey = antiKey;
        this.rotation = rotation;
    }

    public String getAntiKey() {
        return antiKey;
    }

    public void setAntiKey(String antiKey) {
        this.antiKey = antiKey;
    }
    
        public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    
        public int getRotation() {
        return rotation;
    }

    public void setAntiKey(int rotatio) {
        this.rotation = rotation;
    }
    
    public void setKeys(String key, String antiKey, int rotation) {
        this.key = key;
        this.antiKey = antiKey;
        this.rotation = rotation;
    }
}
