import java.util.List;
import java.util.LinkedList;
/**
 * Write a description of class MovementIdle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovementIdle extends MovementAbstract {

    private MovementIdle() {
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

        public MovementIdle build() {
            MovementIdle m = new MovementIdle();
            m.setImages(images);
            return m; 
        }

    }
}
