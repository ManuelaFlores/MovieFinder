package com.manuflowers.moviefinder.ui.detail

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.manuflowers.moviefinder.R
import com.manuflowers.moviefinder.ui.model.DetailOfMovie
import com.manuflowers.moviefinder.ui.model.Result
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_detail.*

class DetailActivity : AppCompatActivity(), DetailContract.View {

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
        val detailPresenter = DetailPresenter(this)
        detailPresenter.requestResult("354912")

        val overview: Bundle = intent.extras!!

        tvTitleOfFilm.text = overview.getString("title")
        tvOverview.text = overview.getString("overview")
        Picasso.get().load("http://image.tmdb.org/t/p/w500/${overview.getString("poster")}").into(ivPosterDetail)
    }

    override fun onSuccesfull(detailOfMovie: DetailOfMovie) {
        tvOverview.text = detailOfMovie.overview
        Log.e("M- success", "${detailOfMovie.overview}")
        showData(detailOfMovie)
    }

    override fun showErrorService(errorMessage: String) {
        val toast = Toast.makeText(applicationContext, errorMessage, Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun showFailureMessage(failureMessage: String?) {
        val toast = Toast.makeText(applicationContext, failureMessage, Toast.LENGTH_SHORT)
        toast.show()
    }

    private fun showData (detailOfMovie: DetailOfMovie){
        tvOverview.text = detailOfMovie.overview
    }
}
