package com.example.home.mymovies.layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.home.mymovies.ui.component.Greeting
import com.example.home.mymovies.ui.theme.MyMoviesTheme

class RowActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultPreview2()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    MyMoviesTheme {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Greeting(name = "Android", modifier = Modifier.background(Color.Green))
            Greeting(name = "Android", modifier = Modifier.background(Color.Yellow))
        }
        //Si ocupa más de lo hay en pantalla no se verá, no hay scroll aquí
    }
}