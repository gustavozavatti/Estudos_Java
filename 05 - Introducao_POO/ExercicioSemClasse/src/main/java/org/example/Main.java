package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter the measures of triangle X: ");
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double area1 = result(x1, x2, x3);

        System.out.println("Enter the measures of triangle Y: ");
        x1 = sc.nextDouble();
        x2 = sc.nextDouble();
        x3 = sc.nextDouble();
        double area2 = result(x1, x2, x3);

        System.out.printf("Area of triangle X: %.4f%n", area1);
        System.out.printf("Area of triangle Y: %.4f%n", area2);
        System.out.println("-----------------------------------");
        
        if (area1 > area2) {
            System.out.println("Larger area is X");
        }
        else{
            System.out.println("Larger area is Y");
        }

        sc.close();
        }

    static double result(double x1, double x2, double x3) {
        double p = (x1 + x2 + x3) / 2;
        double result = Math.sqrt(p * (p - x1) * (p - x2) * (p - x3));
        return result;
        }
    }
