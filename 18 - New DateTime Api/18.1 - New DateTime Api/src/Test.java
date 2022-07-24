/*
 Old DateTime API wasn't good.
 New DateTime API was introduced in Java 1.8

 Problems with old DateTime API:
    - 2 Date classes present in util and sql package
    - For formatting date, another package named text needed to be imported
    - All the classes in Date package were not thread safe

 Changes in new DateTime API:
    - new package time was created
    - Date object only print Date now, and not Time to avoid confusion
*/

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Test {
    public static void main(String[] args) {
        // Using LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println();

        LocalDate localDate2 = LocalDate.of(2013, 2, 20);
        System.out.println(localDate2);

        System.out.println();

        // LocalDate localDate3 = LocalDate.of(2013, Month.FEBRUARY, 29);        // Will throw error since invalid date
        // System.out.println(localDate3);


        // Using LocalTime
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        System.out.println();

        LocalTime localTime2 = LocalTime.of(12, 25);
        System.out.println(localTime2);

        System.out.println();

        for (String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }

        System.out.println();

        LocalTime localTime3 = LocalTime.now(ZoneId.of("Asia/Kuwait")); // We want to print time based on zone
        System.out.println(localTime3);

        System.out.println();


        // Using Instant - machine readable time
        Instant instant = Instant.now();
        System.out.println(instant);

        System.out.println();


        // Using LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}

