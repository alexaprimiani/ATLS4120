package com.example.lab8atls4120

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createIcecream(view: View) {
        var flavor:CharSequence = ""
        var toppingList = ""

        val flavorId = radioGroup.checkedRadioButtonId

        if(flavorId == -1){
            val flavorSnackbar = Snackbar.make(root_layout, "Please select a flavor", Snackbar.LENGTH_SHORT)
            flavorSnackbar.show()
        }
        else{
            flavor = findViewById<RadioButton>(flavorId).text

            if(checkBox.isChecked){
                toppingList += " " + checkBox.text
            }
            if(checkBox2.isChecked){
                toppingList += " " + checkBox2.text
            }
            if(checkBox3.isChecked){
                toppingList += " " + checkBox3.text
            }
            if(checkBox4.isChecked){
                toppingList += " " + checkBox4.text
            }
            if(toppingList.isNotEmpty()){
                toppingList = "with" + toppingList
            }

            val location = "at " + spinner.selectedItem

            if(dairySwitch.isChecked){
                flavor = dairySwitch.text.toString() + " $flavor"
            }


            messageTextView.text = "You'd like $flavor ice cream $toppingList $location"
        }
    }
}