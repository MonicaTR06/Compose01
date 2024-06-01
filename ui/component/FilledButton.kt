package com.example.home.mymovies.ui.component

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun FilledButton(text:String, onClick: () -> Unit) {
    Button(onClick = { onClick() }) {
        Text(text)
    }
}