package usingperiodandduration;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class UsingDuration {
    public static void main(String[] args) {
        //create LocalTime of 6:30 am
        LocalTime initialTime = LocalTime.of(6, 30, 0);
        // add 30s make LocalTime become 6:30:30
        LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
        //using Duration between to get seconds
        long thirty = Duration.between(initialTime, finalTime).getSeconds();
        //same operation but by another way
        long thirty2 = ChronoUnit.SECONDS.between(initialTime, finalTime);

        System.out.println();
    }
}
