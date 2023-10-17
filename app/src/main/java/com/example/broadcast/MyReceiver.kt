package com.example.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        when(intent?.action) {
            Intent.ACTION_AIRPLANE_MODE_CHANGED -> {
                val turnedOn = intent.getBooleanExtra("state", false)
                Toast.makeText(context, "Авиарижм: $turnedOn", Toast.LENGTH_LONG).show()
            }
            Intent.ACTION_BATTERY_CHANGED -> {
                Toast.makeText(context, "Зарядка", Toast.LENGTH_LONG).show()
            }
        }
    }
}