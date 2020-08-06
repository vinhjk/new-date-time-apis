package usingzoneddatetime;

import java.time.*;
import java.util.Set;

public class ZonedDateTimeEx {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        //create a zone for Paris
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        //get all ZoneIds
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        //converted to a specific zone
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        //get time zone specific date time
        ZonedDateTime zonedDateTimeParse = ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]");
        //add 2 hours to the time by ZoneOffset
        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offSetByTwo = OffsetDateTime
                .of(localDateTime, offset);

        System.out.println();
    }
}
