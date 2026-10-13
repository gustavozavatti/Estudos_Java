package org.example;
import org.example.entities.ImportedProduct;
import org.example.entities.Product;
import org.example.entities.UsedProduct;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int numberProducts = sc.nextInt();

        for (int i = 0; i < numberProducts; i++) {
            System.out.println("Product #" + (i + 1) + ": ");

            sc.nextLine();
            System.out.print("Common, used or imported (c/u/i): ");
            String productType = sc.nextLine().toLowerCase();

            System.out.print("Name: ");
            String nameProduct = sc.nextLine();

            System.out.print("Price: ");
            double priceProduct = sc.nextDouble();

            switch (productType) {
                case "c":
                    products.add(new Product(nameProduct, priceProduct));
                    break;
                case "u":
                    sc.nextLine();

                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    String manufactureDate = sc.nextLine();
                    products.add(new UsedProduct(nameProduct, priceProduct, LocalDate.parse(manufactureDate, formatter)));
                    break;
                case "i":
                    System.out.print("Customs fee: ");
                    double customFee = sc.nextDouble();
                    sc.nextLine();
                    ImportedProduct importedProduct = new ImportedProduct(nameProduct, priceProduct, customFee);
                    importedProduct.totalPrice();
                    products.add(importedProduct);
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }

        for (Product product : products) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}