package com.example.kotlinbasics

import java.util.Locale

fun main() {
    val name: String? = "Ella"

    name?.let {
        println(it.uppercase(Locale.ROOT))
    }

}