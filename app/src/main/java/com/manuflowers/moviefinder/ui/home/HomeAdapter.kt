package com.manuflowers.moviefinder.ui.home

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.manuflowers.moviefinder.ui.model.Result

class HomeAdapter(val items: List<Result>): RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): HomeViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    //    val view = LayoutInflater()
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(p0: HomeViewHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class HomeViewHolder(view: View) : RecyclerView.ViewHolder(view)
}