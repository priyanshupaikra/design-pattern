public class Main {

    public static void main(String[] args) {

        AccountRepository repo = new AccountRepository();
        BankingService service = new BankingService(repo);

        Account account = service.createAccount("user123", AccountType.SAVINGS);

        service.deposit(account.getAccountId(), 1000);
        service.withdraw(account.getAccountId(), 200);

        System.out.println(account.getBalance());
    }
}