package model;

public class CurrentAccount extends AbstractAccount {

    public CurrentAccount(String userId) {
        super(userId);
    }

    @Override
    public double calculateInterest() {
        return 0;
    }
}