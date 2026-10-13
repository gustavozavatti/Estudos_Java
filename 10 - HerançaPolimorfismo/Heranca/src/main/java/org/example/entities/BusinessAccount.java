package org.example.entities;

public class BusinessAccount extends Account {

    private Double LoanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer id, String holder, Double balance, Double loanLimit) {
        super(id, holder, balance);
        LoanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return LoanLimit;
    }

    public void loan(Double amount) {
        if (LoanLimit >= amount) {
            this.balance = amount - 10.0;
        }
    }

}
