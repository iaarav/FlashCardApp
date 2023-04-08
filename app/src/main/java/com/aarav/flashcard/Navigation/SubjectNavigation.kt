package com.aarav.flashcard.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aarav.flashcard.screens.*

@Composable
fun SubjectNavigation() {
    val Ncontroller = rememberNavController()
    NavHost(
        navController = Ncontroller,
        startDestination = SubjectScreens.HomeScreen.name,
    ){
        composable(SubjectScreens.HomeScreen.name){
            MainnScreen(navController = Ncontroller)
        }
        composable(SubjectScreens.Flash_Screen1.name){
            Flash_Screen1(navController = Ncontroller)
        }
        composable(SubjectScreens.Flash_Screen2.name){
            Flash_Screen2(navController = Ncontroller)
        }
        composable(SubjectScreens.Flash_Screen3.name){
            Flash_Screen3(navController = Ncontroller)
        }
        composable(SubjectScreens.Flash_Screen4.name){
            Flash_Screen4(navController = Ncontroller)
        }
    }
}