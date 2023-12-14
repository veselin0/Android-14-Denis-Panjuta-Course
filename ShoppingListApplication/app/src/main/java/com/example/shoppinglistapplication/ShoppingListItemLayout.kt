package com.example.shoppinglistapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ShoppingListItemLayout(
    item: ShoppingListItem,
    onEditClick: () -> Unit,
    onDeleteClick: () -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .border(
                border = BorderStroke(width = 2.dp, Color(0XFF018786)),
                shape = RoundedCornerShape(20)
            )
    ) {
        Text(text = item.name, modifier = Modifier.padding(8.dp))
        Text(text =  item.quantity.toString(), modifier = Modifier.padding(8.dp))
    }
}