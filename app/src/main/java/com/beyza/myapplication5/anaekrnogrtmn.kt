package com.beyza.myapplication5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_anamenuogrnc.*

class anaekrnogrtmn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anaekrnogrtmn)

        notıd.setOnClickListener{
            val intent= Intent(applicationContext,notekleme::class.java)
            startActivity(intent)
        }
    }
}