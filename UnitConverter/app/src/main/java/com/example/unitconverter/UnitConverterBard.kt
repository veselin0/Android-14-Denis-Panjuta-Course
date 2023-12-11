package com.example.unitconverter

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@SuppressLint("UnusedMaterialScaffoldPaddingParameter", "UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun LengthConverterApp() {
    val context = LocalContext.current
    val fromValue = remember { mutableStateOf("") }
    val fromUnit = remember { mutableStateOf("Millimeters") }
    val toUnit = remember { mutableStateOf("Meters") }
    val convertedValue = remember { mutableStateOf("") }
    var expanded by remember { mutableStateOf(false) }
    val options = listOf("Millimeters", "Centimeters", "Meters")

    val initialValue = fromUnit.value

    Scaffold {
        Column {
            Text(text = "Length Converter")

            Row {
                Text(text = "From:")
                Spacer(modifier = Modifier.width(10.dp))
                TextField(
                    value = fromValue.value,
                    onValueChange = { fromValue.value = it },
                    modifier = Modifier.width(200.dp).clickable { expanded = true }
                )
            }

            Row {
                Text(text = "From Unit:")
                Spacer(modifier = Modifier.width(10.dp))
                DropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
//                    options = listOf("Millimeters", "Centimeters", "Meters"),
//                    initialValue = fromUnit.value
                ) {
                    options.forEach { option ->
                        DropdownMenuItem(
                            text = { Text(text = option) },
                            onClick = { fromUnit.value = option })
                    }
                }
            }

//            Row {
//                Text(text = "To Unit:")
//                Spacer(modifier = Modifier.width(10.dp))
//                DropdownMenu(
//                    options = listOf("Millimeters", "Centimeters", "Meters"),
//                    initialValue = toUnit.value
//                ) { option ->
//                    DropdownMenuItem(onClick = { toUnit.value = option }) { Text(text = option) }
//                }
//            }
//
//            Button(onClick = {
//                convertedValue.value = convertValue(
//                    fromValue.value.toDouble(), fromUnit.value, toUnit.value
//                ).toString()
//            }) {
//                Text(text = "Convert")
//            }

            Text(text = "Converted Value: ${convertedValue.value}")
        }
    }
}

//fun convertValue(value: Double, fromUnit: String, toUnit: String): Double {
//    when (fromUnit) {
//        "Millimeters" -> {
//            if (toUnit == "Centimeters") {
//                return value * 0.1
//            } else if (toUnit == "Meters") {
//                return value * 0.001
//            }
//        }
//
//        "Centimeters" -> {
//            if (toUnit == "Millimeters") {
//                return value * 10
//            } else if (toUnit == "Meters") {
//                return value * 0.01
//            }
//        }
//
//        "Meters" -> {
//            if (toUnit == "Millimeters") {
//                return value * 1000
//            } else if (toUnit == "Centimeters") {
//                return value * 100
//            }
//        }
//
//        else -> {
//            // Invalid unit
//            return 0.0
//        }
//    }
//}


@Preview
@Composable
fun LengthConverterAppPreview() {
    LengthConverterApp()
}


