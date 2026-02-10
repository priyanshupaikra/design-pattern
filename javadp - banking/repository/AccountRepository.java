package repository;

import model.Account;
import java.util.HashMap;
import java.util.Map;

public class AccountRepository {

    private Map<String, Account> storage = new HashMap<>();

    public void save(Account account) {
        storage.put(account.getAccountId(), account);
    }

    public Account findById(String accountId) {
        return storage.get(accountId);
    }
}