package com.learnprogramming.contact_menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {// Thsi block of code inflate the menu to the particular element. like textView button...
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        registerForContextMenu(tv) // inflate the menu to the element through the element id
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {// This block of code just inflate the menu to the activity
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.my_menu,menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.pizza -> {
                Toast.makeText(this,"pizza are the choosen one", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.burger -> {
                Toast.makeText(this,"burger are the choosen one", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.salad -> {
                Toast.makeText(this, "salad are the choosen one", Toast.LENGTH_LONG).show()
                return true
            }
            else -> {
                return false
            }
        }
        return super.onContextItemSelected(item)
    }

}