package com.learnprogramming.seekbardemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBar.max = 200
        seekBar.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{  //create object for SeekBar interface
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                tv.text = "Current progress $p1"
            }
            override fun onStartTrackingTouch(p0: SeekBar?){
                tv.text = "******* SekBar touch *******"
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                tv.text = "****** Final value : ${p0?.progress}******"
            }
        })

        seekBar2.max = 500
        seekBar2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                tv.text = "Curent progress $p1"
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                tv.text = "******* SekBar touch*****"
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                tv.text = "****** Final value : ${p0?.progress}"
            }

        })
    }
}