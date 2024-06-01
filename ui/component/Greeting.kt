package com.example.home.mymovies.ui.component

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.home.mymovies.ui.theme.MyMoviesTheme

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text("Hi $name", modifier = modifier)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewGreeting() {
    MyMoviesTheme {
        Greeting("Android")
    }
}