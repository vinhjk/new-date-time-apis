package compatibility;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class CompatibilityDateAndCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault());
    }
}
