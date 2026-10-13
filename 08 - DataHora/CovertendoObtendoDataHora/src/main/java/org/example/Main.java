package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-12-17");
        LocalDateTime d02 = LocalDateTime.parse("2022-12-17T01:30:26");
        Instant d03 = Instant.parse("2022-12-17T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);
        System.out.println("R3 = " + r3);
        System.out.println("R4 = " + r4);

        System.out.println("DO4 = " + d01.getDayOfMonth());
        System.out.println("DO4 = " + d01.getMonthValue());
        System.out.println("DO4 = " + d01.getYear());

        System.out.println("DO5 = " + d02.getHour());
        System.out.println("DO5 = " + d02.getMinute());


    }
}