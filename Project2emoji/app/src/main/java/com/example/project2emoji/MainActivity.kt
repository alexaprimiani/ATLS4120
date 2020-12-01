package com.example.project2emoji

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val spinner: Spinner = findViewById(R.id.spinner)
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(position) {
                    case 0:
                    image.setImageResource(R.drawable.item1);
                    break;
                    case 1:
                    image.setImageResource(R.drawable.item2);
                    break;
                    default:
                    //Default image
                    //image.setImageResource(R.drawable.item2);
                    break;

                }
            }
        }*/

            val spinner: Spinner = findViewById(R.id.spinner)
            ArrayAdapter.createFromResource(
                this,
                R.array.eyes,
                android.R.layout.simple_spinner_item
            ).also { adapter ->
                // Specify the layout to use when the list of choices appears
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                // Apply the adapter to the spinner
                spinner.adapter = adapter
            }

            class SpinnerActivity : Activity(), AdapterView.OnItemSelectedListener {

                val imageEyes = findViewById<ImageView>(R.id.imageViewEyes)

                override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long) {
                    // An item was selected. You can retrieve the selected item using
                    var emojiname = parent.getItemAtPosition(pos)
                    if(emojiname == "normal eyes"){
                        imageEyes.setImageResource(R.drawable.emojinormaleyes)
                    }
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // Another interface callback
                }
            }

        }
    }














/*    fun makeEmoji(view: View?){
        val spinner: Spinner = findViewById(R.id.spinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.eyes,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }

            class SpinnerActivity : Activity(), AdapterView.OnItemSelectedListener {

            val imageEyes = findViewById<ImageView>(R.id.imageViewEyes)

            override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long) {
                // An item was selected. You can retrieve the selected item using
                parent.getItemAtPosition(pos)
                if(pos == 1){
                    imageEyes.setImageResource(R.drawable.emojinormaleyes)
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Another interface callback
            }
        }

    }
}*/

