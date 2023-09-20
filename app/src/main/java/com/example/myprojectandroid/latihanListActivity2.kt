package com.example.myprojectandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class latihanListActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_list2)

        val arrayAdapter: ArrayAdapter<*>
        val language = arrayOf(
            "python", "c++", "java", "go lang", "javascript", "ruby", "ca", "SQL server", "mongoDB", "postgreSQL"
        )
//        val mListview: ListView = findViewById(R.id.lv)
//        arrayAdapter = ArrayAdapter(this,
//            android.R.layout.simple_list_item_1, language)
//        mListview.adapter = arrayAdapter
    }
}