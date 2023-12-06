package com.example.kotlinbasics

fun main() {

    val numbers = mutableListOf(1, 2, 3, 4, 5)

    for (index in 0 ..<numbers.size){
        numbers[index] = numbers[index] * 2
//        println(index)
    }

    println(numbers)

}