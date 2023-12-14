package com.example.kotlinbasics

fun main() {
    val blueRoseVase = Vase(roseColor = "blue", vaseDesign = "Rose")
    val redRoseVase = blueRoseVase.copy(roseColor = "Red")
    println(redRoseVase.roseColor)
    println(redRoseVase.vaseDesign)
    println("")
    println(blueRoseVase)
    println(redRoseVase)
}

data class Vase(val roseColor: String, val vaseDesign: String)