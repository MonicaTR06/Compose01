package com.example.myapplication.ui.component

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun FilledButton(text:String, onClick: () -> Unit) {
    Button(onClick = { onClick() }) {
        Text(text)
    }
}