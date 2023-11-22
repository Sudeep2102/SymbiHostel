package com.example.symbihostel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class ChoiceScreen : AppCompatActivity() {
    private val CHOICE_TIME: Long=3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice_screen)

        Handler().postDelayed({
            startActivity(Intent (this, LoginPage::class.java))
            finish()

        }, CHOICE_TIME)
    }
}