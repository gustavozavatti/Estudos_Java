package org.example;

public class Account {
    private int accountNumber;
    private String accountName;
    private double balance;

    public Account(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }
    public Account(int accountNumber, String accountName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }
    public void withdraw(double amount) {
        if(amount > 0 && this.balance >= amount + 5.0) {
            this.balance -= amount + 5.0;
        }
    }

    @Override
    public String toString() {
        return "Account number: " + accountNumber +
                ", Holder: " + accountName +
                ", Balance: $ " + String.format("%.2f", balance);
    }

}
