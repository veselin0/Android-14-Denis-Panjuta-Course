package com.example.kotlinbasics

fun main() {

    val fruitList = mutableListOf("lemon", "apple", "kiwi", "pear", "melon")
    println(fruitList)

    for (item in fruitList) {
        println(item)
        if (item == "kiwi") {
            fruitList.removeLast()
            break
        }
    }

    println(fruitList)

    println(fruitList.size)

    for (index in 0..<fruitList.size) {
        println(index)
    }

    for (index in 0..<fruitList.size) {
        println("item ${fruitList[index]} is at index $index")
    }
}