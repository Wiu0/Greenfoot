import java.io.File;
/**
 * Write a description of class ImageWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ImageWorld  extends ImageW
{
    public ImageWorld(File dir){
        super(dir);
    }
    
    public TypeImage getType(){
        return TypeImage.WORLD;
    }
}
