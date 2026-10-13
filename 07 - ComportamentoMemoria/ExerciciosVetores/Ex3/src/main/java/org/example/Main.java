package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int roomsRented;
        do {
            System.out.print("How many rooms will be rented (1-10): ");
            roomsRented = sc.nextInt();
        } while (roomsRented <= 0 || roomsRented > 10);

        Person[] persons = new Person[10];

        for (int i = 0; i < roomsRented; i++) {
            System.out.printf("Rent #%d:\n", i + 1);

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();

            if (persons[roomNumber] != null) {
                System.out.println("Room already occupied! Try again.");
                i--;
            } else {
                persons[roomNumber] = new Person(name, email, roomNumber);
            }
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null) {
                System.out.println(i + ": " + persons[i]);
            }
        }

        sc.close();
    }
}
