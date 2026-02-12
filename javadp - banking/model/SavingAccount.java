package model;

public class SavingsAccount extends AbstractAccount {

    public SavingsAccount(String userId) {
        super(userId);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.04;
    }
}