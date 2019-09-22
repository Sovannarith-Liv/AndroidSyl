package com.learnprogramming.mulseekbar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var alphaColor =0
    var redColor = 0
    var greenColor = 0
    var blueColor = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        alpha.max = 255
        red.max = 255
        green.max = 255
        blue.max = 255

        class InnerClass: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                when(p0?.id){
                    R.id.alpha -> {
                        alphaColor = p1
                    }
                    R.id.red -> {
                        redColor = p1
                    }
                    R.id.green -> {
                        greenColor = p1
                    }
                    R.id.blue -> {
                        blueColor = p1
                    }
                }
                var bgColor = Color.argb(alphaColor, redColor, greenColor, blueColor)
                page.setBackgroundColor(bgColor)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}

            override fun onStopTrackingTouch(p0: SeekBar?) {}

        }

        var listener = InnerClass()
        alpha.setOnSeekBarChangeListener(listener)
        red.setOnSeekBarChangeListener(listener)
        green.setOnSeekBarChangeListener(listener)
        blue.setOnSeekBarChangeListener(listener)

    }
}