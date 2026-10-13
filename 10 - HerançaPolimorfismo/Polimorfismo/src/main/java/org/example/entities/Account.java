package org.example.entities;

public class Account {

    protected Integer id;
    protected String holder;
    protected Double balance;

    public Account() {
    }

    public Account(Integer id, String holder, Double balance) {
        this.id = id;
        this.holder = holder;
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void withdraw(Double balance) {
        this.balance -= balance + 5.0;
    }

    public void deposit(Double balance) {
        this.balance += balance;
    }
}
