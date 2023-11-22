package com.example.symbihostel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class LoginPage : AppCompatActivity() {
    private val LOGIN_TIME: Long=3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        Handler().postDelayed({
            startActivity(Intent (this, StudentP1::class.java))
            finish()

        }, LOGIN_TIME)
    }
}