package EndOfTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class EndOfTime {
    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis());

        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z");
        formatter.setTimeZone(TimeZone.getTimeZone("EST"));
        System.out.println(date);
        System.out.println(formatter.format(date));
    }
}
