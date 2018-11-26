import java.io.File;
/**
 * Write a description of class ImageActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ImageActor extends ImageW
{
    public ImageActor(File dir){
        super(dir);
    }
    
     public TypeImage getType(){
        return TypeImage.ACTOR;
    }
}
