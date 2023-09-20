package com.example.myprojectandroid

import android.annotation.SuppressLint
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class calculatorActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator2)

        val angka1 : TextView = findViewById(R.id.angka1)
        val angka2 : TextView = findViewById(R.id.angka2)

        val inputangka1 : EditText = findViewById(R.id.inputangka1)
        val inputangka2 : EditText = findViewById(R.id.inputangka2)

        val btnplus : Button = findViewById(R.id.btnplus)
        val btnminus : Button = findViewById(R.id.btnminus)
        val btnpersen : Button = findViewById(R.id.btnpersen)
        val btnkali : Button = findViewById(R.id.btnkali)
        val btnper : Button = findViewById(R.id.btnper)
        val btnclear : Button = findViewById(R.id.btnclear)
        val hasil : TextView = findViewById(R.id.hasil)

        val builder : AlertDialog.Builder =
            AlertDialog.Builder(this@calculatorActivity2)

        btnplus.setOnClickListener {
            var rumus1 : Int = inputangka1.text.toString().toInt()
            var rumus2 : Int = inputangka2.text.toString().toInt()
            var rumus : Int
            rumus = rumus1 + rumus2
            hasil.text = rumus.toString()
        }
        btnminus.setOnClickListener {
            var rumus1 : Int = inputangka1.text.toString().toInt()
            var rumus2 : Int = inputangka2.text.toString().toInt()
            var rumus : Int
            rumus = rumus1 - rumus2
            hasil.text = rumus.toString()
        }
        btnpersen.setOnClickListener {
            var rumus1 : Int = inputangka1.text.toString().toInt()
            var rumus2 : Int = inputangka2.text.toString().toInt()
            var rumus : Int
            rumus = rumus1 % rumus2
            hasil.text = rumus.toString()
        }
        btnkali.setOnClickListener {
            var rumus1 : Int = inputangka1.text.toString().toInt()
            var rumus2 : Int = inputangka2.text.toString().toInt()
            var rumus : Int
            rumus = rumus1 * rumus2
            hasil.text = rumus.toString()
        }
        btnper.setOnClickListener {
            var rumus1 : Int = inputangka1.text.toString().toInt()
            var rumus2 : Int = inputangka2.text.toString().toInt()
            var rumus : Int
            rumus = rumus1 / rumus2
            hasil.text = rumus.toString()
        }
        btnclear.setOnClickListener {
            builder.setTitle("perhatian")
            builder.setMessage("kamu yakin mau menghapus datanya")
            builder.setCancelable(false)

            builder.setIcon(R.drawable.baseline_info_24)

            builder.setPositiveButton("yes",
                DialogInterface.OnClickListener { dialog, which ->
                    hasil.text = "0"
                    inputangka1.setText("")
                    inputangka2.setText("")
                })
            builder.setPositiveButton("no",
                DialogInterface.OnClickListener { dialog, which -> })

//          agar builder kita dibuat harus panggil funsi builder create()
            val alertDialog : AlertDialog = builder.create()

//          untuk menampilkan papUp gunakan fungsi show()
            alertDialog.show()

            var rumus1 : Float = inputangka1.text.toString().toFloat()
            var rumus2 : Float = inputangka1.text.toString().toFloat()
            var rumus : Float

        }
    }
}