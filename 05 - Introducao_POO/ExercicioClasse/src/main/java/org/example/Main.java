package org.example;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Triangle X = new Triangle();
         Triangle Y = new Triangle();

         System.out.println("Enter the measures of the triangle X: ");
         X.lado1 = sc.nextDouble();
         X.lado2 = sc.nextDouble();
         X.lado3 = sc.nextDouble();
         System.out.println("Enter the measures of the triangle Y: ");
         Y.lado1 = sc.nextDouble();
         Y.lado2 = sc.nextDouble();
         Y.lado3 = sc.nextDouble();

         double p = (X.lado1 + X.lado2 + X.lado3) / 2;
         double areaX = Math.sqrt(p * (p - X.lado1) * (p - X.lado2) * (p - X.lado3));

         p = (Y.lado1 + Y.lado2 + Y.lado3) / 2;
         double areaY = Math.sqrt(p * (p - Y.lado1) * (p - Y.lado2) * (p - Y.lado3));

         if (areaX > areaY) {
             System.out.println("Larger area is X");
         }
         else{
             System.out.println("Larger area is Y");
         }

         sc.close();
    }
}
