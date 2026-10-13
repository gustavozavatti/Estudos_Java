package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number of digits: ");
        int quantityNumbers = sc.nextInt();
        int[] numbers = new int[quantityNumbers];

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Negative numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.println(numbers[i]);
            }
        }

        sc.close();
    }
}
