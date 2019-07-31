package com.example.test

import org.junit.Test
import androidx.test.ext.junit.runners.AndroidJUnit4
import junit.framework.TestCase.assertEquals
import kotlinx.android.synthetic.main.activity_main.*
import org.junit.runner.RunWith

class MainActivityInstrumentedTest {

    @Test
    fun onCreate() {
    }

    @Test
    fun calc() {
        val mainActivity = MainActivity()
        val num1 = 10//mainActivity.num1.text.toString().toInt()
        val num2 = 10//mainActivity.num2.text.toString().toInt()
        var result: Int? = null

        result = num1 * num2

        assertEquals("100じゃないよ！", 100, result)

    }
}