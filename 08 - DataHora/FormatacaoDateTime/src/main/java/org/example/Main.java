package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-12-17");
        LocalDateTime d02 = LocalDateTime.parse("2022-12-17T01:30:26");
        Instant d03 = Instant.parse("2022-12-17T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());

        System.out.println("SEM FORMAT: ");
        System.out.println("DO1 = " + d01);
        System.out.println("DO2 = " + d02);
        System.out.println("DO3 = " + d03);

        System.out.println("---------------------------");

        System.out.println("COM FORMAT: ");
        System.out.println("DO1 = " + fmt1.format(d01));
        System.out.println("DO2 = " + fmt2.format(d02));
        System.out.println("DO3 = " + fmt3.format(d03));


    }
}