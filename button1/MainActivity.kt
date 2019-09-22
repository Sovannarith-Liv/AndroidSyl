package com.learnprogramming.button1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var orders = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun hello(v: View){
        var s = group.checkedRadioButtonId
        when(s){
            R.id.male -> {
                Toast.makeText(this,"You are male",Toast.LENGTH_LONG).show()
            }
            R.id.female -> {
                Toast.makeText(this,"You are female",Toast.LENGTH_LONG).show()
            }
        }
        if(Pizza.isChecked){
            orders+="Pizza\n"
        }
        if (Bread.isChecked){
            orders+="Bread"
        }
        textView.text = orders
    }
}
