package com.example.lesson33

import junit.framework.Assert.assertEquals
import org.junit.Test

class RegistrationTest {

    @Test
    fun `password and confirmed password are different return false`() {
        val result = Registration().validateInput(username = "Some username",
            password = "100101", confirmedPassword = "password")

        assertEquals(result, false)
    }

    @Test
    fun `password doesn't have enough numbers`() {
        val result = Registration().validateInput(username = "Username",
            password = "qwerty", confirmedPassword = "qwerty")

        assertEquals(result, false)
    }

    @Test
    fun `username is not in the list`() {
        val result = Registration().validateInput(username = "Who is",
            password = "1001", confirmedPassword = "1001")

        assertEquals(result, false)
    }

    @Test
    fun `password has uppercase return true`() {
        val result = Registration().validateInput(username = "Kostya90",
            password = "passS", confirmedPassword = "passS")

        assertEquals(result, true)
    }

    @Test
    fun `password blanc return false`() {
        val result = Registration().validateInput(username = "Kostya90",
            password = "pass", confirmedPassword = " ")

        assertEquals(result, false)
    }

    @Test
    fun `username blanc return false`() {
        val result = Registration().validateInput(username = " ",
            password = "pass", confirmedPassword = "passs")

        assertEquals(result, false)
    }
}