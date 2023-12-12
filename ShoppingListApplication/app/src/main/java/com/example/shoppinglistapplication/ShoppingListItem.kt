package com.example.shoppinglistapplication

data class ShoppingListItem(
    val id: Int,
    var name: String,
    var quantity: Int,
    var isBeingEdited: Boolean
)