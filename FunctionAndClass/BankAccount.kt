fun main() {
    val customer = BankAccount()
    customer.accountNumber = 12345
    customer.balance = 5000
    println(customer.currentBalance())
    customer.deposit(500)
    println(customer.currentBalance())
    customer.withdraw(600)
    println(customer.currentBalance())
}

class BankAccount {
    var accountNumber: Int = 0
    var balance: Int = 0

    fun deposit(amt: Int) {
        balance += amt
    }

    fun withdraw(amt: Int) {
        balance -= amt
    }

    fun currentBalance(): Int {
        return balance
    }
}
