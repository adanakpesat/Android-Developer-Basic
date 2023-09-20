package com.example.myprojectandroid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TravelActivity2 : AppCompatActivity() {
    var ibcall : ImageButton? = null
    var ibnavigate : ImageButton? = null
    var ibshare : ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel2)

        ibcall = findViewById(R.id.ibcall)
        ibnavigate = findViewById(R.id.ibnavigate)
        ibshare = findViewById(R.id.ibshare)

        ibcall!!.setOnClickListener {
            val phonenumber = "025123122"
            val phoneIntent = Intent(Intent.ACTION_DIAL,
                Uri.parse("tell: $phonenumber"))

            startActivity(phoneIntent)
        }

        ibnavigate!!.setOnClickListener {
            val mapIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:46.62550006670495, 8.02897500906588"))

            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
    }
}