package com.example.desafiotemalivre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()

        supportActionBar!!.hide()
        Handler().postDelayed({
            val intentMain = Intent(this,MainActivity::class.java)
            startActivity(intentMain)
            finish()
        },4000)

    }
}