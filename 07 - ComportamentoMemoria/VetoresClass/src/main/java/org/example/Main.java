package org.example;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of products: ");
        int totalProducts = sc.nextInt();

        Product[] products = new Product[totalProducts];

        System.out.println("Enter the products data: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Price: ");
            double price = sc.nextDouble();
            products[i] = new Product(name, price);
        }

        double totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            totalPrice += products[i].getProductPrice();
        }
        totalPrice = totalPrice / totalProducts;

        System.out.printf("Average price is %.2f", totalPrice);

        sc.close();

    }
}
