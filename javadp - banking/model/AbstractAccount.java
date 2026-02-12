package model;

import java.util.UUID;

public abstract class AbstractAccount {

    protected String accountId;
    protected String userId;
    protected double balance;
    protected AccountStatus status;

    public AbstractAccount(String userId) {
        this.accountId = UUID.randomUUID().toString();
        this.userId = userId;
        this.status = AccountStatus.ACTIVE;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
        } else {
            throw new RuntimeException("Insufficient funds");
        }
    }

    public abstract double calculateInterest();

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }
}