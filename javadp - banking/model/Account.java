package model;

import java.util.UUID;

public class Account {

    private String accountId;
    private String userId;
    private double balance;
    private AccountStatus status;
    private AccountType type;

    public Account(String userId, AccountType type) {
        this.accountId = UUID.randomUUID().toString();
        this.userId = userId;
        this.type = type;
        this.status = AccountStatus.ACTIVE;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
        } else {
            throw new RuntimeException("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountId() {
        return accountId;
    }
}