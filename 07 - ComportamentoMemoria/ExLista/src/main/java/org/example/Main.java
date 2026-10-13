package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.println("How many employees will be registered: ");
        int employeesRegistered = sc.nextInt();

        Employee employee;
        for (int i = 0; i < employeesRegistered; i++){
            System.out.printf("Employee %d: \n", i + 1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            employee = new Employee(id, name, salary);
            list.add(employee);
        }

        System.out.println("\nList of employees: ");
        for (Employee employeeList : list){
            System.out.println(employeeList);
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int idIncrease = sc.nextInt();

        boolean found = false;

        for (Employee employeeList : list){
            if (employeeList.getId() == idIncrease){
                found = true;
                double increment = employeeList.getSalary();
                employeeList.setSalary(increment * 1.1);
                break;
            }
            else{
                System.out.println("This id does not exist!");
            }
        }

        System.out.println("\nList of employees: ");
        for (Employee employeeList : list){
            System.out.println(employeeList);
        }

        sc.close();
    }
}