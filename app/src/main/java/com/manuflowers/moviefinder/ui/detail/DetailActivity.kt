package com.manuflowers.moviefinder.ui.detail

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.manuflowers.moviefinder.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_detail.*

class DetailActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)
        init()
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    private fun init(){
        val overview: Bundle = intent.extras!!

        tvTitleOfFilm.text = overview.getString("title")
        tvOverview.text = overview.getString("overview")
        Picasso.get().load("http://image.tmdb.org/t/p/w500/${overview.getString("poster")}").into(ivPosterDetail)
    }

}
