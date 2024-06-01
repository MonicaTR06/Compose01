package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.myapplication.ui.component.FilledButton
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
                        FilledButton(text = stringResource(id = R.string.structure)) {
                            val intent = Intent(this@MainActivity2, LayoutsActivity::class.java)
                            startActivity(intent)
                        }

                    }

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
    }



/*
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
*/
}