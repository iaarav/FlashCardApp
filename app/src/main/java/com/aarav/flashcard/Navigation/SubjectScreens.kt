package com.aarav.flashcard.Navigation

enum class SubjectScreens {
    HomeScreen,
    Flash_Screen1,
    Flash_Screen2,
    Flash_Screen3,
    Flash_Screen4;

    companion object{
        fun fromroute(route: String?):SubjectScreens=when(route?.substringBefore("/")){
            HomeScreen.name-> HomeScreen
            Flash_Screen1.name->Flash_Screen1
            Flash_Screen2.name->Flash_Screen2
            Flash_Screen3.name->Flash_Screen3
            Flash_Screen4.name->Flash_Screen4
            null-> HomeScreen

            else -> throw IllegalArgumentException("Route $route is not recognisable ")
        }
    }
}