package com.example.lab8atls4120

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_icecream.*
import kotlinx.android.synthetic.main.activity_main.*

class IcecreamActivity : AppCompatActivity() {
    private var icecreamShopName : String? = null
    private var icecreamShopUrl : String? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_icecream)
        setSupportActionBar(findViewById(R.id.toolbar))

        icecreamShopName = intent.getStringExtra("icecreamShopName")
        icecreamShopUrl = intent.getStringExtra("icecreamShopURL")

        icecreamShopName?.let { Log.i("shop recieved", it)};
        icecreamShopUrl?.let { Log.i("url recieved", it)};

        icecreamShopName?.let {icecreamShopTextView.text = "You should get ice cream at $icecreamShopName"}

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onBackPressed(){
        val data = Intent()
        data.putExtra("feedback", feedbackEditText.text.toString())
        setResult(Activity.RESULT_OK, data)
        super.onBackPressed()
        finish()
    }
}