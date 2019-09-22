package com.learnprogramming.videoplayerratingbar

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.MediaController
import android.widget.RatingBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast.makeText as makeText1

class MainActivity : AppCompatActivity() {

    var position = 0 // Set variable for position which represent the timestep
    var mediaControls: MediaController? = null // Set variable for media controls

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (mediaControls == null){
            mediaControls = MediaController(this@MainActivity) // Create a new object for
        }
        // Use a try catch to prevent the app from crashing when referencing a URI locally or
        try{
            videoView.setMediaController(mediaControls)//assign the media controls to the video
            videoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.buwanmeixiaohai))
        }
        catch (e: Exception){
            Log.d("Player",e.message)
        }
        // puts the video in focus
        videoView.setOnPreparedListener {
            videoView.seekTo(position)
            if (position == 0){
                videoView.start()
            }else{
                videoView.pause()
            }
            // Don't stop the playback until the video
        }
        val button = findViewById<View>(R.id.button) as Button
        val ratingBar = findViewById<View>(R.id.ratingBar) as RatingBar
    }

    fun clicked(view: View){
        val ratingValue = ratingBar.rating
        Toast.makeText(this,"Your rating is $ratingValue", Toast.LENGTH_LONG).show()
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        if(outState!=null){
            outState.putInt("Position",videoView.currentPosition) // Get the position, put into a key value pair when rotating
        }
        videoView.pause()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState!=null) {
        position = savedInstanceState.getInt("Position") // Get the value with the key and play the button
        }
        videoView.seekTo(position)
    }
}
