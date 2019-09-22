package com.learnprogramming.menuoption

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Somlor_korko : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_somlor_korko)

        Toast.makeText(this, "This is Somlor korko!!", Toast.LENGTH_LONG).show()
    }
}
