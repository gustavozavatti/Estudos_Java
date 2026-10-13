package org.example;

import org.example.entities.Account;
import org.example.entities.BusinessAccount;
import org.example.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        list.add(new BusinessAccount(1003, "Bob", 500.0, 300.0));

        double sum = 0.0;

        for(Account acc : list){
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f%n%n", sum);

        for (Account acc : list){
            acc.deposit(10.0);
        }
        for (Account acc : list){
            System.out.println("Updated balance: " + acc.getBalance());
        }
    }
}