package com.example.sessiya1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var TextLogin: TextView = findViewById(R.id.textView6)
        TextLogin.setOnClickListener {
            var intent1 = Intent(this, MainActivity::class.java)
            startActivity(intent1)
        }
    }
}