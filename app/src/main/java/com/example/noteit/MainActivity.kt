package com.example.noteit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.noteit.ui.theme.NoteITTheme
import com.example.noteit.Screens.HomeScreen.HomeScreenComponents

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NoteITTheme {
                HomeScreenComponents()
            }
        }
    }
}

@Preview
@Composable
fun PreviewToDoListApp() {
    HomeScreenComponents()
}

