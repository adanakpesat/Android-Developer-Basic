package com.example.myprojectandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splashscreendoaActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreendoa2)

//      panggilan objek handle dr package os
//      postdelayed = menjalankan action ketika delay 5 detik
//      waktu yg ditentukan telah selesai
        Handler().postDelayed({
            val intent = Intent(this,
                dashboardDoaActivity2::class.java)
            startActivity(intent)
        },5000)
    }
}