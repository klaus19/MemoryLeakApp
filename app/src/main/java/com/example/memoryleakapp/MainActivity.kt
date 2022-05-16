package com.example.memoryleakapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Intent(this,SecondActivity::class.java).also {
            startActivity(it)
        }

    }

    companion object{
        lateinit var context: Context
    }
}