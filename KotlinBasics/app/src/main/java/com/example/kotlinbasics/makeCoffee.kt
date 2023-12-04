package com.example.kotlinbasics

fun main() {

    val coffeeeForGocho = CoffeeDetails(2, "Gocho", "Long", 3)

    makeCoffee(coffeeeForGocho)

}

fun divide(dou1: Double, dou2: Double): Double {
    return dou1 / dou2
}

fun add(): Int {
    println("Please enter an integer:")
    var int1 = readln().toInt()
    println("Please, enter another integer:")
    var int2 = readln().toInt()

    return int1 + int2
}

fun coffeeDetails() {
    println("Who is this coffee for?")
    val name = readln()
    println("How much sugar doe's the subject want?")
    val sugarCount = readln().toInt()
}

fun makeCoffee(coffeeDetails: CoffeeDetails) {
//    if (sugarCount == 1) println("coffee with $sugarCount spoon of sugar for ")
//    else if (sugarCount == 0) println("Coffee with no sugar for $name")
//    else println("coffee with $sugarCount spoons of sugar for $name")
    when (coffeeDetails.sugarCount) {
        0 -> println("Coffee with no sugar for ${coffeeDetails.name}.")
        1 -> println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name}.")
        else -> println("${coffeeDetails.size} coffee with ${coffeeDetails.sugarCount} spoons of sugar and ${coffeeDetails.creamAmount} spoons of cream for ${coffeeDetails.name}.")
    }
}