package com.example.home.mymovies

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.home.mymovies.layouts.BoxActivity
import com.example.home.mymovies.layouts.ColumnActivity
import com.example.home.mymovies.layouts.RowActivity
import com.example.home.mymovies.ui.component.FilledButton
import com.example.home.mymovies.ui.theme.MyMoviesTheme

class LayoutsActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyMoviesTheme {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Layouts más eficientes",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(16.dp)
                    )
                    FilledButton("Box") {
                        val intent = Intent(this@LayoutsActivity, BoxActivity::class.java)
                        startActivity(intent)
                    }
                    FilledButton("Box with Constraints") {}
                    FilledButton("Column") {
                        val intent = Intent(this@LayoutsActivity, ColumnActivity::class.java)
                        startActivity(intent)
                    }
                    FilledButton("Row") {
                        val intent = Intent(this@LayoutsActivity, RowActivity::class.java)
                        startActivity(intent)
                    }

                }
                /*

                 Text("LazyRow, LazyColumn, LazyVerticalGrid(recycler view aprox)")
                 Text("ConstraintLayout")
                 Text("Scaffold posiciona los elementos tipos de na pantalla material")
                 Text("Surface se parece al box pero aplica conceptos de Material")
                 Text("Card")*/
            }
        }
    }
}