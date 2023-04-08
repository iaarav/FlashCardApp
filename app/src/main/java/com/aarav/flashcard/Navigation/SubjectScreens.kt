package com.aarav.flashcard.Navigation

enum class SubjectScreens {
    HomeScreen,
    DetailScreen;
    companion object{
        fun fromroute(route: String?):SubjectScreens=when(route?.substringBefore("/")){
            HomeScreen.name-> HomeScreen
            DetailScreen.name->DetailScreen
            null-> HomeScreen

            else -> throw IllegalArgumentException("Route $route is not recognisable ")
        }
    }
}