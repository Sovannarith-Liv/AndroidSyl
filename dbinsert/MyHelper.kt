package com.learnprogramming.dbinsert

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.core.content.contentValuesOf

var COL1 = "Colunm1"
var COL2 = "Colunm2"
var TABLE_NAMR = "Stuff"
var DATA_BASE = "Data"
class MyHelper(context: Context):SQLiteOpenHelper(context, DATA_BASE,null,1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        var create_table = "create table $TABLE_NAMR($COL1 varchar(250), $COL2 varchar(250))"
        p0?.execSQL(create_table)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun insertData(DTO1:Staff):Long{
        var cv = ContentValues() //This is map

        cv.put(COL1,DTO1.city)
        cv.put(COL2,DTO1.named)

        var dt = this.writableDatabase
        var res = dt.insert(TABLE_NAMR,null,cv)
        return res
    }
    fun readRecord():ArrayList<Staff>{
        var db = this.readableDatabase
        var cursor = db.rawQuery("Select * from $TABLE_NAMR",null) // reading data from database // query mean reading
        var list = ArrayList<Staff>()
        if (cursor.moveToFirst()||cursor!=null){ //moveToFirst method will return Boolean value, if it could move to the first raw, it will return true
            do {
                var city = cursor.getString(cursor.getColumnIndex(COL1)) // get the value of the first col
                var name = cursor.getString(cursor.getColumnIndex(COL2))  // get the value of the second col

                var dto = Staff(city,name)  // Create new raw to store the value from col1 and col2
                list.add(dto)
            }while (cursor.moveToNext());
        }
        return list
    }
}