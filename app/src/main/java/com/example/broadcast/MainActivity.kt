package com.example.broadcast

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val receiver = MyReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val filter = IntentFilter().apply {
//            addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
//            addAction(Intent.ACTION_BATTERY_CHANGED)
//        }
//        registerReceiver(receiver, filter)
    }

    override fun onDestroy() {
        super.onDestroy()
//        unregisterReceiver(receiver)
    }
}
