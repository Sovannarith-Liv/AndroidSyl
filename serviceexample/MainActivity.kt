package com.learnprogramming.serviceexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun music(v: View){
        var i = Intent(this,MyService::class.java)
        when(v.id){
            R.id.startBtn -> {
                startService(i)
            }
            R.id.stopBtn -> {
                stopService(i)
            }
            R.id.newBtn -> {
                startActivity(Intent(this,Main2Activity::class.java))
            }
        }
    }
}
