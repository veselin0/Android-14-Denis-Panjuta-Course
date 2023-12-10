package com.example.captaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.captaingame.ui.theme.CaptainGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaptainGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CaptainGame()
                }
            }
        }
    }
}

@Composable
fun CaptainGame() {
    var treasuresFound by remember { mutableIntStateOf(0) }
    var direction by remember { mutableStateOf("North") }
    var stormOrTreasure by remember { mutableStateOf("") }

    Column {
        Text(text = "Treasures found: ${treasuresFound}")
        Text(text = "Current direction: ${direction}")
        Text(text = stormOrTreasure)

        Button(onClick = {
            direction = "East"
            if (Random.nextBoolean()) {
                treasuresFound += 1
                stormOrTreasure = "Found a Treasure!"
            } else {
                stormOrTreasure = "Storm Ahead!"
            }
        }) {
            Text(text = "Sail East")
        }
        Button(onClick = {
            direction = "West"
            if (Random.nextBoolean()) {
                treasuresFound += 1
                stormOrTreasure = "Found a Treasure!"
            } else {
                stormOrTreasure = "Storm Ahead!"
            }
        }) {
            Text(text = "Sail West")
        }
        Button(onClick = {
            direction = "North"
            if (Random.nextBoolean()) {
                treasuresFound += 1
                stormOrTreasure = "Found a Treasure!"
            } else {
                stormOrTreasure = "Storm Ahead!"
            }
        }) {
            Text(text = "Sail North")
        }
        Button(onClick = {
            direction = "South"
            if (Random.nextBoolean()) {
                treasuresFound += 1
                stormOrTreasure = "Found a Treasure!"
            } else {
                stormOrTreasure = "Storm Ahead!"
            }
        }) {
            Text(text = "Sail South")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CaptainGamePreview() {
    CaptainGameTheme {
        CaptainGame()
    }
}