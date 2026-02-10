class AccountRepository:

    def __init__(self):
        self.storage = {}

    def save(self, account):
        self.storage[account.account_id] = account

    def find_by_id(self, account_id):
        return self.storage.get(account_id)