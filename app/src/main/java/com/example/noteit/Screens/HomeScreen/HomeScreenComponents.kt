package com.example.noteit.Screens.HomeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.noteit.R

@Composable
fun HomeScreenComponents() {
    Column (
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
    ) {
        Header(onMenuClicked = { /*TODO*/ }, profileImageResId = R.mipmap.ic_image)
        TodoListTitle()
        Spacer(modifier = Modifier.height(16.dp))
        TabRowComponent()
        ListItems(todoItems = listOf(
            "Finances", "Work", "Gym", "Reading books"
        ))
        Button()
    }
}