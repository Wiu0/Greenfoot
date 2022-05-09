import java.util.List;
import java.util.LinkedList;
/**
 * Write a description of class MovemenLeft here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovementLeft extends MovementAbstract {

    private MovementLeft() {
        images = new LinkedList();
    }

    public void setImages(List<String> images){
        super.images.addAll(images);
    }
    
    public static class Builder {
        private List<String> images = new LinkedList();

        public Builder add(String image) {
            images.add(image);
            return this;
        }

        public MovementLeft build() {
            MovementLeft m = new MovementLeft();
            m.setImages(images);
            return m; 
        }

    }
}
