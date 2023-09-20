package com.example.myprojectandroid

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myprojectandroid.adapter.doaAdapter
import com.example.myprojectandroid.adapter.doaHarianAdapter
import com.example.myprojectandroid.model.doa
import com.example.myprojectandroid.model.doaHarian

class doaharianActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doaharian2)

        val rvdoa : RecyclerView =
            findViewById(R.id.rvdoa)
        val data = arrayListOf<doaHarian>(
            doaHarian("doa sebelum bobo","بِسْمِكَ اللّٰهُمَّ اَحْيَا وَاَمُوْتُ", "Bismikallohumma ahya wa amuutu"),
            doaHarian("doa sebelum bobo","بِسْمِكَ اللّٰهُمَّ اَحْيَا وَاَمُوْتُ", "Bismikallohumma ahya wa amuutu"),
            doaHarian("doa sebelum bobo","بِسْمِكَ اللّٰهُمَّ اَحْيَا وَاَمُوْتُ", "Bismikallohumma ahya wa amuutu"),
            doaHarian("doa sebelum bobo","بِسْمِكَ اللّٰهُمَّ اَحْيَا وَاَمُوْتُ", "Bismikallohumma ahya wa amuutu"),
            doaHarian("doa sebelum bobo","بِسْمِكَ اللّٰهُمَّ اَحْيَا وَاَمُوْتُ", "Bismikallohumma ahya wa amuutu"),
        )
        val adapter = doaHarianAdapter(data)

        rvdoa.adapter = adapter
        rvdoa.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}