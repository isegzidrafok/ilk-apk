package com.example.ilkapk

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color
import android.view.Gravity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)
        text.text = "G"
        text.textSize = 96f
        text.setTextColor(Color.YELLOW)
        text.gravity = Gravity.CENTER

        setContentView(text)
    }
}

