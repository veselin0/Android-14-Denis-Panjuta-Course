package com.example.kotlinbasics

fun main() {
    var number: Int
    println("Please, enter a number")
    try {
//        error prone code you want to execute
        number = readln().toInt()
        println("User entered: $number")
    }catch (e: Exception) {
//        what should happen when error occurs
        println("Error: ${e.message}")
    }finally {
        number = 0
//        println(number)
//        println("This will be executed regardless, weather there is an error or not ")
    }
}