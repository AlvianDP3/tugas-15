package com.AlvianDwiPramono.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler(looper.getMainLopper()).postDelayed({
          startActivity(Intent(PackageContext: this, MainActivity::class.java))
            finish()
        }.  3000)

    }
}