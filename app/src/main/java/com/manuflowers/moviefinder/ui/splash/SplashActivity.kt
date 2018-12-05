package com.manuflowers.moviefinder.ui.splash

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.manuflowers.moviefinder.R
import com.manuflowers.moviefinder.ui.home.HomeActivity
import kotlinx.android.synthetic.main.activity_home.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_splash)
        intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
       /* setContentView(R.layout.activity_home)
        */
    }
}
