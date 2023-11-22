package com.example.symbihostel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class WelcomeScreen : AppCompatActivity() {
    private val WELCOME_TIME: Long=3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)

        Handler().postDelayed({
            startActivity(Intent (this, ChoiceScreen::class.java))
            finish()

        }, WELCOME_TIME)

    }
}