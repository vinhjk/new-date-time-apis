package usinglocalst;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class WorkingWithLocalTime {
    public static void main(String[] args) {
        //get current time
        LocalTime localTime = LocalTime.now();
        // config time
        LocalTime sixThirtyUseParse = LocalTime.parse("06:30");
        LocalTime sixThirtyUseOf = LocalTime.of(6, 30);
        //get time after adds an hour to this time by plus
        LocalTime sevenThirty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);
        //get hour
        int six = LocalTime.parse("06:30").getHour(); // the same we can get min, sec too
        //check time
        boolean isBefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));
        //get max time
        LocalTime maxTime = LocalTime.MAX; // the same we can get MIN and MIDNIGHT time

        System.out.println();
    }
}
