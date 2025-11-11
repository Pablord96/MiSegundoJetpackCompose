package com.example.misegundojetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.content.contentReceiver
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.misegundojetpackcompose.ui.theme.MiSegundoJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiSegundoJetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Pablo",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun MiFuncion1() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Greeting("Eduardo",
            modifier = Modifier
                .background(color = Color.Red))
        Greeting("Pablo",
            modifier =  Modifier
                .align(Alignment.BottomCenter)
                .background(color = Color.Yellow))
        Greeting("Jorge",
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .background(color = Color.Red))
    }
}

@Composable
fun MiFuncion2(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Greeting(
            "Pablo Rodriguez",
            modifier = Modifier
                .background(Color.Red)
        )
        Greeting(
            "Android",
            modifier = Modifier
                .background(Color.Yellow)
                .weight(2f)
        )
        Greeting(
            "San Juan de la Cruz",
            modifier = Modifier
                .background(Color.Red)
                .weight(1f)
        )
    }
}

@Composable
fun MiFuncion3(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ){
        Greeting(
            "Pablo ",
            modifier = Modifier
                .background(Color.Red)
        )
        Greeting(
            "Android",
            modifier = Modifier
                .background(Color.Yellow)
        )
        Greeting(
            "San Juan",
            modifier = Modifier
                .background(Color.Red)
        )
    }
}

@Preview(showBackground = true, widthDp = 200, heightDp = 100)
@Composable
fun MiBoton(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(text="Pulsa Aquí",
            modifier = Modifier.background(Color.Green)
                .border(width = 2.dp, color = Color.Black)
                .padding(horizontal = 20.dp, vertical = 10.dp))
    }
}

//@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MiSegundoJetpackComposeTheme {
        Greeting("Android")
    }
}

//@Preview(showBackground = true, name = "Pablo Preview")
@Composable
fun MiFuncion1Preview() {
    MiSegundoJetpackComposeTheme {
        MiFuncion1()
    }
}

//@Preview(showBackground = true, name = "Pablo Preview 2")
@Composable
fun MiFuncion2Preview() {
    MiSegundoJetpackComposeTheme {
        MiFuncion2()
    }
}

//@Preview(showBackground = true, name = "Pablo Preview 3")
@Composable
fun MiFuncion3Preview() {
    MiSegundoJetpackComposeTheme {
        MiFuncion3()
    }
}