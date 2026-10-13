package org.example;
import org.example.model.entities.Account;
import org.example.model.exceptions.DomainException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Account account;

        try {
            System.out.println("Enter account data: ");

            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            account = new Account(number, holder, balance, withdrawLimit);

            System.out.print("Enter amount to withdraw: ");
            double withdraw = sc.nextDouble();
            account.withdraw(withdraw);
            System.out.println("New balance: " + account.getBalance());

        }catch (DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Invalid input");
        } catch (RuntimeException e) {
            System.out.println("Unexpected error!");
        }
        sc.close();
    }
}
