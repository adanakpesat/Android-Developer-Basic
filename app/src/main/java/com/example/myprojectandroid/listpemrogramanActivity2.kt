package com.example.myprojectandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myprojectandroid.adapter.languageAdapter
import com.example.myprojectandroid.model.language

class listpemrogramanActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listpemrograman2)
        val bpem : RecyclerView =
            findViewById(R.id.bpem)
        val data = arrayListOf<language>(
            language("golang", R.drawable.golang),
            language("C++", R.drawable.cplus),
            language("python", R.drawable.python),
            language("golang", R.drawable.golang),
            language("C++", R.drawable.cplus),
            language("golang", R.drawable.golang),
            language("C++", R.drawable.cplus),
            language("python", R.drawable.python)
        )

        val adapter = languageAdapter(data)

        bpem.adapter = adapter
        bpem.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}