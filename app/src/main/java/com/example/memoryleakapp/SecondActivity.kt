package com.example.memoryleakapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SecondActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainActivity.context = this
    }
}