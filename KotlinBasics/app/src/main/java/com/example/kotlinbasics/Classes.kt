package com.example.kotlinbasics

fun main() {

    val myBook = BookClass()
    println("${myBook.title}, ${myBook.author}, ${myBook.yearPublished}")

    val customBook = BookClass("Treasury Planet", "Steven King", 1960)
    println("${customBook.title}, ${customBook.author}, ${customBook.yearPublished}")

}