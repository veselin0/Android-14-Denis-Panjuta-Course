package com.example.kotlinbasics

fun main() {

    val shoppingList1 = listOf("Processor", "RAM", "Graphics Card", "SSD")
    val shoppingList = mutableListOf("Processor", "RAM", "Graphics Card RTX 6030", "SSD")
    shoppingList.add("Cooling System")
    shoppingList.remove("Graphics Card RTX 6030")
    shoppingList.add("Graphics Card RTX 4090")

    println(shoppingList)
}