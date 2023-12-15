package com.example.counterviewmodel

import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    private val _count = mutableIntStateOf(0)

//    Expose count as an immutable state?
    val count: MutableIntState = _count

    fun increment() {
        _count.intValue++
    }

    fun decrement() {
        _count.intValue--
    }
}