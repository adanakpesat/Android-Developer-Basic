package com.example.myprojectandroid

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val titleHello : TextView = findViewById(R.id.titleHello)
        val labelnama : TextView = findViewById(R.id.labelnama)
        val inputnama : EditText = findViewById(R.id.inputnama)
        val labelkelas : TextView = findViewById(R.id.labelkelas)
        val inputkelas : EditText = findViewById(R.id.inputkelas)
        val btnSubmit : Button = findViewById(R.id.btnSumbit)
        val tampilnama : TextView = findViewById(R.id.tampilnama)
        val tampilkelas : TextView = findViewById(R.id.tampilkelas)

        titleHello.text = "form biodata"

        btnSubmit.setOnClickListener(){
            Toast.makeText(this, "Hello ${inputnama.text}",
                Toast.LENGTH_SHORT
            ).show()
            tampilnama.text = inputnama.text
            tampilkelas.text = inputkelas.text
        }


    }
}