package org.example;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of heights: ");
        int numberHeights = sc.nextInt();

        double[] heights = new double[numberHeights];
        System.out.println("Enter the height values: ");
        for (int i = 0; i < numberHeights; i++) {
            heights[i] = sc.nextDouble();
        }

        double total = 0.0;
        for (int i = 0; i < numberHeights; i++) {
            total += heights[i];
        }
        total = total / numberHeights;

        System.out.printf("Average height: %.2f", total);


        sc.close();
    }
}
