package com.example.kotlinbasics

fun main() {

    var daisy = Dog("Daisy", "boxer", 1)

    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old.")

    println("A year has passed.")

    daisy.age = 2
    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old.")

    println("And Daisy is now Crazy.")
    daisy.name = "Crazy"

    val myBook = BookClass()
    println("${myBook.title}, ${myBook.author}, ${myBook.yearPublished}")

    val customBook = BookClass("Treasury Planet", "Steven King", 1960)
    println("${customBook.title}, ${customBook.author}, ${customBook.yearPublished}")

}