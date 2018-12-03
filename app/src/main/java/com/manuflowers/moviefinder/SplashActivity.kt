package com.manuflowers.moviefinder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //   setContentView(R.layout.activity_splash)
        setContentView(R.layout.activity_home)
        setSupportActionBar(HomeToolbar)
    }
}
