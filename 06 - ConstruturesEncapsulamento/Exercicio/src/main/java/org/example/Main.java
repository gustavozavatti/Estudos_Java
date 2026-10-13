package org.example;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Account account;

        System.out.println("Enter your account details: ");
        System.out.print("Enter your account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your account name: ");
        String accountName = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n): ");
        String initialDeposit = sc.nextLine();
        double depositAmount = 0.0;

        if (initialDeposit.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            depositAmount = sc.nextDouble();
            account = new Account(accountNumber, accountName, depositAmount);
        }
        else {
            account = new Account(accountNumber, accountName);
        }

        System.out.println("Account details: ");
        System.out.println(account);

        boolean condition = true;
        while (condition) {
            System.out.println("Press 1) Deposit");
            System.out.println("Press 2) Withdraw");
            System.out.println("Press 3) Quit");

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter a deposit value: ");
                    double depositValue = sc.nextDouble();
                    account.deposit(depositValue);
                    System.out.println(account);
                    break;

                case 2:
                    System.out.println("Enter a withdraw value: ");
                    double withdrawValue = sc.nextDouble();
                    account.withdraw(withdrawValue);
                    System.out.println(account);
                    break;

                case 3:
                    System.out.println("Thank you for using our account");
                    condition = false;
                    break;

                default:
                    System.out.println("Invalid input");
                    break;
            }
        }

        sc.close();
    }
}
