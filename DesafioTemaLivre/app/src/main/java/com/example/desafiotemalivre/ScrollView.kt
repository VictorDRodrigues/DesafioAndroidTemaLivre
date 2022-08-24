package com.example.desafiotemalivre

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ScrollView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_view)

        supportActionBar?.hide()

        val btnmain = findViewById<ImageView>(R.id.imgbackmain)
        btnmain.setOnClickListener{
            val IntentM = Intent(this,MainActivity::class.java)
            startActivity(IntentM)
        }
    }
}