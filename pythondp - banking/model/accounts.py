import uuid
from abc import ABC, abstractmethod


class AbstractAccount(ABC):

    def __init__(self, user_id):
        self.account_id = str(uuid.uuid4())
        self.user_id = user_id
        self.balance = 0.0

    def deposit(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        if self.balance >= amount:
            self.balance -= amount
        else:
            raise Exception("Insufficient funds")

    @abstractmethod
    def calculate_interest(self):
        pass