package com.learnprogramming.explicit_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun startNew(v:View){
        var intent = Intent(this, Main2Activity::class.java)

        var name = editText.text.toString()
        //intent.putExtra("User_name",name)
        //intent.putExtra("School","KIT")

        var bundle = Bundle()// create bundle object to store the data

        bundle.putString("user_name", name)// access the putString method inside the bundle class
        bundle.putString("school","KIT")

        intent.putExtras(bundle) // put the bundle inside the intent in order to send the data to another activity
        startActivity(intent) // start the intent
    }
}