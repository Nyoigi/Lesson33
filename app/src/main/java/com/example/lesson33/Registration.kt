package com.example.lesson33

class Registration {

    val listOfUsers = listOf("Petya11", "Sasha99", "Kostya90")

    fun validateInput(
        username: String, password: String,
        confirmedPassword: String
    ): Boolean {
//        if (password != confirmedPassword) {
//            return false
//        }
//        if (username !in listOfUsers) {
//            return false
//        }
//        if (password.count { it.isDigit() } < 3) {
//            return false
//        }
        if (password.count { it.isUpperCase() } < 1) {
            return false
        }
        if (username.isBlank()) {
            return false
        }
        if (confirmedPassword.isBlank()) {
            return false
        }

        return true
    }
}