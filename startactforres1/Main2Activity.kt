package com.learnprogramming.startactforres1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun callme(view:View){
        var i = Intent()
        var g = editText.text.toString()

        i.putExtra("name", g)
        setResult(-1, i)
        finish()
    }
}
