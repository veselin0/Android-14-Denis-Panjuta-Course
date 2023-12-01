package com.example.kotlinbasics

fun main() {

    var myAge: UShort = 35u
    println(myAge)

    myAge = 36u
    println(myAge)

    val pi = 3.14f
    println(pi)

    val myTrue: Boolean = true
    val myFalse: Boolean = false

    println(myTrue || myFalse)
    println(myTrue && myFalse)
    println(!myTrue)

    val myChar = 'a'
    println(myChar)

    val yourChar = '\u00AE'
    println(yourChar)

    val backSlash = '\\'
    println(backSlash)

    var name = "Gocho"
    name = "Kochev"
    println(name)
    println(name.uppercase())
    println(name.lowercase())

    val firstName = "Bocho"
    val lastName = "Dochev"
    println(firstName + " " + lastName)
    println("$firstName $lastName")
    println("${firstName.uppercase()} ${lastName.lowercase()}")
}