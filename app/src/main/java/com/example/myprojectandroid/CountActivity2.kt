package com.example.myprojectandroid

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.sql.ResultSet

class CountActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count2)

        val tvNumber : TextView = findViewById(R.id.tvNumber)
        val btnCount : Button = findViewById(R.id.btnCount)
        val btnReset : Button = findViewById(R.id.btnReset)
        val btnMinus : Button = findViewById(R.id.btnMinus)

//      setText dan getText
//          setText = merubah/mengisi text cukup panggil fungsi text
        tvNumber.text = "0"
//          getText = mengambil text
        println(tvNumber.text)
        Log.d("number", "hasilnya : ${tvNumber.text}")

//      action
        btnReset.setOnClickListener{
//          bikin variabel nilainya berubah
//          ambil teks lalu konversi dari string ke integer
            var ResetInteger : Int = tvNumber.text.toString().toInt()
            ResetInteger=0

//          setText
            tvNumber.text = ResetInteger.toString()
        }
        btnCount.setOnClickListener {
//              bikin variabel nilainya berubah
//              ambil teks lalu konversi dari string ke int
            var countInteger : Int = tvNumber.text.toString().toInt()
            countInteger++

//          setText
            tvNumber.text = countInteger.toString()
        }
        btnMinus.setOnClickListener {
//              bikin variabel nilainya berubah
//              ambil teks lalu konversi dari string ke int
            var minusInteger : Int = tvNumber.text.toString().toInt()
            minusInteger--

//          setText
            tvNumber.text = minusInteger.toString()
        }
        }

        }


