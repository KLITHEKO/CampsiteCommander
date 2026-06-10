package com.example.campsitecommander

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    //@SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main) // view binding

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Joining XML views using findViewById

        val etItem = findViewById<EditText>(R.id.Item)
        val etCategory = findViewById<EditText>(R.id.category)
        val etQuantity = findViewById<EditText>(R.id.quantity)
        val etComments = findViewById<EditText>(R.id.comments)
        val btnAdd = findViewById<Button>(R.id.add)
        val btnView = findViewById<Button>(R.id.btnViewInventory)

// Empty Array List
        val itemList = ArrayList<String>()
        val categoryList = ArrayList<String>()
        val quantityList = ArrayList<Int>()
        val commentsList = ArrayList<String>()

        btnAdd.setOnClickListener {

            //Pulling data for edit texts
            val itemText = etItem.text.toString().trim()
            val categoryText = etCategory.text.toString().trim()
            val quantityText = etQuantity.text.toString().trim()
            val commentsText = etComments.text.toString().trim()

            if (itemText.isEmpty() || categoryText.isEmpty() || quantityText.isEmpty() || commentsText.isEmpty()) {
                Toast.makeText(this, "Fill in all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val quantityInt = quantityText.toIntOrNull()
            if (quantityInt == null) {
                Toast.makeText(this, "Quantity must be a number", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Add to lists
            itemList.add(itemText)
            categoryList.add(categoryText)
            quantityList.add(quantityInt)
            commentsList.add(commentsText)

            Toast.makeText(this, "Item added", Toast.LENGTH_SHORT).show()
        }

        //VIEW BUTTON (SEND DATA) - Joining screen two to Screen 1

        btnView.setOnClickListener {

            val intent = Intent(this, DisplayActivity::class.java)

            intent.putStringArrayListExtra("ITEMS", ArrayList(itemList))
            intent.putStringArrayListExtra("CATEGORIES", ArrayList(categoryList))
            intent.putIntegerArrayListExtra("QUANTITIES", ArrayList(quantityList))
            intent.putStringArrayListExtra("COMMENTS", ArrayList(commentsList))

            startActivity(intent)
        }


    }


}