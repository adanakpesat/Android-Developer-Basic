package com.example.myprojectandroid

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myprojectandroid.adapter.doaAdapter
import com.example.myprojectandroid.adapter.languageAdapter
import com.example.myprojectandroid.model.doa

class dashboardDoaActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_doa2)

        val ivdoa : RecyclerView =
            findViewById(R.id.pemdoa)
        val data = arrayListOf<doa>(
            doa("dzikir & doa sunnah stelah sholat", R.drawable.logo_doa),
            doa("dzikir harian", R.drawable.logo_doa),
            doa("dzikir & doa sunnah stelah sholat", R.drawable.logo_doa),
            doa("dzikir setiap saat", R.drawable.logo_doa),
            doa("dzikir pagi dan petang", R.drawable.logo_doa),
        )

        val cvSelengkapnya:CardView = findViewById(R.id.cvSelengkapnya)
        val adapter = doaAdapter(data)
        ivdoa.adapter = adapter
        ivdoa.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        cvSelengkapnya.setOnClickListener{
            val intent = Intent(this, doaharianActivity2::class.java)
            startActivity(intent)
        }
    }
}