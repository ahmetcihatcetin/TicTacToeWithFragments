package com.example.tictactoefragments

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.tictactoefragments.databinding.FragmentNavButtonsBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val fragmentManager = supportFragmentManager.beginTransaction()
        fragmentManager.replace(R.id.placeHolderForNavButtons, NavButtons())
        fragmentManager.commit()

        val gridFragmentManager = supportFragmentManager.beginTransaction()
        gridFragmentManager.replace(R.id.placeHolderForGameGrid, GameGridFragment())
        gridFragmentManager.commit()
    }
}