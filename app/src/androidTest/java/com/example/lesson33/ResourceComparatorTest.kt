package com.example.lesson33

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ResourceComparatorTest {

    private var context: Context? = null
    private var calculator: Calculator = mock<Calculator>(Calculator::class.java)
    private var mathematics: Mathematics? = null

    @Before
    fun setUp() {
        context = ApplicationProvider.getApplicationContext()
        mathematics = Mathematics(calculator)
    }

    @After
    fun tearDown() {
        //livedata.removeObserver
    }

    @Test
    fun invokeCalculatorAddMathematicsInvoked_returnTrue() {
        mathematics?.add(firstNumber = 10, secondNumber = 10)

        verify(calculator, atLeastOnce())
            .add(firstNumber = 10, secondNumber = 10)
    }

//    @Test
//    fun resourceStringSameAsGiveString_returnTrue() {
//        val result = ResourceComparator()
//            .isEqual(context = context, resId = R.string.app_name, string = "Lesson33")
//
//        assertTrue(result)
//    }
//
//    @Test
//    fun resourceStringDifferentAsGivenString_returnFalse() {
//        val result = ResourceComparator()
//            .isEqual(context = context, resId = R.string.app_name, string = "Lesson21")
//
//        assertFalse(result)
//    }
}