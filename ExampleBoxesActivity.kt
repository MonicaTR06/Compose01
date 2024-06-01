package com.example.home.mymovies


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.transform.CircleCropTransformation
import com.example.home.mymovies.ui.theme.MyMoviesTheme

class ExampleBoxesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyMoviesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MediaItem()
                    //ButtonText()
                    /*Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Greeting("Android", modifier = Modifier.align(Alignment.BottomEnd))
                        Greeting("Moni Android")
                    }*/
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(text = "Hola $name!", modifier = modifier)
}

@Preview(
    showBackground = true,
    name = "ButtonText",
    widthDp = 200,
    heightDp = 600
)
@Composable
fun ButtonText() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = stringResource(R.string.ExampleString),
            color = Color.White,
            fontSize = 15.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Thin,
            fontFamily = FontFamily.Monospace,
            letterSpacing = 5.sp,
            lineHeight = 16.sp,
            softWrap = false,//usar recorte a medias
            maxLines = 3,
            style = MaterialTheme.typography.h4.copy(
                shadow = Shadow(
                    offset = Offset(10f, 10f),
                    blurRadius = 5f,
                    color = Color.Yellow
                )
            ),
            overflow = TextOverflow.Ellipsis,//si no cabe texto
            textDecoration = TextDecoration.LineThrough,
            modifier = Modifier
                .clickable {

                }
                .background(Color.Blue)
                .border(width = 2.dp, color = Color.Cyan)
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .border(width = 2.dp, color = Color.Yellow)
                .padding(all = 4.dp)
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "MediaItem"
)
@Composable
fun MediaItem() {
    Column {
        Box(
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
                .background(color = Color.Blue)
        ) {
            AsyncImage(
                //model = "https://loremflickr.com/320/240/cat?lock=1",
                model = ImageRequest.Builder(context = LocalContext.current)
                    .data("https://loremflickr.com/320/240/cat?lock=1")
                    .crossfade(2000)
                    //.transformations(CircleCropTransformation())
                    .build(),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxSize(),
                // .clip(RoundedCornerShape(4.dp)),
                //.clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Icon(imageVector = Icons.Default.PlayArrow,
                tint = Color.White,
                contentDescription = "",
                modifier = Modifier.size(92.dp)
                    .align(Alignment.Center)
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.secondary)
                .padding(16.dp)
        ) {
            Text("Title Pelicula", style = MaterialTheme.typography.h6)
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Ejemplo",
    widthDp = 400,
    heightDp = 200
)
@Composable
fun DefaultPreview() {
    MyMoviesTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Yellow),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly //SpaceBetween(no pone espacio en los bordesarriba y abajo), SpaceAround(mismo espacio arriba y abajo x cada elemento)
        ) {
            Greeting2(
                name = "Android",
                modifier = Modifier.background(Color.Blue)
                //weight(1f) sin vertical
            )
            Greeting2(
                name = "Moni :) Android",
                modifier = Modifier.background(Color.Red)
            )
            Greeting2(
                name = "Moni :D",
                modifier = Modifier.background(Color.Green)
            )
        }
    }
}