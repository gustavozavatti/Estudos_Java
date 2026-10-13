package org.example;
import org.example.entities.Account;
import org.example.entities.BusinessAccount;
import org.example.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account account = new Account(1001, "Alex", 500.0);
        account.withdraw(300.0);
        System.out.println(account.getBalance());

        Account account2 = new SavingsAccount(1002, "Alex", 500.0, 200.0);
        account2.withdraw(300.0);
        System.out.println(account2.getBalance());

        Account account3 = new BusinessAccount(1003, "Alex", 500.0, 200.0);
        account3.withdraw(300.0);
        System.out.println(account3.getBalance());
    }
}
