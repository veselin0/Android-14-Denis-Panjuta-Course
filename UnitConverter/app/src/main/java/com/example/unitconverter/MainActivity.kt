package com.example.unitconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.unitconverter.ui.theme.UnitConverterTheme
import kotlin.math.ceil
import kotlin.math.roundToInt

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConverterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    UnitConverter()
                }
            }
        }
    }
}

@Composable
fun UnitConverter() {
    var inputValue by remember { mutableStateOf("") }
    var outputValue by remember { mutableStateOf("") }
    var inputUnit by remember { mutableStateOf("Meter") }
    var outputUnit by remember { mutableStateOf("Meter") }
    var isInputExpanded by remember { mutableStateOf(false) }
    var isOutputExpanded by remember { mutableStateOf(false) }
    val inputConversionFactor = remember { mutableDoubleStateOf(1.0) }
    val outputConversionFactor = remember { mutableDoubleStateOf(1.0) }

    fun convertUnits() {

//        ?: - elvis operator
        val inputValueDouble = inputValue.toDoubleOrNull() ?: 0.0
        val result = (((inputValueDouble * inputConversionFactor.doubleValue * 100.0) / outputConversionFactor.doubleValue)).roundToInt() / 100.0
        outputValue = result.toString()

    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Unit Converter")
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = inputValue,
            label = { Text(text = "Enter Value") },
            onValueChange = {
                inputValue = it
                convertUnits()
            })
        Spacer(modifier = Modifier.height(16.dp))
        Row {
//            Input Box
            Box {
//            Input Button
                Button(onClick = { isInputExpanded = true }) {
                    Text(text = inputUnit)
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Down")
                }
                DropdownMenu(
                    expanded = isInputExpanded,
                    onDismissRequest = { isInputExpanded = false }) {
                    DropdownMenuItem(text = { Text(text = "Meters") }, onClick = {
                        isInputExpanded = false
                        inputUnit = "Meters"
                        inputConversionFactor.doubleValue = 1.0
                        convertUnits()
                    })
                    DropdownMenuItem(
                        text = { Text(text = "Centimeters") },
                        onClick = {
                            isInputExpanded = false
                            inputUnit = "Centimeters"
                            inputConversionFactor.doubleValue = 0.01
                            convertUnits()
                        })
                    DropdownMenuItem(text = { Text(text = "Millimeters") },
                        onClick = {
                            isInputExpanded = false
                            inputUnit = "Millimeters"
                            inputConversionFactor.doubleValue = 0.001
                            convertUnits()
                        })
                    DropdownMenuItem(text = { Text(text = "Feet") },
                        onClick = {
                            isInputExpanded = false
                            inputUnit = "Feet"
                            inputConversionFactor.doubleValue = 0.3048
                            convertUnits()
                        })
                }
            }
            Spacer(modifier = Modifier.width(16.dp))

//                Output Box
            Box {
//                Output Button
                Button(onClick = { isOutputExpanded = true }) {
                    Text(text = outputUnit)
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Down")
                }
                DropdownMenu(
                    expanded = isOutputExpanded,
                    onDismissRequest = { isOutputExpanded = false }) {
                    DropdownMenuItem(text = { Text(text = "Meters") },
                        onClick = {
                            isOutputExpanded = false
                            outputUnit = "Meters"
                            outputConversionFactor.doubleValue = 1.0
                            convertUnits()
                        })
                    DropdownMenuItem(text = { Text(text = "Centimeters") }, onClick = {
                        isOutputExpanded = false
                        outputUnit = "Centimeters"
                        outputConversionFactor.doubleValue = 0.01
                        convertUnits()
                    })
                    DropdownMenuItem(text = { Text(text = "Millimeters") }, onClick = {
                        isOutputExpanded = false
                        outputUnit = "Millimeters"
                        outputConversionFactor.doubleValue = 0.001
                        convertUnits()
                    })
                    DropdownMenuItem(text = { Text(text = "Feet") }, onClick = {
                        isOutputExpanded = false
                        outputUnit = "Feet"
                        outputConversionFactor.doubleValue = 0.3048
                        convertUnits()
                    })
                }
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text("Result: $outputValue $outputUnit")
    }
}


@Preview(showBackground = true)
@Composable
fun UnitConverterPreview() {
    UnitConverterTheme {
        UnitConverter()
    }
}