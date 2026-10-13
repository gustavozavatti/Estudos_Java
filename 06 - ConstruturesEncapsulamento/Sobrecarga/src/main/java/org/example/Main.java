package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product x = new Product(name, price, quantity);

        System.out.println(x);

        boolean running = true;

        while(running) {
            System.out.println("-----------------------------------------------------");
            System.out.println("Enter (1) to add more product data");
            System.out.println("Enter (2) to remove product data");
            System.out.println("Enter (3) to exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the number of products to be added in stock: ");
                    int quantityAdd = sc.nextInt();
                    x.addProduct(quantityAdd);
                    break;
                case 2:
                    System.out.print("Enter the number of products to be removed in stock: ");
                    int quantityRemove = sc.nextInt();
                    x.removeProduct(quantityRemove);
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        System.out.println(x);

        sc.close();
    }
}
