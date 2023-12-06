package com.example.bankaccountprog

fun main() {

    val gochosBankAccount = BankAccount("Gocho Kochev", 5000.0)

    println("${gochosBankAccount.holderName}'s account current balance is ${gochosBankAccount.currentBalance()}")

    gochosBankAccount.deposit(200.0)
    gochosBankAccount.withdraw(2000.0)
    gochosBankAccount.deposit(3000.0)

    gochosBankAccount.displayTransactionsHistory()

    println("${gochosBankAccount.holderName}'s current balance is ${gochosBankAccount.currentBalance()} ")

    val kujosBankAccount = BankAccount("Kujo Dog", 6000.0)

    println("${kujosBankAccount.holderName}'s account current balance is ${kujosBankAccount.currentBalance()}")

    kujosBankAccount.deposit(2000.0)
    kujosBankAccount.withdraw(1000.0)
    kujosBankAccount.deposit(500.0)

    kujosBankAccount.displayTransactionsHistory()

    println("${kujosBankAccount.holderName}'s current balance is ${kujosBankAccount.currentBalance()} ")

    val sarahsBankAccount = BankAccount("Sarah", 0.0)

    println("${sarahsBankAccount.holderName}'s account current balance is ${sarahsBankAccount.currentBalance()}")

    sarahsBankAccount.deposit(100.0)
    sarahsBankAccount.withdraw(10.0)
    sarahsBankAccount.deposit(300.0)

    sarahsBankAccount.displayTransactionsHistory()

    println("${sarahsBankAccount.holderName}'s current balance is ${sarahsBankAccount.currentBalance()} ")



}