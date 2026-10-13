package org.example;
import org.example.entities.Employee;
import org.example.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = sc.nextInt();
        sc.nextLine();

        List<Employee> employees = new ArrayList<Employee>();

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.print("Employee " + (i + 1) + ": ");

            System.out.print("Outsourced? (y/n): ");
            String choice = sc.nextLine().toLowerCase();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            switch (choice) {
                case "y":
                    System.out.print("Additional charge: ");
                    double additionalCharge = sc.nextDouble();
                    employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
                    sc.nextLine();
                    break;
                case "n":
                    employees.add(new Employee(name, hours, valuePerHour));
                    sc.nextLine();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        System.out.println("PAYMENTS: ");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        sc.close();
    }
}
