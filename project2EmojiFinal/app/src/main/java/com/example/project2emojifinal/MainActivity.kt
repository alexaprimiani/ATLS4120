package com.example.project2emojifinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun emojiMaker(view: View) {
        val imageEyes = findViewById<ImageView>(R.id.imageViewEyes)
        imageEyes.setImageResource(R.drawable.emojinormaleyes)
        }
    fun eyesHappy(view: View){
        val imageEyes = findViewById<ImageView>(R.id.imageViewEyes)
        imageEyes.setImageResource(R.drawable.emojihappyeyes)
    }
    fun eyesWinky(view: View){
        val imageEyes = findViewById<ImageView>(R.id.imageViewEyes)
        imageEyes.setImageResource(R.drawable.emojiwinkylargeeyes)
    }
    fun eyesDead(view: View){
        val imageEyes = findViewById<ImageView>(R.id.imageViewEyes)
        imageEyes.setImageResource(R.drawable.emojixeyes)
    }
    fun mouthSmile(view: View){
        val imageMouth = findViewById<ImageView>(R.id.imageViewMouth)
        imageMouth.setImageResource(R.drawable.emojismilemouth)
    }
    fun mouthSad(view: View){
        val imageMouth = findViewById<ImageView>(R.id.imageViewMouth)
        imageMouth.setImageResource(R.drawable.emojisadmouth)
    }
    fun mouthOpen(view: View){
        val imageMouth = findViewById<ImageView>(R.id.imageViewMouth)
        imageMouth.setImageResource(R.drawable.emojiopenmouth)
    }
    fun mouthTongueOut(view: View){
        val imageMouth = findViewById<ImageView>(R.id.imageViewMouth)
        imageMouth.setImageResource(R.drawable.emojitongueoutmouth)
    }
    fun accessoryMask(view: View){
        val imageAccessory = findViewById<ImageView>(R.id.imageViewAccessory)
        imageAccessory.setImageResource(R.drawable.emojimaskaccessory)
    }
    fun accessorySunglasses(view: View){
        val imageAccessory = findViewById<ImageView>(R.id.imageViewAccessory)
        imageAccessory.setImageResource(R.drawable.emojisunglassesaccessory)
    }
    fun accessoryHat(view: View){
        val imageAccessory = findViewById<ImageView>(R.id.imageViewAccessory)
        imageAccessory.setImageResource(R.drawable.emojihataccessory)
    }
    fun accessoryGlasses(view: View){
        val imageAccessory = findViewById<ImageView>(R.id.imageViewAccessory)
        imageAccessory.setImageResource(R.drawable.emojiglassesaccessory)
    }
    fun extraCensorBar(view: View){
        val imageExtra = findViewById<ImageView>(R.id.imageViewExtra)
        imageExtra.setImageResource(R.drawable.emojicensorbarextra)
    }
    fun extraSmoke(view: View){
        val imageExtra = findViewById<ImageView>(R.id.imageViewExtra)
        imageExtra.setImageResource(R.drawable.emojismoke2extra)
    }
    fun extraTear(view: View){
        val imageExtra = findViewById<ImageView>(R.id.imageViewExtra)
        imageExtra.setImageResource(R.drawable.emojiwaterdropextra)
    }
    fun extraZs(view: View){
        val imageExtra = findViewById<ImageView>(R.id.imageViewExtra)
        imageExtra.setImageResource(R.drawable.emojizsextra)
    }
    fun resetEmoji(view: View){
        val imageEyes = findViewById<ImageView>(R.id.imageViewEyes)
        imageEyes.setImageResource(android.R.color.transparent)
        val imageMouth = findViewById<ImageView>(R.id.imageViewMouth)
        imageMouth.setImageResource(android.R.color.transparent)
        val imageAccessory = findViewById<ImageView>(R.id.imageViewAccessory)
        imageAccessory.setImageResource(android.R.color.transparent)
        val imageExtra = findViewById<ImageView>(R.id.imageViewExtra)
        imageExtra.setImageResource(android.R.color.transparent)
    }


}
