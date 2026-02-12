package factory;

import model.*;

public class AccountFactory {

    public static AbstractAccount createAccount(AccountType type, String userId) {

        switch(type) {
            case SAVINGS:
                return new SavingsAccount(userId);
            case CURRENT:
                return new CurrentAccount(userId);
            default:
                throw new IllegalArgumentException("Invalid account type");
        }
    }
}