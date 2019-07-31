package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calc.setOnClickListener {
            calc()
        }
    }
    fun calc(): Int? {
        val num1 = num1.text.toString().toInt()
        val num2 = num2.text.toString().toInt()
        var result: Int? = null

            result = num1 * num2

        return result
    }
}
