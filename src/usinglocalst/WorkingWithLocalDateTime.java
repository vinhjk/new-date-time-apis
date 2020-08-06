package usinglocalst;

import java.time.LocalDateTime;
import java.time.Month;

public class WorkingWithLocalDateTime {
    public static void main(String[] args) {
        //get local date time
        LocalDateTime localDateTime = LocalDateTime.now();
        //config date time
        LocalDateTime configDateTime = LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
        LocalDateTime configByParse = LocalDateTime.parse("2015-02-20T06:30:00");
        //add a day
        LocalDateTime addOne = localDateTime.plusDays(2);
        //abstract a hour
        LocalDateTime minus = localDateTime.minusHours(2);
        // TODO: 8/5/2020 learning more than that ex

        System.out.println();
    }
}
