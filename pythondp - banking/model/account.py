import uuid
from enum import Enum


class AccountType(Enum):
    SAVINGS = "SAVINGS"
    CURRENT = "CURRENT"
    BUSINESS = "BUSINESS"


class AccountStatus(Enum):
    ACTIVE = "ACTIVE"
    FROZEN = "FROZEN"
    CLOSED = "CLOSED"


class Account:

    def __init__(self, user_id: str, account_type: AccountType):
        self.account_id = str(uuid.uuid4())
        self.user_id = user_id
        self.type = account_type
        self.status = AccountStatus.ACTIVE
        self.balance = 0.0

    def deposit(self, amount: float):
        self.balance += amount

    def withdraw(self, amount: float):
        if self.balance >= amount:
            self.balance -= amount
        else:
            raise Exception("Insufficient funds")