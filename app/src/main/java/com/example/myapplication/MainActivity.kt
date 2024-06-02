package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.layouts.BoxActivity
import com.example.myapplication.layouts.ColumnActivity
import com.example.myapplication.layouts.ExampleBoxesActivity
import com.example.myapplication.layouts.RowActivity
import com.example.myapplication.layouts.StateActivity
import com.example.myapplication.ui.component.FilledButton
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
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
                        val intent = Intent(this@MainActivity, BoxActivity::class.java)
                        startActivity(intent)
                    }
                    FilledButton("Box with Constraints") {}
                    FilledButton("Column") {
                        val intent = Intent(this@MainActivity, ColumnActivity::class.java)
                        startActivity(intent)
                    }
                    FilledButton("Row") {
                        val intent = Intent(this@MainActivity, RowActivity::class.java)
                        startActivity(intent)
                    }
                    FilledButton("State") {
                        val intent = Intent(this@MainActivity, StateActivity::class.java)
                        startActivity(intent)
                    }
                    FilledButton("ExampleBoxes") {
                        val intent = Intent(this@MainActivity, ExampleBoxesActivity::class.java)
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
        /*
         MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        * */
    }
}
/*
//enableEdgeToEdge()//??
        setContent {
            MyApplicationTheme { //(optional) own theme
                Surface(//Component of compose (container)
                    modifier = Modifier.fillMaxSize(),//Modifier api tipo Builder
                    /*
                    * Tipos Modifier
                    * 1.Posicionamiento y tamaño: fillMaxWidth,flagContentHeigth, width, heigth,asperRatio
                    * 2.Funcionalidad:ampliar caracteristicas clicabke, flowable, scroll al layoput horizontalscroll verticalscroll
                    * 3.Apariencia: background,padding,scale, border, alpha
                    * 4.Listeners: onfocuschange, onsizechange,onkeyEvent
                    *
                    * Orden de Modifier muy importante y puedes repetir modifiers, el onclick primero si deaseas que abarque a todo el contenido
                    * */
                    //color = MaterialTheme.colors.background
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        FilledButton(text = stringResource(id = R.string.layouts)) {
                            val intent = Intent(this@MainActivity, LayoutsActivity::class.java)
                            startActivity(intent)
                        }
                    }
                }
            }
        }
* */