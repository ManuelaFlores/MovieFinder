package com.manuflowers.moviefinder.ui.home

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.manuflowers.moviefinder.R
import com.manuflowers.moviefinder.ui.model.Result
import kotlinx.android.synthetic.main.item_search_result.view.*

class HomeAdapter(
    val items: List<Result>,
    val onItemClickListener: (Int) -> Unit
) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_search_result, parent, false)
        return HomeViewHolder(view)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.itemView.tvNameOfFilm.text = items[position].title
        holder.itemView.tvDirectorName.text = items[position].original_title
        holder.itemView.tvYearofRelease.text = items[position].release_date

    }

    inner class HomeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        init {
            itemView.setOnClickListener {
                onItemClickListener(adapterPosition)
            }
        }
    }
}