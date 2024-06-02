package com.example.myapplication.layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class StateActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
//var text by rememberSaveable { mutableStateOf("") }
                /*

                Scaffold() {
                }
                 val (value, onValueChange) = rememberSaveable { mutableStateOf("") }
                 StateSample(
                     text = value,
                     onValueChange = onValueChange
                 )*/
            }
        }
    }

    @Composable
    fun StateSample(text: String, onValueChange: (String) -> Unit) {
        //var text = remember { mutableStateOf("") }
        /*var text by remember {
            mutableStateOf("")
        }*/
        /*var text by rememberSaveable {
            mutableStateOf("")
        */

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(64.dp),
            verticalArrangement = Arrangement.Center
        ) {
            TextField(
                value = text, //text.value
                onValueChange = { onValueChange(it) },
                modifier = Modifier.fillMaxWidth()
            )
            Text(
                text = text,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Yellow)
                    .padding(8.dp)
            )
            Button(
                onClick = { onValueChange("") },
                modifier = Modifier.fillMaxWidth(),
                enabled = text.isNotEmpty()
            ) {
                Text(text = "Clear")
            }
        }
    }
}