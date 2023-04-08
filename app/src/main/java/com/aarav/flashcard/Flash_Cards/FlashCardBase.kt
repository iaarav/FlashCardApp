package com.aarav.flashcard.Flash_Cards

import android.view.Surface
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.math.sin

@Composable
fun FCB(card_Questions: List<String>) {
    LazyColumn {
        items(card_Questions) { it ->
            FCB_Cards(question = it )
        }
    }
}


@Composable
fun FCB_Cards(question:String) {
    Card(
        modifier = Modifier.size(50.dp),
        shape = RoundedCornerShape(10.dp),
        backgroundColor = Color.LightGray
    ) {
        Text(text = question )
    }
}