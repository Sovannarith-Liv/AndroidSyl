package com.learnprogramming.aswitch

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switch2.setOnCheckedChangeListener{compoundButton, b -> //compoundButton use to store the state of the switch, b is boolean if the switch is on it will be true otherwise false
            if(b){
                page1.setBackgroundColor(Color.GRAY)
            }
            else{
                page1.setBackgroundColor(Color.BLUE)    
            }
        }
    }
}
