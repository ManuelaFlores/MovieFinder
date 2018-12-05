package com.manuflowers.moviefinder.ui.home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.manuflowers.moviefinder.R
import com.manuflowers.moviefinder.ui.model.Result
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    var listOfMovies: MutableList<Result> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(HomeToolbar)
        init()
    }

    fun init (){
        //to populate activity with data fake :
        listOfMovies.add(Result(123,"Film 1","Film1","2013"))
        listOfMovies.add(Result(123,"Film 2","Film2","2011"))
        listOfMovies.add(Result(123,"Film 3","Film3","2012"))
        listOfMovies.add(Result(123,"Film 4","Film4","2014"))
        listOfMovies.add(Result(123,"Film 5","Film5","2015"))
        listOfMovies.add(Result(123,"Film 6","Film7","2016"))
        listOfMovies.add(Result(123,"Film 7","Film8","2017"))
        listOfMovies.add(Result(123,"Film 8","Film9","2017"))
        listOfMovies.add(Result(123,"Film 9","Film9","2018"))

        rvSearchResult.adapter = HomeAdapter(listOfMovies)
    }
}
