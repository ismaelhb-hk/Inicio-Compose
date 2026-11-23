package com.ismael.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ismael.myapplication.ui.theme.ComposePruebas1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Prueba1()
        }
    }
}



@Composable

fun Prueba1() {
    Column(modifier = Modifier.padding(all = 20.dp)) {
    Row(modifier = Modifier.padding(all = 20.dp)) {
        Text(text = "Fila1")
        Spacer(modifier = Modifier.width(40.dp))
        Text(text = "Fila2")
    }


        Text(text = "Hola clase dam")

        Text(text = "Esto es la clase dam ")
    }

}

@Composable
@Preview
fun Prueba1preview() {
        Prueba1()
    
}


