package com.example.order_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        val amount = intent.getStringExtra("EXTRA_QUANTITY")
        val price = intent.getStringExtra("EXTRA_PRICE")
        val tvAmount = findViewById<TextView>(R.id.tvAmount)
        val tvTotal = findViewById<TextView>(R.id.tvTotal)
        val btn_continue = findViewById<TextView>(R.id.btn_continue)
        val btn_go_back = findViewById<TextView>(R.id.btn_go_back)
        val arrow_go_back = findViewById<ImageView>(R.id.arrow_go_back)

        tvAmount.text = amount
        tvTotal.text = price

        btn_continue.setOnClickListener {
            Intent(this, Activity4::class.java).also {
                startActivity(it)
                finish()
            }
        }

        btn_go_back.setOnClickListener {
            Intent(this, Activity2::class.java).also {
                startActivity(it)
                finish()
            }
        }

        arrow_go_back.setOnClickListener {
            Intent(this, Activity2::class.java).also {
                startActivity(it)
                finish()
            }
        }
    }
}