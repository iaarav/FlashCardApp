package com.aarav.flashcard.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aarav.flashcard.HomeScreen
import com.aarav.flashcard.Subjects

@Composable
fun SubjectNavigation() {
    val Ncontroller = rememberNavController()
    NavHost(
        navController = Ncontroller,
        startDestination = SubjectScreens.HomeScreen.name,
    ){
        composable(SubjectScreens.HomeScreen.name){
            HomeScreen()
        }
    }
}