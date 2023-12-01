package com.example.paperrockscissorsgame


fun main() {
    var computerChoice = ""
    var userChoice = ""
    println("Paper, Scissors or Rock? Enter your Choice:")
    userChoice = readln()

    val randomNumber = (1..3).random()
    computerChoice = if (randomNumber == 1) "paper"
    else if (randomNumber == 2) "scissors"
    else "rock"
    println(computerChoice)
}