package com.example.myapplication.layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.component.Greeting
import com.example.myapplication.ui.theme.MyApplicationTheme

class BoxActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultPreview()
        }
    }
}

@Preview(showBackground = true, name = "Android Greeting", widthDp = 400, heightDp = 200)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        //Box x defecto se adapata al tamaño de sus hijos
        Box(
            modifier = Modifier
                .fillMaxSize()//modificador para que ocupe toda la pantalla
                .background(Color.Gray),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Box (FrameLayout aprox)",
                modifier = Modifier.align(Alignment.TopCenter)
            )
            Greeting(name = "Monica", modifier = Modifier.align(Alignment.BottomStart))
            Greeting(name = "Toribio", modifier = Modifier.align(Alignment.BottomCenter))
            Greeting(name = "Yurani", modifier = Modifier.align(Alignment.BottomEnd))
        }
    }
}