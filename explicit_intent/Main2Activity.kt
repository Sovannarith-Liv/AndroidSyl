package com.learnprogramming.explicit_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //var name = intent.getStringExtra("User_name")
        //var sch = intent.getStringExtra("school")

        //user.text = "Welcome $name and you are from $sch"

        var bundle = intent.extras  // create the variable to store the intent send from the first activity
        var name = bundle?.get("user_name")// access the data inside the bundle
        var school = bundle?.get("school")

        user.text = "Name is $name you are from $school"
    }
}