package com.example.worktimelogwidgetandroid

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.core.app.ComponentActivity


@SuppressLint("RestrictedApi")
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // serves layout from .xml to the user
        setContentView(R.layout.main_activity)

        // handle button press
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            // send API request to google sheets
            Log.i("MainActivity", "Button pressed!")


//            val resultTextView: TextView = findViewById(R.id.textView)
//            resultTextView.text = "Wylosowano: ${(0..6).random()}"
        }
    }


}


