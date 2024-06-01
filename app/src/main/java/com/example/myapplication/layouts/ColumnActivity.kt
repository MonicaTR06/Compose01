package com.example.myapplication.layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.component.Greeting
import com.example.myapplication.ui.theme.MyApplicationTheme

class ColumnActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultPreviewColumnActivity()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewColumnActivity() {
    MyApplicationTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            // verticalArrangement = Arrangement.SpaceEvenly//En función del espacio que tiene lo divide por igual arriba abajo
            //verticalArrangement = Arrangement.SpaceBetween//igual al anterior pero evita poner espacio en los bordes(top y bottom)
            verticalArrangement = Arrangement.SpaceAround,//mismo espacio arriba y abajo en cada elemento
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //weight dividir por peso en total hay 5 cajas que se reparte en toda la vista
            Text(text = "Column(LinerLayout vertical aprox)", modifier = Modifier.weight(1f))
            Greeting(name = "Android", modifier = Modifier.background(Color.Yellow).weight(2f))
            Greeting(name = "Android", modifier = Modifier.background(Color.Green).weight(2f))
        }
    }
}