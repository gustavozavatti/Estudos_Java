package org.example;
import org.example.entities.Account;
import org.example.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account account = new Account(1020, "Alex", 1000.0);
        Account account2 = new SavingsAccount(1021, "Maria", 1000.0, 0.01);

        account.withdraw(50.0);
        account2.withdraw(50.0);

        System.out.println(account.getBalance());
        System.out.println(account2.getBalance());
    }
}
