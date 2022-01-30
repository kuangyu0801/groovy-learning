class Account {
    BigDecimal balance
    String type

    Account plus(Account other) {
        new Account(balance: this.balance + other.balance)
    }

    String toString() {
        "Account Balance: $balance"
    }

    BigDecimal deposit(BigDecimal amount) {
        balance += amount
    }

    BigDecimal withdraw(BigDecimal amount) {
        balance -= amount
    }
}

Account savings = new Account(balance:100.00, type:"saving")
savings.deposit(50)
Account checking = new Account(balance:500.00, type:"checking")
checking.withdraw(100)
println savings + checking