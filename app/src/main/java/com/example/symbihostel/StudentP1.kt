package com.example.symbihostel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class StudentP1 : AppCompatActivity() {
    private val STUDENT_TIME: Long=3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_p1)

        Handler().postDelayed({
            startActivity(Intent (this, MainActivity::class.java))
            finish()

        }, STUDENT_TIME)
    }
}