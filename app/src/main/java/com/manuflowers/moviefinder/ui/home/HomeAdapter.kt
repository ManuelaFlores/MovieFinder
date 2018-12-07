package com.manuflowers.moviefinder.ui.home

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.manuflowers.moviefinder.R
import com.manuflowers.moviefinder.ui.model.Result
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_search_result.view.*

class HomeAdapter(
    private val items: List<Result>,
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

        if (items[position].poster_path.isNotEmpty()) {
            holder.itemView.ivPosterFilm.loadUrl("http://image.tmdb.org/t/p/w500/${items[position].poster_path}")
        } else {
            Picasso.get().load(R.drawable.monsta_1).into(holder.itemView.ivPosterFilm)
        }
    }

    inner class HomeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        init {
            itemView.setOnClickListener {
                onItemClickListener(adapterPosition)
            }
        }
    }
}