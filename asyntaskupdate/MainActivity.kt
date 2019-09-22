package com.learnprogramming.asyntaskupdate

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.core.view.GestureDetectorCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    lateinit var gdc: GestureDetectorCompat
    override fun onDoubleTap(p0: MotionEvent?): Boolean {
        gestureEvent.text = "Double Tap..."
        bg.setBackgroundColor(Color.YELLOW)
        return true
    }

    override fun onDoubleTapEvent(p0: MotionEvent?): Boolean {
        gestureEvent.text = "On DOuble Tap Event..."
        bg.setBackgroundColor(Color.RED)
        return true
    }

    override fun onSingleTapConfirmed(p0: MotionEvent?): Boolean {
        gestureEvent.text = "On Single Tap confirmed..."
        bg.setBackgroundColor(Color.MAGENTA)
        return true
    }

    override fun onShowPress(p0: MotionEvent?) {
    }

    override fun onSingleTapUp(p0: MotionEvent?): Boolean {

        return true
    }

    override fun onDown(p0: MotionEvent?): Boolean {
        gestureEvent.text = "On Down"
        bg.setBackgroundColor(Color.YELLOW)
        return true
    }

    override fun onFling(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        gestureEvent.text = "Flinging..."
        bg.setBackgroundColor(Color.BLUE)
        return true
    }

    override fun onScroll(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        gestureEvent.text = "Scrolling..."
        bg.setBackgroundColor(Color.YELLOW)
        return true
    }

    override fun onLongPress(p0: MotionEvent?) {
        gestureEvent.text = "On Long Press"
        bg.setBackgroundColor(Color.BLACK)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        gdc.onTouchEvent(event)
        return super.onTouchEvent(event)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gdc = GestureDetectorCompat(this, this)
        gdc.setOnDoubleTapListener(this)
    }
}
