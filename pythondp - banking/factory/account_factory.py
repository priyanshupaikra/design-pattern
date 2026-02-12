from model.savings_account import SavingsAccount
from model.current_account import CurrentAccount


class AccountFactory:

    @staticmethod
    def create_account(account_type, user_id):

        if account_type == "SAVINGS":
            return SavingsAccount(user_id)

        elif account_type == "CURRENT":
            return CurrentAccount(user_id)

        else:
            raise Exception("Invalid account type")