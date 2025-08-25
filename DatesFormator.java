import java.text.SimpleDateFormat;
import java.util.Date;

public class DatesFormator {
    public static void main(String[] args) {
        Date currentData = new Date();

        SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE");
        String dayOfWeek = dayOfWeekFormat.format(currentData);
<<<<<<< HEAD
        SimpleDateFormat dayOfMonthFormat = new SimpleDateFormat("d");
        String dayOfMonth = dayOfMonthFormat.format(currentData);
        SimpleDateFormat monthFormat = new SimpleDateFormat("MMMM");
        String month = monthFormat.format(currentData);
    
        System.out.println("Current Day of the Week " + dayOfWeek);
        System.out.println("Current Day of month "+ dayOfMonth);
        System.out.println("Current Month "+ month);
    }

=======
    
        System.out.println("Current Day of the Week " + dayOfWeek);
    }
>>>>>>> f83c590ce35d4fefac329ebb3a4a6bc6373e394c
}
