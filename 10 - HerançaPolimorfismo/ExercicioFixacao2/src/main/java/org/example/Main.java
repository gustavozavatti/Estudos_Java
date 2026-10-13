package org.example;
import org.example.entities.Fisica;
import org.example.entities.Juridica;
import org.example.entities.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        for(int i = 0; i < n; i++){
            System.out.print("Pessoa " + (i + 1) + ": ");

            sc.nextLine();
            System.out.print("Individual or company (i/c): ");
            String individuo = sc.nextLine();

            System.out.print("Name: ");
            String nome = sc.nextLine();

            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();

            switch(individuo){
                case "i":
                    System.out.print("Health expenditures: ");
                    double healthExpenditures = sc.nextDouble();
                    pessoas.add(new Fisica(nome, annualIncome, healthExpenditures));
                    break;
                case "c":
                    System.out.print("Number of employees: ");
                    int numOfEmployees = sc.nextInt();
                    pessoas.add(new Juridica(nome, annualIncome, numOfEmployees));
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }

        double sum = 0.0;

        System.out.println();
        System.out.println("TAXED PAID: ");
        for(Pessoa p : pessoas){
            sum += p.imposto();
            System.out.println(p.getNome() + " $ " + p.imposto());
        }
        System.out.println();
        System.out.println("TOTAL TAXES: " + sum);

        sc.close();
    }
}
