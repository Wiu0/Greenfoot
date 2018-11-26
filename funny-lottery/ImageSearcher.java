import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.io.File;
import javax.swing.JOptionPane;
/**
 * Write a description of class ImageSearcher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ImageSearcher  
{
    private static final File fileImage;
    private static List<String> list;
    private static Map<TypeImage, ImageW> mapperImage;
        
    static{
        fileImage = new File("settings/img/");
        list = Arrays.asList(fileImage.list());
        mapperImage = new HashMap<TypeImage, ImageW>();
        mapperImage.put(TypeImage.WORLD, new ImageWorld(fileImage));
        mapperImage.put(TypeImage.ACTOR, new ImageActor(fileImage));
    } 
    
    public static List<String> findAllImage(TypeImage type){
        List<String> l = mapperImage.get(type).findImage();
        //JOptionPane.showMessageDialog(null, l);
        return l;
    }

    public static List<String> findAllImage(){
        //JOptionPane.showMessageDialog(null, l);
        return list;
    }

    public static void findImage(String name){
    
    }
    
    
}
