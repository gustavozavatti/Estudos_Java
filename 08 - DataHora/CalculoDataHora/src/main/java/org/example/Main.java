package org.example;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-12-17");
        LocalDateTime d02 = LocalDateTime.parse("2022-12-17T01:30:26");
        Instant d03 = Instant.parse("2022-12-17T01:30:26Z");

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);

        System.out.println("Past Week Date: " + pastWeekLocalDate);
        System.out.println("Next Week Date: " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);

        System.out.println("Past Week LocalDateTime: " + pastWeekLocalDateTime);
        System.out.println("Next Week LocalDateTime: " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("Past Week Instant: " + pastWeekInstant);
        System.out.println("Next Week Instant: " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d02);
        Duration t3 = Duration.between(pastWeekInstant, d03);

        System.out.println("Past Duration: " + t1.toDays());
        System.out.println("Past Duration: " + t2.toDays());
        System.out.println("Past Duration: " + t3.toDays());
    }
}
