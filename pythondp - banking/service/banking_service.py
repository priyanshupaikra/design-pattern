from model.account import Account


class BankingService:

    def __init__(self, repository):
        self.repository = repository

    def create_account(self, user_id, account_type):
        account = Account(user_id, account_type)
        self.repository.save(account)
        return account

    def deposit(self, account_id, amount):
        account = self.repository.find_by_id(account_id)
        account.deposit(amount)

    def withdraw(self, account_id, amount):
        account = self.repository.find_by_id(account_id)
        account.withdraw(amount)