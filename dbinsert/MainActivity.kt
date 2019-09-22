package com.learnprogramming.dbinsert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var str:String =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun insert(v: View){
        var city:String = editText.text.toString() // colunm of the table in DTO1 raw
        var named:String = editText2.text.toString() // colunm of the table in DTO1 raw

        var DTO1 = Staff(city, named)  // The raw of the table

        var helper = MyHelper(this)
        var res = helper.insertData(DTO1)

        if (res == -1.toLong()){
            Toast.makeText(this, "fail", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this, "suc*", Toast.LENGTH_LONG).show()
        }
    }
    fun ViewData(v:View){
        var db = MyHelper(this)
        var arrList = db.readRecord()
        for (i in arrList){
            var name = i.named
            var city = i.city

            str+="$name : $city \n"
        }
        tv.text = str
    }
}
