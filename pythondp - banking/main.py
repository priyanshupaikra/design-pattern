from repository.account_repository import AccountRepository
from service.banking_service import BankingService
from model.account import AccountType

repo = AccountRepository()
service = BankingService(repo)

account = service.create_account("user123", AccountType.SAVINGS)

service.deposit(account.account_id, 1000)
service.withdraw(account.account_id, 200)

print(account.balance)