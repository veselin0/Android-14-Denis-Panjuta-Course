package com.example.navigationexample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FirstScreen(navigateToSecondScreen: (String, String) -> Unit) {
    val name = remember { mutableStateOf("") }
    val age = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "This is the first screen", fontSize = 24.sp)
        OutlinedTextField(
            value = name.value,
            onValueChange = { name.value = it },
            label = { Text(text = "name") })
        OutlinedTextField(
            value = age.value,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChange = { age.value = it },
            label = { Text(text = "age") })
        Button(onClick = { navigateToSecondScreen(name.value, age.value) }) {
            Text(text = "Go to Second Screen")
        }
    }
}