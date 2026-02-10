package service;

import model.Account;
import model.AccountType;
import repository.AccountRepository;

public class BankingService {

    private AccountRepository repository;

    public BankingService(AccountRepository repository) {
        this.repository = repository;
    }

    public Account createAccount(String userId, AccountType type) {
        Account account = new Account(userId, type);
        repository.save(account);
        return account;
    }

    public void deposit(String accountId, double amount) {
        Account account = repository.findById(accountId);
        account.deposit(amount);
    }

    public void withdraw(String accountId, double amount) {
        Account account = repository.findById(accountId);
        account.withdraw(amount);
    }
}