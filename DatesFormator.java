import java.text.SimpleDateFormat;
import java.util.Date;

public class DatesFormator {
    public static void main(String[] args) {
        Date currentData = new Date();

        SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE");
        String dayOfWeek = dayOfWeekFormat.format(currentData);
    
        System.out.println("Current Day of the Week " + dayOfWeek);
    }
}
