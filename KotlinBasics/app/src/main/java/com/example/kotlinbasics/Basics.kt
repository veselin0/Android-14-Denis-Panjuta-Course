package com.example.kotlinbasics

fun main() {

//    var myAge: UShort = 35u
//    println(myAge)
//
//    myAge = 36u
//    println(myAge)
//
//    val pi = 3.14f
//    println(pi)
//
//    val myTrue: Boolean = true
//    val myFalse: Boolean = false
//
//    println(myTrue || myFalse)
//    println(myTrue && myFalse)
//    println(!myTrue)
//
//    val myChar = 'a'
//    println(myChar)
//
//    val yourChar = '\u00AE'
//    println(yourChar)
//
//    val backSlash = '\\'
//    println(backSlash)
//
//    var name = "Gocho"
//    name = "Kochev"
//    println(name)
//    println(name.uppercase())
//    println(name.lowercase())
//
//    val firstName = "Bocho"
//    val lastName = "Dochev"
//    println(firstName + " " + lastName)
//    println("$firstName $lastName")
//    println("${firstName.uppercase()} ${lastName.lowercase()}")


//    if
//    var age = 0
//    println("Please, enter your age: ")
//    val inputData = readln()
//    if (inputData.isNotEmpty()) {
//        age = inputData.toInt()
//        if (age >= 18) {
//            println("You can go to the pub")
//        } else {
//            println("You can't go to the pub")
//        }
//    }

//    else if
//    var age = 0
//    println("Please, enter your age: ")
//    val inputData = readln()
//    if (inputData.isNotEmpty()) {
//        age = inputData.toInt()
//        if (age in 18 .. 39) {
//            println("You can go to the pub")
//        } else if (age >= 40) {
//            println("You can't go to the pub")
//        } else {
//            println("You are too young to get into the pub")
//        }
//    }

    var userInput = readln()
    while (userInput == "1") {
        println("Loop ie executed")
        userInput = readln()
    }
    println("Loop is done!")
}