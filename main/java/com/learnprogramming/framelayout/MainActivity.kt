package com.learnprogramming.framelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun changeImage(view: View){
        var img = view as ImageView
        when(img.id){
            R.id.pic1 ->{
                pic1.visibility = View.GONE
                pic2.visibility = View.VISIBLE
            }
            R.id.pic2 -> {
                pic2.visibility = View.GONE
                pic1.visibility = View.VISIBLE
            }
        }
    }
}
