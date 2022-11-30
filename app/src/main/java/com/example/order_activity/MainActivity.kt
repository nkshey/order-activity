package com.example.order_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnContinue = findViewById<TextView>(R.id.btnContinue)

        btnContinue.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
            finish()
        }
    }
}