package com.learnprogramming.intentservice

import android.app.IntentService
import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class MyService : IntentService("Daemon") {
    override fun onHandleIntent(p0: Intent?) {
        Thread.sleep(10000)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Toast.makeText(this,"Download started...", Toast.LENGTH_LONG).show()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Service Destroyed...", Toast.LENGTH_LONG).show()
    }

}
