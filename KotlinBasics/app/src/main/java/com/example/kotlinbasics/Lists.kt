package com.example.kotlinbasics

fun main() {

    val shoppingList1 = listOf("Processor", "RAM", "Graphics Card", "SSD")
    val shoppingList = mutableListOf("Processor", "RAM", "Graphics Card RTX 6030", "SSD")

//    shoppingList.remove("RAM")

//    val hasRam = shoppingList.contains("RAM")

//    if  (hasRam) println("there is RAM in the list")
    if  (shoppingList.contains("RAM")) println("there is RAM in the list")
    else println("there isn't RAM in the list")

//    shoppingList.add("Cooling System")
//    shoppingList.removeAt(2)
//    shoppingList.removeAt(1)
//    shoppingList.add(2, "RAM")
//    shoppingList.add("Graphics Card RTX 4090")
//    shoppingList[4] = "Graphics Card RX 7800XT"
//    shoppingList.set(1, "Water Cooling")
//    println(shoppingList)



//    println(shoppingList)
//    println(shoppingList[2])
//    println(shoppingList[4])

}