package com.learnprogramming.asyntaskexample

import android.content.Context
import android.os.AsyncTask
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import org.w3c.dom.Text
import java.security.AccessControlContext

class MyTask(context: Context, button: Button, progressBar: ProgressBar, textView: TextView) : AsyncTask<Void,Int,String>(){

    lateinit var context:Context
    lateinit var button: Button
    lateinit var progressBar: ProgressBar
    lateinit var textView: TextView
    init {
        this.context = context
        this.button = button
        this.progressBar = progressBar
        this.textView = textView
    }

    override fun onPreExecute() {
        super.onPreExecute()
        textView.text = "Preparing for download"
        Thread.sleep(5000)
    }

    override fun doInBackground(vararg p0: Void?): String {
        for(i in 1..100 step 1){
            Thread.sleep(100)
            publishProgress(i)
        }
        return "Download completed"
    }

    override fun onProgressUpdate(vararg values: Int?) {  // the value that pass from doInBackground alway store in value[0]
        var progress = values[0]
        textView.text = "$progress % Downloaded..."
        progressBar.progress = progress!! // !! is to promise that the value isn't null
    }

    override fun onPostExecute(result: String?) {
        textView.text = result
    }
}