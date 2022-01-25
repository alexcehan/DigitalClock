import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GettingTime {


    String time;


    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss dd-MMM-yyyy");

    public String displayTime() {
        time = timeFormat.format(Calendar.getInstance().getTime());

        return time;
    }


}
