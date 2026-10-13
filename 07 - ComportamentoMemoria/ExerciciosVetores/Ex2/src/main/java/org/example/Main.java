package org.example;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("How many people will be registered: ");
        int quantityPeople = sc.nextInt();

        People[] people = new People[quantityPeople];
        System.out.println("Enter the people data: ");
        for (int i = 0; i < people.length; i++) {
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Age: ");
            int age = sc.nextInt();
            System.out.println("Height: ");
            double height = sc.nextDouble();
            people[i] = new People(name, age, height);
        }

        double totalHeight = 0;
        int underAge = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() <= 18){
                underAge++;
            }
            totalHeight += people[i].getHeight();
        }

        System.out.printf("Average height: %.2f", totalHeight / quantityPeople);
        System.out.printf("Under age percentage: %.2f", (double) underAge / quantityPeople * 100);

        sc.close();
    }
}
