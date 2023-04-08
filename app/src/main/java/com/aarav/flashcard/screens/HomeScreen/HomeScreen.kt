package com.aarav.flashcard.screens

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.aarav.flashcard.Navigation.SubjectScreens
import com.aarav.flashcard.Navigation.SubjectScreens.*


@Composable
fun MainnScreen(navController: NavController) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(), color = Color(0xFFEEA975)
    ) {
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {

            Spacer(modifier = Modifier.height(50.dp))
            Header()
            Spacer(modifier = Modifier.height(60.dp))
            val subject = listOf("Physics", "Chemistry", "Biology", "Maths")

            Column(modifier = Modifier.padding(12.dp)) {
                LazyColumn {
                    items(subject) {
                        SubjectRow(Sname = it){subject->
                            if(subject.equals("Physics")) navController.navigate(route = SubjectScreens.Flash_Screen1.name)
                            if(subject.equals("Chemistry")) navController.navigate(route = SubjectScreens.Flash_Screen2.name)
                            if(subject.equals("Biology")) navController.navigate(route = SubjectScreens.Flash_Screen3.name)
                            if(subject.equals("Maths")) navController.navigate(route = SubjectScreens.Flash_Screen4.name)
                            Log.d("Subject", "Subjects: clicked $subject ")
                        }
                    }
                }

            }
        }
    }
}


@Composable
fun Header() {
    Card(
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .height(100.dp),
        backgroundColor = Color.White,
        shape = RoundedCornerShape(20.dp)
    ) {

    }
}

@Composable
fun Subjects(subject: List<String>) {

}

@Composable
fun SubjectRow(Sname: String, onItemClick: (String) -> Unit) {
    Card(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth(0.9f)
            .height(100.dp)
            .clickable {
                onItemClick(Sname)
            },
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp,
        backgroundColor = Color(0xFFC2E2E7)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Surface(
                modifier = Modifier
                    .padding(15.dp)
                    .size(100.dp),
                shape = RectangleShape,
                color = Color(0xFFC2E2E7)
            ) {
                Icon(
                    imageVector = Icons.Default.AccountBox, contentDescription = "Subject Image"
                )
            }
            Text(text = Sname)
        }
    }
}