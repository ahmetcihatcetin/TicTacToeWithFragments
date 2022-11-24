package com.example.tictactoefragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager.beginTransaction()
        fragmentManager.replace(R.id.placeHolderForNavButtons, NavButtons())
        fragmentManager.commit()
    }
}