package com.example.noteit.Screens.HomeScreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ListItems(todoItems: List<String>) {
    LazyColumn {
        itemsIndexed(items = todoItems.chunked(2)) {index, chunkedItems ->
            Row (
                modifier = Modifier.fillMaxWidth()
            ) {
                for (item in chunkedItems) {
                    listItemsCard()
                    Spacer(modifier = Modifier.width(8.dp))
                }
            }
        }
    }
}

@Composable
fun listItemsCard() {
    Box {
        Card (
            modifier = Modifier
                .padding(start = 20.dp, bottom = 16.dp, top = 16.dp)
                .clickable { }
                .size(width = 160.dp, height = 120.dp),
            shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
        ) {
            Row (modifier = Modifier.padding(8.dp)) {
                Icon(
                    Icons.Filled.CalendarMonth,
                    contentDescription = "Calender",
                    modifier = Modifier.size(48.dp))
                Spacer(modifier = Modifier.width(16.dp))
                Column (
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Text(text = "Finances", style = TextStyle(fontSize = 18.sp))
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(text = "3 tasks", style = TextStyle(fontSize = 13.sp))
                }
            }
        }
    }
}