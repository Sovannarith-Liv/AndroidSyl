package com.learnprogramming.startactforres1

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
    fun click(view:View){
        var i = Intent(this, Main2Activity::class.java)
        startActivityForResult(i, 3)
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode==3&&resultCode==-1){
            var c = data?.getStringExtra("name")
            Show.text = c
        }
    }
}
