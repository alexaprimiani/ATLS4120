package com.example.lab8atls4120

import java.text.FieldPosition

data class IcecreamShop(var name:String="", var url:String="") {
    fun suggestIcecreamShop(position:Int){
        setIcecreamShopName(position)
        setIcecreamShopUrl(position)
    }

    private fun setIcecreamShopName(position: Int){
        when(position){
            0 -> name="insomnia cookies"
            1 -> name="glacier ice cream"
            2 -> name="gelato boy"
            else -> name="ice cream shop of your choice"
        }
    }

    private fun setIcecreamShopUrl(position: Int){
        when(position){
            0 -> url=" https://insomniacookies.com/locations/store/1146"
            1 -> url="https://www.glaciericecream.com/"
            2 -> url="https://gelatoboy.com/"
            else -> url="https://www.google.com/search?q=ice+cream+shop+boulder&rlz=1C5CHFA_enUS764US764&oq=ice+cream+shop+boulder&aqs=chrome.0.0i457j0j0i22i30l2.2501j0j7&sourceid=chrome&ie=UTF-8"
        }
    }
}