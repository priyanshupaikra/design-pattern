from model.accounts import AbstractAccount


class SavingsAccount(AbstractAccount):

    def calculate_interest(self):
        return self.balance * 0.04