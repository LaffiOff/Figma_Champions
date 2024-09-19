package com.example.sessiya1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        val buttonSkip: Button = findViewById(R.id.button5)
        buttonSkip.setOnClickListener{
            val intent1 = Intent(this, MainActivity::class.java)
            startActivity(intent1)
            val buttonNext: Button = findViewById(R.id.button3)
            buttonNext.setOnClickListener {
                val intent2 = Intent(this, MainActivity::class.java)
                startActivity(intent2)
            }

        }
    }
}