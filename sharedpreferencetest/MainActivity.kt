package com.learnprogramming.sharedpreferencetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var pref = MyPref(this@MainActivity)

        var score = pref.getScore()
        tv.text = "Your score is $score"

        score++

        pref.setScore(score)
    }
}
