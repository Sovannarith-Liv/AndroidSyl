package com.learnprogramming.menuoption

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Somlor_proher : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_somlor_proher)

        Toast.makeText(this, "This is somlor proher!!", Toast.LENGTH_LONG).show()
    }
}
