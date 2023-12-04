package com.example.kotlinbasics

fun main() {

    var daisy = Dog("Daisy", "boxer", 1)

    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old.")

    println("A year has passed.")

    daisy.age = 2
    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old.")

    println("And Daisy is now Crazy.")
    daisy.name = "Crazy"

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

fun makeCoffee(name: String, sugarCount: Int) {
//    if (sugarCount == 1) println("coffee with $sugarCount spoon of sugar for ")
//    else if (sugarCount == 0) println("Coffee with no sugar for $name")
//    else println("coffee with $sugarCount spoons of sugar for $name")
    when (sugarCount) {
        0 -> println("Coffee with no sugar for $name.")
        1 -> println("Coffee with $sugarCount spoon of sugar for $name.")
        else -> println("Coffee with $sugarCount spoons of sugar for $name.")
    }
}