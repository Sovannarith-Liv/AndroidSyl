package com.learnprogramming.mycustombroadcast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
 // This method work for both less than 25 targetversionsdk and above 29 version targetversionsdk
// If want to specify less than 25 version of targetversionsdk use this method
// add <Intent-filter> element in the <receiver> element and the action in <Intent-filter> element.
//then fo to the MainActivity and add the name of the action in Intent parenthesis.
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendBct(v:View){
        var i = Intent(this, MyReceiver::class.java)
        sendBroadcast(i)
    }
}
