package com.example.myprojectandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import jp.wasabeef.glide.transformations.BlurTransformation

class belajarScrollViewActivity2 : AppCompatActivity() {
    var ivdes : ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_scroll_view2)

        ivdes = findViewById(R.id.ivdes)

        Glide.with(this)
            .load(R.drawable.tangled)
            .transform(BlurTransformation(25, 3))
            .into(ivdes!!)
    }
}