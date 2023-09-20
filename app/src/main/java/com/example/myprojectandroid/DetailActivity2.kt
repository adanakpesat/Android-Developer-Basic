package com.example.myprojectandroid

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class DetailActivity2 : AppCompatActivity() {
    var btnpindah : MaterialButton? = null
    var btnshare : MaterialButton? = null
    
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail2)
        
        btnpindah = findViewById(R.id.btnpindah)
        btnshare = findViewById(R.id.btnshare)
        
        btnpindah!!.setOnClickListener { 
            val intent = Intent(this, DetailActivity2::class.java)
            startActivities(intent)
        }
        btnshare!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "saya pesen matcha latte!")
            intent.setType("text/plain")
            startActivities(Intent.createChooser(intent, "share to : "))

    }
}

    private fun startActivities(intent: Intent) {

    }


}
