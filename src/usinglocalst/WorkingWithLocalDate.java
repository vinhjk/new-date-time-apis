package usinglocalst;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class WorkingWithLocalDate {
    public static void main(String[] args) {
        //get current date
        LocalDate localDate = LocalDate.now();
        //config date
        LocalDate localDateConfig = LocalDate.of(1999, 11, 22);
        LocalDate localDateConfig2 =LocalDate.parse("1999-11-22");
        //get tomorrow day
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        //get current day, but abstracts one month. Accept enum MONTHS as the time unit
        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        //get day of week
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        //get day of month
        int dayOfMonth = LocalDate.now().getDayOfMonth();
        // TODO: 8/5/2020 st more, you can learning after .......

        System.out.println();
    }
}
