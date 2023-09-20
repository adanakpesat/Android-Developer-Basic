package com.example.myprojectandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class latihanVisibilityActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_visibility2)
        val tvteks : TextView = findViewById(R.id.tvteks)
        val btnklik : Button = findViewById(R.id.btnklik)

        btnklik.setOnClickListener {
            if (tvteks.visibility == View.VISIBLE){
                tvteks.visibility = View.INVISIBLE
            }else{
                tvteks.visibility = View.VISIBLE

            }

            }
        }
    }
