package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun testfun() {
            val button = findViewById<Button>(R.id.square)
            val text = findViewById<TextView>(R.id.textView)
            val mail = findViewById<EditText>(R.id.editTextTextEmailAddress)
            var number = 0
            button.setOnClickListener {
                if (mail.text.isEmpty()) {
                    Toast.makeText(this, "aue aue aue", Toast.LENGTH_SHORT).show()
                    mail.error = "errorclown"
                }
                text.text = number.toString()
                number++
            }

        }
        testfun()
    }
}