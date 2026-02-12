from model.accounts import AbstractAccount


class CurrentAccount(AbstractAccount):

    def calculate_interest(self):
        return 0