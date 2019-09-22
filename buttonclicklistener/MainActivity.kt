package com.learnprogramming.buttonclicklistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClicked(view:View){
        var button = view as Button
        when(button.id){
            R.id.button1 -> Toast.makeText(this,"Button 1 Clicked...", Toast.LENGTH_LONG).show()
            R.id.button2 -> Toast.makeText(this,"Button 2 Clicked...", Toast.LENGTH_LONG).show()
            else -> Toast.makeText(this,"Invalid Button...", Toast.LENGTH_LONG).show()
        }
    }


}
