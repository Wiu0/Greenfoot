 /**
 * Write a description of class TimerMoviment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Calendar;
public class TimerMoviment  
{
    // instance variables - replace the example below with your own
    private Calendar fim;

    public TimerMoviment(){
        fim = Calendar.getInstance();
    }

    public boolean execute(ActionTimer action, int time)
    {
        if(fim.before(Calendar.getInstance())) {
            action.action();
            fim = Calendar.getInstance();
            fim.add(Calendar.MILLISECOND, time);
            return true;
        }   
        return false;
    }
}
