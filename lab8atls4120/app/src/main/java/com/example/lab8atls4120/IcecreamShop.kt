package com.example.lab8atls4120

import java.text.FieldPosition

data class IcecreamShop(var name:String="", var url:String="") {
    fun suggestIcecreamShop(position:Int){
        setIcecreamShopName(position)
        setIcecreamShopUrl(position)
    }

    private fun setIcecreamShopName(position: Int){
        when(position){
            0 -> name="this place"
            1 -> name="another place"
            2 -> name="gelato boy"
            else -> name="ice cream shop of your choice"
        }
    }

    private fun setIcecreamShopUrl(position: Int){
        when(position){
            0 -> url="url"
            1 -> url="url"
            2 -> url="url"
            else -> url="ice cream shop of your choice"
        }
    }
}