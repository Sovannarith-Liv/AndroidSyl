package com.learnprogramming.asyntaskupdate

import android.os.AsyncTask
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView

class MyTask(button: Button, progressBar: ProgressBar, textView: TextView) : AsyncTask<Void, Int, String>(){


    var button: Button = button
    var progressBar: ProgressBar = progressBar
    var textView: TextView = textView

    override fun onPreExecute() {
        super.onPreExecute()
        textView.text = "Preparing for download..."
        button.isEnabled = false
        Thread.sleep(5000)
    }

    override fun doInBackground(vararg p0: Void?): String {

        for(i in 1..100 step 1){
            Thread.sleep(100)
            publishProgress(i,100)
        }
        return "Download completed"
    }

    override fun onProgressUpdate(vararg values: Int?) {
        var progress = values[0]
        textView.text = "$progress % Downloaded...of ${values[1]}"
        progressBar.progress = progress!!
    }

    override fun onPostExecute(result: String?) {
        textView.text = result
        button.isEnabled = true
    }
}