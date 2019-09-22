package com.learnprogramming.implicit_intent

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
    fun share (v:View){
        var i = Intent()   // create intent without any specify destination
        i.action = Intent.ACTION_SEND  // action is string variable, Intent is a class and ACTION_SEND is the constant variable type static. we use this when we don't specify the destination of the intent.
        var msg = editText.text.toString() // take the text from the plain text and store in msg
        i.putExtra(Intent.EXTRA_TEXT, msg)//  put the msg in the intent. // EXTRA_TEXT is the common key.
        i.type = "text/plain"// type of the message that we want to send
        startActivity(Intent.createChooser(i,"Send to"))// display all the available app
    }
}
