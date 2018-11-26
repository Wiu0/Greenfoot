import java.util.List;
import java.util.Arrays;
import java.io.File;
/**
 * Write a description of class ImageW here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ImageW  
{
    private File dir;
    
    public ImageW(File dir){
        this.dir = new File(dir.getAbsolutePath() + "/" + getType().name());
    }
    
    public List<String> findImage(){
        return Arrays.asList(dir.list());
    }
    
    public abstract TypeImage getType();
}
