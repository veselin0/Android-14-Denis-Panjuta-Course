package com.example.kotlinbasics

fun main() {

    val fruitList = mutableListOf("lemon", "apple", "kiwi", "pear", "melon")
    println(fruitList)
    fruitList.add("orange")
    println(fruitList)
    fruitList.remove("kiwi")
    println(fruitList)

    if (fruitList.contains("apple")) println("There is an apple in the list.")
    else println("There isn't an apple in the list.")
}