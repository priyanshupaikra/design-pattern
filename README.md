# 🏦 Design Patterns – Learning with a Banking System

> A comprehensive guide to **Design Patterns** with theoretical concepts, learned and applied while designing a **Banking System**.

---

## 📚 Table of Contents

- [Introduction](#introduction)
- [Types of Design Patterns](#types-of-design-patterns)
- [Creational Design Patterns](#creational-design-patterns)
- [Structural Design Patterns](#structural-design-patterns)
- [Behavioral Design Patterns](#behavioral-design-patterns)
- [Advanced Design Patterns](#advanced-design-patterns)
- [MVC Design Pattern](#mvc-design-pattern)

---

## Introduction

**Design Patterns** are proven, reusable solutions to common problems that occur in software design. They are not finished code but rather templates or blueprints that describe how to solve a problem in various situations. Design patterns help developers write code that is **more maintainable, scalable, and flexible**.

### Why Learn Design Patterns?

- **Reusability** – Patterns provide tested, proven development paradigms.
- **Common Vocabulary** – They provide a shared language for developers to communicate design ideas.
- **Best Practices** – They capture expert knowledge and best practices.
- **Maintainability** – Code built with patterns is easier to understand, modify, and extend.

### Why a Banking System?

A banking system is a rich domain with complex requirements — account management, transactions, notifications, security, and reporting — making it an ideal candidate to apply and understand various design patterns in a real-world context.

---

## Types of Design Patterns

Design patterns are broadly classified into **three categories**:

| Category       | Purpose                                                                 |
|----------------|-------------------------------------------------------------------------|
| **Creational** | Deal with object creation mechanisms                                    |
| **Structural** | Deal with object composition and relationships between entities         |
| **Behavioral** | Deal with communication and responsibility distribution between objects |

---

## Creational Design Patterns

> Creational Design Patterns deal with **object creation** in a flexible and efficient manner. They help you control **how and when** objects are instantiated.

### 1. Singleton Pattern

Ensures a class has **only one instance** and provides a global point of access to it.

- **Banking Example:** A single `DatabaseConnection` or `BankConfiguration` instance shared across the entire application.

### 2. Factory Method Pattern

Defines an interface for creating objects but lets **subclasses decide** which class to instantiate.

- **Banking Example:** An `AccountFactory` that creates different account types (`SavingsAccount`, `CurrentAccount`) based on input.

### 3. Abstract Factory Pattern

Provides an interface for creating **families of related objects** without specifying their concrete classes.

- **Banking Example:** A `BankServiceFactory` that creates related services like `LoanService`, `InsuranceService` for different bank types (Retail vs Corporate).

### 4. Builder Pattern

Separates the **construction of a complex object** from its representation, allowing the same construction process to create different representations.

- **Banking Example:** Building a complex `BankAccount` object step-by-step — setting account holder, type, balance, overdraft limit, etc.

### 5. Prototype Pattern

Creates new objects by **cloning an existing object** (prototype) rather than creating from scratch.

- **Banking Example:** Cloning a template `LoanAgreement` and modifying specific fields for each customer.

### 6. Object Pool Pattern

Manages a pool of **reusable objects** to avoid the cost of creating and destroying them repeatedly.

- **Banking Example:** A pool of `DatabaseConnection` objects reused across multiple transaction requests.

### 7. Lazy Initialization

Delays the creation of an object or the calculation of a value **until it is first needed**.

- **Banking Example:** Loading a customer's full transaction history only when they explicitly request it.

---

## Structural Design Patterns

> Structural patterns explain how classes and objects are **combined to form larger structures**. They improve code flexibility by simplifying relationships between components.

### 1. Adapter Pattern

Converts the interface of a class into **another interface** that clients expect. It lets incompatible interfaces work together.

- **Banking Example:** Adapting a third-party payment gateway's API to work with the bank's internal payment processing interface.

### 2. Decorator Pattern

Adds **new responsibilities to an object dynamically** without altering its structure.

- **Banking Example:** Adding features like SMS notifications, insurance, or overdraft protection to a basic `BankAccount` dynamically.

### 3. Facade Pattern

Provides a **simplified interface** to a complex subsystem.

- **Banking Example:** A `BankingFacade` that provides simple methods like `openAccount()`, `transferFunds()`, hiding the complexity of multiple internal services.

### 4. Composite Pattern

Composes objects into **tree structures** to represent part-whole hierarchies, allowing clients to treat individual objects and compositions uniformly.

- **Banking Example:** Representing a bank's organizational structure — branches containing departments containing employees.

### 5. Proxy Pattern

Provides a **surrogate or placeholder** for another object to control access to it.

- **Banking Example:** A `SecureAccountProxy` that checks user authentication and authorization before allowing access to sensitive account operations.

### 6. Bridge Pattern

Separates an object's **abstraction from its implementation** so that the two can vary independently.

- **Banking Example:** Separating `Account` abstraction (Savings, Current) from `Bank` implementation (SBI, HDFC) so they can vary independently.

### 7. Flyweight Pattern

Reduces memory usage by **sharing common data** across multiple objects.

- **Banking Example:** Sharing common currency format, interest rate metadata across thousands of account objects instead of duplicating them.

---

## Behavioral Design Patterns

> Behavioral patterns define how objects **communicate and distribute responsibilities**. They help manage workflows, interactions, and decision-making within a system.

### 1. Observer Pattern

Defines a **one-to-many dependency** so that when one object changes state, all its dependents are notified.

- **Banking Example:** Notifying customers via SMS, Email, and Push Notification when a transaction occurs on their account.

### 2. Strategy Pattern

Defines a **family of algorithms**, encapsulates each one, and makes them interchangeable.

- **Banking Example:** Different interest calculation strategies — `SimpleInterest`, `CompoundInterest`, `FixedDeposit` — applied based on account type.

### 3. Command Pattern

Encapsulates a **request as an object**, allowing parameterization, queuing, logging, and undo operations.

- **Banking Example:** Encapsulating banking operations like `DepositCommand`, `WithdrawCommand`, `TransferCommand` — enabling undo/redo and transaction logging.

### 4. Chain of Responsibility Pattern

Passes a request along a **chain of handlers**, where each handler decides whether to process it or pass it along.

- **Banking Example:** Loan approval chain — `BranchManager` → `RegionalManager` → `HeadOffice` — each approving loans up to a certain limit.

### 5. Template Method Pattern

Defines the **skeleton of an algorithm** in a base class, letting subclasses override specific steps without changing the overall structure.

- **Banking Example:** A base `Transaction` class that defines steps: `validate()` → `execute()` → `log()`, with subclasses implementing each step differently.

### 6. Iterator Pattern

Provides a way to **sequentially access elements** of a collection without exposing its underlying representation.

- **Banking Example:** Iterating over a customer's transaction history without exposing the internal data structure (array, linked list, database cursor).

### 7. State Pattern

Allows an object to **alter its behavior** when its internal state changes.

- **Banking Example:** An `Account` that behaves differently based on its state — `Active`, `Frozen`, `Closed` — allowing or disallowing transactions accordingly.

### 8. Mediator Pattern

Defines an object that **encapsulates how a set of objects interact**, promoting loose coupling.

- **Banking Example:** A `TransactionMediator` coordinating between `Account`, `LedgerService`, `NotificationService`, and `FraudDetection` during a fund transfer.

### 9. Memento Pattern

Captures and stores an object's **internal state** so it can be **restored later** without violating encapsulation.

- **Banking Example:** Saving the state of a banking form or transaction-in-progress so the user can undo or go back to a previous step.

### 10. Visitor Pattern

Lets you **add new operations** to existing object structures without modifying them.

- **Banking Example:** Adding a new reporting or auditing operation across different account types (`Savings`, `Current`, `Loan`) without changing their classes.

---

## Advanced Design Patterns

> Advanced topics cover architectural principles and deeper system-design concepts. They help you build **enterprise-level, scalable, and robust** software systems.

### SOLID Principles

The five foundational principles of object-oriented design:

| Principle                       | Description                                                                                         |
|---------------------------------|-----------------------------------------------------------------------------------------------------|
| **S** – Single Responsibility   | A class should have only one reason to change.                                                      |
| **O** – Open/Closed             | Classes should be open for extension but closed for modification.                                   |
| **L** – Liskov Substitution     | Subtypes must be substitutable for their base types without altering program correctness.           |
| **I** – Interface Segregation   | Clients should not be forced to depend on interfaces they do not use.                               |
| **D** – Dependency Inversion    | High-level modules should depend on abstractions, not on low-level modules.                         |

### Dependency Injection Pattern

A technique where an object's **dependencies are provided externally** rather than created internally. This promotes loose coupling and testability.

- **Banking Example:** Injecting `NotificationService` and `TransactionRepository` into `AccountService` rather than instantiating them inside.

### Composition vs Inheritance

- **Inheritance** – "is-a" relationship (e.g., `SavingsAccount` *is an* `Account`).
- **Composition** – "has-a" relationship (e.g., `Account` *has a* `TransactionHistory`).
- **Best Practice:** Favor **composition over inheritance** for more flexible and maintainable designs.

### Event-Driven Architecture & Patterns

A software architecture pattern where the **flow of the program is driven by events** — such as user actions, sensor outputs, or message streams.

- **Banking Example:** A transaction event triggers fraud detection, notification, and ledger update services asynchronously.

### CQRS Design Pattern (Command Query Responsibility Segregation)

Separates **read (query)** and **write (command)** operations into different models for better performance and scalability.

- **Banking Example:** Separate models for processing transactions (write) and generating account statements (read).

### Event Sourcing Pattern

Stores the **state of an entity as a sequence of events** rather than just its current state.

- **Banking Example:** Instead of storing just the current balance, storing every deposit, withdrawal, and transfer event to reconstruct the balance at any point.

### CQRS vs Event Sourcing

| Aspect          | CQRS                                      | Event Sourcing                                    |
|-----------------|--------------------------------------------|--------------------------------------------------|
| **Focus**       | Separating reads from writes               | Storing state as a sequence of events             |
| **Complement**  | Often used together but are independent    | Can work without CQRS                             |
| **Use Case**    | High-read or high-write systems            | Audit trails, financial systems                   |

### Repository Pattern

Mediates between the **domain and data mapping layers** using a collection-like interface for accessing domain objects.

- **Banking Example:** An `AccountRepository` that abstracts whether accounts are stored in a SQL database, NoSQL store, or in-memory cache.

---

## MVC Design Pattern

**MVC (Model-View-Controller)** separates an application into three interconnected components:

| Component      | Responsibility                                                        |
|----------------|-----------------------------------------------------------------------|
| **Model**      | Manages data, business logic, and rules.                              |
| **View**       | Displays data to the user (UI).                                       |
| **Controller** | Handles user input and updates Model and View accordingly.            |

### Benefits:
- Improves **scalability** and **maintainability**.
- Supports **parallel development** — designers work on views, developers on logic.
- Clean separation of concerns.

- **Banking Example:** `AccountModel` (data & logic) → `AccountView` (dashboard UI) → `AccountController` (handles deposit/withdrawal requests).

---

## 🛠️ Tech Stack

- **Language:** Java / Python / C++ *(based on implementation)*
- **Concepts:** OOP, SOLID, Design Patterns
- **Domain:** Banking System

---

## 📝 License

This project is for **educational purposes** — learning and applying design patterns through a banking system domain.

---

> ⭐ *If you find this helpful, give it a star and start building!*
