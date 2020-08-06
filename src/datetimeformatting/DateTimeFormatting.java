package datetimeformatting;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
public class DateTimeFormatting {
    public static void main(String[] args) {
        //create dateTime
        LocalDateTime localDateTime = LocalDateTime.of(2015, Month.JANUARY, 25, 6, 30);
        //format to String
        String localDateString = localDateTime.format(DateTimeFormatter.ISO_DATE);
        //format allow pattern
        localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
    }
}
