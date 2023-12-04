package com.example.kotlinbasics

class Dog(val name: String, val breed: String, val age: Int = 0) {

    init {
        bark(name)
    }

    fun bark(name: String ) {
        println("$name says Woof, woof!")
    }
}