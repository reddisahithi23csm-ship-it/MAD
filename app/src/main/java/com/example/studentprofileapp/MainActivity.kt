package com.example.studentprofileapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.showDetailsBtn)

        btn.setOnClickListener {
            Toast.makeText(
                this,
                "Profile Loaded Successfully!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}