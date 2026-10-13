package org.example;
import org.example.entities.Account;
import org.example.entities.BusinessAccount;
import org.example.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account account = new Account(1001, "Alex", 0.0);
        BusinessAccount businessAccount = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING
        Account account1 = businessAccount;
        Account account2 = new BusinessAccount(1003, "John", 0.0, 200.0);
        Account account3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        //DOWN CASTING

        BusinessAccount account4 = (BusinessAccount)account2;
        account4.loan(100.0);

        if (account3 instanceof SavingsAccount) {
            SavingsAccount account5 = (SavingsAccount) account3;
            account5.updateBalance();
            System.out.println("Updated balance!");
        }
    }
}
