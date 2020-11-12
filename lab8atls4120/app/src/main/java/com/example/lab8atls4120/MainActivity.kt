package com.example.lab8atls4120

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.RadioButton
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var myIcecreamShop = IcecreamShop();
    private var selectedLocationPosition = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        locationButton.setOnClickListener{
            selectedLocationPosition = spinner.selectedItemPosition
            myIcecreamShop.suggestIcecreamShop(selectedLocationPosition)
            Log.i("shop suggested", myIcecreamShop.name);
            Log.i("url suggested", myIcecreamShop.url);

            val intent = Intent(this, IcecreamActivity::class.java)
            intent.putExtra("icecreamShopName", myIcecreamShop.name)
            intent.putExtra("icecreamShopURL", myIcecreamShop.url)

            startActivity(intent)
        }
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