package org.example;
import org.example.entities.Departament;
import org.example.entities.HourContract;
import org.example.entities.Worker;
import org.example.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.print("Enter department´s name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel.toUpperCase()), baseSalary,new Departament(departmentName));

        System.out.print("How many contracts to this work: ");
        int numberOfContracts = sc.nextInt();

        for (int i = 0; i < numberOfContracts; i++) {
            System.out.printf("Enter contract #%d data: %n",  i + 1);

            sc.nextLine();

            System.out.print("Date (DD/MM/YYYY): ");
            String date = sc.nextLine();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration: (hours): ");
            int duration = sc.nextInt();

            HourContract contract = new HourContract(LocalDate.parse(date, dtf) , valuePerHour, duration);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartament().getName());
        System.out.println("Income for " + monthAndYear + ": " + worker.income(year, month));

        sc.close();
    }
}
