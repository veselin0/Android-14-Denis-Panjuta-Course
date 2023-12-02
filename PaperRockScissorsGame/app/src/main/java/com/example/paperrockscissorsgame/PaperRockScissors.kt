package com.example.paperrockscissorsgame


fun main() {
    var computerChoice = ""
    var userChoice = ""
    var input: String

    while (userChoice == "") {
        println("Paper, Scissors or Rock? Enter your Choice:")
        input = readln().lowercase()

        if (input !in listOf("paper", "scissors", "rock")) {
            println("Invalid choice. Please choose between paper, scissors, or rock.")
        } else {
            userChoice = input
        }
    }

    val randomNumber = (1..3).random()
    when (randomNumber) {
        1 -> {
            computerChoice = "paper"
        }

        2 -> {
            computerChoice = "scissors"
        }

        3 -> {
            computerChoice = "rock"
        }

        else -> {}
    }
    println(computerChoice)

    val winner = when {
        userChoice == computerChoice -> "Tie"
        userChoice == "rock" && computerChoice == "scissors" -> "User"
        userChoice == "paper" && computerChoice == "rock" -> "User"
        userChoice == "scissors" && computerChoice == "paper" -> "User"
        else -> "Computer"
    }

    when (winner) {
        "Tie" -> println("It's a tie!")
        else -> println("$winner wins!")
    }



}