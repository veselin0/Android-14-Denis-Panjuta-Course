package com.example.kotlinbasics

fun main() {
    makeCoffee("Gocho", 0)
    makeCoffee("Bocho", 1)
    makeCoffee("Docho", 36)
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