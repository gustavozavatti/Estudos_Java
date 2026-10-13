package org.example.model.entities;

import org.example.model.exceptions.DomainException;

public class Account {

    private final Integer number;
    private String holderName;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holderName, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holderName = holderName;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public Integer getNumber() {
        return number;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double balance) {
        this.balance += balance;
    }

    public void withdraw(Double balance) {
        if(balance > withdrawLimit) {
            throw new DomainException("The amount balance exceeds withdraw limit!");
        }
        if (this.balance < balance) {
            throw new DomainException("Not enough balance!");
        }
        if (balance < 0) {
            throw new DomainException("Not enough balance!");
        }
        this.balance -= balance;
    }
}
