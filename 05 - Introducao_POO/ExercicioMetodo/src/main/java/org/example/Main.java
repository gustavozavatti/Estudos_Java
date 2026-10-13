package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.ladoA = sc.nextDouble();
        x.ladoB = sc.nextDouble();
        x.ladoC = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.ladoA = sc.nextDouble();
        y.ladoB = sc.nextDouble();
        y.ladoC = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.2f\n", areaX);
        System.out.printf("Triangle Y area: %.2f\n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area is X");
        } else{
            System.out.println("Larger area is Y");
        }
        sc.close();
    }
}
