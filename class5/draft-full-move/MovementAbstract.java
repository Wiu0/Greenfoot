import java.util.List;
import java.util.LinkedList;
import java.util.function.Predicate;
/**
 * Write a description of class MovementAbstract here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class MovementAbstract implements Movement {
    
    protected List<String> images;
    protected List<String> keys;
    private int position = 0;
    
    public String nextImage() {
        if(position >= images.size()) position = 0;        
        return images.get(position++);
    }
}
