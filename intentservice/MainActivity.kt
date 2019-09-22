package com.learnprogramming.intentservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    lateinit var i:Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun stopService(v:View){
        stopService(i)
    }
    fun downloadFile(v:View){
        i = Intent(this,MyService::class.java)
        startService(i)
    }
}
