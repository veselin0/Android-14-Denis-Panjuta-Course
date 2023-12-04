package com.example.kotlinbasics

class Dog(var name: String, val breed: String, var age: Int = 0) {

    init {
        bark(name)
    }

    fun bark(name: String ) {
        println("$name says Woof, woof!")
    }
}