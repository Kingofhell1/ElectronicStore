package com.example.myapplication3

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication3.data.AuthActivity

class GeneralActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_general)
        Handler().postDelayed({val intent = Intent(this, AuthActivity::class.java)
            startActivity(intent) },  3000)
    }
}