package com.example.campsitecommander

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_display)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //  Joining views
        val txtDetails = findViewById<TextView>(R.id.txtDetails)
        val btnBack = findViewById<Button>(R.id.btnBack)

        // Retrieve data safely from Intent
        val items = intent.getStringArrayListExtra("ITEMS")
        val categories = intent.getStringArrayListExtra("CATEGORIES")
        val quantities = intent.getIntegerArrayListExtra("QUANTITIES")
        val comments = intent.getStringArrayListExtra("COMMENTS")

        // Use a StringBuilder for efficient string concatenation
        val display = StringBuilder()

        // Verify the main list is not null before looping
        when {
            items != null && categories != null && quantities != null && comments != null -> {

                for (i in items.indices) {
                    display.append("Item: ${items[i]}\n")
                    display.append("Category: ${categories[i]}\n")
                    display.append("Quantity: ${quantities[i]}\n")
                    display.append("Comments: ${comments[i]}\n\n")
                }

                // SHOW ITEMS (QTY >= 2)
                display.append("--- Items with Qty >= 2 ---\n")
                for (i in quantities.indices) {
                    if (quantities[i] >= 2) {
                        display.append("Item: ${items[i]} (Qty: ${quantities[i]})\n")
                    }
                }
            }
        }

        // Set text to layout view
        txtDetails.text = display.toString()

        // Go back
        btnBack.setOnClickListener {
            finish()
        }
    }
}
