package com.saber.jetcomposesample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.Spacing
import androidx.ui.material.MaterialTheme
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontStyle
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewText()
        }
    }
}

@Composable
fun NewText() {
    Column() {
        Text("First Line",style = TextStyle(color = Color.White))
        Text("Second Line",style = TextStyle(color = Color.Red,fontStyle = FontStyle.Italic))
        Text("Third line", modifier = Spacing(all = 30.dp))
    }
}

@Preview
@Composable
fun DefaultPreview() {
    NewText()
}
