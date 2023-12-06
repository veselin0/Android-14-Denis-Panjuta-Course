package com.example.bankaccountprog

fun main() {

    val GochosBankAccount = BankAccount("Gocho Kochev", 5000.0)

    GochosBankAccount.deposit(200.0)
    GochosBankAccount.withdraw(2000.0)
    GochosBankAccount.deposit(3000.0)
    GochosBankAccount.deposit(2000.0)
    GochosBankAccount.withdraw(4500.0)

    GochosBankAccount.displayTransactionsHistory()

    println("${GochosBankAccount.holderName}'s balance is ${GochosBankAccount.balance} ")

}