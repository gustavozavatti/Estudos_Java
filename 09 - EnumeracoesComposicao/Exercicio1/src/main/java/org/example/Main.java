package org.example;
import org.example.entities.Client;
import org.example.entities.Order;
import org.example.entities.OrderItem;
import org.example.entities.Product;
import org.example.entities.enums.OrderStatus;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date: (DD/MM/YYYY): ");
        String birthDate = sc.nextLine();
        LocalDate birthDateFormat = LocalDate.parse(birthDate, fmt);

        Client client = new Client(name, email, birthDateFormat);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();
        OrderStatus statusProduct = OrderStatus.valueOf(status);

        Order order = new Order(LocalDate.now(), statusProduct, client);

        System.out.print("How many items to this order: ");
        int quantityOrder = sc.nextInt();

        for(int i = 0; i < quantityOrder; i++){
            System.out.printf("Enter %d item data: \n", i + 1);

            sc.nextLine();
            System.out.print("Product name: ");
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            double priceProduct = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantityProduct = sc.nextInt();

            Product product = new Product(productName, priceProduct);
            OrderItem orderItem = new OrderItem(quantityProduct, product);

            order.addItem(orderItem);

        }

        System.out.println();
        System.out.print(order);

        sc.close();
    }
}
