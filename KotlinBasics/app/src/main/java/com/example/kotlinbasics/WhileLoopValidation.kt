package com.example.kotlinbasics

import java.util.Scanner


fun main() {
   val scanner = Scanner(System.`in`)

    var choice: String? = null

    while (choice == null) {
        println("Choose between paper, scissors, or rock: ")
      val input = scanner.nextLine()

        if (input !in listOf("paper", "scissors", "rock")) {
            println("Invalid choice. Please choose between paper, scissors, or rock.")
        } else {
            choice = input
        }
    }

    println("You chose: $choice")
}
