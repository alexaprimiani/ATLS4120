package com.example.halloween2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sayHi(view: View) {
        //TextView
        val hiText = findViewById<TextView>(R.id.textMessage)

        //EditText
        val editName = findViewById<EditText>(R.id.editTextName)
        val name = editName.text

        hiText.setText("Have a great day " + name + "!")

        val imageHappy = findViewById<ImageView>(R.id.imageView3)
        imageHappy.setImageResource(R.drawable.lab7happy)

    }
}