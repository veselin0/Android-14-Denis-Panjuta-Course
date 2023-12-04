package com.example.kotlinbasics

fun main() {
    println("Who is this coffee for?")
    val name = readln()
    println("How much sugar doe's the subject want?")
    val sugarCount = readln().toInt()
    makeCoffee(name, sugarCount)
}

fun makeCoffee(name: String, sugarCount: Int) {
//    if (sugarCount == 1) println("coffee with $sugarCount spoon of sugar for ")
//    else if (sugarCount == 0) println("Coffee with no sugar for $name")
//    else println("coffee with $sugarCount spoons of sugar for $name")
    when(sugarCount) {
        0 -> println("Coffee with no sugar for $name.")
        1 -> println("Coffee with $sugarCount spoon of sugar for $name.")
        else -> println("Coffee with $sugarCount spoons of sugar for $name.")
    }
}