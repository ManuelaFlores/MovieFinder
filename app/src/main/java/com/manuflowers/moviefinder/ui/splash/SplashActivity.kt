package com.manuflowers.moviefinder.ui.splash

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.manuflowers.moviefinder.ui.home.HomeActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}
