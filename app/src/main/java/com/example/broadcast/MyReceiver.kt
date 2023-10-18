package com.example.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        when(intent?.action) {
            ACTION_CLICKED -> {
                val clicks = intent.getIntExtra(EXTRA_CLICKED, 0)
                Toast.makeText(context, "Клик! $clicks", Toast.LENGTH_SHORT).show()
            }
            Intent.ACTION_AIRPLANE_MODE_CHANGED -> {
                val turnedOn = intent.getBooleanExtra("state", false)
                Toast.makeText(context, "Авиарижм: $turnedOn", Toast.LENGTH_LONG).show()
            }
            Intent.ACTION_BATTERY_CHANGED -> {
                Toast.makeText(context, "Зарядка", Toast.LENGTH_LONG).show()
            }
        }
    }

    companion object {
        const val ACTION_CLICKED = "clicked"
        const val EXTRA_CLICKED = "click"
    }
}