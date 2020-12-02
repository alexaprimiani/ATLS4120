package com.example.project2emojifinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun emojiMaker(view: View) {

        val spinnerEyes: Spinner = findViewById(R.id.spinnerEyes)
        val imageEyes = findViewById<ImageView>(R.id.imageViewEyes)

        var position = spinnerEyes.selectedItemPosition
        when (position) {
            0 -> imageEyes.setImageResource(R.drawable.emojinormaleyes)
            1 -> imageEyes.setImageResource(R.drawable.emojinormaleyes)
            2 -> imageEyes.setImageResource(R.drawable.emojihappyeyes)
            3 -> imageEyes.setImageResource(R.drawable.emojiwinkylargeeyes)
            4 -> imageEyes.setImageResource(R.drawable.emojixeyes)
            else -> imageEyes.setImageResource(R.drawable.emojinormaleyes)

        }
    }

}