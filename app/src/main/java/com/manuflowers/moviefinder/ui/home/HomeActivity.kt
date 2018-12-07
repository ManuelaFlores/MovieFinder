package com.manuflowers.moviefinder.ui.home

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.NonNull
import android.view.View
import android.widget.SearchView
import android.widget.Toast
import com.manuflowers.moviefinder.R
import com.manuflowers.moviefinder.ui.detail.DetailActivity
import com.manuflowers.moviefinder.ui.model.Result
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity(), HomeContract.View {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(HomeToolbar)
        init()
    }

    private fun init() {

        val homePresenter = HomePresenter(this)
        homePresenter.requestDataMovie("spider man")

        svMoviesFinder.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                if (query != null) {
                    homePresenter.requestDataMovie(query)
                } else {
                    homePresenter.onFailureService(query)
                }
                return false
            }

            override fun onQueryTextChange(query: String?): Boolean {
                return false
            }
        })
    }

    override fun showLoading() {
        val toast = Toast.makeText(applicationContext, "Loading", Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun hideLoading() {
        val toast = Toast.makeText(applicationContext, "hideee", Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun onSuccesfull(list: List<Result>) {
        if (list.isNotEmpty()) {
            rvSearchResult.visibility = View.VISIBLE
            populateRecyclerView(list)
        } else {
            rvSearchResult.visibility = View.GONE
        }
    }

    override fun showErrorService(errorMessage: String) {
        val toast = Toast.makeText(applicationContext, errorMessage, Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun showFailureMessage(failureMessage: String?) {
        val toast = Toast.makeText(applicationContext, failureMessage, Toast.LENGTH_SHORT)
        toast.show()
    }

    private fun populateRecyclerView(@NonNull list: List<Result>) {
        rvSearchResult.adapter = HomeAdapter(list) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("overview", list[it].overview)
            intent.putExtra("poster", list[it].poster_path)
            intent.putExtra("title", list[it].title)
            startActivity(intent)
        }
    }
}
