package com.example.desafiotemalivre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val imgStart = findViewById<ImageView>(R.id.imgPallet)
        imgStart.setOnClickListener{
            val IntentS = Intent(this,ScrollView::class.java)
            startActivity(IntentS)
        }

    }
}