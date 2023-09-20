package com.example.myprojectandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class listNamaActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_nama2)

//  define array adapter

        val arrayAdapter:ArrayAdapter<*>
        val users = arrayOf(
            "steve smith", "ros taylor", "rohit sharma"
        )
        val mListview: ListView = findViewById(R.id.ivnama)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, users)
        mListview.adapter = arrayAdapter
    }
}