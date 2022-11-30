package com.example.order_activity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class Activity2 : AppCompatActivity() {
    @SuppressLint("Range")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        var quantity_burger = findViewById<TextView>(R.id.quantity_burger)
        var price_burger = findViewById<TextView>(R.id.price_burger)
        val btn_plus = findViewById<TextView>(R.id.btn_plus)
        val btn_minus = findViewById<TextView>(R.id.btn_minus)
        val btn_next = findViewById<TextView>(R.id.btn_continue)

        var count = 1
        var price = 4.99

        btn_plus.setOnClickListener {
            if (count == 10) {
                Toast.makeText(this, "You have reached the maximum amount!", Toast.LENGTH_SHORT).show()
            } else {
                count++
                price = price + 4.99
                quantity_burger.text = "$count"
                price_burger.text = "$${price.toFloat()}"
            }
        }

        btn_minus.setOnClickListener {
            if (count == 1) {
                Toast.makeText(this, "This is the lowest amount.", Toast.LENGTH_SHORT).show()
            } else {
                count--
                price = price - 4.99
                quantity_burger.text = "$count"
                price_burger.text = "$${price.toFloat()}"
            }
        }

        btn_next.setOnClickListener {
            Intent(this, Activity3::class.java).also {
                it.putExtra("EXTRA_QUANTITY", quantity_burger.text)
                it.putExtra("EXTRA_PRICE", price_burger.text)
                startActivity(it)
                finish()
            }
        }
    }
}
