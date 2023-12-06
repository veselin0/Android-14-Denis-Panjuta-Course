package com.example.bankaccountprog

class BankAccount(var holderName: String, var balance: Double) {
    private val transactionsHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        balance += amount
        transactionsHistory.add("$holderName deposited $$amount")
    }

    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            transactionsHistory.add("$holderName withdrew $$amount")
        } else {
            println("You have not enough funds to withdraw $$amount")
        }
    }

    fun displayTransactionsHistory() {
        println("Transaction History of $holderName")
        for (transaction in transactionsHistory) {
            println(transaction)
        }
    }
}